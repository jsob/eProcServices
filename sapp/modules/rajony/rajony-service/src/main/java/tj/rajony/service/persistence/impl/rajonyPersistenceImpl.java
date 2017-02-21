/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package tj.rajony.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import tj.rajony.exception.NoSuchrajonyException;

import tj.rajony.model.impl.rajonyImpl;
import tj.rajony.model.impl.rajonyModelImpl;
import tj.rajony.model.rajony;

import tj.rajony.service.persistence.rajonyPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the rajony service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see rajonyPersistence
 * @see tj.rajony.service.persistence.rajonyUtil
 * @generated
 */
@ProviderType
public class rajonyPersistenceImpl extends BasePersistenceImpl<rajony>
	implements rajonyPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link rajonyUtil} to access the rajony persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = rajonyImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(rajonyModelImpl.ENTITY_CACHE_ENABLED,
			rajonyModelImpl.FINDER_CACHE_ENABLED, rajonyImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(rajonyModelImpl.ENTITY_CACHE_ENABLED,
			rajonyModelImpl.FINDER_CACHE_ENABLED, rajonyImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(rajonyModelImpl.ENTITY_CACHE_ENABLED,
			rajonyModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public rajonyPersistenceImpl() {
		setModelClass(rajony.class);
	}

	/**
	 * Caches the rajony in the entity cache if it is enabled.
	 *
	 * @param rajony the rajony
	 */
	@Override
	public void cacheResult(rajony rajony) {
		entityCache.putResult(rajonyModelImpl.ENTITY_CACHE_ENABLED,
			rajonyImpl.class, rajony.getPrimaryKey(), rajony);

		rajony.resetOriginalValues();
	}

	/**
	 * Caches the rajonies in the entity cache if it is enabled.
	 *
	 * @param rajonies the rajonies
	 */
	@Override
	public void cacheResult(List<rajony> rajonies) {
		for (rajony rajony : rajonies) {
			if (entityCache.getResult(rajonyModelImpl.ENTITY_CACHE_ENABLED,
						rajonyImpl.class, rajony.getPrimaryKey()) == null) {
				cacheResult(rajony);
			}
			else {
				rajony.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all rajonies.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(rajonyImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the rajony.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(rajony rajony) {
		entityCache.removeResult(rajonyModelImpl.ENTITY_CACHE_ENABLED,
			rajonyImpl.class, rajony.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<rajony> rajonies) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (rajony rajony : rajonies) {
			entityCache.removeResult(rajonyModelImpl.ENTITY_CACHE_ENABLED,
				rajonyImpl.class, rajony.getPrimaryKey());
		}
	}

	/**
	 * Creates a new rajony with the primary key. Does not add the rajony to the database.
	 *
	 * @param rajony_id the primary key for the new rajony
	 * @return the new rajony
	 */
	@Override
	public rajony create(long rajony_id) {
		rajony rajony = new rajonyImpl();

		rajony.setNew(true);
		rajony.setPrimaryKey(rajony_id);

		return rajony;
	}

	/**
	 * Removes the rajony with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param rajony_id the primary key of the rajony
	 * @return the rajony that was removed
	 * @throws NoSuchrajonyException if a rajony with the primary key could not be found
	 */
	@Override
	public rajony remove(long rajony_id) throws NoSuchrajonyException {
		return remove((Serializable)rajony_id);
	}

	/**
	 * Removes the rajony with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the rajony
	 * @return the rajony that was removed
	 * @throws NoSuchrajonyException if a rajony with the primary key could not be found
	 */
	@Override
	public rajony remove(Serializable primaryKey) throws NoSuchrajonyException {
		Session session = null;

		try {
			session = openSession();

			rajony rajony = (rajony)session.get(rajonyImpl.class, primaryKey);

			if (rajony == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchrajonyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(rajony);
		}
		catch (NoSuchrajonyException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected rajony removeImpl(rajony rajony) {
		rajony = toUnwrappedModel(rajony);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(rajony)) {
				rajony = (rajony)session.get(rajonyImpl.class,
						rajony.getPrimaryKeyObj());
			}

			if (rajony != null) {
				session.delete(rajony);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (rajony != null) {
			clearCache(rajony);
		}

		return rajony;
	}

	@Override
	public rajony updateImpl(rajony rajony) {
		rajony = toUnwrappedModel(rajony);

		boolean isNew = rajony.isNew();

		Session session = null;

		try {
			session = openSession();

			if (rajony.isNew()) {
				session.save(rajony);

				rajony.setNew(false);
			}
			else {
				rajony = (rajony)session.merge(rajony);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		entityCache.putResult(rajonyModelImpl.ENTITY_CACHE_ENABLED,
			rajonyImpl.class, rajony.getPrimaryKey(), rajony, false);

		rajony.resetOriginalValues();

		return rajony;
	}

	protected rajony toUnwrappedModel(rajony rajony) {
		if (rajony instanceof rajonyImpl) {
			return rajony;
		}

		rajonyImpl rajonyImpl = new rajonyImpl();

		rajonyImpl.setNew(rajony.isNew());
		rajonyImpl.setPrimaryKey(rajony.getPrimaryKey());

		rajonyImpl.setKod_vbk(rajony.getKod_vbk());
		rajonyImpl.setNazvanie(rajony.getNazvanie());
		rajonyImpl.setOblast_id(rajony.getOblast_id());
		rajonyImpl.setRajony_id(rajony.getRajony_id());

		return rajonyImpl;
	}

	/**
	 * Returns the rajony with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the rajony
	 * @return the rajony
	 * @throws NoSuchrajonyException if a rajony with the primary key could not be found
	 */
	@Override
	public rajony findByPrimaryKey(Serializable primaryKey)
		throws NoSuchrajonyException {
		rajony rajony = fetchByPrimaryKey(primaryKey);

		if (rajony == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchrajonyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return rajony;
	}

	/**
	 * Returns the rajony with the primary key or throws a {@link NoSuchrajonyException} if it could not be found.
	 *
	 * @param rajony_id the primary key of the rajony
	 * @return the rajony
	 * @throws NoSuchrajonyException if a rajony with the primary key could not be found
	 */
	@Override
	public rajony findByPrimaryKey(long rajony_id) throws NoSuchrajonyException {
		return findByPrimaryKey((Serializable)rajony_id);
	}

	/**
	 * Returns the rajony with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the rajony
	 * @return the rajony, or <code>null</code> if a rajony with the primary key could not be found
	 */
	@Override
	public rajony fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(rajonyModelImpl.ENTITY_CACHE_ENABLED,
				rajonyImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		rajony rajony = (rajony)serializable;

		if (rajony == null) {
			Session session = null;

			try {
				session = openSession();

				rajony = (rajony)session.get(rajonyImpl.class, primaryKey);

				if (rajony != null) {
					cacheResult(rajony);
				}
				else {
					entityCache.putResult(rajonyModelImpl.ENTITY_CACHE_ENABLED,
						rajonyImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(rajonyModelImpl.ENTITY_CACHE_ENABLED,
					rajonyImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return rajony;
	}

	/**
	 * Returns the rajony with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param rajony_id the primary key of the rajony
	 * @return the rajony, or <code>null</code> if a rajony with the primary key could not be found
	 */
	@Override
	public rajony fetchByPrimaryKey(long rajony_id) {
		return fetchByPrimaryKey((Serializable)rajony_id);
	}

	@Override
	public Map<Serializable, rajony> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, rajony> map = new HashMap<Serializable, rajony>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			rajony rajony = fetchByPrimaryKey(primaryKey);

			if (rajony != null) {
				map.put(primaryKey, rajony);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(rajonyModelImpl.ENTITY_CACHE_ENABLED,
					rajonyImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (rajony)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_RAJONY_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append(String.valueOf(primaryKey));

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (rajony rajony : (List<rajony>)q.list()) {
				map.put(rajony.getPrimaryKeyObj(), rajony);

				cacheResult(rajony);

				uncachedPrimaryKeys.remove(rajony.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(rajonyModelImpl.ENTITY_CACHE_ENABLED,
					rajonyImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the rajonies.
	 *
	 * @return the rajonies
	 */
	@Override
	public List<rajony> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the rajonies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link rajonyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of rajonies
	 * @param end the upper bound of the range of rajonies (not inclusive)
	 * @return the range of rajonies
	 */
	@Override
	public List<rajony> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the rajonies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link rajonyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of rajonies
	 * @param end the upper bound of the range of rajonies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of rajonies
	 */
	@Override
	public List<rajony> findAll(int start, int end,
		OrderByComparator<rajony> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the rajonies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link rajonyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of rajonies
	 * @param end the upper bound of the range of rajonies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of rajonies
	 */
	@Override
	public List<rajony> findAll(int start, int end,
		OrderByComparator<rajony> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<rajony> list = null;

		if (retrieveFromCache) {
			list = (List<rajony>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_RAJONY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_RAJONY;

				if (pagination) {
					sql = sql.concat(rajonyModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<rajony>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<rajony>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the rajonies from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (rajony rajony : findAll()) {
			remove(rajony);
		}
	}

	/**
	 * Returns the number of rajonies.
	 *
	 * @return the number of rajonies
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_RAJONY);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return rajonyModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the rajony persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(rajonyImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_RAJONY = "SELECT rajony FROM rajony rajony";
	private static final String _SQL_SELECT_RAJONY_WHERE_PKS_IN = "SELECT rajony FROM rajony rajony WHERE rajony_id IN (";
	private static final String _SQL_COUNT_RAJONY = "SELECT COUNT(rajony) FROM rajony rajony";
	private static final String _ORDER_BY_ENTITY_ALIAS = "rajony.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No rajony exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(rajonyPersistenceImpl.class);
}
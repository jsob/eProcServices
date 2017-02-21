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

package tj.roli.service.persistence.impl;

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

import tj.roli.exception.NoSuchroliException;

import tj.roli.model.impl.roliImpl;
import tj.roli.model.impl.roliModelImpl;
import tj.roli.model.roli;

import tj.roli.service.persistence.roliPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the roli service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see roliPersistence
 * @see tj.roli.service.persistence.roliUtil
 * @generated
 */
@ProviderType
public class roliPersistenceImpl extends BasePersistenceImpl<roli>
	implements roliPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link roliUtil} to access the roli persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = roliImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(roliModelImpl.ENTITY_CACHE_ENABLED,
			roliModelImpl.FINDER_CACHE_ENABLED, roliImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(roliModelImpl.ENTITY_CACHE_ENABLED,
			roliModelImpl.FINDER_CACHE_ENABLED, roliImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(roliModelImpl.ENTITY_CACHE_ENABLED,
			roliModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public roliPersistenceImpl() {
		setModelClass(roli.class);
	}

	/**
	 * Caches the roli in the entity cache if it is enabled.
	 *
	 * @param roli the roli
	 */
	@Override
	public void cacheResult(roli roli) {
		entityCache.putResult(roliModelImpl.ENTITY_CACHE_ENABLED,
			roliImpl.class, roli.getPrimaryKey(), roli);

		roli.resetOriginalValues();
	}

	/**
	 * Caches the rolis in the entity cache if it is enabled.
	 *
	 * @param rolis the rolis
	 */
	@Override
	public void cacheResult(List<roli> rolis) {
		for (roli roli : rolis) {
			if (entityCache.getResult(roliModelImpl.ENTITY_CACHE_ENABLED,
						roliImpl.class, roli.getPrimaryKey()) == null) {
				cacheResult(roli);
			}
			else {
				roli.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all rolis.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(roliImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the roli.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(roli roli) {
		entityCache.removeResult(roliModelImpl.ENTITY_CACHE_ENABLED,
			roliImpl.class, roli.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<roli> rolis) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (roli roli : rolis) {
			entityCache.removeResult(roliModelImpl.ENTITY_CACHE_ENABLED,
				roliImpl.class, roli.getPrimaryKey());
		}
	}

	/**
	 * Creates a new roli with the primary key. Does not add the roli to the database.
	 *
	 * @param roli_id the primary key for the new roli
	 * @return the new roli
	 */
	@Override
	public roli create(long roli_id) {
		roli roli = new roliImpl();

		roli.setNew(true);
		roli.setPrimaryKey(roli_id);

		return roli;
	}

	/**
	 * Removes the roli with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param roli_id the primary key of the roli
	 * @return the roli that was removed
	 * @throws NoSuchroliException if a roli with the primary key could not be found
	 */
	@Override
	public roli remove(long roli_id) throws NoSuchroliException {
		return remove((Serializable)roli_id);
	}

	/**
	 * Removes the roli with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the roli
	 * @return the roli that was removed
	 * @throws NoSuchroliException if a roli with the primary key could not be found
	 */
	@Override
	public roli remove(Serializable primaryKey) throws NoSuchroliException {
		Session session = null;

		try {
			session = openSession();

			roli roli = (roli)session.get(roliImpl.class, primaryKey);

			if (roli == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchroliException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(roli);
		}
		catch (NoSuchroliException nsee) {
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
	protected roli removeImpl(roli roli) {
		roli = toUnwrappedModel(roli);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(roli)) {
				roli = (roli)session.get(roliImpl.class, roli.getPrimaryKeyObj());
			}

			if (roli != null) {
				session.delete(roli);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (roli != null) {
			clearCache(roli);
		}

		return roli;
	}

	@Override
	public roli updateImpl(roli roli) {
		roli = toUnwrappedModel(roli);

		boolean isNew = roli.isNew();

		Session session = null;

		try {
			session = openSession();

			if (roli.isNew()) {
				session.save(roli);

				roli.setNew(false);
			}
			else {
				roli = (roli)session.merge(roli);
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

		entityCache.putResult(roliModelImpl.ENTITY_CACHE_ENABLED,
			roliImpl.class, roli.getPrimaryKey(), roli, false);

		roli.resetOriginalValues();

		return roli;
	}

	protected roli toUnwrappedModel(roli roli) {
		if (roli instanceof roliImpl) {
			return roli;
		}

		roliImpl roliImpl = new roliImpl();

		roliImpl.setNew(roli.isNew());
		roliImpl.setPrimaryKey(roli.getPrimaryKey());

		roliImpl.setRol(roli.getRol());
		roliImpl.setRoli_id(roli.getRoli_id());

		return roliImpl;
	}

	/**
	 * Returns the roli with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the roli
	 * @return the roli
	 * @throws NoSuchroliException if a roli with the primary key could not be found
	 */
	@Override
	public roli findByPrimaryKey(Serializable primaryKey)
		throws NoSuchroliException {
		roli roli = fetchByPrimaryKey(primaryKey);

		if (roli == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchroliException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return roli;
	}

	/**
	 * Returns the roli with the primary key or throws a {@link NoSuchroliException} if it could not be found.
	 *
	 * @param roli_id the primary key of the roli
	 * @return the roli
	 * @throws NoSuchroliException if a roli with the primary key could not be found
	 */
	@Override
	public roli findByPrimaryKey(long roli_id) throws NoSuchroliException {
		return findByPrimaryKey((Serializable)roli_id);
	}

	/**
	 * Returns the roli with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the roli
	 * @return the roli, or <code>null</code> if a roli with the primary key could not be found
	 */
	@Override
	public roli fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(roliModelImpl.ENTITY_CACHE_ENABLED,
				roliImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		roli roli = (roli)serializable;

		if (roli == null) {
			Session session = null;

			try {
				session = openSession();

				roli = (roli)session.get(roliImpl.class, primaryKey);

				if (roli != null) {
					cacheResult(roli);
				}
				else {
					entityCache.putResult(roliModelImpl.ENTITY_CACHE_ENABLED,
						roliImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(roliModelImpl.ENTITY_CACHE_ENABLED,
					roliImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return roli;
	}

	/**
	 * Returns the roli with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param roli_id the primary key of the roli
	 * @return the roli, or <code>null</code> if a roli with the primary key could not be found
	 */
	@Override
	public roli fetchByPrimaryKey(long roli_id) {
		return fetchByPrimaryKey((Serializable)roli_id);
	}

	@Override
	public Map<Serializable, roli> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, roli> map = new HashMap<Serializable, roli>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			roli roli = fetchByPrimaryKey(primaryKey);

			if (roli != null) {
				map.put(primaryKey, roli);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(roliModelImpl.ENTITY_CACHE_ENABLED,
					roliImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (roli)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ROLI_WHERE_PKS_IN);

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

			for (roli roli : (List<roli>)q.list()) {
				map.put(roli.getPrimaryKeyObj(), roli);

				cacheResult(roli);

				uncachedPrimaryKeys.remove(roli.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(roliModelImpl.ENTITY_CACHE_ENABLED,
					roliImpl.class, primaryKey, nullModel);
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
	 * Returns all the rolis.
	 *
	 * @return the rolis
	 */
	@Override
	public List<roli> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the rolis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link roliModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of rolis
	 * @param end the upper bound of the range of rolis (not inclusive)
	 * @return the range of rolis
	 */
	@Override
	public List<roli> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the rolis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link roliModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of rolis
	 * @param end the upper bound of the range of rolis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of rolis
	 */
	@Override
	public List<roli> findAll(int start, int end,
		OrderByComparator<roli> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the rolis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link roliModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of rolis
	 * @param end the upper bound of the range of rolis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of rolis
	 */
	@Override
	public List<roli> findAll(int start, int end,
		OrderByComparator<roli> orderByComparator, boolean retrieveFromCache) {
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

		List<roli> list = null;

		if (retrieveFromCache) {
			list = (List<roli>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ROLI);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ROLI;

				if (pagination) {
					sql = sql.concat(roliModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<roli>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<roli>)QueryUtil.list(q, getDialect(), start,
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
	 * Removes all the rolis from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (roli roli : findAll()) {
			remove(roli);
		}
	}

	/**
	 * Returns the number of rolis.
	 *
	 * @return the number of rolis
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ROLI);

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
		return roliModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the roli persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(roliImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_ROLI = "SELECT roli FROM roli roli";
	private static final String _SQL_SELECT_ROLI_WHERE_PKS_IN = "SELECT roli FROM roli roli WHERE roli_id IN (";
	private static final String _SQL_COUNT_ROLI = "SELECT COUNT(roli) FROM roli roli";
	private static final String _ORDER_BY_ENTITY_ALIAS = "roli.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No roli exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(roliPersistenceImpl.class);
}
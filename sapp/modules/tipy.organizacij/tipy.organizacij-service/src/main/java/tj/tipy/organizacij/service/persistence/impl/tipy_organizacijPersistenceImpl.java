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

package tj.tipy.organizacij.service.persistence.impl;

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

import tj.tipy.organizacij.exception.NoSuchtipy_organizacijException;
import tj.tipy.organizacij.model.impl.tipy_organizacijImpl;
import tj.tipy.organizacij.model.impl.tipy_organizacijModelImpl;
import tj.tipy.organizacij.model.tipy_organizacij;
import tj.tipy.organizacij.service.persistence.tipy_organizacijPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the tipy_organizacij service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tipy_organizacijPersistence
 * @see tj.tipy.organizacij.service.persistence.tipy_organizacijUtil
 * @generated
 */
@ProviderType
public class tipy_organizacijPersistenceImpl extends BasePersistenceImpl<tipy_organizacij>
	implements tipy_organizacijPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link tipy_organizacijUtil} to access the tipy_organizacij persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = tipy_organizacijImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(tipy_organizacijModelImpl.ENTITY_CACHE_ENABLED,
			tipy_organizacijModelImpl.FINDER_CACHE_ENABLED,
			tipy_organizacijImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(tipy_organizacijModelImpl.ENTITY_CACHE_ENABLED,
			tipy_organizacijModelImpl.FINDER_CACHE_ENABLED,
			tipy_organizacijImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(tipy_organizacijModelImpl.ENTITY_CACHE_ENABLED,
			tipy_organizacijModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public tipy_organizacijPersistenceImpl() {
		setModelClass(tipy_organizacij.class);
	}

	/**
	 * Caches the tipy_organizacij in the entity cache if it is enabled.
	 *
	 * @param tipy_organizacij the tipy_organizacij
	 */
	@Override
	public void cacheResult(tipy_organizacij tipy_organizacij) {
		entityCache.putResult(tipy_organizacijModelImpl.ENTITY_CACHE_ENABLED,
			tipy_organizacijImpl.class, tipy_organizacij.getPrimaryKey(),
			tipy_organizacij);

		tipy_organizacij.resetOriginalValues();
	}

	/**
	 * Caches the tipy_organizacijs in the entity cache if it is enabled.
	 *
	 * @param tipy_organizacijs the tipy_organizacijs
	 */
	@Override
	public void cacheResult(List<tipy_organizacij> tipy_organizacijs) {
		for (tipy_organizacij tipy_organizacij : tipy_organizacijs) {
			if (entityCache.getResult(
						tipy_organizacijModelImpl.ENTITY_CACHE_ENABLED,
						tipy_organizacijImpl.class,
						tipy_organizacij.getPrimaryKey()) == null) {
				cacheResult(tipy_organizacij);
			}
			else {
				tipy_organizacij.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tipy_organizacijs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(tipy_organizacijImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tipy_organizacij.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(tipy_organizacij tipy_organizacij) {
		entityCache.removeResult(tipy_organizacijModelImpl.ENTITY_CACHE_ENABLED,
			tipy_organizacijImpl.class, tipy_organizacij.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<tipy_organizacij> tipy_organizacijs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (tipy_organizacij tipy_organizacij : tipy_organizacijs) {
			entityCache.removeResult(tipy_organizacijModelImpl.ENTITY_CACHE_ENABLED,
				tipy_organizacijImpl.class, tipy_organizacij.getPrimaryKey());
		}
	}

	/**
	 * Creates a new tipy_organizacij with the primary key. Does not add the tipy_organizacij to the database.
	 *
	 * @param tipy_organizacij_id the primary key for the new tipy_organizacij
	 * @return the new tipy_organizacij
	 */
	@Override
	public tipy_organizacij create(long tipy_organizacij_id) {
		tipy_organizacij tipy_organizacij = new tipy_organizacijImpl();

		tipy_organizacij.setNew(true);
		tipy_organizacij.setPrimaryKey(tipy_organizacij_id);

		return tipy_organizacij;
	}

	/**
	 * Removes the tipy_organizacij with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tipy_organizacij_id the primary key of the tipy_organizacij
	 * @return the tipy_organizacij that was removed
	 * @throws NoSuchtipy_organizacijException if a tipy_organizacij with the primary key could not be found
	 */
	@Override
	public tipy_organizacij remove(long tipy_organizacij_id)
		throws NoSuchtipy_organizacijException {
		return remove((Serializable)tipy_organizacij_id);
	}

	/**
	 * Removes the tipy_organizacij with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tipy_organizacij
	 * @return the tipy_organizacij that was removed
	 * @throws NoSuchtipy_organizacijException if a tipy_organizacij with the primary key could not be found
	 */
	@Override
	public tipy_organizacij remove(Serializable primaryKey)
		throws NoSuchtipy_organizacijException {
		Session session = null;

		try {
			session = openSession();

			tipy_organizacij tipy_organizacij = (tipy_organizacij)session.get(tipy_organizacijImpl.class,
					primaryKey);

			if (tipy_organizacij == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchtipy_organizacijException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tipy_organizacij);
		}
		catch (NoSuchtipy_organizacijException nsee) {
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
	protected tipy_organizacij removeImpl(tipy_organizacij tipy_organizacij) {
		tipy_organizacij = toUnwrappedModel(tipy_organizacij);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tipy_organizacij)) {
				tipy_organizacij = (tipy_organizacij)session.get(tipy_organizacijImpl.class,
						tipy_organizacij.getPrimaryKeyObj());
			}

			if (tipy_organizacij != null) {
				session.delete(tipy_organizacij);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tipy_organizacij != null) {
			clearCache(tipy_organizacij);
		}

		return tipy_organizacij;
	}

	@Override
	public tipy_organizacij updateImpl(tipy_organizacij tipy_organizacij) {
		tipy_organizacij = toUnwrappedModel(tipy_organizacij);

		boolean isNew = tipy_organizacij.isNew();

		Session session = null;

		try {
			session = openSession();

			if (tipy_organizacij.isNew()) {
				session.save(tipy_organizacij);

				tipy_organizacij.setNew(false);
			}
			else {
				tipy_organizacij = (tipy_organizacij)session.merge(tipy_organizacij);
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

		entityCache.putResult(tipy_organizacijModelImpl.ENTITY_CACHE_ENABLED,
			tipy_organizacijImpl.class, tipy_organizacij.getPrimaryKey(),
			tipy_organizacij, false);

		tipy_organizacij.resetOriginalValues();

		return tipy_organizacij;
	}

	protected tipy_organizacij toUnwrappedModel(
		tipy_organizacij tipy_organizacij) {
		if (tipy_organizacij instanceof tipy_organizacijImpl) {
			return tipy_organizacij;
		}

		tipy_organizacijImpl tipy_organizacijImpl = new tipy_organizacijImpl();

		tipy_organizacijImpl.setNew(tipy_organizacij.isNew());
		tipy_organizacijImpl.setPrimaryKey(tipy_organizacij.getPrimaryKey());

		tipy_organizacijImpl.setTipy_organizacij_id(tipy_organizacij.getTipy_organizacij_id());
		tipy_organizacijImpl.setNazvanie(tipy_organizacij.getNazvanie());

		return tipy_organizacijImpl;
	}

	/**
	 * Returns the tipy_organizacij with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tipy_organizacij
	 * @return the tipy_organizacij
	 * @throws NoSuchtipy_organizacijException if a tipy_organizacij with the primary key could not be found
	 */
	@Override
	public tipy_organizacij findByPrimaryKey(Serializable primaryKey)
		throws NoSuchtipy_organizacijException {
		tipy_organizacij tipy_organizacij = fetchByPrimaryKey(primaryKey);

		if (tipy_organizacij == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchtipy_organizacijException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tipy_organizacij;
	}

	/**
	 * Returns the tipy_organizacij with the primary key or throws a {@link NoSuchtipy_organizacijException} if it could not be found.
	 *
	 * @param tipy_organizacij_id the primary key of the tipy_organizacij
	 * @return the tipy_organizacij
	 * @throws NoSuchtipy_organizacijException if a tipy_organizacij with the primary key could not be found
	 */
	@Override
	public tipy_organizacij findByPrimaryKey(long tipy_organizacij_id)
		throws NoSuchtipy_organizacijException {
		return findByPrimaryKey((Serializable)tipy_organizacij_id);
	}

	/**
	 * Returns the tipy_organizacij with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tipy_organizacij
	 * @return the tipy_organizacij, or <code>null</code> if a tipy_organizacij with the primary key could not be found
	 */
	@Override
	public tipy_organizacij fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(tipy_organizacijModelImpl.ENTITY_CACHE_ENABLED,
				tipy_organizacijImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		tipy_organizacij tipy_organizacij = (tipy_organizacij)serializable;

		if (tipy_organizacij == null) {
			Session session = null;

			try {
				session = openSession();

				tipy_organizacij = (tipy_organizacij)session.get(tipy_organizacijImpl.class,
						primaryKey);

				if (tipy_organizacij != null) {
					cacheResult(tipy_organizacij);
				}
				else {
					entityCache.putResult(tipy_organizacijModelImpl.ENTITY_CACHE_ENABLED,
						tipy_organizacijImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(tipy_organizacijModelImpl.ENTITY_CACHE_ENABLED,
					tipy_organizacijImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tipy_organizacij;
	}

	/**
	 * Returns the tipy_organizacij with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tipy_organizacij_id the primary key of the tipy_organizacij
	 * @return the tipy_organizacij, or <code>null</code> if a tipy_organizacij with the primary key could not be found
	 */
	@Override
	public tipy_organizacij fetchByPrimaryKey(long tipy_organizacij_id) {
		return fetchByPrimaryKey((Serializable)tipy_organizacij_id);
	}

	@Override
	public Map<Serializable, tipy_organizacij> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, tipy_organizacij> map = new HashMap<Serializable, tipy_organizacij>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			tipy_organizacij tipy_organizacij = fetchByPrimaryKey(primaryKey);

			if (tipy_organizacij != null) {
				map.put(primaryKey, tipy_organizacij);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(tipy_organizacijModelImpl.ENTITY_CACHE_ENABLED,
					tipy_organizacijImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (tipy_organizacij)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_TIPY_ORGANIZACIJ_WHERE_PKS_IN);

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

			for (tipy_organizacij tipy_organizacij : (List<tipy_organizacij>)q.list()) {
				map.put(tipy_organizacij.getPrimaryKeyObj(), tipy_organizacij);

				cacheResult(tipy_organizacij);

				uncachedPrimaryKeys.remove(tipy_organizacij.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(tipy_organizacijModelImpl.ENTITY_CACHE_ENABLED,
					tipy_organizacijImpl.class, primaryKey, nullModel);
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
	 * Returns all the tipy_organizacijs.
	 *
	 * @return the tipy_organizacijs
	 */
	@Override
	public List<tipy_organizacij> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tipy_organizacijs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tipy_organizacijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tipy_organizacijs
	 * @param end the upper bound of the range of tipy_organizacijs (not inclusive)
	 * @return the range of tipy_organizacijs
	 */
	@Override
	public List<tipy_organizacij> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tipy_organizacijs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tipy_organizacijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tipy_organizacijs
	 * @param end the upper bound of the range of tipy_organizacijs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tipy_organizacijs
	 */
	@Override
	public List<tipy_organizacij> findAll(int start, int end,
		OrderByComparator<tipy_organizacij> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tipy_organizacijs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tipy_organizacijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tipy_organizacijs
	 * @param end the upper bound of the range of tipy_organizacijs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of tipy_organizacijs
	 */
	@Override
	public List<tipy_organizacij> findAll(int start, int end,
		OrderByComparator<tipy_organizacij> orderByComparator,
		boolean retrieveFromCache) {
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

		List<tipy_organizacij> list = null;

		if (retrieveFromCache) {
			list = (List<tipy_organizacij>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_TIPY_ORGANIZACIJ);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TIPY_ORGANIZACIJ;

				if (pagination) {
					sql = sql.concat(tipy_organizacijModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<tipy_organizacij>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<tipy_organizacij>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the tipy_organizacijs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (tipy_organizacij tipy_organizacij : findAll()) {
			remove(tipy_organizacij);
		}
	}

	/**
	 * Returns the number of tipy_organizacijs.
	 *
	 * @return the number of tipy_organizacijs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_TIPY_ORGANIZACIJ);

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
		return tipy_organizacijModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the tipy_organizacij persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(tipy_organizacijImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_TIPY_ORGANIZACIJ = "SELECT tipy_organizacij FROM tipy_organizacij tipy_organizacij";
	private static final String _SQL_SELECT_TIPY_ORGANIZACIJ_WHERE_PKS_IN = "SELECT tipy_organizacij FROM tipy_organizacij tipy_organizacij WHERE tipy_organizacij_id IN (";
	private static final String _SQL_COUNT_TIPY_ORGANIZACIJ = "SELECT COUNT(tipy_organizacij) FROM tipy_organizacij tipy_organizacij";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tipy_organizacij.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No tipy_organizacij exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(tipy_organizacijPersistenceImpl.class);
}
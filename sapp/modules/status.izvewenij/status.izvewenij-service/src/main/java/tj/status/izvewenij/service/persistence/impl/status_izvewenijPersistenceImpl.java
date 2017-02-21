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

package tj.status.izvewenij.service.persistence.impl;

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

import tj.status.izvewenij.exception.NoSuchstatus_izvewenijException;
import tj.status.izvewenij.model.impl.status_izvewenijImpl;
import tj.status.izvewenij.model.impl.status_izvewenijModelImpl;
import tj.status.izvewenij.model.status_izvewenij;
import tj.status.izvewenij.service.persistence.status_izvewenijPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the status_izvewenij service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see status_izvewenijPersistence
 * @see tj.status.izvewenij.service.persistence.status_izvewenijUtil
 * @generated
 */
@ProviderType
public class status_izvewenijPersistenceImpl extends BasePersistenceImpl<status_izvewenij>
	implements status_izvewenijPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link status_izvewenijUtil} to access the status_izvewenij persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = status_izvewenijImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(status_izvewenijModelImpl.ENTITY_CACHE_ENABLED,
			status_izvewenijModelImpl.FINDER_CACHE_ENABLED,
			status_izvewenijImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(status_izvewenijModelImpl.ENTITY_CACHE_ENABLED,
			status_izvewenijModelImpl.FINDER_CACHE_ENABLED,
			status_izvewenijImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(status_izvewenijModelImpl.ENTITY_CACHE_ENABLED,
			status_izvewenijModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public status_izvewenijPersistenceImpl() {
		setModelClass(status_izvewenij.class);
	}

	/**
	 * Caches the status_izvewenij in the entity cache if it is enabled.
	 *
	 * @param status_izvewenij the status_izvewenij
	 */
	@Override
	public void cacheResult(status_izvewenij status_izvewenij) {
		entityCache.putResult(status_izvewenijModelImpl.ENTITY_CACHE_ENABLED,
			status_izvewenijImpl.class, status_izvewenij.getPrimaryKey(),
			status_izvewenij);

		status_izvewenij.resetOriginalValues();
	}

	/**
	 * Caches the status_izvewenijs in the entity cache if it is enabled.
	 *
	 * @param status_izvewenijs the status_izvewenijs
	 */
	@Override
	public void cacheResult(List<status_izvewenij> status_izvewenijs) {
		for (status_izvewenij status_izvewenij : status_izvewenijs) {
			if (entityCache.getResult(
						status_izvewenijModelImpl.ENTITY_CACHE_ENABLED,
						status_izvewenijImpl.class,
						status_izvewenij.getPrimaryKey()) == null) {
				cacheResult(status_izvewenij);
			}
			else {
				status_izvewenij.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all status_izvewenijs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(status_izvewenijImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the status_izvewenij.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(status_izvewenij status_izvewenij) {
		entityCache.removeResult(status_izvewenijModelImpl.ENTITY_CACHE_ENABLED,
			status_izvewenijImpl.class, status_izvewenij.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<status_izvewenij> status_izvewenijs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (status_izvewenij status_izvewenij : status_izvewenijs) {
			entityCache.removeResult(status_izvewenijModelImpl.ENTITY_CACHE_ENABLED,
				status_izvewenijImpl.class, status_izvewenij.getPrimaryKey());
		}
	}

	/**
	 * Creates a new status_izvewenij with the primary key. Does not add the status_izvewenij to the database.
	 *
	 * @param status_izvewenij_id the primary key for the new status_izvewenij
	 * @return the new status_izvewenij
	 */
	@Override
	public status_izvewenij create(long status_izvewenij_id) {
		status_izvewenij status_izvewenij = new status_izvewenijImpl();

		status_izvewenij.setNew(true);
		status_izvewenij.setPrimaryKey(status_izvewenij_id);

		return status_izvewenij;
	}

	/**
	 * Removes the status_izvewenij with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param status_izvewenij_id the primary key of the status_izvewenij
	 * @return the status_izvewenij that was removed
	 * @throws NoSuchstatus_izvewenijException if a status_izvewenij with the primary key could not be found
	 */
	@Override
	public status_izvewenij remove(long status_izvewenij_id)
		throws NoSuchstatus_izvewenijException {
		return remove((Serializable)status_izvewenij_id);
	}

	/**
	 * Removes the status_izvewenij with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the status_izvewenij
	 * @return the status_izvewenij that was removed
	 * @throws NoSuchstatus_izvewenijException if a status_izvewenij with the primary key could not be found
	 */
	@Override
	public status_izvewenij remove(Serializable primaryKey)
		throws NoSuchstatus_izvewenijException {
		Session session = null;

		try {
			session = openSession();

			status_izvewenij status_izvewenij = (status_izvewenij)session.get(status_izvewenijImpl.class,
					primaryKey);

			if (status_izvewenij == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchstatus_izvewenijException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(status_izvewenij);
		}
		catch (NoSuchstatus_izvewenijException nsee) {
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
	protected status_izvewenij removeImpl(status_izvewenij status_izvewenij) {
		status_izvewenij = toUnwrappedModel(status_izvewenij);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(status_izvewenij)) {
				status_izvewenij = (status_izvewenij)session.get(status_izvewenijImpl.class,
						status_izvewenij.getPrimaryKeyObj());
			}

			if (status_izvewenij != null) {
				session.delete(status_izvewenij);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (status_izvewenij != null) {
			clearCache(status_izvewenij);
		}

		return status_izvewenij;
	}

	@Override
	public status_izvewenij updateImpl(status_izvewenij status_izvewenij) {
		status_izvewenij = toUnwrappedModel(status_izvewenij);

		boolean isNew = status_izvewenij.isNew();

		Session session = null;

		try {
			session = openSession();

			if (status_izvewenij.isNew()) {
				session.save(status_izvewenij);

				status_izvewenij.setNew(false);
			}
			else {
				status_izvewenij = (status_izvewenij)session.merge(status_izvewenij);
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

		entityCache.putResult(status_izvewenijModelImpl.ENTITY_CACHE_ENABLED,
			status_izvewenijImpl.class, status_izvewenij.getPrimaryKey(),
			status_izvewenij, false);

		status_izvewenij.resetOriginalValues();

		return status_izvewenij;
	}

	protected status_izvewenij toUnwrappedModel(
		status_izvewenij status_izvewenij) {
		if (status_izvewenij instanceof status_izvewenijImpl) {
			return status_izvewenij;
		}

		status_izvewenijImpl status_izvewenijImpl = new status_izvewenijImpl();

		status_izvewenijImpl.setNew(status_izvewenij.isNew());
		status_izvewenijImpl.setPrimaryKey(status_izvewenij.getPrimaryKey());

		status_izvewenijImpl.setStatus(status_izvewenij.getStatus());
		status_izvewenijImpl.setStatus_izvewenij_id(status_izvewenij.getStatus_izvewenij_id());

		return status_izvewenijImpl;
	}

	/**
	 * Returns the status_izvewenij with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the status_izvewenij
	 * @return the status_izvewenij
	 * @throws NoSuchstatus_izvewenijException if a status_izvewenij with the primary key could not be found
	 */
	@Override
	public status_izvewenij findByPrimaryKey(Serializable primaryKey)
		throws NoSuchstatus_izvewenijException {
		status_izvewenij status_izvewenij = fetchByPrimaryKey(primaryKey);

		if (status_izvewenij == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchstatus_izvewenijException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return status_izvewenij;
	}

	/**
	 * Returns the status_izvewenij with the primary key or throws a {@link NoSuchstatus_izvewenijException} if it could not be found.
	 *
	 * @param status_izvewenij_id the primary key of the status_izvewenij
	 * @return the status_izvewenij
	 * @throws NoSuchstatus_izvewenijException if a status_izvewenij with the primary key could not be found
	 */
	@Override
	public status_izvewenij findByPrimaryKey(long status_izvewenij_id)
		throws NoSuchstatus_izvewenijException {
		return findByPrimaryKey((Serializable)status_izvewenij_id);
	}

	/**
	 * Returns the status_izvewenij with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the status_izvewenij
	 * @return the status_izvewenij, or <code>null</code> if a status_izvewenij with the primary key could not be found
	 */
	@Override
	public status_izvewenij fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(status_izvewenijModelImpl.ENTITY_CACHE_ENABLED,
				status_izvewenijImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		status_izvewenij status_izvewenij = (status_izvewenij)serializable;

		if (status_izvewenij == null) {
			Session session = null;

			try {
				session = openSession();

				status_izvewenij = (status_izvewenij)session.get(status_izvewenijImpl.class,
						primaryKey);

				if (status_izvewenij != null) {
					cacheResult(status_izvewenij);
				}
				else {
					entityCache.putResult(status_izvewenijModelImpl.ENTITY_CACHE_ENABLED,
						status_izvewenijImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(status_izvewenijModelImpl.ENTITY_CACHE_ENABLED,
					status_izvewenijImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return status_izvewenij;
	}

	/**
	 * Returns the status_izvewenij with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param status_izvewenij_id the primary key of the status_izvewenij
	 * @return the status_izvewenij, or <code>null</code> if a status_izvewenij with the primary key could not be found
	 */
	@Override
	public status_izvewenij fetchByPrimaryKey(long status_izvewenij_id) {
		return fetchByPrimaryKey((Serializable)status_izvewenij_id);
	}

	@Override
	public Map<Serializable, status_izvewenij> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, status_izvewenij> map = new HashMap<Serializable, status_izvewenij>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			status_izvewenij status_izvewenij = fetchByPrimaryKey(primaryKey);

			if (status_izvewenij != null) {
				map.put(primaryKey, status_izvewenij);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(status_izvewenijModelImpl.ENTITY_CACHE_ENABLED,
					status_izvewenijImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (status_izvewenij)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_STATUS_IZVEWENIJ_WHERE_PKS_IN);

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

			for (status_izvewenij status_izvewenij : (List<status_izvewenij>)q.list()) {
				map.put(status_izvewenij.getPrimaryKeyObj(), status_izvewenij);

				cacheResult(status_izvewenij);

				uncachedPrimaryKeys.remove(status_izvewenij.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(status_izvewenijModelImpl.ENTITY_CACHE_ENABLED,
					status_izvewenijImpl.class, primaryKey, nullModel);
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
	 * Returns all the status_izvewenijs.
	 *
	 * @return the status_izvewenijs
	 */
	@Override
	public List<status_izvewenij> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the status_izvewenijs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link status_izvewenijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of status_izvewenijs
	 * @param end the upper bound of the range of status_izvewenijs (not inclusive)
	 * @return the range of status_izvewenijs
	 */
	@Override
	public List<status_izvewenij> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the status_izvewenijs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link status_izvewenijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of status_izvewenijs
	 * @param end the upper bound of the range of status_izvewenijs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of status_izvewenijs
	 */
	@Override
	public List<status_izvewenij> findAll(int start, int end,
		OrderByComparator<status_izvewenij> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the status_izvewenijs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link status_izvewenijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of status_izvewenijs
	 * @param end the upper bound of the range of status_izvewenijs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of status_izvewenijs
	 */
	@Override
	public List<status_izvewenij> findAll(int start, int end,
		OrderByComparator<status_izvewenij> orderByComparator,
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

		List<status_izvewenij> list = null;

		if (retrieveFromCache) {
			list = (List<status_izvewenij>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_STATUS_IZVEWENIJ);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_STATUS_IZVEWENIJ;

				if (pagination) {
					sql = sql.concat(status_izvewenijModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<status_izvewenij>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<status_izvewenij>)QueryUtil.list(q,
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
	 * Removes all the status_izvewenijs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (status_izvewenij status_izvewenij : findAll()) {
			remove(status_izvewenij);
		}
	}

	/**
	 * Returns the number of status_izvewenijs.
	 *
	 * @return the number of status_izvewenijs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_STATUS_IZVEWENIJ);

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
		return status_izvewenijModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the status_izvewenij persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(status_izvewenijImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_STATUS_IZVEWENIJ = "SELECT status_izvewenij FROM status_izvewenij status_izvewenij";
	private static final String _SQL_SELECT_STATUS_IZVEWENIJ_WHERE_PKS_IN = "SELECT status_izvewenij FROM status_izvewenij status_izvewenij WHERE status_izvewenij_id IN (";
	private static final String _SQL_COUNT_STATUS_IZVEWENIJ = "SELECT COUNT(status_izvewenij) FROM status_izvewenij status_izvewenij";
	private static final String _ORDER_BY_ENTITY_ALIAS = "status_izvewenij.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No status_izvewenij exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(status_izvewenijPersistenceImpl.class);
}
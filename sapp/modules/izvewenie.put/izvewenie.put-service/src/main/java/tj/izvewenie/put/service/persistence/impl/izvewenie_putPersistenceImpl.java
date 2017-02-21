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

package tj.izvewenie.put.service.persistence.impl;

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

import tj.izvewenie.put.exception.NoSuchizvewenie_putException;
import tj.izvewenie.put.model.impl.izvewenie_putImpl;
import tj.izvewenie.put.model.impl.izvewenie_putModelImpl;
import tj.izvewenie.put.model.izvewenie_put;
import tj.izvewenie.put.service.persistence.izvewenie_putPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the izvewenie_put service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see izvewenie_putPersistence
 * @see tj.izvewenie.put.service.persistence.izvewenie_putUtil
 * @generated
 */
@ProviderType
public class izvewenie_putPersistenceImpl extends BasePersistenceImpl<izvewenie_put>
	implements izvewenie_putPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link izvewenie_putUtil} to access the izvewenie_put persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = izvewenie_putImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(izvewenie_putModelImpl.ENTITY_CACHE_ENABLED,
			izvewenie_putModelImpl.FINDER_CACHE_ENABLED,
			izvewenie_putImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(izvewenie_putModelImpl.ENTITY_CACHE_ENABLED,
			izvewenie_putModelImpl.FINDER_CACHE_ENABLED,
			izvewenie_putImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(izvewenie_putModelImpl.ENTITY_CACHE_ENABLED,
			izvewenie_putModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public izvewenie_putPersistenceImpl() {
		setModelClass(izvewenie_put.class);
	}

	/**
	 * Caches the izvewenie_put in the entity cache if it is enabled.
	 *
	 * @param izvewenie_put the izvewenie_put
	 */
	@Override
	public void cacheResult(izvewenie_put izvewenie_put) {
		entityCache.putResult(izvewenie_putModelImpl.ENTITY_CACHE_ENABLED,
			izvewenie_putImpl.class, izvewenie_put.getPrimaryKey(),
			izvewenie_put);

		izvewenie_put.resetOriginalValues();
	}

	/**
	 * Caches the izvewenie_puts in the entity cache if it is enabled.
	 *
	 * @param izvewenie_puts the izvewenie_puts
	 */
	@Override
	public void cacheResult(List<izvewenie_put> izvewenie_puts) {
		for (izvewenie_put izvewenie_put : izvewenie_puts) {
			if (entityCache.getResult(
						izvewenie_putModelImpl.ENTITY_CACHE_ENABLED,
						izvewenie_putImpl.class, izvewenie_put.getPrimaryKey()) == null) {
				cacheResult(izvewenie_put);
			}
			else {
				izvewenie_put.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all izvewenie_puts.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(izvewenie_putImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the izvewenie_put.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(izvewenie_put izvewenie_put) {
		entityCache.removeResult(izvewenie_putModelImpl.ENTITY_CACHE_ENABLED,
			izvewenie_putImpl.class, izvewenie_put.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<izvewenie_put> izvewenie_puts) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (izvewenie_put izvewenie_put : izvewenie_puts) {
			entityCache.removeResult(izvewenie_putModelImpl.ENTITY_CACHE_ENABLED,
				izvewenie_putImpl.class, izvewenie_put.getPrimaryKey());
		}
	}

	/**
	 * Creates a new izvewenie_put with the primary key. Does not add the izvewenie_put to the database.
	 *
	 * @param izvewenie_put_id the primary key for the new izvewenie_put
	 * @return the new izvewenie_put
	 */
	@Override
	public izvewenie_put create(long izvewenie_put_id) {
		izvewenie_put izvewenie_put = new izvewenie_putImpl();

		izvewenie_put.setNew(true);
		izvewenie_put.setPrimaryKey(izvewenie_put_id);

		return izvewenie_put;
	}

	/**
	 * Removes the izvewenie_put with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param izvewenie_put_id the primary key of the izvewenie_put
	 * @return the izvewenie_put that was removed
	 * @throws NoSuchizvewenie_putException if a izvewenie_put with the primary key could not be found
	 */
	@Override
	public izvewenie_put remove(long izvewenie_put_id)
		throws NoSuchizvewenie_putException {
		return remove((Serializable)izvewenie_put_id);
	}

	/**
	 * Removes the izvewenie_put with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the izvewenie_put
	 * @return the izvewenie_put that was removed
	 * @throws NoSuchizvewenie_putException if a izvewenie_put with the primary key could not be found
	 */
	@Override
	public izvewenie_put remove(Serializable primaryKey)
		throws NoSuchizvewenie_putException {
		Session session = null;

		try {
			session = openSession();

			izvewenie_put izvewenie_put = (izvewenie_put)session.get(izvewenie_putImpl.class,
					primaryKey);

			if (izvewenie_put == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchizvewenie_putException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(izvewenie_put);
		}
		catch (NoSuchizvewenie_putException nsee) {
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
	protected izvewenie_put removeImpl(izvewenie_put izvewenie_put) {
		izvewenie_put = toUnwrappedModel(izvewenie_put);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(izvewenie_put)) {
				izvewenie_put = (izvewenie_put)session.get(izvewenie_putImpl.class,
						izvewenie_put.getPrimaryKeyObj());
			}

			if (izvewenie_put != null) {
				session.delete(izvewenie_put);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (izvewenie_put != null) {
			clearCache(izvewenie_put);
		}

		return izvewenie_put;
	}

	@Override
	public izvewenie_put updateImpl(izvewenie_put izvewenie_put) {
		izvewenie_put = toUnwrappedModel(izvewenie_put);

		boolean isNew = izvewenie_put.isNew();

		Session session = null;

		try {
			session = openSession();

			if (izvewenie_put.isNew()) {
				session.save(izvewenie_put);

				izvewenie_put.setNew(false);
			}
			else {
				izvewenie_put = (izvewenie_put)session.merge(izvewenie_put);
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

		entityCache.putResult(izvewenie_putModelImpl.ENTITY_CACHE_ENABLED,
			izvewenie_putImpl.class, izvewenie_put.getPrimaryKey(),
			izvewenie_put, false);

		izvewenie_put.resetOriginalValues();

		return izvewenie_put;
	}

	protected izvewenie_put toUnwrappedModel(izvewenie_put izvewenie_put) {
		if (izvewenie_put instanceof izvewenie_putImpl) {
			return izvewenie_put;
		}

		izvewenie_putImpl izvewenie_putImpl = new izvewenie_putImpl();

		izvewenie_putImpl.setNew(izvewenie_put.isNew());
		izvewenie_putImpl.setPrimaryKey(izvewenie_put.getPrimaryKey());

		izvewenie_putImpl.setIzvewenie_id(izvewenie_put.getIzvewenie_id());
		izvewenie_putImpl.setIzvewenie_put_id(izvewenie_put.getIzvewenie_put_id());
		izvewenie_putImpl.setPut_a(izvewenie_put.getPut_a());
		izvewenie_putImpl.setPut_b(izvewenie_put.getPut_b());
		izvewenie_putImpl.setPut_c(izvewenie_put.getPut_c());

		return izvewenie_putImpl;
	}

	/**
	 * Returns the izvewenie_put with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the izvewenie_put
	 * @return the izvewenie_put
	 * @throws NoSuchizvewenie_putException if a izvewenie_put with the primary key could not be found
	 */
	@Override
	public izvewenie_put findByPrimaryKey(Serializable primaryKey)
		throws NoSuchizvewenie_putException {
		izvewenie_put izvewenie_put = fetchByPrimaryKey(primaryKey);

		if (izvewenie_put == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchizvewenie_putException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return izvewenie_put;
	}

	/**
	 * Returns the izvewenie_put with the primary key or throws a {@link NoSuchizvewenie_putException} if it could not be found.
	 *
	 * @param izvewenie_put_id the primary key of the izvewenie_put
	 * @return the izvewenie_put
	 * @throws NoSuchizvewenie_putException if a izvewenie_put with the primary key could not be found
	 */
	@Override
	public izvewenie_put findByPrimaryKey(long izvewenie_put_id)
		throws NoSuchizvewenie_putException {
		return findByPrimaryKey((Serializable)izvewenie_put_id);
	}

	/**
	 * Returns the izvewenie_put with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the izvewenie_put
	 * @return the izvewenie_put, or <code>null</code> if a izvewenie_put with the primary key could not be found
	 */
	@Override
	public izvewenie_put fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(izvewenie_putModelImpl.ENTITY_CACHE_ENABLED,
				izvewenie_putImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		izvewenie_put izvewenie_put = (izvewenie_put)serializable;

		if (izvewenie_put == null) {
			Session session = null;

			try {
				session = openSession();

				izvewenie_put = (izvewenie_put)session.get(izvewenie_putImpl.class,
						primaryKey);

				if (izvewenie_put != null) {
					cacheResult(izvewenie_put);
				}
				else {
					entityCache.putResult(izvewenie_putModelImpl.ENTITY_CACHE_ENABLED,
						izvewenie_putImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(izvewenie_putModelImpl.ENTITY_CACHE_ENABLED,
					izvewenie_putImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return izvewenie_put;
	}

	/**
	 * Returns the izvewenie_put with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param izvewenie_put_id the primary key of the izvewenie_put
	 * @return the izvewenie_put, or <code>null</code> if a izvewenie_put with the primary key could not be found
	 */
	@Override
	public izvewenie_put fetchByPrimaryKey(long izvewenie_put_id) {
		return fetchByPrimaryKey((Serializable)izvewenie_put_id);
	}

	@Override
	public Map<Serializable, izvewenie_put> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, izvewenie_put> map = new HashMap<Serializable, izvewenie_put>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			izvewenie_put izvewenie_put = fetchByPrimaryKey(primaryKey);

			if (izvewenie_put != null) {
				map.put(primaryKey, izvewenie_put);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(izvewenie_putModelImpl.ENTITY_CACHE_ENABLED,
					izvewenie_putImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (izvewenie_put)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_IZVEWENIE_PUT_WHERE_PKS_IN);

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

			for (izvewenie_put izvewenie_put : (List<izvewenie_put>)q.list()) {
				map.put(izvewenie_put.getPrimaryKeyObj(), izvewenie_put);

				cacheResult(izvewenie_put);

				uncachedPrimaryKeys.remove(izvewenie_put.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(izvewenie_putModelImpl.ENTITY_CACHE_ENABLED,
					izvewenie_putImpl.class, primaryKey, nullModel);
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
	 * Returns all the izvewenie_puts.
	 *
	 * @return the izvewenie_puts
	 */
	@Override
	public List<izvewenie_put> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the izvewenie_puts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link izvewenie_putModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of izvewenie_puts
	 * @param end the upper bound of the range of izvewenie_puts (not inclusive)
	 * @return the range of izvewenie_puts
	 */
	@Override
	public List<izvewenie_put> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the izvewenie_puts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link izvewenie_putModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of izvewenie_puts
	 * @param end the upper bound of the range of izvewenie_puts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of izvewenie_puts
	 */
	@Override
	public List<izvewenie_put> findAll(int start, int end,
		OrderByComparator<izvewenie_put> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the izvewenie_puts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link izvewenie_putModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of izvewenie_puts
	 * @param end the upper bound of the range of izvewenie_puts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of izvewenie_puts
	 */
	@Override
	public List<izvewenie_put> findAll(int start, int end,
		OrderByComparator<izvewenie_put> orderByComparator,
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

		List<izvewenie_put> list = null;

		if (retrieveFromCache) {
			list = (List<izvewenie_put>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_IZVEWENIE_PUT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_IZVEWENIE_PUT;

				if (pagination) {
					sql = sql.concat(izvewenie_putModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<izvewenie_put>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<izvewenie_put>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Removes all the izvewenie_puts from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (izvewenie_put izvewenie_put : findAll()) {
			remove(izvewenie_put);
		}
	}

	/**
	 * Returns the number of izvewenie_puts.
	 *
	 * @return the number of izvewenie_puts
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_IZVEWENIE_PUT);

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
		return izvewenie_putModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the izvewenie_put persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(izvewenie_putImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_IZVEWENIE_PUT = "SELECT izvewenie_put FROM izvewenie_put izvewenie_put";
	private static final String _SQL_SELECT_IZVEWENIE_PUT_WHERE_PKS_IN = "SELECT izvewenie_put FROM izvewenie_put izvewenie_put WHERE izvewenie_put_id IN (";
	private static final String _SQL_COUNT_IZVEWENIE_PUT = "SELECT COUNT(izvewenie_put) FROM izvewenie_put izvewenie_put";
	private static final String _ORDER_BY_ENTITY_ALIAS = "izvewenie_put.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No izvewenie_put exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(izvewenie_putPersistenceImpl.class);
}
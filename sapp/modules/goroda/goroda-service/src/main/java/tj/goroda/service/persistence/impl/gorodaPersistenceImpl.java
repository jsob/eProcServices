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

package tj.goroda.service.persistence.impl;

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

import tj.goroda.exception.NoSuchgorodaException;

import tj.goroda.model.goroda;
import tj.goroda.model.impl.gorodaImpl;
import tj.goroda.model.impl.gorodaModelImpl;

import tj.goroda.service.persistence.gorodaPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the goroda service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see gorodaPersistence
 * @see tj.goroda.service.persistence.gorodaUtil
 * @generated
 */
@ProviderType
public class gorodaPersistenceImpl extends BasePersistenceImpl<goroda>
	implements gorodaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link gorodaUtil} to access the goroda persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = gorodaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(gorodaModelImpl.ENTITY_CACHE_ENABLED,
			gorodaModelImpl.FINDER_CACHE_ENABLED, gorodaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(gorodaModelImpl.ENTITY_CACHE_ENABLED,
			gorodaModelImpl.FINDER_CACHE_ENABLED, gorodaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(gorodaModelImpl.ENTITY_CACHE_ENABLED,
			gorodaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public gorodaPersistenceImpl() {
		setModelClass(goroda.class);
	}

	/**
	 * Caches the goroda in the entity cache if it is enabled.
	 *
	 * @param goroda the goroda
	 */
	@Override
	public void cacheResult(goroda goroda) {
		entityCache.putResult(gorodaModelImpl.ENTITY_CACHE_ENABLED,
			gorodaImpl.class, goroda.getPrimaryKey(), goroda);

		goroda.resetOriginalValues();
	}

	/**
	 * Caches the gorodas in the entity cache if it is enabled.
	 *
	 * @param gorodas the gorodas
	 */
	@Override
	public void cacheResult(List<goroda> gorodas) {
		for (goroda goroda : gorodas) {
			if (entityCache.getResult(gorodaModelImpl.ENTITY_CACHE_ENABLED,
						gorodaImpl.class, goroda.getPrimaryKey()) == null) {
				cacheResult(goroda);
			}
			else {
				goroda.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all gorodas.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(gorodaImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the goroda.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(goroda goroda) {
		entityCache.removeResult(gorodaModelImpl.ENTITY_CACHE_ENABLED,
			gorodaImpl.class, goroda.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<goroda> gorodas) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (goroda goroda : gorodas) {
			entityCache.removeResult(gorodaModelImpl.ENTITY_CACHE_ENABLED,
				gorodaImpl.class, goroda.getPrimaryKey());
		}
	}

	/**
	 * Creates a new goroda with the primary key. Does not add the goroda to the database.
	 *
	 * @param goroda_id the primary key for the new goroda
	 * @return the new goroda
	 */
	@Override
	public goroda create(long goroda_id) {
		goroda goroda = new gorodaImpl();

		goroda.setNew(true);
		goroda.setPrimaryKey(goroda_id);

		return goroda;
	}

	/**
	 * Removes the goroda with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param goroda_id the primary key of the goroda
	 * @return the goroda that was removed
	 * @throws NoSuchgorodaException if a goroda with the primary key could not be found
	 */
	@Override
	public goroda remove(long goroda_id) throws NoSuchgorodaException {
		return remove((Serializable)goroda_id);
	}

	/**
	 * Removes the goroda with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the goroda
	 * @return the goroda that was removed
	 * @throws NoSuchgorodaException if a goroda with the primary key could not be found
	 */
	@Override
	public goroda remove(Serializable primaryKey) throws NoSuchgorodaException {
		Session session = null;

		try {
			session = openSession();

			goroda goroda = (goroda)session.get(gorodaImpl.class, primaryKey);

			if (goroda == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchgorodaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(goroda);
		}
		catch (NoSuchgorodaException nsee) {
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
	protected goroda removeImpl(goroda goroda) {
		goroda = toUnwrappedModel(goroda);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(goroda)) {
				goroda = (goroda)session.get(gorodaImpl.class,
						goroda.getPrimaryKeyObj());
			}

			if (goroda != null) {
				session.delete(goroda);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (goroda != null) {
			clearCache(goroda);
		}

		return goroda;
	}

	@Override
	public goroda updateImpl(goroda goroda) {
		goroda = toUnwrappedModel(goroda);

		boolean isNew = goroda.isNew();

		Session session = null;

		try {
			session = openSession();

			if (goroda.isNew()) {
				session.save(goroda);

				goroda.setNew(false);
			}
			else {
				goroda = (goroda)session.merge(goroda);
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

		entityCache.putResult(gorodaModelImpl.ENTITY_CACHE_ENABLED,
			gorodaImpl.class, goroda.getPrimaryKey(), goroda, false);

		goroda.resetOriginalValues();

		return goroda;
	}

	protected goroda toUnwrappedModel(goroda goroda) {
		if (goroda instanceof gorodaImpl) {
			return goroda;
		}

		gorodaImpl gorodaImpl = new gorodaImpl();

		gorodaImpl.setNew(goroda.isNew());
		gorodaImpl.setPrimaryKey(goroda.getPrimaryKey());

		gorodaImpl.setGoroda_id(goroda.getGoroda_id());
		gorodaImpl.setNazvanie(goroda.getNazvanie());

		return gorodaImpl;
	}

	/**
	 * Returns the goroda with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the goroda
	 * @return the goroda
	 * @throws NoSuchgorodaException if a goroda with the primary key could not be found
	 */
	@Override
	public goroda findByPrimaryKey(Serializable primaryKey)
		throws NoSuchgorodaException {
		goroda goroda = fetchByPrimaryKey(primaryKey);

		if (goroda == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchgorodaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return goroda;
	}

	/**
	 * Returns the goroda with the primary key or throws a {@link NoSuchgorodaException} if it could not be found.
	 *
	 * @param goroda_id the primary key of the goroda
	 * @return the goroda
	 * @throws NoSuchgorodaException if a goroda with the primary key could not be found
	 */
	@Override
	public goroda findByPrimaryKey(long goroda_id) throws NoSuchgorodaException {
		return findByPrimaryKey((Serializable)goroda_id);
	}

	/**
	 * Returns the goroda with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the goroda
	 * @return the goroda, or <code>null</code> if a goroda with the primary key could not be found
	 */
	@Override
	public goroda fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(gorodaModelImpl.ENTITY_CACHE_ENABLED,
				gorodaImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		goroda goroda = (goroda)serializable;

		if (goroda == null) {
			Session session = null;

			try {
				session = openSession();

				goroda = (goroda)session.get(gorodaImpl.class, primaryKey);

				if (goroda != null) {
					cacheResult(goroda);
				}
				else {
					entityCache.putResult(gorodaModelImpl.ENTITY_CACHE_ENABLED,
						gorodaImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(gorodaModelImpl.ENTITY_CACHE_ENABLED,
					gorodaImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return goroda;
	}

	/**
	 * Returns the goroda with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param goroda_id the primary key of the goroda
	 * @return the goroda, or <code>null</code> if a goroda with the primary key could not be found
	 */
	@Override
	public goroda fetchByPrimaryKey(long goroda_id) {
		return fetchByPrimaryKey((Serializable)goroda_id);
	}

	@Override
	public Map<Serializable, goroda> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, goroda> map = new HashMap<Serializable, goroda>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			goroda goroda = fetchByPrimaryKey(primaryKey);

			if (goroda != null) {
				map.put(primaryKey, goroda);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(gorodaModelImpl.ENTITY_CACHE_ENABLED,
					gorodaImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (goroda)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_GORODA_WHERE_PKS_IN);

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

			for (goroda goroda : (List<goroda>)q.list()) {
				map.put(goroda.getPrimaryKeyObj(), goroda);

				cacheResult(goroda);

				uncachedPrimaryKeys.remove(goroda.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(gorodaModelImpl.ENTITY_CACHE_ENABLED,
					gorodaImpl.class, primaryKey, nullModel);
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
	 * Returns all the gorodas.
	 *
	 * @return the gorodas
	 */
	@Override
	public List<goroda> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the gorodas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link gorodaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of gorodas
	 * @param end the upper bound of the range of gorodas (not inclusive)
	 * @return the range of gorodas
	 */
	@Override
	public List<goroda> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the gorodas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link gorodaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of gorodas
	 * @param end the upper bound of the range of gorodas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of gorodas
	 */
	@Override
	public List<goroda> findAll(int start, int end,
		OrderByComparator<goroda> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the gorodas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link gorodaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of gorodas
	 * @param end the upper bound of the range of gorodas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of gorodas
	 */
	@Override
	public List<goroda> findAll(int start, int end,
		OrderByComparator<goroda> orderByComparator, boolean retrieveFromCache) {
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

		List<goroda> list = null;

		if (retrieveFromCache) {
			list = (List<goroda>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_GORODA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_GORODA;

				if (pagination) {
					sql = sql.concat(gorodaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<goroda>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<goroda>)QueryUtil.list(q, getDialect(), start,
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
	 * Removes all the gorodas from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (goroda goroda : findAll()) {
			remove(goroda);
		}
	}

	/**
	 * Returns the number of gorodas.
	 *
	 * @return the number of gorodas
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_GORODA);

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
		return gorodaModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the goroda persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(gorodaImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_GORODA = "SELECT goroda FROM goroda goroda";
	private static final String _SQL_SELECT_GORODA_WHERE_PKS_IN = "SELECT goroda FROM goroda goroda WHERE goroda_id IN (";
	private static final String _SQL_COUNT_GORODA = "SELECT COUNT(goroda) FROM goroda goroda";
	private static final String _ORDER_BY_ENTITY_ALIAS = "goroda.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No goroda exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(gorodaPersistenceImpl.class);
}
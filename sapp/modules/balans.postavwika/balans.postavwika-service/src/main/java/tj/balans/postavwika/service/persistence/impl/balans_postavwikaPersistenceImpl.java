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

package tj.balans.postavwika.service.persistence.impl;

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

import tj.balans.postavwika.exception.NoSuchbalans_postavwikaException;
import tj.balans.postavwika.model.balans_postavwika;
import tj.balans.postavwika.model.impl.balans_postavwikaImpl;
import tj.balans.postavwika.model.impl.balans_postavwikaModelImpl;
import tj.balans.postavwika.service.persistence.balans_postavwikaPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the balans_postavwika service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see balans_postavwikaPersistence
 * @see tj.balans.postavwika.service.persistence.balans_postavwikaUtil
 * @generated
 */
@ProviderType
public class balans_postavwikaPersistenceImpl extends BasePersistenceImpl<balans_postavwika>
	implements balans_postavwikaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link balans_postavwikaUtil} to access the balans_postavwika persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = balans_postavwikaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(balans_postavwikaModelImpl.ENTITY_CACHE_ENABLED,
			balans_postavwikaModelImpl.FINDER_CACHE_ENABLED,
			balans_postavwikaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(balans_postavwikaModelImpl.ENTITY_CACHE_ENABLED,
			balans_postavwikaModelImpl.FINDER_CACHE_ENABLED,
			balans_postavwikaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(balans_postavwikaModelImpl.ENTITY_CACHE_ENABLED,
			balans_postavwikaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public balans_postavwikaPersistenceImpl() {
		setModelClass(balans_postavwika.class);
	}

	/**
	 * Caches the balans_postavwika in the entity cache if it is enabled.
	 *
	 * @param balans_postavwika the balans_postavwika
	 */
	@Override
	public void cacheResult(balans_postavwika balans_postavwika) {
		entityCache.putResult(balans_postavwikaModelImpl.ENTITY_CACHE_ENABLED,
			balans_postavwikaImpl.class, balans_postavwika.getPrimaryKey(),
			balans_postavwika);

		balans_postavwika.resetOriginalValues();
	}

	/**
	 * Caches the balans_postavwikas in the entity cache if it is enabled.
	 *
	 * @param balans_postavwikas the balans_postavwikas
	 */
	@Override
	public void cacheResult(List<balans_postavwika> balans_postavwikas) {
		for (balans_postavwika balans_postavwika : balans_postavwikas) {
			if (entityCache.getResult(
						balans_postavwikaModelImpl.ENTITY_CACHE_ENABLED,
						balans_postavwikaImpl.class,
						balans_postavwika.getPrimaryKey()) == null) {
				cacheResult(balans_postavwika);
			}
			else {
				balans_postavwika.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all balans_postavwikas.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(balans_postavwikaImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the balans_postavwika.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(balans_postavwika balans_postavwika) {
		entityCache.removeResult(balans_postavwikaModelImpl.ENTITY_CACHE_ENABLED,
			balans_postavwikaImpl.class, balans_postavwika.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<balans_postavwika> balans_postavwikas) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (balans_postavwika balans_postavwika : balans_postavwikas) {
			entityCache.removeResult(balans_postavwikaModelImpl.ENTITY_CACHE_ENABLED,
				balans_postavwikaImpl.class, balans_postavwika.getPrimaryKey());
		}
	}

	/**
	 * Creates a new balans_postavwika with the primary key. Does not add the balans_postavwika to the database.
	 *
	 * @param balans_postavwika_id the primary key for the new balans_postavwika
	 * @return the new balans_postavwika
	 */
	@Override
	public balans_postavwika create(long balans_postavwika_id) {
		balans_postavwika balans_postavwika = new balans_postavwikaImpl();

		balans_postavwika.setNew(true);
		balans_postavwika.setPrimaryKey(balans_postavwika_id);

		return balans_postavwika;
	}

	/**
	 * Removes the balans_postavwika with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param balans_postavwika_id the primary key of the balans_postavwika
	 * @return the balans_postavwika that was removed
	 * @throws NoSuchbalans_postavwikaException if a balans_postavwika with the primary key could not be found
	 */
	@Override
	public balans_postavwika remove(long balans_postavwika_id)
		throws NoSuchbalans_postavwikaException {
		return remove((Serializable)balans_postavwika_id);
	}

	/**
	 * Removes the balans_postavwika with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the balans_postavwika
	 * @return the balans_postavwika that was removed
	 * @throws NoSuchbalans_postavwikaException if a balans_postavwika with the primary key could not be found
	 */
	@Override
	public balans_postavwika remove(Serializable primaryKey)
		throws NoSuchbalans_postavwikaException {
		Session session = null;

		try {
			session = openSession();

			balans_postavwika balans_postavwika = (balans_postavwika)session.get(balans_postavwikaImpl.class,
					primaryKey);

			if (balans_postavwika == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchbalans_postavwikaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(balans_postavwika);
		}
		catch (NoSuchbalans_postavwikaException nsee) {
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
	protected balans_postavwika removeImpl(balans_postavwika balans_postavwika) {
		balans_postavwika = toUnwrappedModel(balans_postavwika);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(balans_postavwika)) {
				balans_postavwika = (balans_postavwika)session.get(balans_postavwikaImpl.class,
						balans_postavwika.getPrimaryKeyObj());
			}

			if (balans_postavwika != null) {
				session.delete(balans_postavwika);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (balans_postavwika != null) {
			clearCache(balans_postavwika);
		}

		return balans_postavwika;
	}

	@Override
	public balans_postavwika updateImpl(balans_postavwika balans_postavwika) {
		balans_postavwika = toUnwrappedModel(balans_postavwika);

		boolean isNew = balans_postavwika.isNew();

		Session session = null;

		try {
			session = openSession();

			if (balans_postavwika.isNew()) {
				session.save(balans_postavwika);

				balans_postavwika.setNew(false);
			}
			else {
				balans_postavwika = (balans_postavwika)session.merge(balans_postavwika);
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

		entityCache.putResult(balans_postavwikaModelImpl.ENTITY_CACHE_ENABLED,
			balans_postavwikaImpl.class, balans_postavwika.getPrimaryKey(),
			balans_postavwika, false);

		balans_postavwika.resetOriginalValues();

		return balans_postavwika;
	}

	protected balans_postavwika toUnwrappedModel(
		balans_postavwika balans_postavwika) {
		if (balans_postavwika instanceof balans_postavwikaImpl) {
			return balans_postavwika;
		}

		balans_postavwikaImpl balans_postavwikaImpl = new balans_postavwikaImpl();

		balans_postavwikaImpl.setNew(balans_postavwika.isNew());
		balans_postavwikaImpl.setPrimaryKey(balans_postavwika.getPrimaryKey());

		balans_postavwikaImpl.setBalans_postavwika_id(balans_postavwika.getBalans_postavwika_id());
		balans_postavwikaImpl.setBalans(balans_postavwika.getBalans());
		balans_postavwikaImpl.setPostavwik_id(balans_postavwika.getPostavwik_id());

		return balans_postavwikaImpl;
	}

	/**
	 * Returns the balans_postavwika with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the balans_postavwika
	 * @return the balans_postavwika
	 * @throws NoSuchbalans_postavwikaException if a balans_postavwika with the primary key could not be found
	 */
	@Override
	public balans_postavwika findByPrimaryKey(Serializable primaryKey)
		throws NoSuchbalans_postavwikaException {
		balans_postavwika balans_postavwika = fetchByPrimaryKey(primaryKey);

		if (balans_postavwika == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchbalans_postavwikaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return balans_postavwika;
	}

	/**
	 * Returns the balans_postavwika with the primary key or throws a {@link NoSuchbalans_postavwikaException} if it could not be found.
	 *
	 * @param balans_postavwika_id the primary key of the balans_postavwika
	 * @return the balans_postavwika
	 * @throws NoSuchbalans_postavwikaException if a balans_postavwika with the primary key could not be found
	 */
	@Override
	public balans_postavwika findByPrimaryKey(long balans_postavwika_id)
		throws NoSuchbalans_postavwikaException {
		return findByPrimaryKey((Serializable)balans_postavwika_id);
	}

	/**
	 * Returns the balans_postavwika with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the balans_postavwika
	 * @return the balans_postavwika, or <code>null</code> if a balans_postavwika with the primary key could not be found
	 */
	@Override
	public balans_postavwika fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(balans_postavwikaModelImpl.ENTITY_CACHE_ENABLED,
				balans_postavwikaImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		balans_postavwika balans_postavwika = (balans_postavwika)serializable;

		if (balans_postavwika == null) {
			Session session = null;

			try {
				session = openSession();

				balans_postavwika = (balans_postavwika)session.get(balans_postavwikaImpl.class,
						primaryKey);

				if (balans_postavwika != null) {
					cacheResult(balans_postavwika);
				}
				else {
					entityCache.putResult(balans_postavwikaModelImpl.ENTITY_CACHE_ENABLED,
						balans_postavwikaImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(balans_postavwikaModelImpl.ENTITY_CACHE_ENABLED,
					balans_postavwikaImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return balans_postavwika;
	}

	/**
	 * Returns the balans_postavwika with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param balans_postavwika_id the primary key of the balans_postavwika
	 * @return the balans_postavwika, or <code>null</code> if a balans_postavwika with the primary key could not be found
	 */
	@Override
	public balans_postavwika fetchByPrimaryKey(long balans_postavwika_id) {
		return fetchByPrimaryKey((Serializable)balans_postavwika_id);
	}

	@Override
	public Map<Serializable, balans_postavwika> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, balans_postavwika> map = new HashMap<Serializable, balans_postavwika>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			balans_postavwika balans_postavwika = fetchByPrimaryKey(primaryKey);

			if (balans_postavwika != null) {
				map.put(primaryKey, balans_postavwika);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(balans_postavwikaModelImpl.ENTITY_CACHE_ENABLED,
					balans_postavwikaImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (balans_postavwika)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_BALANS_POSTAVWIKA_WHERE_PKS_IN);

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

			for (balans_postavwika balans_postavwika : (List<balans_postavwika>)q.list()) {
				map.put(balans_postavwika.getPrimaryKeyObj(), balans_postavwika);

				cacheResult(balans_postavwika);

				uncachedPrimaryKeys.remove(balans_postavwika.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(balans_postavwikaModelImpl.ENTITY_CACHE_ENABLED,
					balans_postavwikaImpl.class, primaryKey, nullModel);
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
	 * Returns all the balans_postavwikas.
	 *
	 * @return the balans_postavwikas
	 */
	@Override
	public List<balans_postavwika> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the balans_postavwikas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link balans_postavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of balans_postavwikas
	 * @param end the upper bound of the range of balans_postavwikas (not inclusive)
	 * @return the range of balans_postavwikas
	 */
	@Override
	public List<balans_postavwika> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the balans_postavwikas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link balans_postavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of balans_postavwikas
	 * @param end the upper bound of the range of balans_postavwikas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of balans_postavwikas
	 */
	@Override
	public List<balans_postavwika> findAll(int start, int end,
		OrderByComparator<balans_postavwika> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the balans_postavwikas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link balans_postavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of balans_postavwikas
	 * @param end the upper bound of the range of balans_postavwikas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of balans_postavwikas
	 */
	@Override
	public List<balans_postavwika> findAll(int start, int end,
		OrderByComparator<balans_postavwika> orderByComparator,
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

		List<balans_postavwika> list = null;

		if (retrieveFromCache) {
			list = (List<balans_postavwika>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_BALANS_POSTAVWIKA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_BALANS_POSTAVWIKA;

				if (pagination) {
					sql = sql.concat(balans_postavwikaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<balans_postavwika>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<balans_postavwika>)QueryUtil.list(q,
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
	 * Removes all the balans_postavwikas from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (balans_postavwika balans_postavwika : findAll()) {
			remove(balans_postavwika);
		}
	}

	/**
	 * Returns the number of balans_postavwikas.
	 *
	 * @return the number of balans_postavwikas
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_BALANS_POSTAVWIKA);

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
		return balans_postavwikaModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the balans_postavwika persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(balans_postavwikaImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_BALANS_POSTAVWIKA = "SELECT balans_postavwika FROM balans_postavwika balans_postavwika";
	private static final String _SQL_SELECT_BALANS_POSTAVWIKA_WHERE_PKS_IN = "SELECT balans_postavwika FROM balans_postavwika balans_postavwika WHERE balans_postavwika_id IN (";
	private static final String _SQL_COUNT_BALANS_POSTAVWIKA = "SELECT COUNT(balans_postavwika) FROM balans_postavwika balans_postavwika";
	private static final String _ORDER_BY_ENTITY_ALIAS = "balans_postavwika.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No balans_postavwika exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(balans_postavwikaPersistenceImpl.class);
}
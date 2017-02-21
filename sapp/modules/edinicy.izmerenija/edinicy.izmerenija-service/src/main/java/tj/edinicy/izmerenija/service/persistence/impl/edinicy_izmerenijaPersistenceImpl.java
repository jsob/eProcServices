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

package tj.edinicy.izmerenija.service.persistence.impl;

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

import tj.edinicy.izmerenija.exception.NoSuchedinicy_izmerenijaException;
import tj.edinicy.izmerenija.model.edinicy_izmerenija;
import tj.edinicy.izmerenija.model.impl.edinicy_izmerenijaImpl;
import tj.edinicy.izmerenija.model.impl.edinicy_izmerenijaModelImpl;
import tj.edinicy.izmerenija.service.persistence.edinicy_izmerenijaPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the edinicy_izmerenija service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see edinicy_izmerenijaPersistence
 * @see tj.edinicy.izmerenija.service.persistence.edinicy_izmerenijaUtil
 * @generated
 */
@ProviderType
public class edinicy_izmerenijaPersistenceImpl extends BasePersistenceImpl<edinicy_izmerenija>
	implements edinicy_izmerenijaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link edinicy_izmerenijaUtil} to access the edinicy_izmerenija persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = edinicy_izmerenijaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(edinicy_izmerenijaModelImpl.ENTITY_CACHE_ENABLED,
			edinicy_izmerenijaModelImpl.FINDER_CACHE_ENABLED,
			edinicy_izmerenijaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(edinicy_izmerenijaModelImpl.ENTITY_CACHE_ENABLED,
			edinicy_izmerenijaModelImpl.FINDER_CACHE_ENABLED,
			edinicy_izmerenijaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(edinicy_izmerenijaModelImpl.ENTITY_CACHE_ENABLED,
			edinicy_izmerenijaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public edinicy_izmerenijaPersistenceImpl() {
		setModelClass(edinicy_izmerenija.class);
	}

	/**
	 * Caches the edinicy_izmerenija in the entity cache if it is enabled.
	 *
	 * @param edinicy_izmerenija the edinicy_izmerenija
	 */
	@Override
	public void cacheResult(edinicy_izmerenija edinicy_izmerenija) {
		entityCache.putResult(edinicy_izmerenijaModelImpl.ENTITY_CACHE_ENABLED,
			edinicy_izmerenijaImpl.class, edinicy_izmerenija.getPrimaryKey(),
			edinicy_izmerenija);

		edinicy_izmerenija.resetOriginalValues();
	}

	/**
	 * Caches the edinicy_izmerenijas in the entity cache if it is enabled.
	 *
	 * @param edinicy_izmerenijas the edinicy_izmerenijas
	 */
	@Override
	public void cacheResult(List<edinicy_izmerenija> edinicy_izmerenijas) {
		for (edinicy_izmerenija edinicy_izmerenija : edinicy_izmerenijas) {
			if (entityCache.getResult(
						edinicy_izmerenijaModelImpl.ENTITY_CACHE_ENABLED,
						edinicy_izmerenijaImpl.class,
						edinicy_izmerenija.getPrimaryKey()) == null) {
				cacheResult(edinicy_izmerenija);
			}
			else {
				edinicy_izmerenija.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all edinicy_izmerenijas.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(edinicy_izmerenijaImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the edinicy_izmerenija.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(edinicy_izmerenija edinicy_izmerenija) {
		entityCache.removeResult(edinicy_izmerenijaModelImpl.ENTITY_CACHE_ENABLED,
			edinicy_izmerenijaImpl.class, edinicy_izmerenija.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<edinicy_izmerenija> edinicy_izmerenijas) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (edinicy_izmerenija edinicy_izmerenija : edinicy_izmerenijas) {
			entityCache.removeResult(edinicy_izmerenijaModelImpl.ENTITY_CACHE_ENABLED,
				edinicy_izmerenijaImpl.class, edinicy_izmerenija.getPrimaryKey());
		}
	}

	/**
	 * Creates a new edinicy_izmerenija with the primary key. Does not add the edinicy_izmerenija to the database.
	 *
	 * @param edinicy_izmerenija_id the primary key for the new edinicy_izmerenija
	 * @return the new edinicy_izmerenija
	 */
	@Override
	public edinicy_izmerenija create(long edinicy_izmerenija_id) {
		edinicy_izmerenija edinicy_izmerenija = new edinicy_izmerenijaImpl();

		edinicy_izmerenija.setNew(true);
		edinicy_izmerenija.setPrimaryKey(edinicy_izmerenija_id);

		return edinicy_izmerenija;
	}

	/**
	 * Removes the edinicy_izmerenija with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param edinicy_izmerenija_id the primary key of the edinicy_izmerenija
	 * @return the edinicy_izmerenija that was removed
	 * @throws NoSuchedinicy_izmerenijaException if a edinicy_izmerenija with the primary key could not be found
	 */
	@Override
	public edinicy_izmerenija remove(long edinicy_izmerenija_id)
		throws NoSuchedinicy_izmerenijaException {
		return remove((Serializable)edinicy_izmerenija_id);
	}

	/**
	 * Removes the edinicy_izmerenija with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the edinicy_izmerenija
	 * @return the edinicy_izmerenija that was removed
	 * @throws NoSuchedinicy_izmerenijaException if a edinicy_izmerenija with the primary key could not be found
	 */
	@Override
	public edinicy_izmerenija remove(Serializable primaryKey)
		throws NoSuchedinicy_izmerenijaException {
		Session session = null;

		try {
			session = openSession();

			edinicy_izmerenija edinicy_izmerenija = (edinicy_izmerenija)session.get(edinicy_izmerenijaImpl.class,
					primaryKey);

			if (edinicy_izmerenija == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchedinicy_izmerenijaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(edinicy_izmerenija);
		}
		catch (NoSuchedinicy_izmerenijaException nsee) {
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
	protected edinicy_izmerenija removeImpl(
		edinicy_izmerenija edinicy_izmerenija) {
		edinicy_izmerenija = toUnwrappedModel(edinicy_izmerenija);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(edinicy_izmerenija)) {
				edinicy_izmerenija = (edinicy_izmerenija)session.get(edinicy_izmerenijaImpl.class,
						edinicy_izmerenija.getPrimaryKeyObj());
			}

			if (edinicy_izmerenija != null) {
				session.delete(edinicy_izmerenija);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (edinicy_izmerenija != null) {
			clearCache(edinicy_izmerenija);
		}

		return edinicy_izmerenija;
	}

	@Override
	public edinicy_izmerenija updateImpl(edinicy_izmerenija edinicy_izmerenija) {
		edinicy_izmerenija = toUnwrappedModel(edinicy_izmerenija);

		boolean isNew = edinicy_izmerenija.isNew();

		Session session = null;

		try {
			session = openSession();

			if (edinicy_izmerenija.isNew()) {
				session.save(edinicy_izmerenija);

				edinicy_izmerenija.setNew(false);
			}
			else {
				edinicy_izmerenija = (edinicy_izmerenija)session.merge(edinicy_izmerenija);
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

		entityCache.putResult(edinicy_izmerenijaModelImpl.ENTITY_CACHE_ENABLED,
			edinicy_izmerenijaImpl.class, edinicy_izmerenija.getPrimaryKey(),
			edinicy_izmerenija, false);

		edinicy_izmerenija.resetOriginalValues();

		return edinicy_izmerenija;
	}

	protected edinicy_izmerenija toUnwrappedModel(
		edinicy_izmerenija edinicy_izmerenija) {
		if (edinicy_izmerenija instanceof edinicy_izmerenijaImpl) {
			return edinicy_izmerenija;
		}

		edinicy_izmerenijaImpl edinicy_izmerenijaImpl = new edinicy_izmerenijaImpl();

		edinicy_izmerenijaImpl.setNew(edinicy_izmerenija.isNew());
		edinicy_izmerenijaImpl.setPrimaryKey(edinicy_izmerenija.getPrimaryKey());

		edinicy_izmerenijaImpl.setEdinicy_izmerenija_id(edinicy_izmerenija.getEdinicy_izmerenija_id());
		edinicy_izmerenijaImpl.setNazvanie(edinicy_izmerenija.getNazvanie());

		return edinicy_izmerenijaImpl;
	}

	/**
	 * Returns the edinicy_izmerenija with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the edinicy_izmerenija
	 * @return the edinicy_izmerenija
	 * @throws NoSuchedinicy_izmerenijaException if a edinicy_izmerenija with the primary key could not be found
	 */
	@Override
	public edinicy_izmerenija findByPrimaryKey(Serializable primaryKey)
		throws NoSuchedinicy_izmerenijaException {
		edinicy_izmerenija edinicy_izmerenija = fetchByPrimaryKey(primaryKey);

		if (edinicy_izmerenija == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchedinicy_izmerenijaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return edinicy_izmerenija;
	}

	/**
	 * Returns the edinicy_izmerenija with the primary key or throws a {@link NoSuchedinicy_izmerenijaException} if it could not be found.
	 *
	 * @param edinicy_izmerenija_id the primary key of the edinicy_izmerenija
	 * @return the edinicy_izmerenija
	 * @throws NoSuchedinicy_izmerenijaException if a edinicy_izmerenija with the primary key could not be found
	 */
	@Override
	public edinicy_izmerenija findByPrimaryKey(long edinicy_izmerenija_id)
		throws NoSuchedinicy_izmerenijaException {
		return findByPrimaryKey((Serializable)edinicy_izmerenija_id);
	}

	/**
	 * Returns the edinicy_izmerenija with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the edinicy_izmerenija
	 * @return the edinicy_izmerenija, or <code>null</code> if a edinicy_izmerenija with the primary key could not be found
	 */
	@Override
	public edinicy_izmerenija fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(edinicy_izmerenijaModelImpl.ENTITY_CACHE_ENABLED,
				edinicy_izmerenijaImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		edinicy_izmerenija edinicy_izmerenija = (edinicy_izmerenija)serializable;

		if (edinicy_izmerenija == null) {
			Session session = null;

			try {
				session = openSession();

				edinicy_izmerenija = (edinicy_izmerenija)session.get(edinicy_izmerenijaImpl.class,
						primaryKey);

				if (edinicy_izmerenija != null) {
					cacheResult(edinicy_izmerenija);
				}
				else {
					entityCache.putResult(edinicy_izmerenijaModelImpl.ENTITY_CACHE_ENABLED,
						edinicy_izmerenijaImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(edinicy_izmerenijaModelImpl.ENTITY_CACHE_ENABLED,
					edinicy_izmerenijaImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return edinicy_izmerenija;
	}

	/**
	 * Returns the edinicy_izmerenija with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param edinicy_izmerenija_id the primary key of the edinicy_izmerenija
	 * @return the edinicy_izmerenija, or <code>null</code> if a edinicy_izmerenija with the primary key could not be found
	 */
	@Override
	public edinicy_izmerenija fetchByPrimaryKey(long edinicy_izmerenija_id) {
		return fetchByPrimaryKey((Serializable)edinicy_izmerenija_id);
	}

	@Override
	public Map<Serializable, edinicy_izmerenija> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, edinicy_izmerenija> map = new HashMap<Serializable, edinicy_izmerenija>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			edinicy_izmerenija edinicy_izmerenija = fetchByPrimaryKey(primaryKey);

			if (edinicy_izmerenija != null) {
				map.put(primaryKey, edinicy_izmerenija);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(edinicy_izmerenijaModelImpl.ENTITY_CACHE_ENABLED,
					edinicy_izmerenijaImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (edinicy_izmerenija)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_EDINICY_IZMERENIJA_WHERE_PKS_IN);

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

			for (edinicy_izmerenija edinicy_izmerenija : (List<edinicy_izmerenija>)q.list()) {
				map.put(edinicy_izmerenija.getPrimaryKeyObj(),
					edinicy_izmerenija);

				cacheResult(edinicy_izmerenija);

				uncachedPrimaryKeys.remove(edinicy_izmerenija.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(edinicy_izmerenijaModelImpl.ENTITY_CACHE_ENABLED,
					edinicy_izmerenijaImpl.class, primaryKey, nullModel);
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
	 * Returns all the edinicy_izmerenijas.
	 *
	 * @return the edinicy_izmerenijas
	 */
	@Override
	public List<edinicy_izmerenija> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the edinicy_izmerenijas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link edinicy_izmerenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of edinicy_izmerenijas
	 * @param end the upper bound of the range of edinicy_izmerenijas (not inclusive)
	 * @return the range of edinicy_izmerenijas
	 */
	@Override
	public List<edinicy_izmerenija> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the edinicy_izmerenijas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link edinicy_izmerenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of edinicy_izmerenijas
	 * @param end the upper bound of the range of edinicy_izmerenijas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of edinicy_izmerenijas
	 */
	@Override
	public List<edinicy_izmerenija> findAll(int start, int end,
		OrderByComparator<edinicy_izmerenija> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the edinicy_izmerenijas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link edinicy_izmerenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of edinicy_izmerenijas
	 * @param end the upper bound of the range of edinicy_izmerenijas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of edinicy_izmerenijas
	 */
	@Override
	public List<edinicy_izmerenija> findAll(int start, int end,
		OrderByComparator<edinicy_izmerenija> orderByComparator,
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

		List<edinicy_izmerenija> list = null;

		if (retrieveFromCache) {
			list = (List<edinicy_izmerenija>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_EDINICY_IZMERENIJA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EDINICY_IZMERENIJA;

				if (pagination) {
					sql = sql.concat(edinicy_izmerenijaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<edinicy_izmerenija>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<edinicy_izmerenija>)QueryUtil.list(q,
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
	 * Removes all the edinicy_izmerenijas from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (edinicy_izmerenija edinicy_izmerenija : findAll()) {
			remove(edinicy_izmerenija);
		}
	}

	/**
	 * Returns the number of edinicy_izmerenijas.
	 *
	 * @return the number of edinicy_izmerenijas
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_EDINICY_IZMERENIJA);

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
		return edinicy_izmerenijaModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the edinicy_izmerenija persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(edinicy_izmerenijaImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_EDINICY_IZMERENIJA = "SELECT edinicy_izmerenija FROM edinicy_izmerenija edinicy_izmerenija";
	private static final String _SQL_SELECT_EDINICY_IZMERENIJA_WHERE_PKS_IN = "SELECT edinicy_izmerenija FROM edinicy_izmerenija edinicy_izmerenija WHERE edinicy_izmerenija_id IN (";
	private static final String _SQL_COUNT_EDINICY_IZMERENIJA = "SELECT COUNT(edinicy_izmerenija) FROM edinicy_izmerenija edinicy_izmerenija";
	private static final String _ORDER_BY_ENTITY_ALIAS = "edinicy_izmerenija.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No edinicy_izmerenija exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(edinicy_izmerenijaPersistenceImpl.class);
}
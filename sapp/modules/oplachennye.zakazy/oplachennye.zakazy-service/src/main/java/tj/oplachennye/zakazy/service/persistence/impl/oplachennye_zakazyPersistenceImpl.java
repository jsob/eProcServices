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

package tj.oplachennye.zakazy.service.persistence.impl;

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

import tj.oplachennye.zakazy.exception.NoSuchoplachennye_zakazyException;
import tj.oplachennye.zakazy.model.impl.oplachennye_zakazyImpl;
import tj.oplachennye.zakazy.model.impl.oplachennye_zakazyModelImpl;
import tj.oplachennye.zakazy.model.oplachennye_zakazy;
import tj.oplachennye.zakazy.service.persistence.oplachennye_zakazyPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the oplachennye_zakazy service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see oplachennye_zakazyPersistence
 * @see tj.oplachennye.zakazy.service.persistence.oplachennye_zakazyUtil
 * @generated
 */
@ProviderType
public class oplachennye_zakazyPersistenceImpl extends BasePersistenceImpl<oplachennye_zakazy>
	implements oplachennye_zakazyPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link oplachennye_zakazyUtil} to access the oplachennye_zakazy persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = oplachennye_zakazyImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(oplachennye_zakazyModelImpl.ENTITY_CACHE_ENABLED,
			oplachennye_zakazyModelImpl.FINDER_CACHE_ENABLED,
			oplachennye_zakazyImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(oplachennye_zakazyModelImpl.ENTITY_CACHE_ENABLED,
			oplachennye_zakazyModelImpl.FINDER_CACHE_ENABLED,
			oplachennye_zakazyImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(oplachennye_zakazyModelImpl.ENTITY_CACHE_ENABLED,
			oplachennye_zakazyModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public oplachennye_zakazyPersistenceImpl() {
		setModelClass(oplachennye_zakazy.class);
	}

	/**
	 * Caches the oplachennye_zakazy in the entity cache if it is enabled.
	 *
	 * @param oplachennye_zakazy the oplachennye_zakazy
	 */
	@Override
	public void cacheResult(oplachennye_zakazy oplachennye_zakazy) {
		entityCache.putResult(oplachennye_zakazyModelImpl.ENTITY_CACHE_ENABLED,
			oplachennye_zakazyImpl.class, oplachennye_zakazy.getPrimaryKey(),
			oplachennye_zakazy);

		oplachennye_zakazy.resetOriginalValues();
	}

	/**
	 * Caches the oplachennye_zakazies in the entity cache if it is enabled.
	 *
	 * @param oplachennye_zakazies the oplachennye_zakazies
	 */
	@Override
	public void cacheResult(List<oplachennye_zakazy> oplachennye_zakazies) {
		for (oplachennye_zakazy oplachennye_zakazy : oplachennye_zakazies) {
			if (entityCache.getResult(
						oplachennye_zakazyModelImpl.ENTITY_CACHE_ENABLED,
						oplachennye_zakazyImpl.class,
						oplachennye_zakazy.getPrimaryKey()) == null) {
				cacheResult(oplachennye_zakazy);
			}
			else {
				oplachennye_zakazy.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all oplachennye_zakazies.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(oplachennye_zakazyImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the oplachennye_zakazy.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(oplachennye_zakazy oplachennye_zakazy) {
		entityCache.removeResult(oplachennye_zakazyModelImpl.ENTITY_CACHE_ENABLED,
			oplachennye_zakazyImpl.class, oplachennye_zakazy.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<oplachennye_zakazy> oplachennye_zakazies) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (oplachennye_zakazy oplachennye_zakazy : oplachennye_zakazies) {
			entityCache.removeResult(oplachennye_zakazyModelImpl.ENTITY_CACHE_ENABLED,
				oplachennye_zakazyImpl.class, oplachennye_zakazy.getPrimaryKey());
		}
	}

	/**
	 * Creates a new oplachennye_zakazy with the primary key. Does not add the oplachennye_zakazy to the database.
	 *
	 * @param oplachennye_zakazy_id the primary key for the new oplachennye_zakazy
	 * @return the new oplachennye_zakazy
	 */
	@Override
	public oplachennye_zakazy create(long oplachennye_zakazy_id) {
		oplachennye_zakazy oplachennye_zakazy = new oplachennye_zakazyImpl();

		oplachennye_zakazy.setNew(true);
		oplachennye_zakazy.setPrimaryKey(oplachennye_zakazy_id);

		return oplachennye_zakazy;
	}

	/**
	 * Removes the oplachennye_zakazy with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param oplachennye_zakazy_id the primary key of the oplachennye_zakazy
	 * @return the oplachennye_zakazy that was removed
	 * @throws NoSuchoplachennye_zakazyException if a oplachennye_zakazy with the primary key could not be found
	 */
	@Override
	public oplachennye_zakazy remove(long oplachennye_zakazy_id)
		throws NoSuchoplachennye_zakazyException {
		return remove((Serializable)oplachennye_zakazy_id);
	}

	/**
	 * Removes the oplachennye_zakazy with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the oplachennye_zakazy
	 * @return the oplachennye_zakazy that was removed
	 * @throws NoSuchoplachennye_zakazyException if a oplachennye_zakazy with the primary key could not be found
	 */
	@Override
	public oplachennye_zakazy remove(Serializable primaryKey)
		throws NoSuchoplachennye_zakazyException {
		Session session = null;

		try {
			session = openSession();

			oplachennye_zakazy oplachennye_zakazy = (oplachennye_zakazy)session.get(oplachennye_zakazyImpl.class,
					primaryKey);

			if (oplachennye_zakazy == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchoplachennye_zakazyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(oplachennye_zakazy);
		}
		catch (NoSuchoplachennye_zakazyException nsee) {
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
	protected oplachennye_zakazy removeImpl(
		oplachennye_zakazy oplachennye_zakazy) {
		oplachennye_zakazy = toUnwrappedModel(oplachennye_zakazy);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(oplachennye_zakazy)) {
				oplachennye_zakazy = (oplachennye_zakazy)session.get(oplachennye_zakazyImpl.class,
						oplachennye_zakazy.getPrimaryKeyObj());
			}

			if (oplachennye_zakazy != null) {
				session.delete(oplachennye_zakazy);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (oplachennye_zakazy != null) {
			clearCache(oplachennye_zakazy);
		}

		return oplachennye_zakazy;
	}

	@Override
	public oplachennye_zakazy updateImpl(oplachennye_zakazy oplachennye_zakazy) {
		oplachennye_zakazy = toUnwrappedModel(oplachennye_zakazy);

		boolean isNew = oplachennye_zakazy.isNew();

		Session session = null;

		try {
			session = openSession();

			if (oplachennye_zakazy.isNew()) {
				session.save(oplachennye_zakazy);

				oplachennye_zakazy.setNew(false);
			}
			else {
				oplachennye_zakazy = (oplachennye_zakazy)session.merge(oplachennye_zakazy);
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

		entityCache.putResult(oplachennye_zakazyModelImpl.ENTITY_CACHE_ENABLED,
			oplachennye_zakazyImpl.class, oplachennye_zakazy.getPrimaryKey(),
			oplachennye_zakazy, false);

		oplachennye_zakazy.resetOriginalValues();

		return oplachennye_zakazy;
	}

	protected oplachennye_zakazy toUnwrappedModel(
		oplachennye_zakazy oplachennye_zakazy) {
		if (oplachennye_zakazy instanceof oplachennye_zakazyImpl) {
			return oplachennye_zakazy;
		}

		oplachennye_zakazyImpl oplachennye_zakazyImpl = new oplachennye_zakazyImpl();

		oplachennye_zakazyImpl.setNew(oplachennye_zakazy.isNew());
		oplachennye_zakazyImpl.setPrimaryKey(oplachennye_zakazy.getPrimaryKey());

		oplachennye_zakazyImpl.setData_oplaty(oplachennye_zakazy.getData_oplaty());
		oplachennye_zakazyImpl.setIzvewenie_id(oplachennye_zakazy.getIzvewenie_id());
		oplachennye_zakazyImpl.setOplachennye_zakazy_id(oplachennye_zakazy.getOplachennye_zakazy_id());
		oplachennye_zakazyImpl.setOplatil(oplachennye_zakazy.getOplatil());
		oplachennye_zakazyImpl.setPostavwik_id(oplachennye_zakazy.getPostavwik_id());
		oplachennye_zakazyImpl.setSumma(oplachennye_zakazy.getSumma());
		oplachennye_zakazyImpl.setTranzakcija(oplachennye_zakazy.getTranzakcija());

		return oplachennye_zakazyImpl;
	}

	/**
	 * Returns the oplachennye_zakazy with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the oplachennye_zakazy
	 * @return the oplachennye_zakazy
	 * @throws NoSuchoplachennye_zakazyException if a oplachennye_zakazy with the primary key could not be found
	 */
	@Override
	public oplachennye_zakazy findByPrimaryKey(Serializable primaryKey)
		throws NoSuchoplachennye_zakazyException {
		oplachennye_zakazy oplachennye_zakazy = fetchByPrimaryKey(primaryKey);

		if (oplachennye_zakazy == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchoplachennye_zakazyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return oplachennye_zakazy;
	}

	/**
	 * Returns the oplachennye_zakazy with the primary key or throws a {@link NoSuchoplachennye_zakazyException} if it could not be found.
	 *
	 * @param oplachennye_zakazy_id the primary key of the oplachennye_zakazy
	 * @return the oplachennye_zakazy
	 * @throws NoSuchoplachennye_zakazyException if a oplachennye_zakazy with the primary key could not be found
	 */
	@Override
	public oplachennye_zakazy findByPrimaryKey(long oplachennye_zakazy_id)
		throws NoSuchoplachennye_zakazyException {
		return findByPrimaryKey((Serializable)oplachennye_zakazy_id);
	}

	/**
	 * Returns the oplachennye_zakazy with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the oplachennye_zakazy
	 * @return the oplachennye_zakazy, or <code>null</code> if a oplachennye_zakazy with the primary key could not be found
	 */
	@Override
	public oplachennye_zakazy fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(oplachennye_zakazyModelImpl.ENTITY_CACHE_ENABLED,
				oplachennye_zakazyImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		oplachennye_zakazy oplachennye_zakazy = (oplachennye_zakazy)serializable;

		if (oplachennye_zakazy == null) {
			Session session = null;

			try {
				session = openSession();

				oplachennye_zakazy = (oplachennye_zakazy)session.get(oplachennye_zakazyImpl.class,
						primaryKey);

				if (oplachennye_zakazy != null) {
					cacheResult(oplachennye_zakazy);
				}
				else {
					entityCache.putResult(oplachennye_zakazyModelImpl.ENTITY_CACHE_ENABLED,
						oplachennye_zakazyImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(oplachennye_zakazyModelImpl.ENTITY_CACHE_ENABLED,
					oplachennye_zakazyImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return oplachennye_zakazy;
	}

	/**
	 * Returns the oplachennye_zakazy with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param oplachennye_zakazy_id the primary key of the oplachennye_zakazy
	 * @return the oplachennye_zakazy, or <code>null</code> if a oplachennye_zakazy with the primary key could not be found
	 */
	@Override
	public oplachennye_zakazy fetchByPrimaryKey(long oplachennye_zakazy_id) {
		return fetchByPrimaryKey((Serializable)oplachennye_zakazy_id);
	}

	@Override
	public Map<Serializable, oplachennye_zakazy> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, oplachennye_zakazy> map = new HashMap<Serializable, oplachennye_zakazy>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			oplachennye_zakazy oplachennye_zakazy = fetchByPrimaryKey(primaryKey);

			if (oplachennye_zakazy != null) {
				map.put(primaryKey, oplachennye_zakazy);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(oplachennye_zakazyModelImpl.ENTITY_CACHE_ENABLED,
					oplachennye_zakazyImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (oplachennye_zakazy)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_OPLACHENNYE_ZAKAZY_WHERE_PKS_IN);

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

			for (oplachennye_zakazy oplachennye_zakazy : (List<oplachennye_zakazy>)q.list()) {
				map.put(oplachennye_zakazy.getPrimaryKeyObj(),
					oplachennye_zakazy);

				cacheResult(oplachennye_zakazy);

				uncachedPrimaryKeys.remove(oplachennye_zakazy.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(oplachennye_zakazyModelImpl.ENTITY_CACHE_ENABLED,
					oplachennye_zakazyImpl.class, primaryKey, nullModel);
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
	 * Returns all the oplachennye_zakazies.
	 *
	 * @return the oplachennye_zakazies
	 */
	@Override
	public List<oplachennye_zakazy> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the oplachennye_zakazies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link oplachennye_zakazyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of oplachennye_zakazies
	 * @param end the upper bound of the range of oplachennye_zakazies (not inclusive)
	 * @return the range of oplachennye_zakazies
	 */
	@Override
	public List<oplachennye_zakazy> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the oplachennye_zakazies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link oplachennye_zakazyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of oplachennye_zakazies
	 * @param end the upper bound of the range of oplachennye_zakazies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of oplachennye_zakazies
	 */
	@Override
	public List<oplachennye_zakazy> findAll(int start, int end,
		OrderByComparator<oplachennye_zakazy> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the oplachennye_zakazies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link oplachennye_zakazyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of oplachennye_zakazies
	 * @param end the upper bound of the range of oplachennye_zakazies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of oplachennye_zakazies
	 */
	@Override
	public List<oplachennye_zakazy> findAll(int start, int end,
		OrderByComparator<oplachennye_zakazy> orderByComparator,
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

		List<oplachennye_zakazy> list = null;

		if (retrieveFromCache) {
			list = (List<oplachennye_zakazy>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_OPLACHENNYE_ZAKAZY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_OPLACHENNYE_ZAKAZY;

				if (pagination) {
					sql = sql.concat(oplachennye_zakazyModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<oplachennye_zakazy>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<oplachennye_zakazy>)QueryUtil.list(q,
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
	 * Removes all the oplachennye_zakazies from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (oplachennye_zakazy oplachennye_zakazy : findAll()) {
			remove(oplachennye_zakazy);
		}
	}

	/**
	 * Returns the number of oplachennye_zakazies.
	 *
	 * @return the number of oplachennye_zakazies
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_OPLACHENNYE_ZAKAZY);

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
		return oplachennye_zakazyModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the oplachennye_zakazy persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(oplachennye_zakazyImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_OPLACHENNYE_ZAKAZY = "SELECT oplachennye_zakazy FROM oplachennye_zakazy oplachennye_zakazy";
	private static final String _SQL_SELECT_OPLACHENNYE_ZAKAZY_WHERE_PKS_IN = "SELECT oplachennye_zakazy FROM oplachennye_zakazy oplachennye_zakazy WHERE oplachennye_zakazy_id IN (";
	private static final String _SQL_COUNT_OPLACHENNYE_ZAKAZY = "SELECT COUNT(oplachennye_zakazy) FROM oplachennye_zakazy oplachennye_zakazy";
	private static final String _ORDER_BY_ENTITY_ALIAS = "oplachennye_zakazy.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No oplachennye_zakazy exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(oplachennye_zakazyPersistenceImpl.class);
}
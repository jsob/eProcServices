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

package tj.istorija.popolnenij.service.persistence.impl;

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

import tj.istorija.popolnenij.exception.NoSuchistorija_popolnenijException;
import tj.istorija.popolnenij.model.impl.istorija_popolnenijImpl;
import tj.istorija.popolnenij.model.impl.istorija_popolnenijModelImpl;
import tj.istorija.popolnenij.model.istorija_popolnenij;
import tj.istorija.popolnenij.service.persistence.istorija_popolnenijPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the istorija_popolnenij service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see istorija_popolnenijPersistence
 * @see tj.istorija.popolnenij.service.persistence.istorija_popolnenijUtil
 * @generated
 */
@ProviderType
public class istorija_popolnenijPersistenceImpl extends BasePersistenceImpl<istorija_popolnenij>
	implements istorija_popolnenijPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link istorija_popolnenijUtil} to access the istorija_popolnenij persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = istorija_popolnenijImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(istorija_popolnenijModelImpl.ENTITY_CACHE_ENABLED,
			istorija_popolnenijModelImpl.FINDER_CACHE_ENABLED,
			istorija_popolnenijImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(istorija_popolnenijModelImpl.ENTITY_CACHE_ENABLED,
			istorija_popolnenijModelImpl.FINDER_CACHE_ENABLED,
			istorija_popolnenijImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(istorija_popolnenijModelImpl.ENTITY_CACHE_ENABLED,
			istorija_popolnenijModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public istorija_popolnenijPersistenceImpl() {
		setModelClass(istorija_popolnenij.class);
	}

	/**
	 * Caches the istorija_popolnenij in the entity cache if it is enabled.
	 *
	 * @param istorija_popolnenij the istorija_popolnenij
	 */
	@Override
	public void cacheResult(istorija_popolnenij istorija_popolnenij) {
		entityCache.putResult(istorija_popolnenijModelImpl.ENTITY_CACHE_ENABLED,
			istorija_popolnenijImpl.class, istorija_popolnenij.getPrimaryKey(),
			istorija_popolnenij);

		istorija_popolnenij.resetOriginalValues();
	}

	/**
	 * Caches the istorija_popolnenijs in the entity cache if it is enabled.
	 *
	 * @param istorija_popolnenijs the istorija_popolnenijs
	 */
	@Override
	public void cacheResult(List<istorija_popolnenij> istorija_popolnenijs) {
		for (istorija_popolnenij istorija_popolnenij : istorija_popolnenijs) {
			if (entityCache.getResult(
						istorija_popolnenijModelImpl.ENTITY_CACHE_ENABLED,
						istorija_popolnenijImpl.class,
						istorija_popolnenij.getPrimaryKey()) == null) {
				cacheResult(istorija_popolnenij);
			}
			else {
				istorija_popolnenij.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all istorija_popolnenijs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(istorija_popolnenijImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the istorija_popolnenij.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(istorija_popolnenij istorija_popolnenij) {
		entityCache.removeResult(istorija_popolnenijModelImpl.ENTITY_CACHE_ENABLED,
			istorija_popolnenijImpl.class, istorija_popolnenij.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<istorija_popolnenij> istorija_popolnenijs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (istorija_popolnenij istorija_popolnenij : istorija_popolnenijs) {
			entityCache.removeResult(istorija_popolnenijModelImpl.ENTITY_CACHE_ENABLED,
				istorija_popolnenijImpl.class,
				istorija_popolnenij.getPrimaryKey());
		}
	}

	/**
	 * Creates a new istorija_popolnenij with the primary key. Does not add the istorija_popolnenij to the database.
	 *
	 * @param istorija_popolnenij_id the primary key for the new istorija_popolnenij
	 * @return the new istorija_popolnenij
	 */
	@Override
	public istorija_popolnenij create(long istorija_popolnenij_id) {
		istorija_popolnenij istorija_popolnenij = new istorija_popolnenijImpl();

		istorija_popolnenij.setNew(true);
		istorija_popolnenij.setPrimaryKey(istorija_popolnenij_id);

		return istorija_popolnenij;
	}

	/**
	 * Removes the istorija_popolnenij with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param istorija_popolnenij_id the primary key of the istorija_popolnenij
	 * @return the istorija_popolnenij that was removed
	 * @throws NoSuchistorija_popolnenijException if a istorija_popolnenij with the primary key could not be found
	 */
	@Override
	public istorija_popolnenij remove(long istorija_popolnenij_id)
		throws NoSuchistorija_popolnenijException {
		return remove((Serializable)istorija_popolnenij_id);
	}

	/**
	 * Removes the istorija_popolnenij with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the istorija_popolnenij
	 * @return the istorija_popolnenij that was removed
	 * @throws NoSuchistorija_popolnenijException if a istorija_popolnenij with the primary key could not be found
	 */
	@Override
	public istorija_popolnenij remove(Serializable primaryKey)
		throws NoSuchistorija_popolnenijException {
		Session session = null;

		try {
			session = openSession();

			istorija_popolnenij istorija_popolnenij = (istorija_popolnenij)session.get(istorija_popolnenijImpl.class,
					primaryKey);

			if (istorija_popolnenij == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchistorija_popolnenijException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(istorija_popolnenij);
		}
		catch (NoSuchistorija_popolnenijException nsee) {
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
	protected istorija_popolnenij removeImpl(
		istorija_popolnenij istorija_popolnenij) {
		istorija_popolnenij = toUnwrappedModel(istorija_popolnenij);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(istorija_popolnenij)) {
				istorija_popolnenij = (istorija_popolnenij)session.get(istorija_popolnenijImpl.class,
						istorija_popolnenij.getPrimaryKeyObj());
			}

			if (istorija_popolnenij != null) {
				session.delete(istorija_popolnenij);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (istorija_popolnenij != null) {
			clearCache(istorija_popolnenij);
		}

		return istorija_popolnenij;
	}

	@Override
	public istorija_popolnenij updateImpl(
		istorija_popolnenij istorija_popolnenij) {
		istorija_popolnenij = toUnwrappedModel(istorija_popolnenij);

		boolean isNew = istorija_popolnenij.isNew();

		Session session = null;

		try {
			session = openSession();

			if (istorija_popolnenij.isNew()) {
				session.save(istorija_popolnenij);

				istorija_popolnenij.setNew(false);
			}
			else {
				istorija_popolnenij = (istorija_popolnenij)session.merge(istorija_popolnenij);
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

		entityCache.putResult(istorija_popolnenijModelImpl.ENTITY_CACHE_ENABLED,
			istorija_popolnenijImpl.class, istorija_popolnenij.getPrimaryKey(),
			istorija_popolnenij, false);

		istorija_popolnenij.resetOriginalValues();

		return istorija_popolnenij;
	}

	protected istorija_popolnenij toUnwrappedModel(
		istorija_popolnenij istorija_popolnenij) {
		if (istorija_popolnenij instanceof istorija_popolnenijImpl) {
			return istorija_popolnenij;
		}

		istorija_popolnenijImpl istorija_popolnenijImpl = new istorija_popolnenijImpl();

		istorija_popolnenijImpl.setNew(istorija_popolnenij.isNew());
		istorija_popolnenijImpl.setPrimaryKey(istorija_popolnenij.getPrimaryKey());

		istorija_popolnenijImpl.setData_zachislenija(istorija_popolnenij.getData_zachislenija());
		istorija_popolnenijImpl.setIstorija_popolnenij_id(istorija_popolnenij.getIstorija_popolnenij_id());
		istorija_popolnenijImpl.setNomer(istorija_popolnenij.getNomer());
		istorija_popolnenijImpl.setPostavwik_id(istorija_popolnenij.getPostavwik_id());
		istorija_popolnenijImpl.setPut(istorija_popolnenij.getPut());
		istorija_popolnenijImpl.setSumma(istorija_popolnenij.getSumma());
		istorija_popolnenijImpl.setTip(istorija_popolnenij.getTip());
		istorija_popolnenijImpl.setTranzakcija(istorija_popolnenij.getTranzakcija());
		istorija_popolnenijImpl.setZachislil(istorija_popolnenij.getZachislil());

		return istorija_popolnenijImpl;
	}

	/**
	 * Returns the istorija_popolnenij with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the istorija_popolnenij
	 * @return the istorija_popolnenij
	 * @throws NoSuchistorija_popolnenijException if a istorija_popolnenij with the primary key could not be found
	 */
	@Override
	public istorija_popolnenij findByPrimaryKey(Serializable primaryKey)
		throws NoSuchistorija_popolnenijException {
		istorija_popolnenij istorija_popolnenij = fetchByPrimaryKey(primaryKey);

		if (istorija_popolnenij == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchistorija_popolnenijException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return istorija_popolnenij;
	}

	/**
	 * Returns the istorija_popolnenij with the primary key or throws a {@link NoSuchistorija_popolnenijException} if it could not be found.
	 *
	 * @param istorija_popolnenij_id the primary key of the istorija_popolnenij
	 * @return the istorija_popolnenij
	 * @throws NoSuchistorija_popolnenijException if a istorija_popolnenij with the primary key could not be found
	 */
	@Override
	public istorija_popolnenij findByPrimaryKey(long istorija_popolnenij_id)
		throws NoSuchistorija_popolnenijException {
		return findByPrimaryKey((Serializable)istorija_popolnenij_id);
	}

	/**
	 * Returns the istorija_popolnenij with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the istorija_popolnenij
	 * @return the istorija_popolnenij, or <code>null</code> if a istorija_popolnenij with the primary key could not be found
	 */
	@Override
	public istorija_popolnenij fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(istorija_popolnenijModelImpl.ENTITY_CACHE_ENABLED,
				istorija_popolnenijImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		istorija_popolnenij istorija_popolnenij = (istorija_popolnenij)serializable;

		if (istorija_popolnenij == null) {
			Session session = null;

			try {
				session = openSession();

				istorija_popolnenij = (istorija_popolnenij)session.get(istorija_popolnenijImpl.class,
						primaryKey);

				if (istorija_popolnenij != null) {
					cacheResult(istorija_popolnenij);
				}
				else {
					entityCache.putResult(istorija_popolnenijModelImpl.ENTITY_CACHE_ENABLED,
						istorija_popolnenijImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(istorija_popolnenijModelImpl.ENTITY_CACHE_ENABLED,
					istorija_popolnenijImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return istorija_popolnenij;
	}

	/**
	 * Returns the istorija_popolnenij with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param istorija_popolnenij_id the primary key of the istorija_popolnenij
	 * @return the istorija_popolnenij, or <code>null</code> if a istorija_popolnenij with the primary key could not be found
	 */
	@Override
	public istorija_popolnenij fetchByPrimaryKey(long istorija_popolnenij_id) {
		return fetchByPrimaryKey((Serializable)istorija_popolnenij_id);
	}

	@Override
	public Map<Serializable, istorija_popolnenij> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, istorija_popolnenij> map = new HashMap<Serializable, istorija_popolnenij>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			istorija_popolnenij istorija_popolnenij = fetchByPrimaryKey(primaryKey);

			if (istorija_popolnenij != null) {
				map.put(primaryKey, istorija_popolnenij);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(istorija_popolnenijModelImpl.ENTITY_CACHE_ENABLED,
					istorija_popolnenijImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (istorija_popolnenij)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ISTORIJA_POPOLNENIJ_WHERE_PKS_IN);

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

			for (istorija_popolnenij istorija_popolnenij : (List<istorija_popolnenij>)q.list()) {
				map.put(istorija_popolnenij.getPrimaryKeyObj(),
					istorija_popolnenij);

				cacheResult(istorija_popolnenij);

				uncachedPrimaryKeys.remove(istorija_popolnenij.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(istorija_popolnenijModelImpl.ENTITY_CACHE_ENABLED,
					istorija_popolnenijImpl.class, primaryKey, nullModel);
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
	 * Returns all the istorija_popolnenijs.
	 *
	 * @return the istorija_popolnenijs
	 */
	@Override
	public List<istorija_popolnenij> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the istorija_popolnenijs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link istorija_popolnenijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of istorija_popolnenijs
	 * @param end the upper bound of the range of istorija_popolnenijs (not inclusive)
	 * @return the range of istorija_popolnenijs
	 */
	@Override
	public List<istorija_popolnenij> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the istorija_popolnenijs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link istorija_popolnenijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of istorija_popolnenijs
	 * @param end the upper bound of the range of istorija_popolnenijs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of istorija_popolnenijs
	 */
	@Override
	public List<istorija_popolnenij> findAll(int start, int end,
		OrderByComparator<istorija_popolnenij> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the istorija_popolnenijs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link istorija_popolnenijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of istorija_popolnenijs
	 * @param end the upper bound of the range of istorija_popolnenijs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of istorija_popolnenijs
	 */
	@Override
	public List<istorija_popolnenij> findAll(int start, int end,
		OrderByComparator<istorija_popolnenij> orderByComparator,
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

		List<istorija_popolnenij> list = null;

		if (retrieveFromCache) {
			list = (List<istorija_popolnenij>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ISTORIJA_POPOLNENIJ);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ISTORIJA_POPOLNENIJ;

				if (pagination) {
					sql = sql.concat(istorija_popolnenijModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<istorija_popolnenij>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<istorija_popolnenij>)QueryUtil.list(q,
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
	 * Removes all the istorija_popolnenijs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (istorija_popolnenij istorija_popolnenij : findAll()) {
			remove(istorija_popolnenij);
		}
	}

	/**
	 * Returns the number of istorija_popolnenijs.
	 *
	 * @return the number of istorija_popolnenijs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ISTORIJA_POPOLNENIJ);

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
		return istorija_popolnenijModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the istorija_popolnenij persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(istorija_popolnenijImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_ISTORIJA_POPOLNENIJ = "SELECT istorija_popolnenij FROM istorija_popolnenij istorija_popolnenij";
	private static final String _SQL_SELECT_ISTORIJA_POPOLNENIJ_WHERE_PKS_IN = "SELECT istorija_popolnenij FROM istorija_popolnenij istorija_popolnenij WHERE istorija_popolnenij_id IN (";
	private static final String _SQL_COUNT_ISTORIJA_POPOLNENIJ = "SELECT COUNT(istorija_popolnenij) FROM istorija_popolnenij istorija_popolnenij";
	private static final String _ORDER_BY_ENTITY_ALIAS = "istorija_popolnenij.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No istorija_popolnenij exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(istorija_popolnenijPersistenceImpl.class);
}
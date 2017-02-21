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

package tj.prichiny.otmeny.service.persistence.impl;

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

import tj.prichiny.otmeny.exception.NoSuchprichiny_otmenyException;
import tj.prichiny.otmeny.model.impl.prichiny_otmenyImpl;
import tj.prichiny.otmeny.model.impl.prichiny_otmenyModelImpl;
import tj.prichiny.otmeny.model.prichiny_otmeny;
import tj.prichiny.otmeny.service.persistence.prichiny_otmenyPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the prichiny_otmeny service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see prichiny_otmenyPersistence
 * @see tj.prichiny.otmeny.service.persistence.prichiny_otmenyUtil
 * @generated
 */
@ProviderType
public class prichiny_otmenyPersistenceImpl extends BasePersistenceImpl<prichiny_otmeny>
	implements prichiny_otmenyPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link prichiny_otmenyUtil} to access the prichiny_otmeny persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = prichiny_otmenyImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(prichiny_otmenyModelImpl.ENTITY_CACHE_ENABLED,
			prichiny_otmenyModelImpl.FINDER_CACHE_ENABLED,
			prichiny_otmenyImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(prichiny_otmenyModelImpl.ENTITY_CACHE_ENABLED,
			prichiny_otmenyModelImpl.FINDER_CACHE_ENABLED,
			prichiny_otmenyImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(prichiny_otmenyModelImpl.ENTITY_CACHE_ENABLED,
			prichiny_otmenyModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public prichiny_otmenyPersistenceImpl() {
		setModelClass(prichiny_otmeny.class);
	}

	/**
	 * Caches the prichiny_otmeny in the entity cache if it is enabled.
	 *
	 * @param prichiny_otmeny the prichiny_otmeny
	 */
	@Override
	public void cacheResult(prichiny_otmeny prichiny_otmeny) {
		entityCache.putResult(prichiny_otmenyModelImpl.ENTITY_CACHE_ENABLED,
			prichiny_otmenyImpl.class, prichiny_otmeny.getPrimaryKey(),
			prichiny_otmeny);

		prichiny_otmeny.resetOriginalValues();
	}

	/**
	 * Caches the prichiny_otmenies in the entity cache if it is enabled.
	 *
	 * @param prichiny_otmenies the prichiny_otmenies
	 */
	@Override
	public void cacheResult(List<prichiny_otmeny> prichiny_otmenies) {
		for (prichiny_otmeny prichiny_otmeny : prichiny_otmenies) {
			if (entityCache.getResult(
						prichiny_otmenyModelImpl.ENTITY_CACHE_ENABLED,
						prichiny_otmenyImpl.class,
						prichiny_otmeny.getPrimaryKey()) == null) {
				cacheResult(prichiny_otmeny);
			}
			else {
				prichiny_otmeny.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all prichiny_otmenies.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(prichiny_otmenyImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the prichiny_otmeny.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(prichiny_otmeny prichiny_otmeny) {
		entityCache.removeResult(prichiny_otmenyModelImpl.ENTITY_CACHE_ENABLED,
			prichiny_otmenyImpl.class, prichiny_otmeny.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<prichiny_otmeny> prichiny_otmenies) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (prichiny_otmeny prichiny_otmeny : prichiny_otmenies) {
			entityCache.removeResult(prichiny_otmenyModelImpl.ENTITY_CACHE_ENABLED,
				prichiny_otmenyImpl.class, prichiny_otmeny.getPrimaryKey());
		}
	}

	/**
	 * Creates a new prichiny_otmeny with the primary key. Does not add the prichiny_otmeny to the database.
	 *
	 * @param prichiny_otmeny_id the primary key for the new prichiny_otmeny
	 * @return the new prichiny_otmeny
	 */
	@Override
	public prichiny_otmeny create(long prichiny_otmeny_id) {
		prichiny_otmeny prichiny_otmeny = new prichiny_otmenyImpl();

		prichiny_otmeny.setNew(true);
		prichiny_otmeny.setPrimaryKey(prichiny_otmeny_id);

		return prichiny_otmeny;
	}

	/**
	 * Removes the prichiny_otmeny with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param prichiny_otmeny_id the primary key of the prichiny_otmeny
	 * @return the prichiny_otmeny that was removed
	 * @throws NoSuchprichiny_otmenyException if a prichiny_otmeny with the primary key could not be found
	 */
	@Override
	public prichiny_otmeny remove(long prichiny_otmeny_id)
		throws NoSuchprichiny_otmenyException {
		return remove((Serializable)prichiny_otmeny_id);
	}

	/**
	 * Removes the prichiny_otmeny with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the prichiny_otmeny
	 * @return the prichiny_otmeny that was removed
	 * @throws NoSuchprichiny_otmenyException if a prichiny_otmeny with the primary key could not be found
	 */
	@Override
	public prichiny_otmeny remove(Serializable primaryKey)
		throws NoSuchprichiny_otmenyException {
		Session session = null;

		try {
			session = openSession();

			prichiny_otmeny prichiny_otmeny = (prichiny_otmeny)session.get(prichiny_otmenyImpl.class,
					primaryKey);

			if (prichiny_otmeny == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchprichiny_otmenyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(prichiny_otmeny);
		}
		catch (NoSuchprichiny_otmenyException nsee) {
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
	protected prichiny_otmeny removeImpl(prichiny_otmeny prichiny_otmeny) {
		prichiny_otmeny = toUnwrappedModel(prichiny_otmeny);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(prichiny_otmeny)) {
				prichiny_otmeny = (prichiny_otmeny)session.get(prichiny_otmenyImpl.class,
						prichiny_otmeny.getPrimaryKeyObj());
			}

			if (prichiny_otmeny != null) {
				session.delete(prichiny_otmeny);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (prichiny_otmeny != null) {
			clearCache(prichiny_otmeny);
		}

		return prichiny_otmeny;
	}

	@Override
	public prichiny_otmeny updateImpl(prichiny_otmeny prichiny_otmeny) {
		prichiny_otmeny = toUnwrappedModel(prichiny_otmeny);

		boolean isNew = prichiny_otmeny.isNew();

		Session session = null;

		try {
			session = openSession();

			if (prichiny_otmeny.isNew()) {
				session.save(prichiny_otmeny);

				prichiny_otmeny.setNew(false);
			}
			else {
				prichiny_otmeny = (prichiny_otmeny)session.merge(prichiny_otmeny);
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

		entityCache.putResult(prichiny_otmenyModelImpl.ENTITY_CACHE_ENABLED,
			prichiny_otmenyImpl.class, prichiny_otmeny.getPrimaryKey(),
			prichiny_otmeny, false);

		prichiny_otmeny.resetOriginalValues();

		return prichiny_otmeny;
	}

	protected prichiny_otmeny toUnwrappedModel(prichiny_otmeny prichiny_otmeny) {
		if (prichiny_otmeny instanceof prichiny_otmenyImpl) {
			return prichiny_otmeny;
		}

		prichiny_otmenyImpl prichiny_otmenyImpl = new prichiny_otmenyImpl();

		prichiny_otmenyImpl.setNew(prichiny_otmeny.isNew());
		prichiny_otmenyImpl.setPrimaryKey(prichiny_otmeny.getPrimaryKey());

		prichiny_otmenyImpl.setData_izmenenija(prichiny_otmeny.getData_izmenenija());
		prichiny_otmenyImpl.setData_sozdanija(prichiny_otmeny.getData_sozdanija());
		prichiny_otmenyImpl.setIzmenil(prichiny_otmeny.getIzmenil());
		prichiny_otmenyImpl.setIzvewenie_id(prichiny_otmeny.getIzvewenie_id());
		prichiny_otmenyImpl.setPrichina(prichiny_otmeny.getPrichina());
		prichiny_otmenyImpl.setPrichiny_otmeny_id(prichiny_otmeny.getPrichiny_otmeny_id());
		prichiny_otmenyImpl.setSozdal(prichiny_otmeny.getSozdal());

		return prichiny_otmenyImpl;
	}

	/**
	 * Returns the prichiny_otmeny with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the prichiny_otmeny
	 * @return the prichiny_otmeny
	 * @throws NoSuchprichiny_otmenyException if a prichiny_otmeny with the primary key could not be found
	 */
	@Override
	public prichiny_otmeny findByPrimaryKey(Serializable primaryKey)
		throws NoSuchprichiny_otmenyException {
		prichiny_otmeny prichiny_otmeny = fetchByPrimaryKey(primaryKey);

		if (prichiny_otmeny == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchprichiny_otmenyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return prichiny_otmeny;
	}

	/**
	 * Returns the prichiny_otmeny with the primary key or throws a {@link NoSuchprichiny_otmenyException} if it could not be found.
	 *
	 * @param prichiny_otmeny_id the primary key of the prichiny_otmeny
	 * @return the prichiny_otmeny
	 * @throws NoSuchprichiny_otmenyException if a prichiny_otmeny with the primary key could not be found
	 */
	@Override
	public prichiny_otmeny findByPrimaryKey(long prichiny_otmeny_id)
		throws NoSuchprichiny_otmenyException {
		return findByPrimaryKey((Serializable)prichiny_otmeny_id);
	}

	/**
	 * Returns the prichiny_otmeny with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the prichiny_otmeny
	 * @return the prichiny_otmeny, or <code>null</code> if a prichiny_otmeny with the primary key could not be found
	 */
	@Override
	public prichiny_otmeny fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(prichiny_otmenyModelImpl.ENTITY_CACHE_ENABLED,
				prichiny_otmenyImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		prichiny_otmeny prichiny_otmeny = (prichiny_otmeny)serializable;

		if (prichiny_otmeny == null) {
			Session session = null;

			try {
				session = openSession();

				prichiny_otmeny = (prichiny_otmeny)session.get(prichiny_otmenyImpl.class,
						primaryKey);

				if (prichiny_otmeny != null) {
					cacheResult(prichiny_otmeny);
				}
				else {
					entityCache.putResult(prichiny_otmenyModelImpl.ENTITY_CACHE_ENABLED,
						prichiny_otmenyImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(prichiny_otmenyModelImpl.ENTITY_CACHE_ENABLED,
					prichiny_otmenyImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return prichiny_otmeny;
	}

	/**
	 * Returns the prichiny_otmeny with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param prichiny_otmeny_id the primary key of the prichiny_otmeny
	 * @return the prichiny_otmeny, or <code>null</code> if a prichiny_otmeny with the primary key could not be found
	 */
	@Override
	public prichiny_otmeny fetchByPrimaryKey(long prichiny_otmeny_id) {
		return fetchByPrimaryKey((Serializable)prichiny_otmeny_id);
	}

	@Override
	public Map<Serializable, prichiny_otmeny> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, prichiny_otmeny> map = new HashMap<Serializable, prichiny_otmeny>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			prichiny_otmeny prichiny_otmeny = fetchByPrimaryKey(primaryKey);

			if (prichiny_otmeny != null) {
				map.put(primaryKey, prichiny_otmeny);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(prichiny_otmenyModelImpl.ENTITY_CACHE_ENABLED,
					prichiny_otmenyImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (prichiny_otmeny)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_PRICHINY_OTMENY_WHERE_PKS_IN);

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

			for (prichiny_otmeny prichiny_otmeny : (List<prichiny_otmeny>)q.list()) {
				map.put(prichiny_otmeny.getPrimaryKeyObj(), prichiny_otmeny);

				cacheResult(prichiny_otmeny);

				uncachedPrimaryKeys.remove(prichiny_otmeny.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(prichiny_otmenyModelImpl.ENTITY_CACHE_ENABLED,
					prichiny_otmenyImpl.class, primaryKey, nullModel);
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
	 * Returns all the prichiny_otmenies.
	 *
	 * @return the prichiny_otmenies
	 */
	@Override
	public List<prichiny_otmeny> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the prichiny_otmenies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link prichiny_otmenyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of prichiny_otmenies
	 * @param end the upper bound of the range of prichiny_otmenies (not inclusive)
	 * @return the range of prichiny_otmenies
	 */
	@Override
	public List<prichiny_otmeny> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the prichiny_otmenies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link prichiny_otmenyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of prichiny_otmenies
	 * @param end the upper bound of the range of prichiny_otmenies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of prichiny_otmenies
	 */
	@Override
	public List<prichiny_otmeny> findAll(int start, int end,
		OrderByComparator<prichiny_otmeny> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the prichiny_otmenies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link prichiny_otmenyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of prichiny_otmenies
	 * @param end the upper bound of the range of prichiny_otmenies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of prichiny_otmenies
	 */
	@Override
	public List<prichiny_otmeny> findAll(int start, int end,
		OrderByComparator<prichiny_otmeny> orderByComparator,
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

		List<prichiny_otmeny> list = null;

		if (retrieveFromCache) {
			list = (List<prichiny_otmeny>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_PRICHINY_OTMENY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PRICHINY_OTMENY;

				if (pagination) {
					sql = sql.concat(prichiny_otmenyModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<prichiny_otmeny>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<prichiny_otmeny>)QueryUtil.list(q,
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
	 * Removes all the prichiny_otmenies from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (prichiny_otmeny prichiny_otmeny : findAll()) {
			remove(prichiny_otmeny);
		}
	}

	/**
	 * Returns the number of prichiny_otmenies.
	 *
	 * @return the number of prichiny_otmenies
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_PRICHINY_OTMENY);

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
		return prichiny_otmenyModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the prichiny_otmeny persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(prichiny_otmenyImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_PRICHINY_OTMENY = "SELECT prichiny_otmeny FROM prichiny_otmeny prichiny_otmeny";
	private static final String _SQL_SELECT_PRICHINY_OTMENY_WHERE_PKS_IN = "SELECT prichiny_otmeny FROM prichiny_otmeny prichiny_otmeny WHERE prichiny_otmeny_id IN (";
	private static final String _SQL_COUNT_PRICHINY_OTMENY = "SELECT COUNT(prichiny_otmeny) FROM prichiny_otmeny prichiny_otmeny";
	private static final String _ORDER_BY_ENTITY_ALIAS = "prichiny_otmeny.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No prichiny_otmeny exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(prichiny_otmenyPersistenceImpl.class);
}
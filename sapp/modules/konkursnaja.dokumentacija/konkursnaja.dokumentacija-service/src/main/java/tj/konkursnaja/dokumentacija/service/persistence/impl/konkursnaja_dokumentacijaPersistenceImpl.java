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

package tj.konkursnaja.dokumentacija.service.persistence.impl;

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

import tj.konkursnaja.dokumentacija.exception.NoSuchkonkursnaja_dokumentacijaException;
import tj.konkursnaja.dokumentacija.model.impl.konkursnaja_dokumentacijaImpl;
import tj.konkursnaja.dokumentacija.model.impl.konkursnaja_dokumentacijaModelImpl;
import tj.konkursnaja.dokumentacija.model.konkursnaja_dokumentacija;
import tj.konkursnaja.dokumentacija.service.persistence.konkursnaja_dokumentacijaPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the konkursnaja_dokumentacija service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see konkursnaja_dokumentacijaPersistence
 * @see tj.konkursnaja.dokumentacija.service.persistence.konkursnaja_dokumentacijaUtil
 * @generated
 */
@ProviderType
public class konkursnaja_dokumentacijaPersistenceImpl
	extends BasePersistenceImpl<konkursnaja_dokumentacija>
	implements konkursnaja_dokumentacijaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link konkursnaja_dokumentacijaUtil} to access the konkursnaja_dokumentacija persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = konkursnaja_dokumentacijaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(konkursnaja_dokumentacijaModelImpl.ENTITY_CACHE_ENABLED,
			konkursnaja_dokumentacijaModelImpl.FINDER_CACHE_ENABLED,
			konkursnaja_dokumentacijaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(konkursnaja_dokumentacijaModelImpl.ENTITY_CACHE_ENABLED,
			konkursnaja_dokumentacijaModelImpl.FINDER_CACHE_ENABLED,
			konkursnaja_dokumentacijaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(konkursnaja_dokumentacijaModelImpl.ENTITY_CACHE_ENABLED,
			konkursnaja_dokumentacijaModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	public konkursnaja_dokumentacijaPersistenceImpl() {
		setModelClass(konkursnaja_dokumentacija.class);
	}

	/**
	 * Caches the konkursnaja_dokumentacija in the entity cache if it is enabled.
	 *
	 * @param konkursnaja_dokumentacija the konkursnaja_dokumentacija
	 */
	@Override
	public void cacheResult(konkursnaja_dokumentacija konkursnaja_dokumentacija) {
		entityCache.putResult(konkursnaja_dokumentacijaModelImpl.ENTITY_CACHE_ENABLED,
			konkursnaja_dokumentacijaImpl.class,
			konkursnaja_dokumentacija.getPrimaryKey(), konkursnaja_dokumentacija);

		konkursnaja_dokumentacija.resetOriginalValues();
	}

	/**
	 * Caches the konkursnaja_dokumentacijas in the entity cache if it is enabled.
	 *
	 * @param konkursnaja_dokumentacijas the konkursnaja_dokumentacijas
	 */
	@Override
	public void cacheResult(
		List<konkursnaja_dokumentacija> konkursnaja_dokumentacijas) {
		for (konkursnaja_dokumentacija konkursnaja_dokumentacija : konkursnaja_dokumentacijas) {
			if (entityCache.getResult(
						konkursnaja_dokumentacijaModelImpl.ENTITY_CACHE_ENABLED,
						konkursnaja_dokumentacijaImpl.class,
						konkursnaja_dokumentacija.getPrimaryKey()) == null) {
				cacheResult(konkursnaja_dokumentacija);
			}
			else {
				konkursnaja_dokumentacija.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all konkursnaja_dokumentacijas.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(konkursnaja_dokumentacijaImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the konkursnaja_dokumentacija.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(konkursnaja_dokumentacija konkursnaja_dokumentacija) {
		entityCache.removeResult(konkursnaja_dokumentacijaModelImpl.ENTITY_CACHE_ENABLED,
			konkursnaja_dokumentacijaImpl.class,
			konkursnaja_dokumentacija.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<konkursnaja_dokumentacija> konkursnaja_dokumentacijas) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (konkursnaja_dokumentacija konkursnaja_dokumentacija : konkursnaja_dokumentacijas) {
			entityCache.removeResult(konkursnaja_dokumentacijaModelImpl.ENTITY_CACHE_ENABLED,
				konkursnaja_dokumentacijaImpl.class,
				konkursnaja_dokumentacija.getPrimaryKey());
		}
	}

	/**
	 * Creates a new konkursnaja_dokumentacija with the primary key. Does not add the konkursnaja_dokumentacija to the database.
	 *
	 * @param konkursnaja_dokumentacija_id the primary key for the new konkursnaja_dokumentacija
	 * @return the new konkursnaja_dokumentacija
	 */
	@Override
	public konkursnaja_dokumentacija create(long konkursnaja_dokumentacija_id) {
		konkursnaja_dokumentacija konkursnaja_dokumentacija = new konkursnaja_dokumentacijaImpl();

		konkursnaja_dokumentacija.setNew(true);
		konkursnaja_dokumentacija.setPrimaryKey(konkursnaja_dokumentacija_id);

		return konkursnaja_dokumentacija;
	}

	/**
	 * Removes the konkursnaja_dokumentacija with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param konkursnaja_dokumentacija_id the primary key of the konkursnaja_dokumentacija
	 * @return the konkursnaja_dokumentacija that was removed
	 * @throws NoSuchkonkursnaja_dokumentacijaException if a konkursnaja_dokumentacija with the primary key could not be found
	 */
	@Override
	public konkursnaja_dokumentacija remove(long konkursnaja_dokumentacija_id)
		throws NoSuchkonkursnaja_dokumentacijaException {
		return remove((Serializable)konkursnaja_dokumentacija_id);
	}

	/**
	 * Removes the konkursnaja_dokumentacija with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the konkursnaja_dokumentacija
	 * @return the konkursnaja_dokumentacija that was removed
	 * @throws NoSuchkonkursnaja_dokumentacijaException if a konkursnaja_dokumentacija with the primary key could not be found
	 */
	@Override
	public konkursnaja_dokumentacija remove(Serializable primaryKey)
		throws NoSuchkonkursnaja_dokumentacijaException {
		Session session = null;

		try {
			session = openSession();

			konkursnaja_dokumentacija konkursnaja_dokumentacija = (konkursnaja_dokumentacija)session.get(konkursnaja_dokumentacijaImpl.class,
					primaryKey);

			if (konkursnaja_dokumentacija == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchkonkursnaja_dokumentacijaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(konkursnaja_dokumentacija);
		}
		catch (NoSuchkonkursnaja_dokumentacijaException nsee) {
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
	protected konkursnaja_dokumentacija removeImpl(
		konkursnaja_dokumentacija konkursnaja_dokumentacija) {
		konkursnaja_dokumentacija = toUnwrappedModel(konkursnaja_dokumentacija);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(konkursnaja_dokumentacija)) {
				konkursnaja_dokumentacija = (konkursnaja_dokumentacija)session.get(konkursnaja_dokumentacijaImpl.class,
						konkursnaja_dokumentacija.getPrimaryKeyObj());
			}

			if (konkursnaja_dokumentacija != null) {
				session.delete(konkursnaja_dokumentacija);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (konkursnaja_dokumentacija != null) {
			clearCache(konkursnaja_dokumentacija);
		}

		return konkursnaja_dokumentacija;
	}

	@Override
	public konkursnaja_dokumentacija updateImpl(
		konkursnaja_dokumentacija konkursnaja_dokumentacija) {
		konkursnaja_dokumentacija = toUnwrappedModel(konkursnaja_dokumentacija);

		boolean isNew = konkursnaja_dokumentacija.isNew();

		Session session = null;

		try {
			session = openSession();

			if (konkursnaja_dokumentacija.isNew()) {
				session.save(konkursnaja_dokumentacija);

				konkursnaja_dokumentacija.setNew(false);
			}
			else {
				konkursnaja_dokumentacija = (konkursnaja_dokumentacija)session.merge(konkursnaja_dokumentacija);
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

		entityCache.putResult(konkursnaja_dokumentacijaModelImpl.ENTITY_CACHE_ENABLED,
			konkursnaja_dokumentacijaImpl.class,
			konkursnaja_dokumentacija.getPrimaryKey(),
			konkursnaja_dokumentacija, false);

		konkursnaja_dokumentacija.resetOriginalValues();

		return konkursnaja_dokumentacija;
	}

	protected konkursnaja_dokumentacija toUnwrappedModel(
		konkursnaja_dokumentacija konkursnaja_dokumentacija) {
		if (konkursnaja_dokumentacija instanceof konkursnaja_dokumentacijaImpl) {
			return konkursnaja_dokumentacija;
		}

		konkursnaja_dokumentacijaImpl konkursnaja_dokumentacijaImpl = new konkursnaja_dokumentacijaImpl();

		konkursnaja_dokumentacijaImpl.setNew(konkursnaja_dokumentacija.isNew());
		konkursnaja_dokumentacijaImpl.setPrimaryKey(konkursnaja_dokumentacija.getPrimaryKey());

		konkursnaja_dokumentacijaImpl.setData_zagruzki(konkursnaja_dokumentacija.getData_zagruzki());
		konkursnaja_dokumentacijaImpl.setImja_fajla(konkursnaja_dokumentacija.getImja_fajla());
		konkursnaja_dokumentacijaImpl.setIzvewenie_id(konkursnaja_dokumentacija.getIzvewenie_id());
		konkursnaja_dokumentacijaImpl.setKonkursnaja_dokumentacija_id(konkursnaja_dokumentacija.getKonkursnaja_dokumentacija_id());
		konkursnaja_dokumentacijaImpl.setLot_id(konkursnaja_dokumentacija.getLot_id());
		konkursnaja_dokumentacijaImpl.setNazvanie_dokumenta(konkursnaja_dokumentacija.getNazvanie_dokumenta());
		konkursnaja_dokumentacijaImpl.setZagruzil(konkursnaja_dokumentacija.getZagruzil());

		return konkursnaja_dokumentacijaImpl;
	}

	/**
	 * Returns the konkursnaja_dokumentacija with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the konkursnaja_dokumentacija
	 * @return the konkursnaja_dokumentacija
	 * @throws NoSuchkonkursnaja_dokumentacijaException if a konkursnaja_dokumentacija with the primary key could not be found
	 */
	@Override
	public konkursnaja_dokumentacija findByPrimaryKey(Serializable primaryKey)
		throws NoSuchkonkursnaja_dokumentacijaException {
		konkursnaja_dokumentacija konkursnaja_dokumentacija = fetchByPrimaryKey(primaryKey);

		if (konkursnaja_dokumentacija == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchkonkursnaja_dokumentacijaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return konkursnaja_dokumentacija;
	}

	/**
	 * Returns the konkursnaja_dokumentacija with the primary key or throws a {@link NoSuchkonkursnaja_dokumentacijaException} if it could not be found.
	 *
	 * @param konkursnaja_dokumentacija_id the primary key of the konkursnaja_dokumentacija
	 * @return the konkursnaja_dokumentacija
	 * @throws NoSuchkonkursnaja_dokumentacijaException if a konkursnaja_dokumentacija with the primary key could not be found
	 */
	@Override
	public konkursnaja_dokumentacija findByPrimaryKey(
		long konkursnaja_dokumentacija_id)
		throws NoSuchkonkursnaja_dokumentacijaException {
		return findByPrimaryKey((Serializable)konkursnaja_dokumentacija_id);
	}

	/**
	 * Returns the konkursnaja_dokumentacija with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the konkursnaja_dokumentacija
	 * @return the konkursnaja_dokumentacija, or <code>null</code> if a konkursnaja_dokumentacija with the primary key could not be found
	 */
	@Override
	public konkursnaja_dokumentacija fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(konkursnaja_dokumentacijaModelImpl.ENTITY_CACHE_ENABLED,
				konkursnaja_dokumentacijaImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		konkursnaja_dokumentacija konkursnaja_dokumentacija = (konkursnaja_dokumentacija)serializable;

		if (konkursnaja_dokumentacija == null) {
			Session session = null;

			try {
				session = openSession();

				konkursnaja_dokumentacija = (konkursnaja_dokumentacija)session.get(konkursnaja_dokumentacijaImpl.class,
						primaryKey);

				if (konkursnaja_dokumentacija != null) {
					cacheResult(konkursnaja_dokumentacija);
				}
				else {
					entityCache.putResult(konkursnaja_dokumentacijaModelImpl.ENTITY_CACHE_ENABLED,
						konkursnaja_dokumentacijaImpl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(konkursnaja_dokumentacijaModelImpl.ENTITY_CACHE_ENABLED,
					konkursnaja_dokumentacijaImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return konkursnaja_dokumentacija;
	}

	/**
	 * Returns the konkursnaja_dokumentacija with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param konkursnaja_dokumentacija_id the primary key of the konkursnaja_dokumentacija
	 * @return the konkursnaja_dokumentacija, or <code>null</code> if a konkursnaja_dokumentacija with the primary key could not be found
	 */
	@Override
	public konkursnaja_dokumentacija fetchByPrimaryKey(
		long konkursnaja_dokumentacija_id) {
		return fetchByPrimaryKey((Serializable)konkursnaja_dokumentacija_id);
	}

	@Override
	public Map<Serializable, konkursnaja_dokumentacija> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, konkursnaja_dokumentacija> map = new HashMap<Serializable, konkursnaja_dokumentacija>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			konkursnaja_dokumentacija konkursnaja_dokumentacija = fetchByPrimaryKey(primaryKey);

			if (konkursnaja_dokumentacija != null) {
				map.put(primaryKey, konkursnaja_dokumentacija);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(konkursnaja_dokumentacijaModelImpl.ENTITY_CACHE_ENABLED,
					konkursnaja_dokumentacijaImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (konkursnaja_dokumentacija)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_KONKURSNAJA_DOKUMENTACIJA_WHERE_PKS_IN);

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

			for (konkursnaja_dokumentacija konkursnaja_dokumentacija : (List<konkursnaja_dokumentacija>)q.list()) {
				map.put(konkursnaja_dokumentacija.getPrimaryKeyObj(),
					konkursnaja_dokumentacija);

				cacheResult(konkursnaja_dokumentacija);

				uncachedPrimaryKeys.remove(konkursnaja_dokumentacija.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(konkursnaja_dokumentacijaModelImpl.ENTITY_CACHE_ENABLED,
					konkursnaja_dokumentacijaImpl.class, primaryKey, nullModel);
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
	 * Returns all the konkursnaja_dokumentacijas.
	 *
	 * @return the konkursnaja_dokumentacijas
	 */
	@Override
	public List<konkursnaja_dokumentacija> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the konkursnaja_dokumentacijas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link konkursnaja_dokumentacijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of konkursnaja_dokumentacijas
	 * @param end the upper bound of the range of konkursnaja_dokumentacijas (not inclusive)
	 * @return the range of konkursnaja_dokumentacijas
	 */
	@Override
	public List<konkursnaja_dokumentacija> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the konkursnaja_dokumentacijas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link konkursnaja_dokumentacijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of konkursnaja_dokumentacijas
	 * @param end the upper bound of the range of konkursnaja_dokumentacijas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of konkursnaja_dokumentacijas
	 */
	@Override
	public List<konkursnaja_dokumentacija> findAll(int start, int end,
		OrderByComparator<konkursnaja_dokumentacija> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the konkursnaja_dokumentacijas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link konkursnaja_dokumentacijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of konkursnaja_dokumentacijas
	 * @param end the upper bound of the range of konkursnaja_dokumentacijas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of konkursnaja_dokumentacijas
	 */
	@Override
	public List<konkursnaja_dokumentacija> findAll(int start, int end,
		OrderByComparator<konkursnaja_dokumentacija> orderByComparator,
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

		List<konkursnaja_dokumentacija> list = null;

		if (retrieveFromCache) {
			list = (List<konkursnaja_dokumentacija>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_KONKURSNAJA_DOKUMENTACIJA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_KONKURSNAJA_DOKUMENTACIJA;

				if (pagination) {
					sql = sql.concat(konkursnaja_dokumentacijaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<konkursnaja_dokumentacija>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<konkursnaja_dokumentacija>)QueryUtil.list(q,
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
	 * Removes all the konkursnaja_dokumentacijas from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (konkursnaja_dokumentacija konkursnaja_dokumentacija : findAll()) {
			remove(konkursnaja_dokumentacija);
		}
	}

	/**
	 * Returns the number of konkursnaja_dokumentacijas.
	 *
	 * @return the number of konkursnaja_dokumentacijas
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_KONKURSNAJA_DOKUMENTACIJA);

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
		return konkursnaja_dokumentacijaModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the konkursnaja_dokumentacija persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(konkursnaja_dokumentacijaImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_KONKURSNAJA_DOKUMENTACIJA = "SELECT konkursnaja_dokumentacija FROM konkursnaja_dokumentacija konkursnaja_dokumentacija";
	private static final String _SQL_SELECT_KONKURSNAJA_DOKUMENTACIJA_WHERE_PKS_IN =
		"SELECT konkursnaja_dokumentacija FROM konkursnaja_dokumentacija konkursnaja_dokumentacija WHERE konkursnaja_dokumentacija_id IN (";
	private static final String _SQL_COUNT_KONKURSNAJA_DOKUMENTACIJA = "SELECT COUNT(konkursnaja_dokumentacija) FROM konkursnaja_dokumentacija konkursnaja_dokumentacija";
	private static final String _ORDER_BY_ENTITY_ALIAS = "konkursnaja_dokumentacija.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No konkursnaja_dokumentacija exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(konkursnaja_dokumentacijaPersistenceImpl.class);
}
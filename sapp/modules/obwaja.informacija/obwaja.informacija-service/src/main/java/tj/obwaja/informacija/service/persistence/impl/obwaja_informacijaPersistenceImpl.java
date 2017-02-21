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

package tj.obwaja.informacija.service.persistence.impl;

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

import tj.obwaja.informacija.exception.NoSuchobwaja_informacijaException;
import tj.obwaja.informacija.model.impl.obwaja_informacijaImpl;
import tj.obwaja.informacija.model.impl.obwaja_informacijaModelImpl;
import tj.obwaja.informacija.model.obwaja_informacija;
import tj.obwaja.informacija.service.persistence.obwaja_informacijaPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the obwaja_informacija service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see obwaja_informacijaPersistence
 * @see tj.obwaja.informacija.service.persistence.obwaja_informacijaUtil
 * @generated
 */
@ProviderType
public class obwaja_informacijaPersistenceImpl extends BasePersistenceImpl<obwaja_informacija>
	implements obwaja_informacijaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link obwaja_informacijaUtil} to access the obwaja_informacija persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = obwaja_informacijaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(obwaja_informacijaModelImpl.ENTITY_CACHE_ENABLED,
			obwaja_informacijaModelImpl.FINDER_CACHE_ENABLED,
			obwaja_informacijaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(obwaja_informacijaModelImpl.ENTITY_CACHE_ENABLED,
			obwaja_informacijaModelImpl.FINDER_CACHE_ENABLED,
			obwaja_informacijaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(obwaja_informacijaModelImpl.ENTITY_CACHE_ENABLED,
			obwaja_informacijaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public obwaja_informacijaPersistenceImpl() {
		setModelClass(obwaja_informacija.class);
	}

	/**
	 * Caches the obwaja_informacija in the entity cache if it is enabled.
	 *
	 * @param obwaja_informacija the obwaja_informacija
	 */
	@Override
	public void cacheResult(obwaja_informacija obwaja_informacija) {
		entityCache.putResult(obwaja_informacijaModelImpl.ENTITY_CACHE_ENABLED,
			obwaja_informacijaImpl.class, obwaja_informacija.getPrimaryKey(),
			obwaja_informacija);

		obwaja_informacija.resetOriginalValues();
	}

	/**
	 * Caches the obwaja_informacijas in the entity cache if it is enabled.
	 *
	 * @param obwaja_informacijas the obwaja_informacijas
	 */
	@Override
	public void cacheResult(List<obwaja_informacija> obwaja_informacijas) {
		for (obwaja_informacija obwaja_informacija : obwaja_informacijas) {
			if (entityCache.getResult(
						obwaja_informacijaModelImpl.ENTITY_CACHE_ENABLED,
						obwaja_informacijaImpl.class,
						obwaja_informacija.getPrimaryKey()) == null) {
				cacheResult(obwaja_informacija);
			}
			else {
				obwaja_informacija.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all obwaja_informacijas.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(obwaja_informacijaImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the obwaja_informacija.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(obwaja_informacija obwaja_informacija) {
		entityCache.removeResult(obwaja_informacijaModelImpl.ENTITY_CACHE_ENABLED,
			obwaja_informacijaImpl.class, obwaja_informacija.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<obwaja_informacija> obwaja_informacijas) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (obwaja_informacija obwaja_informacija : obwaja_informacijas) {
			entityCache.removeResult(obwaja_informacijaModelImpl.ENTITY_CACHE_ENABLED,
				obwaja_informacijaImpl.class, obwaja_informacija.getPrimaryKey());
		}
	}

	/**
	 * Creates a new obwaja_informacija with the primary key. Does not add the obwaja_informacija to the database.
	 *
	 * @param obwaja_informacija_id the primary key for the new obwaja_informacija
	 * @return the new obwaja_informacija
	 */
	@Override
	public obwaja_informacija create(long obwaja_informacija_id) {
		obwaja_informacija obwaja_informacija = new obwaja_informacijaImpl();

		obwaja_informacija.setNew(true);
		obwaja_informacija.setPrimaryKey(obwaja_informacija_id);

		return obwaja_informacija;
	}

	/**
	 * Removes the obwaja_informacija with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param obwaja_informacija_id the primary key of the obwaja_informacija
	 * @return the obwaja_informacija that was removed
	 * @throws NoSuchobwaja_informacijaException if a obwaja_informacija with the primary key could not be found
	 */
	@Override
	public obwaja_informacija remove(long obwaja_informacija_id)
		throws NoSuchobwaja_informacijaException {
		return remove((Serializable)obwaja_informacija_id);
	}

	/**
	 * Removes the obwaja_informacija with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the obwaja_informacija
	 * @return the obwaja_informacija that was removed
	 * @throws NoSuchobwaja_informacijaException if a obwaja_informacija with the primary key could not be found
	 */
	@Override
	public obwaja_informacija remove(Serializable primaryKey)
		throws NoSuchobwaja_informacijaException {
		Session session = null;

		try {
			session = openSession();

			obwaja_informacija obwaja_informacija = (obwaja_informacija)session.get(obwaja_informacijaImpl.class,
					primaryKey);

			if (obwaja_informacija == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchobwaja_informacijaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(obwaja_informacija);
		}
		catch (NoSuchobwaja_informacijaException nsee) {
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
	protected obwaja_informacija removeImpl(
		obwaja_informacija obwaja_informacija) {
		obwaja_informacija = toUnwrappedModel(obwaja_informacija);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(obwaja_informacija)) {
				obwaja_informacija = (obwaja_informacija)session.get(obwaja_informacijaImpl.class,
						obwaja_informacija.getPrimaryKeyObj());
			}

			if (obwaja_informacija != null) {
				session.delete(obwaja_informacija);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (obwaja_informacija != null) {
			clearCache(obwaja_informacija);
		}

		return obwaja_informacija;
	}

	@Override
	public obwaja_informacija updateImpl(obwaja_informacija obwaja_informacija) {
		obwaja_informacija = toUnwrappedModel(obwaja_informacija);

		boolean isNew = obwaja_informacija.isNew();

		Session session = null;

		try {
			session = openSession();

			if (obwaja_informacija.isNew()) {
				session.save(obwaja_informacija);

				obwaja_informacija.setNew(false);
			}
			else {
				obwaja_informacija = (obwaja_informacija)session.merge(obwaja_informacija);
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

		entityCache.putResult(obwaja_informacijaModelImpl.ENTITY_CACHE_ENABLED,
			obwaja_informacijaImpl.class, obwaja_informacija.getPrimaryKey(),
			obwaja_informacija, false);

		obwaja_informacija.resetOriginalValues();

		return obwaja_informacija;
	}

	protected obwaja_informacija toUnwrappedModel(
		obwaja_informacija obwaja_informacija) {
		if (obwaja_informacija instanceof obwaja_informacijaImpl) {
			return obwaja_informacija;
		}

		obwaja_informacijaImpl obwaja_informacijaImpl = new obwaja_informacijaImpl();

		obwaja_informacijaImpl.setNew(obwaja_informacija.isNew());
		obwaja_informacijaImpl.setPrimaryKey(obwaja_informacija.getPrimaryKey());

		obwaja_informacijaImpl.setData_izmenenija(obwaja_informacija.getData_izmenenija());
		obwaja_informacijaImpl.setData_sozdanija(obwaja_informacija.getData_sozdanija());
		obwaja_informacijaImpl.setIzmenil(obwaja_informacija.getIzmenil());
		obwaja_informacijaImpl.setIzvewenie_id(obwaja_informacija.getIzvewenie_id());
		obwaja_informacijaImpl.setJe_pochta(obwaja_informacija.getJe_pochta());
		obwaja_informacijaImpl.setKontaktnoe_lico(obwaja_informacija.getKontaktnoe_lico());
		obwaja_informacijaImpl.setKontaktnyj_telefon(obwaja_informacija.getKontaktnyj_telefon());
		obwaja_informacijaImpl.setObwaja_informacija_id(obwaja_informacija.getObwaja_informacija_id());
		obwaja_informacijaImpl.setSozdal(obwaja_informacija.getSozdal());

		return obwaja_informacijaImpl;
	}

	/**
	 * Returns the obwaja_informacija with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the obwaja_informacija
	 * @return the obwaja_informacija
	 * @throws NoSuchobwaja_informacijaException if a obwaja_informacija with the primary key could not be found
	 */
	@Override
	public obwaja_informacija findByPrimaryKey(Serializable primaryKey)
		throws NoSuchobwaja_informacijaException {
		obwaja_informacija obwaja_informacija = fetchByPrimaryKey(primaryKey);

		if (obwaja_informacija == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchobwaja_informacijaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return obwaja_informacija;
	}

	/**
	 * Returns the obwaja_informacija with the primary key or throws a {@link NoSuchobwaja_informacijaException} if it could not be found.
	 *
	 * @param obwaja_informacija_id the primary key of the obwaja_informacija
	 * @return the obwaja_informacija
	 * @throws NoSuchobwaja_informacijaException if a obwaja_informacija with the primary key could not be found
	 */
	@Override
	public obwaja_informacija findByPrimaryKey(long obwaja_informacija_id)
		throws NoSuchobwaja_informacijaException {
		return findByPrimaryKey((Serializable)obwaja_informacija_id);
	}

	/**
	 * Returns the obwaja_informacija with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the obwaja_informacija
	 * @return the obwaja_informacija, or <code>null</code> if a obwaja_informacija with the primary key could not be found
	 */
	@Override
	public obwaja_informacija fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(obwaja_informacijaModelImpl.ENTITY_CACHE_ENABLED,
				obwaja_informacijaImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		obwaja_informacija obwaja_informacija = (obwaja_informacija)serializable;

		if (obwaja_informacija == null) {
			Session session = null;

			try {
				session = openSession();

				obwaja_informacija = (obwaja_informacija)session.get(obwaja_informacijaImpl.class,
						primaryKey);

				if (obwaja_informacija != null) {
					cacheResult(obwaja_informacija);
				}
				else {
					entityCache.putResult(obwaja_informacijaModelImpl.ENTITY_CACHE_ENABLED,
						obwaja_informacijaImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(obwaja_informacijaModelImpl.ENTITY_CACHE_ENABLED,
					obwaja_informacijaImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return obwaja_informacija;
	}

	/**
	 * Returns the obwaja_informacija with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param obwaja_informacija_id the primary key of the obwaja_informacija
	 * @return the obwaja_informacija, or <code>null</code> if a obwaja_informacija with the primary key could not be found
	 */
	@Override
	public obwaja_informacija fetchByPrimaryKey(long obwaja_informacija_id) {
		return fetchByPrimaryKey((Serializable)obwaja_informacija_id);
	}

	@Override
	public Map<Serializable, obwaja_informacija> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, obwaja_informacija> map = new HashMap<Serializable, obwaja_informacija>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			obwaja_informacija obwaja_informacija = fetchByPrimaryKey(primaryKey);

			if (obwaja_informacija != null) {
				map.put(primaryKey, obwaja_informacija);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(obwaja_informacijaModelImpl.ENTITY_CACHE_ENABLED,
					obwaja_informacijaImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (obwaja_informacija)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_OBWAJA_INFORMACIJA_WHERE_PKS_IN);

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

			for (obwaja_informacija obwaja_informacija : (List<obwaja_informacija>)q.list()) {
				map.put(obwaja_informacija.getPrimaryKeyObj(),
					obwaja_informacija);

				cacheResult(obwaja_informacija);

				uncachedPrimaryKeys.remove(obwaja_informacija.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(obwaja_informacijaModelImpl.ENTITY_CACHE_ENABLED,
					obwaja_informacijaImpl.class, primaryKey, nullModel);
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
	 * Returns all the obwaja_informacijas.
	 *
	 * @return the obwaja_informacijas
	 */
	@Override
	public List<obwaja_informacija> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the obwaja_informacijas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link obwaja_informacijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of obwaja_informacijas
	 * @param end the upper bound of the range of obwaja_informacijas (not inclusive)
	 * @return the range of obwaja_informacijas
	 */
	@Override
	public List<obwaja_informacija> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the obwaja_informacijas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link obwaja_informacijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of obwaja_informacijas
	 * @param end the upper bound of the range of obwaja_informacijas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of obwaja_informacijas
	 */
	@Override
	public List<obwaja_informacija> findAll(int start, int end,
		OrderByComparator<obwaja_informacija> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the obwaja_informacijas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link obwaja_informacijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of obwaja_informacijas
	 * @param end the upper bound of the range of obwaja_informacijas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of obwaja_informacijas
	 */
	@Override
	public List<obwaja_informacija> findAll(int start, int end,
		OrderByComparator<obwaja_informacija> orderByComparator,
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

		List<obwaja_informacija> list = null;

		if (retrieveFromCache) {
			list = (List<obwaja_informacija>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_OBWAJA_INFORMACIJA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_OBWAJA_INFORMACIJA;

				if (pagination) {
					sql = sql.concat(obwaja_informacijaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<obwaja_informacija>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<obwaja_informacija>)QueryUtil.list(q,
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
	 * Removes all the obwaja_informacijas from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (obwaja_informacija obwaja_informacija : findAll()) {
			remove(obwaja_informacija);
		}
	}

	/**
	 * Returns the number of obwaja_informacijas.
	 *
	 * @return the number of obwaja_informacijas
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_OBWAJA_INFORMACIJA);

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
		return obwaja_informacijaModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the obwaja_informacija persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(obwaja_informacijaImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_OBWAJA_INFORMACIJA = "SELECT obwaja_informacija FROM obwaja_informacija obwaja_informacija";
	private static final String _SQL_SELECT_OBWAJA_INFORMACIJA_WHERE_PKS_IN = "SELECT obwaja_informacija FROM obwaja_informacija obwaja_informacija WHERE obwaja_informacija_id IN (";
	private static final String _SQL_COUNT_OBWAJA_INFORMACIJA = "SELECT COUNT(obwaja_informacija) FROM obwaja_informacija obwaja_informacija";
	private static final String _ORDER_BY_ENTITY_ALIAS = "obwaja_informacija.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No obwaja_informacija exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(obwaja_informacijaPersistenceImpl.class);
}
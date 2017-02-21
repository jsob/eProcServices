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

package tj.informacija.o.razmewenii.service.persistence.impl;

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

import tj.informacija.o.razmewenii.exception.NoSuchinformacija_o_razmeweniiException;
import tj.informacija.o.razmewenii.model.impl.informacija_o_razmeweniiImpl;
import tj.informacija.o.razmewenii.model.impl.informacija_o_razmeweniiModelImpl;
import tj.informacija.o.razmewenii.model.informacija_o_razmewenii;
import tj.informacija.o.razmewenii.service.persistence.informacija_o_razmeweniiPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the informacija_o_razmewenii service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see informacija_o_razmeweniiPersistence
 * @see tj.informacija.o.razmewenii.service.persistence.informacija_o_razmeweniiUtil
 * @generated
 */
@ProviderType
public class informacija_o_razmeweniiPersistenceImpl extends BasePersistenceImpl<informacija_o_razmewenii>
	implements informacija_o_razmeweniiPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link informacija_o_razmeweniiUtil} to access the informacija_o_razmewenii persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = informacija_o_razmeweniiImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(informacija_o_razmeweniiModelImpl.ENTITY_CACHE_ENABLED,
			informacija_o_razmeweniiModelImpl.FINDER_CACHE_ENABLED,
			informacija_o_razmeweniiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(informacija_o_razmeweniiModelImpl.ENTITY_CACHE_ENABLED,
			informacija_o_razmeweniiModelImpl.FINDER_CACHE_ENABLED,
			informacija_o_razmeweniiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(informacija_o_razmeweniiModelImpl.ENTITY_CACHE_ENABLED,
			informacija_o_razmeweniiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public informacija_o_razmeweniiPersistenceImpl() {
		setModelClass(informacija_o_razmewenii.class);
	}

	/**
	 * Caches the informacija_o_razmewenii in the entity cache if it is enabled.
	 *
	 * @param informacija_o_razmewenii the informacija_o_razmewenii
	 */
	@Override
	public void cacheResult(informacija_o_razmewenii informacija_o_razmewenii) {
		entityCache.putResult(informacija_o_razmeweniiModelImpl.ENTITY_CACHE_ENABLED,
			informacija_o_razmeweniiImpl.class,
			informacija_o_razmewenii.getPrimaryKey(), informacija_o_razmewenii);

		informacija_o_razmewenii.resetOriginalValues();
	}

	/**
	 * Caches the informacija_o_razmeweniis in the entity cache if it is enabled.
	 *
	 * @param informacija_o_razmeweniis the informacija_o_razmeweniis
	 */
	@Override
	public void cacheResult(
		List<informacija_o_razmewenii> informacija_o_razmeweniis) {
		for (informacija_o_razmewenii informacija_o_razmewenii : informacija_o_razmeweniis) {
			if (entityCache.getResult(
						informacija_o_razmeweniiModelImpl.ENTITY_CACHE_ENABLED,
						informacija_o_razmeweniiImpl.class,
						informacija_o_razmewenii.getPrimaryKey()) == null) {
				cacheResult(informacija_o_razmewenii);
			}
			else {
				informacija_o_razmewenii.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all informacija_o_razmeweniis.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(informacija_o_razmeweniiImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the informacija_o_razmewenii.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(informacija_o_razmewenii informacija_o_razmewenii) {
		entityCache.removeResult(informacija_o_razmeweniiModelImpl.ENTITY_CACHE_ENABLED,
			informacija_o_razmeweniiImpl.class,
			informacija_o_razmewenii.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<informacija_o_razmewenii> informacija_o_razmeweniis) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (informacija_o_razmewenii informacija_o_razmewenii : informacija_o_razmeweniis) {
			entityCache.removeResult(informacija_o_razmeweniiModelImpl.ENTITY_CACHE_ENABLED,
				informacija_o_razmeweniiImpl.class,
				informacija_o_razmewenii.getPrimaryKey());
		}
	}

	/**
	 * Creates a new informacija_o_razmewenii with the primary key. Does not add the informacija_o_razmewenii to the database.
	 *
	 * @param informacija_o_razmewenii_id the primary key for the new informacija_o_razmewenii
	 * @return the new informacija_o_razmewenii
	 */
	@Override
	public informacija_o_razmewenii create(long informacija_o_razmewenii_id) {
		informacija_o_razmewenii informacija_o_razmewenii = new informacija_o_razmeweniiImpl();

		informacija_o_razmewenii.setNew(true);
		informacija_o_razmewenii.setPrimaryKey(informacija_o_razmewenii_id);

		return informacija_o_razmewenii;
	}

	/**
	 * Removes the informacija_o_razmewenii with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param informacija_o_razmewenii_id the primary key of the informacija_o_razmewenii
	 * @return the informacija_o_razmewenii that was removed
	 * @throws NoSuchinformacija_o_razmeweniiException if a informacija_o_razmewenii with the primary key could not be found
	 */
	@Override
	public informacija_o_razmewenii remove(long informacija_o_razmewenii_id)
		throws NoSuchinformacija_o_razmeweniiException {
		return remove((Serializable)informacija_o_razmewenii_id);
	}

	/**
	 * Removes the informacija_o_razmewenii with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the informacija_o_razmewenii
	 * @return the informacija_o_razmewenii that was removed
	 * @throws NoSuchinformacija_o_razmeweniiException if a informacija_o_razmewenii with the primary key could not be found
	 */
	@Override
	public informacija_o_razmewenii remove(Serializable primaryKey)
		throws NoSuchinformacija_o_razmeweniiException {
		Session session = null;

		try {
			session = openSession();

			informacija_o_razmewenii informacija_o_razmewenii = (informacija_o_razmewenii)session.get(informacija_o_razmeweniiImpl.class,
					primaryKey);

			if (informacija_o_razmewenii == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchinformacija_o_razmeweniiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(informacija_o_razmewenii);
		}
		catch (NoSuchinformacija_o_razmeweniiException nsee) {
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
	protected informacija_o_razmewenii removeImpl(
		informacija_o_razmewenii informacija_o_razmewenii) {
		informacija_o_razmewenii = toUnwrappedModel(informacija_o_razmewenii);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(informacija_o_razmewenii)) {
				informacija_o_razmewenii = (informacija_o_razmewenii)session.get(informacija_o_razmeweniiImpl.class,
						informacija_o_razmewenii.getPrimaryKeyObj());
			}

			if (informacija_o_razmewenii != null) {
				session.delete(informacija_o_razmewenii);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (informacija_o_razmewenii != null) {
			clearCache(informacija_o_razmewenii);
		}

		return informacija_o_razmewenii;
	}

	@Override
	public informacija_o_razmewenii updateImpl(
		informacija_o_razmewenii informacija_o_razmewenii) {
		informacija_o_razmewenii = toUnwrappedModel(informacija_o_razmewenii);

		boolean isNew = informacija_o_razmewenii.isNew();

		Session session = null;

		try {
			session = openSession();

			if (informacija_o_razmewenii.isNew()) {
				session.save(informacija_o_razmewenii);

				informacija_o_razmewenii.setNew(false);
			}
			else {
				informacija_o_razmewenii = (informacija_o_razmewenii)session.merge(informacija_o_razmewenii);
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

		entityCache.putResult(informacija_o_razmeweniiModelImpl.ENTITY_CACHE_ENABLED,
			informacija_o_razmeweniiImpl.class,
			informacija_o_razmewenii.getPrimaryKey(), informacija_o_razmewenii,
			false);

		informacija_o_razmewenii.resetOriginalValues();

		return informacija_o_razmewenii;
	}

	protected informacija_o_razmewenii toUnwrappedModel(
		informacija_o_razmewenii informacija_o_razmewenii) {
		if (informacija_o_razmewenii instanceof informacija_o_razmeweniiImpl) {
			return informacija_o_razmewenii;
		}

		informacija_o_razmeweniiImpl informacija_o_razmeweniiImpl = new informacija_o_razmeweniiImpl();

		informacija_o_razmeweniiImpl.setNew(informacija_o_razmewenii.isNew());
		informacija_o_razmeweniiImpl.setPrimaryKey(informacija_o_razmewenii.getPrimaryKey());

		informacija_o_razmeweniiImpl.setCena_postavki(informacija_o_razmewenii.getCena_postavki());
		informacija_o_razmeweniiImpl.setCena_postavki_dlja_zakaza(informacija_o_razmewenii.getCena_postavki_dlja_zakaza());
		informacija_o_razmeweniiImpl.setData_izmenenija(informacija_o_razmewenii.getData_izmenenija());
		informacija_o_razmeweniiImpl.setData_sozdanija(informacija_o_razmewenii.getData_sozdanija());
		informacija_o_razmeweniiImpl.setInformacija_o_razmewenii_id(informacija_o_razmewenii.getInformacija_o_razmewenii_id());
		informacija_o_razmeweniiImpl.setIzmenil(informacija_o_razmewenii.getIzmenil());
		informacija_o_razmeweniiImpl.setIzvewenie_id(informacija_o_razmewenii.getIzvewenie_id());
		informacija_o_razmeweniiImpl.setMesto_postavki(informacija_o_razmewenii.getMesto_postavki());
		informacija_o_razmeweniiImpl.setMesto_postavki_dlja_zakaza(informacija_o_razmewenii.getMesto_postavki_dlja_zakaza());
		informacija_o_razmeweniiImpl.setObespechenie_ispolnenija(informacija_o_razmewenii.getObespechenie_ispolnenija());
		informacija_o_razmeweniiImpl.setObespechenie_ispolnenija_dlja_zakaza(informacija_o_razmewenii.getObespechenie_ispolnenija_dlja_zakaza());
		informacija_o_razmeweniiImpl.setObespechenie_ispolnenija_v_procentah(informacija_o_razmewenii.getObespechenie_ispolnenija_v_procentah());
		informacija_o_razmeweniiImpl.setObespechenie_v_procentah(informacija_o_razmewenii.getObespechenie_v_procentah());
		informacija_o_razmeweniiImpl.setObespechenie_zajavki(informacija_o_razmewenii.getObespechenie_zajavki());
		informacija_o_razmeweniiImpl.setObespechenie_zajavki_dlja_zakaza(informacija_o_razmewenii.getObespechenie_zajavki_dlja_zakaza());
		informacija_o_razmeweniiImpl.setOplata(informacija_o_razmewenii.getOplata());
		informacija_o_razmeweniiImpl.setOplata_dlja_zakaza(informacija_o_razmewenii.getOplata_dlja_zakaza());
		informacija_o_razmeweniiImpl.setSoputstvujuwie_uslovija(informacija_o_razmewenii.getSoputstvujuwie_uslovija());
		informacija_o_razmeweniiImpl.setSoputstvujuwie_uslovija_dlja_zakaza(informacija_o_razmewenii.getSoputstvujuwie_uslovija_dlja_zakaza());
		informacija_o_razmeweniiImpl.setSozdal(informacija_o_razmewenii.getSozdal());
		informacija_o_razmeweniiImpl.setSrok_dejstvija(informacija_o_razmewenii.getSrok_dejstvija());
		informacija_o_razmeweniiImpl.setSrok_dejstvija_dlja_zakaza(informacija_o_razmewenii.getSrok_dejstvija_dlja_zakaza());
		informacija_o_razmeweniiImpl.setSrok_ispolnenija_zajavki(informacija_o_razmewenii.getSrok_ispolnenija_zajavki());
		informacija_o_razmeweniiImpl.setSrok_obespechenija_zajavki(informacija_o_razmewenii.getSrok_obespechenija_zajavki());
		informacija_o_razmeweniiImpl.setSrok_postavki(informacija_o_razmewenii.getSrok_postavki());
		informacija_o_razmeweniiImpl.setSrok_postavki_dlja_zakaza(informacija_o_razmewenii.getSrok_postavki_dlja_zakaza());

		return informacija_o_razmeweniiImpl;
	}

	/**
	 * Returns the informacija_o_razmewenii with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the informacija_o_razmewenii
	 * @return the informacija_o_razmewenii
	 * @throws NoSuchinformacija_o_razmeweniiException if a informacija_o_razmewenii with the primary key could not be found
	 */
	@Override
	public informacija_o_razmewenii findByPrimaryKey(Serializable primaryKey)
		throws NoSuchinformacija_o_razmeweniiException {
		informacija_o_razmewenii informacija_o_razmewenii = fetchByPrimaryKey(primaryKey);

		if (informacija_o_razmewenii == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchinformacija_o_razmeweniiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return informacija_o_razmewenii;
	}

	/**
	 * Returns the informacija_o_razmewenii with the primary key or throws a {@link NoSuchinformacija_o_razmeweniiException} if it could not be found.
	 *
	 * @param informacija_o_razmewenii_id the primary key of the informacija_o_razmewenii
	 * @return the informacija_o_razmewenii
	 * @throws NoSuchinformacija_o_razmeweniiException if a informacija_o_razmewenii with the primary key could not be found
	 */
	@Override
	public informacija_o_razmewenii findByPrimaryKey(
		long informacija_o_razmewenii_id)
		throws NoSuchinformacija_o_razmeweniiException {
		return findByPrimaryKey((Serializable)informacija_o_razmewenii_id);
	}

	/**
	 * Returns the informacija_o_razmewenii with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the informacija_o_razmewenii
	 * @return the informacija_o_razmewenii, or <code>null</code> if a informacija_o_razmewenii with the primary key could not be found
	 */
	@Override
	public informacija_o_razmewenii fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(informacija_o_razmeweniiModelImpl.ENTITY_CACHE_ENABLED,
				informacija_o_razmeweniiImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		informacija_o_razmewenii informacija_o_razmewenii = (informacija_o_razmewenii)serializable;

		if (informacija_o_razmewenii == null) {
			Session session = null;

			try {
				session = openSession();

				informacija_o_razmewenii = (informacija_o_razmewenii)session.get(informacija_o_razmeweniiImpl.class,
						primaryKey);

				if (informacija_o_razmewenii != null) {
					cacheResult(informacija_o_razmewenii);
				}
				else {
					entityCache.putResult(informacija_o_razmeweniiModelImpl.ENTITY_CACHE_ENABLED,
						informacija_o_razmeweniiImpl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(informacija_o_razmeweniiModelImpl.ENTITY_CACHE_ENABLED,
					informacija_o_razmeweniiImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return informacija_o_razmewenii;
	}

	/**
	 * Returns the informacija_o_razmewenii with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param informacija_o_razmewenii_id the primary key of the informacija_o_razmewenii
	 * @return the informacija_o_razmewenii, or <code>null</code> if a informacija_o_razmewenii with the primary key could not be found
	 */
	@Override
	public informacija_o_razmewenii fetchByPrimaryKey(
		long informacija_o_razmewenii_id) {
		return fetchByPrimaryKey((Serializable)informacija_o_razmewenii_id);
	}

	@Override
	public Map<Serializable, informacija_o_razmewenii> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, informacija_o_razmewenii> map = new HashMap<Serializable, informacija_o_razmewenii>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			informacija_o_razmewenii informacija_o_razmewenii = fetchByPrimaryKey(primaryKey);

			if (informacija_o_razmewenii != null) {
				map.put(primaryKey, informacija_o_razmewenii);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(informacija_o_razmeweniiModelImpl.ENTITY_CACHE_ENABLED,
					informacija_o_razmeweniiImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (informacija_o_razmewenii)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_INFORMACIJA_O_RAZMEWENII_WHERE_PKS_IN);

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

			for (informacija_o_razmewenii informacija_o_razmewenii : (List<informacija_o_razmewenii>)q.list()) {
				map.put(informacija_o_razmewenii.getPrimaryKeyObj(),
					informacija_o_razmewenii);

				cacheResult(informacija_o_razmewenii);

				uncachedPrimaryKeys.remove(informacija_o_razmewenii.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(informacija_o_razmeweniiModelImpl.ENTITY_CACHE_ENABLED,
					informacija_o_razmeweniiImpl.class, primaryKey, nullModel);
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
	 * Returns all the informacija_o_razmeweniis.
	 *
	 * @return the informacija_o_razmeweniis
	 */
	@Override
	public List<informacija_o_razmewenii> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the informacija_o_razmeweniis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link informacija_o_razmeweniiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of informacija_o_razmeweniis
	 * @param end the upper bound of the range of informacija_o_razmeweniis (not inclusive)
	 * @return the range of informacija_o_razmeweniis
	 */
	@Override
	public List<informacija_o_razmewenii> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the informacija_o_razmeweniis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link informacija_o_razmeweniiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of informacija_o_razmeweniis
	 * @param end the upper bound of the range of informacija_o_razmeweniis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of informacija_o_razmeweniis
	 */
	@Override
	public List<informacija_o_razmewenii> findAll(int start, int end,
		OrderByComparator<informacija_o_razmewenii> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the informacija_o_razmeweniis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link informacija_o_razmeweniiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of informacija_o_razmeweniis
	 * @param end the upper bound of the range of informacija_o_razmeweniis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of informacija_o_razmeweniis
	 */
	@Override
	public List<informacija_o_razmewenii> findAll(int start, int end,
		OrderByComparator<informacija_o_razmewenii> orderByComparator,
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

		List<informacija_o_razmewenii> list = null;

		if (retrieveFromCache) {
			list = (List<informacija_o_razmewenii>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_INFORMACIJA_O_RAZMEWENII);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_INFORMACIJA_O_RAZMEWENII;

				if (pagination) {
					sql = sql.concat(informacija_o_razmeweniiModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<informacija_o_razmewenii>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<informacija_o_razmewenii>)QueryUtil.list(q,
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
	 * Removes all the informacija_o_razmeweniis from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (informacija_o_razmewenii informacija_o_razmewenii : findAll()) {
			remove(informacija_o_razmewenii);
		}
	}

	/**
	 * Returns the number of informacija_o_razmeweniis.
	 *
	 * @return the number of informacija_o_razmeweniis
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_INFORMACIJA_O_RAZMEWENII);

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
		return informacija_o_razmeweniiModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the informacija_o_razmewenii persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(informacija_o_razmeweniiImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_INFORMACIJA_O_RAZMEWENII = "SELECT informacija_o_razmewenii FROM informacija_o_razmewenii informacija_o_razmewenii";
	private static final String _SQL_SELECT_INFORMACIJA_O_RAZMEWENII_WHERE_PKS_IN =
		"SELECT informacija_o_razmewenii FROM informacija_o_razmewenii informacija_o_razmewenii WHERE informacija_o_razmewenii_id IN (";
	private static final String _SQL_COUNT_INFORMACIJA_O_RAZMEWENII = "SELECT COUNT(informacija_o_razmewenii) FROM informacija_o_razmewenii informacija_o_razmewenii";
	private static final String _ORDER_BY_ENTITY_ALIAS = "informacija_o_razmewenii.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No informacija_o_razmewenii exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(informacija_o_razmeweniiPersistenceImpl.class);
}
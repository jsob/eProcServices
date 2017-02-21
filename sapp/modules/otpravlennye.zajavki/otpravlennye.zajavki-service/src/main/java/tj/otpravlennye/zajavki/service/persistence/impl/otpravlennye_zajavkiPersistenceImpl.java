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

package tj.otpravlennye.zajavki.service.persistence.impl;

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

import tj.otpravlennye.zajavki.exception.NoSuchotpravlennye_zajavkiException;
import tj.otpravlennye.zajavki.model.impl.otpravlennye_zajavkiImpl;
import tj.otpravlennye.zajavki.model.impl.otpravlennye_zajavkiModelImpl;
import tj.otpravlennye.zajavki.model.otpravlennye_zajavki;
import tj.otpravlennye.zajavki.service.persistence.otpravlennye_zajavkiPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the otpravlennye_zajavki service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see otpravlennye_zajavkiPersistence
 * @see tj.otpravlennye.zajavki.service.persistence.otpravlennye_zajavkiUtil
 * @generated
 */
@ProviderType
public class otpravlennye_zajavkiPersistenceImpl extends BasePersistenceImpl<otpravlennye_zajavki>
	implements otpravlennye_zajavkiPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link otpravlennye_zajavkiUtil} to access the otpravlennye_zajavki persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = otpravlennye_zajavkiImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(otpravlennye_zajavkiModelImpl.ENTITY_CACHE_ENABLED,
			otpravlennye_zajavkiModelImpl.FINDER_CACHE_ENABLED,
			otpravlennye_zajavkiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(otpravlennye_zajavkiModelImpl.ENTITY_CACHE_ENABLED,
			otpravlennye_zajavkiModelImpl.FINDER_CACHE_ENABLED,
			otpravlennye_zajavkiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(otpravlennye_zajavkiModelImpl.ENTITY_CACHE_ENABLED,
			otpravlennye_zajavkiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public otpravlennye_zajavkiPersistenceImpl() {
		setModelClass(otpravlennye_zajavki.class);
	}

	/**
	 * Caches the otpravlennye_zajavki in the entity cache if it is enabled.
	 *
	 * @param otpravlennye_zajavki the otpravlennye_zajavki
	 */
	@Override
	public void cacheResult(otpravlennye_zajavki otpravlennye_zajavki) {
		entityCache.putResult(otpravlennye_zajavkiModelImpl.ENTITY_CACHE_ENABLED,
			otpravlennye_zajavkiImpl.class,
			otpravlennye_zajavki.getPrimaryKey(), otpravlennye_zajavki);

		otpravlennye_zajavki.resetOriginalValues();
	}

	/**
	 * Caches the otpravlennye_zajavkis in the entity cache if it is enabled.
	 *
	 * @param otpravlennye_zajavkis the otpravlennye_zajavkis
	 */
	@Override
	public void cacheResult(List<otpravlennye_zajavki> otpravlennye_zajavkis) {
		for (otpravlennye_zajavki otpravlennye_zajavki : otpravlennye_zajavkis) {
			if (entityCache.getResult(
						otpravlennye_zajavkiModelImpl.ENTITY_CACHE_ENABLED,
						otpravlennye_zajavkiImpl.class,
						otpravlennye_zajavki.getPrimaryKey()) == null) {
				cacheResult(otpravlennye_zajavki);
			}
			else {
				otpravlennye_zajavki.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all otpravlennye_zajavkis.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(otpravlennye_zajavkiImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the otpravlennye_zajavki.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(otpravlennye_zajavki otpravlennye_zajavki) {
		entityCache.removeResult(otpravlennye_zajavkiModelImpl.ENTITY_CACHE_ENABLED,
			otpravlennye_zajavkiImpl.class, otpravlennye_zajavki.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<otpravlennye_zajavki> otpravlennye_zajavkis) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (otpravlennye_zajavki otpravlennye_zajavki : otpravlennye_zajavkis) {
			entityCache.removeResult(otpravlennye_zajavkiModelImpl.ENTITY_CACHE_ENABLED,
				otpravlennye_zajavkiImpl.class,
				otpravlennye_zajavki.getPrimaryKey());
		}
	}

	/**
	 * Creates a new otpravlennye_zajavki with the primary key. Does not add the otpravlennye_zajavki to the database.
	 *
	 * @param otpravlennye_zajavki_id the primary key for the new otpravlennye_zajavki
	 * @return the new otpravlennye_zajavki
	 */
	@Override
	public otpravlennye_zajavki create(long otpravlennye_zajavki_id) {
		otpravlennye_zajavki otpravlennye_zajavki = new otpravlennye_zajavkiImpl();

		otpravlennye_zajavki.setNew(true);
		otpravlennye_zajavki.setPrimaryKey(otpravlennye_zajavki_id);

		return otpravlennye_zajavki;
	}

	/**
	 * Removes the otpravlennye_zajavki with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param otpravlennye_zajavki_id the primary key of the otpravlennye_zajavki
	 * @return the otpravlennye_zajavki that was removed
	 * @throws NoSuchotpravlennye_zajavkiException if a otpravlennye_zajavki with the primary key could not be found
	 */
	@Override
	public otpravlennye_zajavki remove(long otpravlennye_zajavki_id)
		throws NoSuchotpravlennye_zajavkiException {
		return remove((Serializable)otpravlennye_zajavki_id);
	}

	/**
	 * Removes the otpravlennye_zajavki with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the otpravlennye_zajavki
	 * @return the otpravlennye_zajavki that was removed
	 * @throws NoSuchotpravlennye_zajavkiException if a otpravlennye_zajavki with the primary key could not be found
	 */
	@Override
	public otpravlennye_zajavki remove(Serializable primaryKey)
		throws NoSuchotpravlennye_zajavkiException {
		Session session = null;

		try {
			session = openSession();

			otpravlennye_zajavki otpravlennye_zajavki = (otpravlennye_zajavki)session.get(otpravlennye_zajavkiImpl.class,
					primaryKey);

			if (otpravlennye_zajavki == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchotpravlennye_zajavkiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(otpravlennye_zajavki);
		}
		catch (NoSuchotpravlennye_zajavkiException nsee) {
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
	protected otpravlennye_zajavki removeImpl(
		otpravlennye_zajavki otpravlennye_zajavki) {
		otpravlennye_zajavki = toUnwrappedModel(otpravlennye_zajavki);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(otpravlennye_zajavki)) {
				otpravlennye_zajavki = (otpravlennye_zajavki)session.get(otpravlennye_zajavkiImpl.class,
						otpravlennye_zajavki.getPrimaryKeyObj());
			}

			if (otpravlennye_zajavki != null) {
				session.delete(otpravlennye_zajavki);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (otpravlennye_zajavki != null) {
			clearCache(otpravlennye_zajavki);
		}

		return otpravlennye_zajavki;
	}

	@Override
	public otpravlennye_zajavki updateImpl(
		otpravlennye_zajavki otpravlennye_zajavki) {
		otpravlennye_zajavki = toUnwrappedModel(otpravlennye_zajavki);

		boolean isNew = otpravlennye_zajavki.isNew();

		Session session = null;

		try {
			session = openSession();

			if (otpravlennye_zajavki.isNew()) {
				session.save(otpravlennye_zajavki);

				otpravlennye_zajavki.setNew(false);
			}
			else {
				otpravlennye_zajavki = (otpravlennye_zajavki)session.merge(otpravlennye_zajavki);
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

		entityCache.putResult(otpravlennye_zajavkiModelImpl.ENTITY_CACHE_ENABLED,
			otpravlennye_zajavkiImpl.class,
			otpravlennye_zajavki.getPrimaryKey(), otpravlennye_zajavki, false);

		otpravlennye_zajavki.resetOriginalValues();

		return otpravlennye_zajavki;
	}

	protected otpravlennye_zajavki toUnwrappedModel(
		otpravlennye_zajavki otpravlennye_zajavki) {
		if (otpravlennye_zajavki instanceof otpravlennye_zajavkiImpl) {
			return otpravlennye_zajavki;
		}

		otpravlennye_zajavkiImpl otpravlennye_zajavkiImpl = new otpravlennye_zajavkiImpl();

		otpravlennye_zajavkiImpl.setNew(otpravlennye_zajavki.isNew());
		otpravlennye_zajavkiImpl.setPrimaryKey(otpravlennye_zajavki.getPrimaryKey());

		otpravlennye_zajavkiImpl.setData_izmenenija(otpravlennye_zajavki.getData_izmenenija());
		otpravlennye_zajavkiImpl.setData_otpravki(otpravlennye_zajavki.getData_otpravki());
		otpravlennye_zajavkiImpl.setIzmenil(otpravlennye_zajavki.getIzmenil());
		otpravlennye_zajavkiImpl.setIzvewenie_id(otpravlennye_zajavki.getIzvewenie_id());
		otpravlennye_zajavkiImpl.setKolichestvo_otpravok(otpravlennye_zajavki.getKolichestvo_otpravok());
		otpravlennye_zajavkiImpl.setLot_id(otpravlennye_zajavki.getLot_id());
		otpravlennye_zajavkiImpl.setOtpravil(otpravlennye_zajavki.getOtpravil());
		otpravlennye_zajavkiImpl.setOtpravlennye_zajavki_id(otpravlennye_zajavki.getOtpravlennye_zajavki_id());
		otpravlennye_zajavkiImpl.setPostavwik_id(otpravlennye_zajavki.getPostavwik_id());
		otpravlennye_zajavkiImpl.setStatus(otpravlennye_zajavki.getStatus());

		return otpravlennye_zajavkiImpl;
	}

	/**
	 * Returns the otpravlennye_zajavki with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the otpravlennye_zajavki
	 * @return the otpravlennye_zajavki
	 * @throws NoSuchotpravlennye_zajavkiException if a otpravlennye_zajavki with the primary key could not be found
	 */
	@Override
	public otpravlennye_zajavki findByPrimaryKey(Serializable primaryKey)
		throws NoSuchotpravlennye_zajavkiException {
		otpravlennye_zajavki otpravlennye_zajavki = fetchByPrimaryKey(primaryKey);

		if (otpravlennye_zajavki == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchotpravlennye_zajavkiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return otpravlennye_zajavki;
	}

	/**
	 * Returns the otpravlennye_zajavki with the primary key or throws a {@link NoSuchotpravlennye_zajavkiException} if it could not be found.
	 *
	 * @param otpravlennye_zajavki_id the primary key of the otpravlennye_zajavki
	 * @return the otpravlennye_zajavki
	 * @throws NoSuchotpravlennye_zajavkiException if a otpravlennye_zajavki with the primary key could not be found
	 */
	@Override
	public otpravlennye_zajavki findByPrimaryKey(long otpravlennye_zajavki_id)
		throws NoSuchotpravlennye_zajavkiException {
		return findByPrimaryKey((Serializable)otpravlennye_zajavki_id);
	}

	/**
	 * Returns the otpravlennye_zajavki with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the otpravlennye_zajavki
	 * @return the otpravlennye_zajavki, or <code>null</code> if a otpravlennye_zajavki with the primary key could not be found
	 */
	@Override
	public otpravlennye_zajavki fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(otpravlennye_zajavkiModelImpl.ENTITY_CACHE_ENABLED,
				otpravlennye_zajavkiImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		otpravlennye_zajavki otpravlennye_zajavki = (otpravlennye_zajavki)serializable;

		if (otpravlennye_zajavki == null) {
			Session session = null;

			try {
				session = openSession();

				otpravlennye_zajavki = (otpravlennye_zajavki)session.get(otpravlennye_zajavkiImpl.class,
						primaryKey);

				if (otpravlennye_zajavki != null) {
					cacheResult(otpravlennye_zajavki);
				}
				else {
					entityCache.putResult(otpravlennye_zajavkiModelImpl.ENTITY_CACHE_ENABLED,
						otpravlennye_zajavkiImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(otpravlennye_zajavkiModelImpl.ENTITY_CACHE_ENABLED,
					otpravlennye_zajavkiImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return otpravlennye_zajavki;
	}

	/**
	 * Returns the otpravlennye_zajavki with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param otpravlennye_zajavki_id the primary key of the otpravlennye_zajavki
	 * @return the otpravlennye_zajavki, or <code>null</code> if a otpravlennye_zajavki with the primary key could not be found
	 */
	@Override
	public otpravlennye_zajavki fetchByPrimaryKey(long otpravlennye_zajavki_id) {
		return fetchByPrimaryKey((Serializable)otpravlennye_zajavki_id);
	}

	@Override
	public Map<Serializable, otpravlennye_zajavki> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, otpravlennye_zajavki> map = new HashMap<Serializable, otpravlennye_zajavki>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			otpravlennye_zajavki otpravlennye_zajavki = fetchByPrimaryKey(primaryKey);

			if (otpravlennye_zajavki != null) {
				map.put(primaryKey, otpravlennye_zajavki);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(otpravlennye_zajavkiModelImpl.ENTITY_CACHE_ENABLED,
					otpravlennye_zajavkiImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (otpravlennye_zajavki)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_OTPRAVLENNYE_ZAJAVKI_WHERE_PKS_IN);

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

			for (otpravlennye_zajavki otpravlennye_zajavki : (List<otpravlennye_zajavki>)q.list()) {
				map.put(otpravlennye_zajavki.getPrimaryKeyObj(),
					otpravlennye_zajavki);

				cacheResult(otpravlennye_zajavki);

				uncachedPrimaryKeys.remove(otpravlennye_zajavki.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(otpravlennye_zajavkiModelImpl.ENTITY_CACHE_ENABLED,
					otpravlennye_zajavkiImpl.class, primaryKey, nullModel);
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
	 * Returns all the otpravlennye_zajavkis.
	 *
	 * @return the otpravlennye_zajavkis
	 */
	@Override
	public List<otpravlennye_zajavki> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the otpravlennye_zajavkis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link otpravlennye_zajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of otpravlennye_zajavkis
	 * @param end the upper bound of the range of otpravlennye_zajavkis (not inclusive)
	 * @return the range of otpravlennye_zajavkis
	 */
	@Override
	public List<otpravlennye_zajavki> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the otpravlennye_zajavkis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link otpravlennye_zajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of otpravlennye_zajavkis
	 * @param end the upper bound of the range of otpravlennye_zajavkis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of otpravlennye_zajavkis
	 */
	@Override
	public List<otpravlennye_zajavki> findAll(int start, int end,
		OrderByComparator<otpravlennye_zajavki> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the otpravlennye_zajavkis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link otpravlennye_zajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of otpravlennye_zajavkis
	 * @param end the upper bound of the range of otpravlennye_zajavkis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of otpravlennye_zajavkis
	 */
	@Override
	public List<otpravlennye_zajavki> findAll(int start, int end,
		OrderByComparator<otpravlennye_zajavki> orderByComparator,
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

		List<otpravlennye_zajavki> list = null;

		if (retrieveFromCache) {
			list = (List<otpravlennye_zajavki>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_OTPRAVLENNYE_ZAJAVKI);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_OTPRAVLENNYE_ZAJAVKI;

				if (pagination) {
					sql = sql.concat(otpravlennye_zajavkiModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<otpravlennye_zajavki>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<otpravlennye_zajavki>)QueryUtil.list(q,
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
	 * Removes all the otpravlennye_zajavkis from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (otpravlennye_zajavki otpravlennye_zajavki : findAll()) {
			remove(otpravlennye_zajavki);
		}
	}

	/**
	 * Returns the number of otpravlennye_zajavkis.
	 *
	 * @return the number of otpravlennye_zajavkis
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_OTPRAVLENNYE_ZAJAVKI);

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
		return otpravlennye_zajavkiModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the otpravlennye_zajavki persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(otpravlennye_zajavkiImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_OTPRAVLENNYE_ZAJAVKI = "SELECT otpravlennye_zajavki FROM otpravlennye_zajavki otpravlennye_zajavki";
	private static final String _SQL_SELECT_OTPRAVLENNYE_ZAJAVKI_WHERE_PKS_IN = "SELECT otpravlennye_zajavki FROM otpravlennye_zajavki otpravlennye_zajavki WHERE otpravlennye_zajavki_id IN (";
	private static final String _SQL_COUNT_OTPRAVLENNYE_ZAJAVKI = "SELECT COUNT(otpravlennye_zajavki) FROM otpravlennye_zajavki otpravlennye_zajavki";
	private static final String _ORDER_BY_ENTITY_ALIAS = "otpravlennye_zajavki.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No otpravlennye_zajavki exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(otpravlennye_zajavkiPersistenceImpl.class);
}
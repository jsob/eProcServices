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

package tj.dokumenty.na.zajavku.service.persistence.impl;

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

import tj.dokumenty.na.zajavku.exception.NoSuchdokumenty_na_zajavkuException;
import tj.dokumenty.na.zajavku.model.dokumenty_na_zajavku;
import tj.dokumenty.na.zajavku.model.impl.dokumenty_na_zajavkuImpl;
import tj.dokumenty.na.zajavku.model.impl.dokumenty_na_zajavkuModelImpl;
import tj.dokumenty.na.zajavku.service.persistence.dokumenty_na_zajavkuPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the dokumenty_na_zajavku service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see dokumenty_na_zajavkuPersistence
 * @see tj.dokumenty.na.zajavku.service.persistence.dokumenty_na_zajavkuUtil
 * @generated
 */
@ProviderType
public class dokumenty_na_zajavkuPersistenceImpl extends BasePersistenceImpl<dokumenty_na_zajavku>
	implements dokumenty_na_zajavkuPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link dokumenty_na_zajavkuUtil} to access the dokumenty_na_zajavku persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = dokumenty_na_zajavkuImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(dokumenty_na_zajavkuModelImpl.ENTITY_CACHE_ENABLED,
			dokumenty_na_zajavkuModelImpl.FINDER_CACHE_ENABLED,
			dokumenty_na_zajavkuImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(dokumenty_na_zajavkuModelImpl.ENTITY_CACHE_ENABLED,
			dokumenty_na_zajavkuModelImpl.FINDER_CACHE_ENABLED,
			dokumenty_na_zajavkuImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(dokumenty_na_zajavkuModelImpl.ENTITY_CACHE_ENABLED,
			dokumenty_na_zajavkuModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public dokumenty_na_zajavkuPersistenceImpl() {
		setModelClass(dokumenty_na_zajavku.class);
	}

	/**
	 * Caches the dokumenty_na_zajavku in the entity cache if it is enabled.
	 *
	 * @param dokumenty_na_zajavku the dokumenty_na_zajavku
	 */
	@Override
	public void cacheResult(dokumenty_na_zajavku dokumenty_na_zajavku) {
		entityCache.putResult(dokumenty_na_zajavkuModelImpl.ENTITY_CACHE_ENABLED,
			dokumenty_na_zajavkuImpl.class,
			dokumenty_na_zajavku.getPrimaryKey(), dokumenty_na_zajavku);

		dokumenty_na_zajavku.resetOriginalValues();
	}

	/**
	 * Caches the dokumenty_na_zajavkus in the entity cache if it is enabled.
	 *
	 * @param dokumenty_na_zajavkus the dokumenty_na_zajavkus
	 */
	@Override
	public void cacheResult(List<dokumenty_na_zajavku> dokumenty_na_zajavkus) {
		for (dokumenty_na_zajavku dokumenty_na_zajavku : dokumenty_na_zajavkus) {
			if (entityCache.getResult(
						dokumenty_na_zajavkuModelImpl.ENTITY_CACHE_ENABLED,
						dokumenty_na_zajavkuImpl.class,
						dokumenty_na_zajavku.getPrimaryKey()) == null) {
				cacheResult(dokumenty_na_zajavku);
			}
			else {
				dokumenty_na_zajavku.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dokumenty_na_zajavkus.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(dokumenty_na_zajavkuImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dokumenty_na_zajavku.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(dokumenty_na_zajavku dokumenty_na_zajavku) {
		entityCache.removeResult(dokumenty_na_zajavkuModelImpl.ENTITY_CACHE_ENABLED,
			dokumenty_na_zajavkuImpl.class, dokumenty_na_zajavku.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<dokumenty_na_zajavku> dokumenty_na_zajavkus) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (dokumenty_na_zajavku dokumenty_na_zajavku : dokumenty_na_zajavkus) {
			entityCache.removeResult(dokumenty_na_zajavkuModelImpl.ENTITY_CACHE_ENABLED,
				dokumenty_na_zajavkuImpl.class,
				dokumenty_na_zajavku.getPrimaryKey());
		}
	}

	/**
	 * Creates a new dokumenty_na_zajavku with the primary key. Does not add the dokumenty_na_zajavku to the database.
	 *
	 * @param dokumenty_na_zajavku_id the primary key for the new dokumenty_na_zajavku
	 * @return the new dokumenty_na_zajavku
	 */
	@Override
	public dokumenty_na_zajavku create(long dokumenty_na_zajavku_id) {
		dokumenty_na_zajavku dokumenty_na_zajavku = new dokumenty_na_zajavkuImpl();

		dokumenty_na_zajavku.setNew(true);
		dokumenty_na_zajavku.setPrimaryKey(dokumenty_na_zajavku_id);

		return dokumenty_na_zajavku;
	}

	/**
	 * Removes the dokumenty_na_zajavku with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dokumenty_na_zajavku_id the primary key of the dokumenty_na_zajavku
	 * @return the dokumenty_na_zajavku that was removed
	 * @throws NoSuchdokumenty_na_zajavkuException if a dokumenty_na_zajavku with the primary key could not be found
	 */
	@Override
	public dokumenty_na_zajavku remove(long dokumenty_na_zajavku_id)
		throws NoSuchdokumenty_na_zajavkuException {
		return remove((Serializable)dokumenty_na_zajavku_id);
	}

	/**
	 * Removes the dokumenty_na_zajavku with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dokumenty_na_zajavku
	 * @return the dokumenty_na_zajavku that was removed
	 * @throws NoSuchdokumenty_na_zajavkuException if a dokumenty_na_zajavku with the primary key could not be found
	 */
	@Override
	public dokumenty_na_zajavku remove(Serializable primaryKey)
		throws NoSuchdokumenty_na_zajavkuException {
		Session session = null;

		try {
			session = openSession();

			dokumenty_na_zajavku dokumenty_na_zajavku = (dokumenty_na_zajavku)session.get(dokumenty_na_zajavkuImpl.class,
					primaryKey);

			if (dokumenty_na_zajavku == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchdokumenty_na_zajavkuException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dokumenty_na_zajavku);
		}
		catch (NoSuchdokumenty_na_zajavkuException nsee) {
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
	protected dokumenty_na_zajavku removeImpl(
		dokumenty_na_zajavku dokumenty_na_zajavku) {
		dokumenty_na_zajavku = toUnwrappedModel(dokumenty_na_zajavku);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dokumenty_na_zajavku)) {
				dokumenty_na_zajavku = (dokumenty_na_zajavku)session.get(dokumenty_na_zajavkuImpl.class,
						dokumenty_na_zajavku.getPrimaryKeyObj());
			}

			if (dokumenty_na_zajavku != null) {
				session.delete(dokumenty_na_zajavku);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dokumenty_na_zajavku != null) {
			clearCache(dokumenty_na_zajavku);
		}

		return dokumenty_na_zajavku;
	}

	@Override
	public dokumenty_na_zajavku updateImpl(
		dokumenty_na_zajavku dokumenty_na_zajavku) {
		dokumenty_na_zajavku = toUnwrappedModel(dokumenty_na_zajavku);

		boolean isNew = dokumenty_na_zajavku.isNew();

		Session session = null;

		try {
			session = openSession();

			if (dokumenty_na_zajavku.isNew()) {
				session.save(dokumenty_na_zajavku);

				dokumenty_na_zajavku.setNew(false);
			}
			else {
				dokumenty_na_zajavku = (dokumenty_na_zajavku)session.merge(dokumenty_na_zajavku);
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

		entityCache.putResult(dokumenty_na_zajavkuModelImpl.ENTITY_CACHE_ENABLED,
			dokumenty_na_zajavkuImpl.class,
			dokumenty_na_zajavku.getPrimaryKey(), dokumenty_na_zajavku, false);

		dokumenty_na_zajavku.resetOriginalValues();

		return dokumenty_na_zajavku;
	}

	protected dokumenty_na_zajavku toUnwrappedModel(
		dokumenty_na_zajavku dokumenty_na_zajavku) {
		if (dokumenty_na_zajavku instanceof dokumenty_na_zajavkuImpl) {
			return dokumenty_na_zajavku;
		}

		dokumenty_na_zajavkuImpl dokumenty_na_zajavkuImpl = new dokumenty_na_zajavkuImpl();

		dokumenty_na_zajavkuImpl.setNew(dokumenty_na_zajavku.isNew());
		dokumenty_na_zajavkuImpl.setPrimaryKey(dokumenty_na_zajavku.getPrimaryKey());

		dokumenty_na_zajavkuImpl.setDokumenty_na_zajavku_id(dokumenty_na_zajavku.getDokumenty_na_zajavku_id());
		dokumenty_na_zajavkuImpl.setData_zagruzki(dokumenty_na_zajavku.getData_zagruzki());
		dokumenty_na_zajavkuImpl.setImja_fajla(dokumenty_na_zajavku.getImja_fajla());
		dokumenty_na_zajavkuImpl.setIzvewenie_id(dokumenty_na_zajavku.getIzvewenie_id());
		dokumenty_na_zajavkuImpl.setLot_id(dokumenty_na_zajavku.getLot_id());
		dokumenty_na_zajavkuImpl.setNazvanie_dokumenta(dokumenty_na_zajavku.getNazvanie_dokumenta());
		dokumenty_na_zajavkuImpl.setPostavwik_id(dokumenty_na_zajavku.getPostavwik_id());
		dokumenty_na_zajavkuImpl.setZagruzil(dokumenty_na_zajavku.getZagruzil());

		return dokumenty_na_zajavkuImpl;
	}

	/**
	 * Returns the dokumenty_na_zajavku with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dokumenty_na_zajavku
	 * @return the dokumenty_na_zajavku
	 * @throws NoSuchdokumenty_na_zajavkuException if a dokumenty_na_zajavku with the primary key could not be found
	 */
	@Override
	public dokumenty_na_zajavku findByPrimaryKey(Serializable primaryKey)
		throws NoSuchdokumenty_na_zajavkuException {
		dokumenty_na_zajavku dokumenty_na_zajavku = fetchByPrimaryKey(primaryKey);

		if (dokumenty_na_zajavku == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchdokumenty_na_zajavkuException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dokumenty_na_zajavku;
	}

	/**
	 * Returns the dokumenty_na_zajavku with the primary key or throws a {@link NoSuchdokumenty_na_zajavkuException} if it could not be found.
	 *
	 * @param dokumenty_na_zajavku_id the primary key of the dokumenty_na_zajavku
	 * @return the dokumenty_na_zajavku
	 * @throws NoSuchdokumenty_na_zajavkuException if a dokumenty_na_zajavku with the primary key could not be found
	 */
	@Override
	public dokumenty_na_zajavku findByPrimaryKey(long dokumenty_na_zajavku_id)
		throws NoSuchdokumenty_na_zajavkuException {
		return findByPrimaryKey((Serializable)dokumenty_na_zajavku_id);
	}

	/**
	 * Returns the dokumenty_na_zajavku with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dokumenty_na_zajavku
	 * @return the dokumenty_na_zajavku, or <code>null</code> if a dokumenty_na_zajavku with the primary key could not be found
	 */
	@Override
	public dokumenty_na_zajavku fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(dokumenty_na_zajavkuModelImpl.ENTITY_CACHE_ENABLED,
				dokumenty_na_zajavkuImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		dokumenty_na_zajavku dokumenty_na_zajavku = (dokumenty_na_zajavku)serializable;

		if (dokumenty_na_zajavku == null) {
			Session session = null;

			try {
				session = openSession();

				dokumenty_na_zajavku = (dokumenty_na_zajavku)session.get(dokumenty_na_zajavkuImpl.class,
						primaryKey);

				if (dokumenty_na_zajavku != null) {
					cacheResult(dokumenty_na_zajavku);
				}
				else {
					entityCache.putResult(dokumenty_na_zajavkuModelImpl.ENTITY_CACHE_ENABLED,
						dokumenty_na_zajavkuImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(dokumenty_na_zajavkuModelImpl.ENTITY_CACHE_ENABLED,
					dokumenty_na_zajavkuImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dokumenty_na_zajavku;
	}

	/**
	 * Returns the dokumenty_na_zajavku with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param dokumenty_na_zajavku_id the primary key of the dokumenty_na_zajavku
	 * @return the dokumenty_na_zajavku, or <code>null</code> if a dokumenty_na_zajavku with the primary key could not be found
	 */
	@Override
	public dokumenty_na_zajavku fetchByPrimaryKey(long dokumenty_na_zajavku_id) {
		return fetchByPrimaryKey((Serializable)dokumenty_na_zajavku_id);
	}

	@Override
	public Map<Serializable, dokumenty_na_zajavku> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, dokumenty_na_zajavku> map = new HashMap<Serializable, dokumenty_na_zajavku>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			dokumenty_na_zajavku dokumenty_na_zajavku = fetchByPrimaryKey(primaryKey);

			if (dokumenty_na_zajavku != null) {
				map.put(primaryKey, dokumenty_na_zajavku);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(dokumenty_na_zajavkuModelImpl.ENTITY_CACHE_ENABLED,
					dokumenty_na_zajavkuImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (dokumenty_na_zajavku)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_DOKUMENTY_NA_ZAJAVKU_WHERE_PKS_IN);

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

			for (dokumenty_na_zajavku dokumenty_na_zajavku : (List<dokumenty_na_zajavku>)q.list()) {
				map.put(dokumenty_na_zajavku.getPrimaryKeyObj(),
					dokumenty_na_zajavku);

				cacheResult(dokumenty_na_zajavku);

				uncachedPrimaryKeys.remove(dokumenty_na_zajavku.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(dokumenty_na_zajavkuModelImpl.ENTITY_CACHE_ENABLED,
					dokumenty_na_zajavkuImpl.class, primaryKey, nullModel);
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
	 * Returns all the dokumenty_na_zajavkus.
	 *
	 * @return the dokumenty_na_zajavkus
	 */
	@Override
	public List<dokumenty_na_zajavku> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dokumenty_na_zajavkus.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link dokumenty_na_zajavkuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dokumenty_na_zajavkus
	 * @param end the upper bound of the range of dokumenty_na_zajavkus (not inclusive)
	 * @return the range of dokumenty_na_zajavkus
	 */
	@Override
	public List<dokumenty_na_zajavku> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dokumenty_na_zajavkus.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link dokumenty_na_zajavkuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dokumenty_na_zajavkus
	 * @param end the upper bound of the range of dokumenty_na_zajavkus (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dokumenty_na_zajavkus
	 */
	@Override
	public List<dokumenty_na_zajavku> findAll(int start, int end,
		OrderByComparator<dokumenty_na_zajavku> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the dokumenty_na_zajavkus.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link dokumenty_na_zajavkuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dokumenty_na_zajavkus
	 * @param end the upper bound of the range of dokumenty_na_zajavkus (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of dokumenty_na_zajavkus
	 */
	@Override
	public List<dokumenty_na_zajavku> findAll(int start, int end,
		OrderByComparator<dokumenty_na_zajavku> orderByComparator,
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

		List<dokumenty_na_zajavku> list = null;

		if (retrieveFromCache) {
			list = (List<dokumenty_na_zajavku>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_DOKUMENTY_NA_ZAJAVKU);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DOKUMENTY_NA_ZAJAVKU;

				if (pagination) {
					sql = sql.concat(dokumenty_na_zajavkuModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<dokumenty_na_zajavku>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<dokumenty_na_zajavku>)QueryUtil.list(q,
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
	 * Removes all the dokumenty_na_zajavkus from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (dokumenty_na_zajavku dokumenty_na_zajavku : findAll()) {
			remove(dokumenty_na_zajavku);
		}
	}

	/**
	 * Returns the number of dokumenty_na_zajavkus.
	 *
	 * @return the number of dokumenty_na_zajavkus
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DOKUMENTY_NA_ZAJAVKU);

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
		return dokumenty_na_zajavkuModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the dokumenty_na_zajavku persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(dokumenty_na_zajavkuImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_DOKUMENTY_NA_ZAJAVKU = "SELECT dokumenty_na_zajavku FROM dokumenty_na_zajavku dokumenty_na_zajavku";
	private static final String _SQL_SELECT_DOKUMENTY_NA_ZAJAVKU_WHERE_PKS_IN = "SELECT dokumenty_na_zajavku FROM dokumenty_na_zajavku dokumenty_na_zajavku WHERE dokumenty_na_zajavku_id IN (";
	private static final String _SQL_COUNT_DOKUMENTY_NA_ZAJAVKU = "SELECT COUNT(dokumenty_na_zajavku) FROM dokumenty_na_zajavku dokumenty_na_zajavku";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dokumenty_na_zajavku.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No dokumenty_na_zajavku exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(dokumenty_na_zajavkuPersistenceImpl.class);
}
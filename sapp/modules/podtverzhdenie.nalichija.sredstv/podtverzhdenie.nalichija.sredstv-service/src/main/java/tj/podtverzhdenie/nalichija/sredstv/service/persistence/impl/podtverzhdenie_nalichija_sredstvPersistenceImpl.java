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

package tj.podtverzhdenie.nalichija.sredstv.service.persistence.impl;

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

import tj.podtverzhdenie.nalichija.sredstv.exception.NoSuchpodtverzhdenie_nalichija_sredstvException;
import tj.podtverzhdenie.nalichija.sredstv.model.impl.podtverzhdenie_nalichija_sredstvImpl;
import tj.podtverzhdenie.nalichija.sredstv.model.impl.podtverzhdenie_nalichija_sredstvModelImpl;
import tj.podtverzhdenie.nalichija.sredstv.model.podtverzhdenie_nalichija_sredstv;
import tj.podtverzhdenie.nalichija.sredstv.service.persistence.podtverzhdenie_nalichija_sredstvPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the podtverzhdenie_nalichija_sredstv service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see podtverzhdenie_nalichija_sredstvPersistence
 * @see tj.podtverzhdenie.nalichija.sredstv.service.persistence.podtverzhdenie_nalichija_sredstvUtil
 * @generated
 */
@ProviderType
public class podtverzhdenie_nalichija_sredstvPersistenceImpl
	extends BasePersistenceImpl<podtverzhdenie_nalichija_sredstv>
	implements podtverzhdenie_nalichija_sredstvPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link podtverzhdenie_nalichija_sredstvUtil} to access the podtverzhdenie_nalichija_sredstv persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = podtverzhdenie_nalichija_sredstvImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(podtverzhdenie_nalichija_sredstvModelImpl.ENTITY_CACHE_ENABLED,
			podtverzhdenie_nalichija_sredstvModelImpl.FINDER_CACHE_ENABLED,
			podtverzhdenie_nalichija_sredstvImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(podtverzhdenie_nalichija_sredstvModelImpl.ENTITY_CACHE_ENABLED,
			podtverzhdenie_nalichija_sredstvModelImpl.FINDER_CACHE_ENABLED,
			podtverzhdenie_nalichija_sredstvImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(podtverzhdenie_nalichija_sredstvModelImpl.ENTITY_CACHE_ENABLED,
			podtverzhdenie_nalichija_sredstvModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	public podtverzhdenie_nalichija_sredstvPersistenceImpl() {
		setModelClass(podtverzhdenie_nalichija_sredstv.class);
	}

	/**
	 * Caches the podtverzhdenie_nalichija_sredstv in the entity cache if it is enabled.
	 *
	 * @param podtverzhdenie_nalichija_sredstv the podtverzhdenie_nalichija_sredstv
	 */
	@Override
	public void cacheResult(
		podtverzhdenie_nalichija_sredstv podtverzhdenie_nalichija_sredstv) {
		entityCache.putResult(podtverzhdenie_nalichija_sredstvModelImpl.ENTITY_CACHE_ENABLED,
			podtverzhdenie_nalichija_sredstvImpl.class,
			podtverzhdenie_nalichija_sredstv.getPrimaryKey(),
			podtverzhdenie_nalichija_sredstv);

		podtverzhdenie_nalichija_sredstv.resetOriginalValues();
	}

	/**
	 * Caches the podtverzhdenie_nalichija_sredstvs in the entity cache if it is enabled.
	 *
	 * @param podtverzhdenie_nalichija_sredstvs the podtverzhdenie_nalichija_sredstvs
	 */
	@Override
	public void cacheResult(
		List<podtverzhdenie_nalichija_sredstv> podtverzhdenie_nalichija_sredstvs) {
		for (podtverzhdenie_nalichija_sredstv podtverzhdenie_nalichija_sredstv : podtverzhdenie_nalichija_sredstvs) {
			if (entityCache.getResult(
						podtverzhdenie_nalichija_sredstvModelImpl.ENTITY_CACHE_ENABLED,
						podtverzhdenie_nalichija_sredstvImpl.class,
						podtverzhdenie_nalichija_sredstv.getPrimaryKey()) == null) {
				cacheResult(podtverzhdenie_nalichija_sredstv);
			}
			else {
				podtverzhdenie_nalichija_sredstv.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all podtverzhdenie_nalichija_sredstvs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(podtverzhdenie_nalichija_sredstvImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the podtverzhdenie_nalichija_sredstv.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		podtverzhdenie_nalichija_sredstv podtverzhdenie_nalichija_sredstv) {
		entityCache.removeResult(podtverzhdenie_nalichija_sredstvModelImpl.ENTITY_CACHE_ENABLED,
			podtverzhdenie_nalichija_sredstvImpl.class,
			podtverzhdenie_nalichija_sredstv.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<podtverzhdenie_nalichija_sredstv> podtverzhdenie_nalichija_sredstvs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (podtverzhdenie_nalichija_sredstv podtverzhdenie_nalichija_sredstv : podtverzhdenie_nalichija_sredstvs) {
			entityCache.removeResult(podtverzhdenie_nalichija_sredstvModelImpl.ENTITY_CACHE_ENABLED,
				podtverzhdenie_nalichija_sredstvImpl.class,
				podtverzhdenie_nalichija_sredstv.getPrimaryKey());
		}
	}

	/**
	 * Creates a new podtverzhdenie_nalichija_sredstv with the primary key. Does not add the podtverzhdenie_nalichija_sredstv to the database.
	 *
	 * @param podtverzhdenie_nalichija_sredstv_id the primary key for the new podtverzhdenie_nalichija_sredstv
	 * @return the new podtverzhdenie_nalichija_sredstv
	 */
	@Override
	public podtverzhdenie_nalichija_sredstv create(
		long podtverzhdenie_nalichija_sredstv_id) {
		podtverzhdenie_nalichija_sredstv podtverzhdenie_nalichija_sredstv = new podtverzhdenie_nalichija_sredstvImpl();

		podtverzhdenie_nalichija_sredstv.setNew(true);
		podtverzhdenie_nalichija_sredstv.setPrimaryKey(podtverzhdenie_nalichija_sredstv_id);

		return podtverzhdenie_nalichija_sredstv;
	}

	/**
	 * Removes the podtverzhdenie_nalichija_sredstv with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param podtverzhdenie_nalichija_sredstv_id the primary key of the podtverzhdenie_nalichija_sredstv
	 * @return the podtverzhdenie_nalichija_sredstv that was removed
	 * @throws NoSuchpodtverzhdenie_nalichija_sredstvException if a podtverzhdenie_nalichija_sredstv with the primary key could not be found
	 */
	@Override
	public podtverzhdenie_nalichija_sredstv remove(
		long podtverzhdenie_nalichija_sredstv_id)
		throws NoSuchpodtverzhdenie_nalichija_sredstvException {
		return remove((Serializable)podtverzhdenie_nalichija_sredstv_id);
	}

	/**
	 * Removes the podtverzhdenie_nalichija_sredstv with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the podtverzhdenie_nalichija_sredstv
	 * @return the podtverzhdenie_nalichija_sredstv that was removed
	 * @throws NoSuchpodtverzhdenie_nalichija_sredstvException if a podtverzhdenie_nalichija_sredstv with the primary key could not be found
	 */
	@Override
	public podtverzhdenie_nalichija_sredstv remove(Serializable primaryKey)
		throws NoSuchpodtverzhdenie_nalichija_sredstvException {
		Session session = null;

		try {
			session = openSession();

			podtverzhdenie_nalichija_sredstv podtverzhdenie_nalichija_sredstv = (podtverzhdenie_nalichija_sredstv)session.get(podtverzhdenie_nalichija_sredstvImpl.class,
					primaryKey);

			if (podtverzhdenie_nalichija_sredstv == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchpodtverzhdenie_nalichija_sredstvException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(podtverzhdenie_nalichija_sredstv);
		}
		catch (NoSuchpodtverzhdenie_nalichija_sredstvException nsee) {
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
	protected podtverzhdenie_nalichija_sredstv removeImpl(
		podtverzhdenie_nalichija_sredstv podtverzhdenie_nalichija_sredstv) {
		podtverzhdenie_nalichija_sredstv = toUnwrappedModel(podtverzhdenie_nalichija_sredstv);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(podtverzhdenie_nalichija_sredstv)) {
				podtverzhdenie_nalichija_sredstv = (podtverzhdenie_nalichija_sredstv)session.get(podtverzhdenie_nalichija_sredstvImpl.class,
						podtverzhdenie_nalichija_sredstv.getPrimaryKeyObj());
			}

			if (podtverzhdenie_nalichija_sredstv != null) {
				session.delete(podtverzhdenie_nalichija_sredstv);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (podtverzhdenie_nalichija_sredstv != null) {
			clearCache(podtverzhdenie_nalichija_sredstv);
		}

		return podtverzhdenie_nalichija_sredstv;
	}

	@Override
	public podtverzhdenie_nalichija_sredstv updateImpl(
		podtverzhdenie_nalichija_sredstv podtverzhdenie_nalichija_sredstv) {
		podtverzhdenie_nalichija_sredstv = toUnwrappedModel(podtverzhdenie_nalichija_sredstv);

		boolean isNew = podtverzhdenie_nalichija_sredstv.isNew();

		Session session = null;

		try {
			session = openSession();

			if (podtverzhdenie_nalichija_sredstv.isNew()) {
				session.save(podtverzhdenie_nalichija_sredstv);

				podtverzhdenie_nalichija_sredstv.setNew(false);
			}
			else {
				podtverzhdenie_nalichija_sredstv = (podtverzhdenie_nalichija_sredstv)session.merge(podtverzhdenie_nalichija_sredstv);
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

		entityCache.putResult(podtverzhdenie_nalichija_sredstvModelImpl.ENTITY_CACHE_ENABLED,
			podtverzhdenie_nalichija_sredstvImpl.class,
			podtverzhdenie_nalichija_sredstv.getPrimaryKey(),
			podtverzhdenie_nalichija_sredstv, false);

		podtverzhdenie_nalichija_sredstv.resetOriginalValues();

		return podtverzhdenie_nalichija_sredstv;
	}

	protected podtverzhdenie_nalichija_sredstv toUnwrappedModel(
		podtverzhdenie_nalichija_sredstv podtverzhdenie_nalichija_sredstv) {
		if (podtverzhdenie_nalichija_sredstv instanceof podtverzhdenie_nalichija_sredstvImpl) {
			return podtverzhdenie_nalichija_sredstv;
		}

		podtverzhdenie_nalichija_sredstvImpl podtverzhdenie_nalichija_sredstvImpl =
			new podtverzhdenie_nalichija_sredstvImpl();

		podtverzhdenie_nalichija_sredstvImpl.setNew(podtverzhdenie_nalichija_sredstv.isNew());
		podtverzhdenie_nalichija_sredstvImpl.setPrimaryKey(podtverzhdenie_nalichija_sredstv.getPrimaryKey());

		podtverzhdenie_nalichija_sredstvImpl.setData_zagruzki(podtverzhdenie_nalichija_sredstv.getData_zagruzki());
		podtverzhdenie_nalichija_sredstvImpl.setImja_fajla(podtverzhdenie_nalichija_sredstv.getImja_fajla());
		podtverzhdenie_nalichija_sredstvImpl.setIzvewenie_id(podtverzhdenie_nalichija_sredstv.getIzvewenie_id());
		podtverzhdenie_nalichija_sredstvImpl.setLot_id(podtverzhdenie_nalichija_sredstv.getLot_id());
		podtverzhdenie_nalichija_sredstvImpl.setNazvanie_dokumenta(podtverzhdenie_nalichija_sredstv.getNazvanie_dokumenta());
		podtverzhdenie_nalichija_sredstvImpl.setPodtverzhdenie_nalichija_sredstv_id(podtverzhdenie_nalichija_sredstv.getPodtverzhdenie_nalichija_sredstv_id());
		podtverzhdenie_nalichija_sredstvImpl.setZagruzil(podtverzhdenie_nalichija_sredstv.getZagruzil());

		return podtverzhdenie_nalichija_sredstvImpl;
	}

	/**
	 * Returns the podtverzhdenie_nalichija_sredstv with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the podtverzhdenie_nalichija_sredstv
	 * @return the podtverzhdenie_nalichija_sredstv
	 * @throws NoSuchpodtverzhdenie_nalichija_sredstvException if a podtverzhdenie_nalichija_sredstv with the primary key could not be found
	 */
	@Override
	public podtverzhdenie_nalichija_sredstv findByPrimaryKey(
		Serializable primaryKey)
		throws NoSuchpodtverzhdenie_nalichija_sredstvException {
		podtverzhdenie_nalichija_sredstv podtverzhdenie_nalichija_sredstv = fetchByPrimaryKey(primaryKey);

		if (podtverzhdenie_nalichija_sredstv == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchpodtverzhdenie_nalichija_sredstvException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return podtverzhdenie_nalichija_sredstv;
	}

	/**
	 * Returns the podtverzhdenie_nalichija_sredstv with the primary key or throws a {@link NoSuchpodtverzhdenie_nalichija_sredstvException} if it could not be found.
	 *
	 * @param podtverzhdenie_nalichija_sredstv_id the primary key of the podtverzhdenie_nalichija_sredstv
	 * @return the podtverzhdenie_nalichija_sredstv
	 * @throws NoSuchpodtverzhdenie_nalichija_sredstvException if a podtverzhdenie_nalichija_sredstv with the primary key could not be found
	 */
	@Override
	public podtverzhdenie_nalichija_sredstv findByPrimaryKey(
		long podtverzhdenie_nalichija_sredstv_id)
		throws NoSuchpodtverzhdenie_nalichija_sredstvException {
		return findByPrimaryKey((Serializable)podtverzhdenie_nalichija_sredstv_id);
	}

	/**
	 * Returns the podtverzhdenie_nalichija_sredstv with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the podtverzhdenie_nalichija_sredstv
	 * @return the podtverzhdenie_nalichija_sredstv, or <code>null</code> if a podtverzhdenie_nalichija_sredstv with the primary key could not be found
	 */
	@Override
	public podtverzhdenie_nalichija_sredstv fetchByPrimaryKey(
		Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(podtverzhdenie_nalichija_sredstvModelImpl.ENTITY_CACHE_ENABLED,
				podtverzhdenie_nalichija_sredstvImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		podtverzhdenie_nalichija_sredstv podtverzhdenie_nalichija_sredstv = (podtverzhdenie_nalichija_sredstv)serializable;

		if (podtverzhdenie_nalichija_sredstv == null) {
			Session session = null;

			try {
				session = openSession();

				podtverzhdenie_nalichija_sredstv = (podtverzhdenie_nalichija_sredstv)session.get(podtverzhdenie_nalichija_sredstvImpl.class,
						primaryKey);

				if (podtverzhdenie_nalichija_sredstv != null) {
					cacheResult(podtverzhdenie_nalichija_sredstv);
				}
				else {
					entityCache.putResult(podtverzhdenie_nalichija_sredstvModelImpl.ENTITY_CACHE_ENABLED,
						podtverzhdenie_nalichija_sredstvImpl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(podtverzhdenie_nalichija_sredstvModelImpl.ENTITY_CACHE_ENABLED,
					podtverzhdenie_nalichija_sredstvImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return podtverzhdenie_nalichija_sredstv;
	}

	/**
	 * Returns the podtverzhdenie_nalichija_sredstv with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param podtverzhdenie_nalichija_sredstv_id the primary key of the podtverzhdenie_nalichija_sredstv
	 * @return the podtverzhdenie_nalichija_sredstv, or <code>null</code> if a podtverzhdenie_nalichija_sredstv with the primary key could not be found
	 */
	@Override
	public podtverzhdenie_nalichija_sredstv fetchByPrimaryKey(
		long podtverzhdenie_nalichija_sredstv_id) {
		return fetchByPrimaryKey((Serializable)podtverzhdenie_nalichija_sredstv_id);
	}

	@Override
	public Map<Serializable, podtverzhdenie_nalichija_sredstv> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, podtverzhdenie_nalichija_sredstv> map = new HashMap<Serializable, podtverzhdenie_nalichija_sredstv>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			podtverzhdenie_nalichija_sredstv podtverzhdenie_nalichija_sredstv = fetchByPrimaryKey(primaryKey);

			if (podtverzhdenie_nalichija_sredstv != null) {
				map.put(primaryKey, podtverzhdenie_nalichija_sredstv);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(podtverzhdenie_nalichija_sredstvModelImpl.ENTITY_CACHE_ENABLED,
					podtverzhdenie_nalichija_sredstvImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey,
						(podtverzhdenie_nalichija_sredstv)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_PODTVERZHDENIE_NALICHIJA_SREDSTV_WHERE_PKS_IN);

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

			for (podtverzhdenie_nalichija_sredstv podtverzhdenie_nalichija_sredstv : (List<podtverzhdenie_nalichija_sredstv>)q.list()) {
				map.put(podtverzhdenie_nalichija_sredstv.getPrimaryKeyObj(),
					podtverzhdenie_nalichija_sredstv);

				cacheResult(podtverzhdenie_nalichija_sredstv);

				uncachedPrimaryKeys.remove(podtverzhdenie_nalichija_sredstv.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(podtverzhdenie_nalichija_sredstvModelImpl.ENTITY_CACHE_ENABLED,
					podtverzhdenie_nalichija_sredstvImpl.class, primaryKey,
					nullModel);
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
	 * Returns all the podtverzhdenie_nalichija_sredstvs.
	 *
	 * @return the podtverzhdenie_nalichija_sredstvs
	 */
	@Override
	public List<podtverzhdenie_nalichija_sredstv> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the podtverzhdenie_nalichija_sredstvs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link podtverzhdenie_nalichija_sredstvModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of podtverzhdenie_nalichija_sredstvs
	 * @param end the upper bound of the range of podtverzhdenie_nalichija_sredstvs (not inclusive)
	 * @return the range of podtverzhdenie_nalichija_sredstvs
	 */
	@Override
	public List<podtverzhdenie_nalichija_sredstv> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the podtverzhdenie_nalichija_sredstvs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link podtverzhdenie_nalichija_sredstvModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of podtverzhdenie_nalichija_sredstvs
	 * @param end the upper bound of the range of podtverzhdenie_nalichija_sredstvs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of podtverzhdenie_nalichija_sredstvs
	 */
	@Override
	public List<podtverzhdenie_nalichija_sredstv> findAll(int start, int end,
		OrderByComparator<podtverzhdenie_nalichija_sredstv> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the podtverzhdenie_nalichija_sredstvs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link podtverzhdenie_nalichija_sredstvModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of podtverzhdenie_nalichija_sredstvs
	 * @param end the upper bound of the range of podtverzhdenie_nalichija_sredstvs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of podtverzhdenie_nalichija_sredstvs
	 */
	@Override
	public List<podtverzhdenie_nalichija_sredstv> findAll(int start, int end,
		OrderByComparator<podtverzhdenie_nalichija_sredstv> orderByComparator,
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

		List<podtverzhdenie_nalichija_sredstv> list = null;

		if (retrieveFromCache) {
			list = (List<podtverzhdenie_nalichija_sredstv>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_PODTVERZHDENIE_NALICHIJA_SREDSTV);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PODTVERZHDENIE_NALICHIJA_SREDSTV;

				if (pagination) {
					sql = sql.concat(podtverzhdenie_nalichija_sredstvModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<podtverzhdenie_nalichija_sredstv>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<podtverzhdenie_nalichija_sredstv>)QueryUtil.list(q,
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
	 * Removes all the podtverzhdenie_nalichija_sredstvs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (podtverzhdenie_nalichija_sredstv podtverzhdenie_nalichija_sredstv : findAll()) {
			remove(podtverzhdenie_nalichija_sredstv);
		}
	}

	/**
	 * Returns the number of podtverzhdenie_nalichija_sredstvs.
	 *
	 * @return the number of podtverzhdenie_nalichija_sredstvs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_PODTVERZHDENIE_NALICHIJA_SREDSTV);

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
		return podtverzhdenie_nalichija_sredstvModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the podtverzhdenie_nalichija_sredstv persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(podtverzhdenie_nalichija_sredstvImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_PODTVERZHDENIE_NALICHIJA_SREDSTV = "SELECT podtverzhdenie_nalichija_sredstv FROM podtverzhdenie_nalichija_sredstv podtverzhdenie_nalichija_sredstv";
	private static final String _SQL_SELECT_PODTVERZHDENIE_NALICHIJA_SREDSTV_WHERE_PKS_IN =
		"SELECT podtverzhdenie_nalichija_sredstv FROM podtverzhdenie_nalichija_sredstv podtverzhdenie_nalichija_sredstv WHERE podtverzhdenie_nalichija_sredstv_id IN (";
	private static final String _SQL_COUNT_PODTVERZHDENIE_NALICHIJA_SREDSTV = "SELECT COUNT(podtverzhdenie_nalichija_sredstv) FROM podtverzhdenie_nalichija_sredstv podtverzhdenie_nalichija_sredstv";
	private static final String _ORDER_BY_ENTITY_ALIAS = "podtverzhdenie_nalichija_sredstv.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No podtverzhdenie_nalichija_sredstv exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(podtverzhdenie_nalichija_sredstvPersistenceImpl.class);
}
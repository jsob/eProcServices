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

package naruwenija.v.izvewenii.service.persistence.impl;

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

import naruwenija.v.izvewenii.exception.NoSuchnaruwenija_v_izveweniiException;
import naruwenija.v.izvewenii.model.impl.naruwenija_v_izveweniiImpl;
import naruwenija.v.izvewenii.model.impl.naruwenija_v_izveweniiModelImpl;
import naruwenija.v.izvewenii.model.naruwenija_v_izvewenii;
import naruwenija.v.izvewenii.service.persistence.naruwenija_v_izveweniiPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the naruwenija_v_izvewenii service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see naruwenija_v_izveweniiPersistence
 * @see naruwenija.v.izvewenii.service.persistence.naruwenija_v_izveweniiUtil
 * @generated
 */
@ProviderType
public class naruwenija_v_izveweniiPersistenceImpl extends BasePersistenceImpl<naruwenija_v_izvewenii>
	implements naruwenija_v_izveweniiPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link naruwenija_v_izveweniiUtil} to access the naruwenija_v_izvewenii persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = naruwenija_v_izveweniiImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(naruwenija_v_izveweniiModelImpl.ENTITY_CACHE_ENABLED,
			naruwenija_v_izveweniiModelImpl.FINDER_CACHE_ENABLED,
			naruwenija_v_izveweniiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(naruwenija_v_izveweniiModelImpl.ENTITY_CACHE_ENABLED,
			naruwenija_v_izveweniiModelImpl.FINDER_CACHE_ENABLED,
			naruwenija_v_izveweniiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(naruwenija_v_izveweniiModelImpl.ENTITY_CACHE_ENABLED,
			naruwenija_v_izveweniiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public naruwenija_v_izveweniiPersistenceImpl() {
		setModelClass(naruwenija_v_izvewenii.class);
	}

	/**
	 * Caches the naruwenija_v_izvewenii in the entity cache if it is enabled.
	 *
	 * @param naruwenija_v_izvewenii the naruwenija_v_izvewenii
	 */
	@Override
	public void cacheResult(naruwenija_v_izvewenii naruwenija_v_izvewenii) {
		entityCache.putResult(naruwenija_v_izveweniiModelImpl.ENTITY_CACHE_ENABLED,
			naruwenija_v_izveweniiImpl.class,
			naruwenija_v_izvewenii.getPrimaryKey(), naruwenija_v_izvewenii);

		naruwenija_v_izvewenii.resetOriginalValues();
	}

	/**
	 * Caches the naruwenija_v_izveweniis in the entity cache if it is enabled.
	 *
	 * @param naruwenija_v_izveweniis the naruwenija_v_izveweniis
	 */
	@Override
	public void cacheResult(
		List<naruwenija_v_izvewenii> naruwenija_v_izveweniis) {
		for (naruwenija_v_izvewenii naruwenija_v_izvewenii : naruwenija_v_izveweniis) {
			if (entityCache.getResult(
						naruwenija_v_izveweniiModelImpl.ENTITY_CACHE_ENABLED,
						naruwenija_v_izveweniiImpl.class,
						naruwenija_v_izvewenii.getPrimaryKey()) == null) {
				cacheResult(naruwenija_v_izvewenii);
			}
			else {
				naruwenija_v_izvewenii.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all naruwenija_v_izveweniis.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(naruwenija_v_izveweniiImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the naruwenija_v_izvewenii.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(naruwenija_v_izvewenii naruwenija_v_izvewenii) {
		entityCache.removeResult(naruwenija_v_izveweniiModelImpl.ENTITY_CACHE_ENABLED,
			naruwenija_v_izveweniiImpl.class,
			naruwenija_v_izvewenii.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<naruwenija_v_izvewenii> naruwenija_v_izveweniis) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (naruwenija_v_izvewenii naruwenija_v_izvewenii : naruwenija_v_izveweniis) {
			entityCache.removeResult(naruwenija_v_izveweniiModelImpl.ENTITY_CACHE_ENABLED,
				naruwenija_v_izveweniiImpl.class,
				naruwenija_v_izvewenii.getPrimaryKey());
		}
	}

	/**
	 * Creates a new naruwenija_v_izvewenii with the primary key. Does not add the naruwenija_v_izvewenii to the database.
	 *
	 * @param naruwenija_v_izvewenii_id the primary key for the new naruwenija_v_izvewenii
	 * @return the new naruwenija_v_izvewenii
	 */
	@Override
	public naruwenija_v_izvewenii create(long naruwenija_v_izvewenii_id) {
		naruwenija_v_izvewenii naruwenija_v_izvewenii = new naruwenija_v_izveweniiImpl();

		naruwenija_v_izvewenii.setNew(true);
		naruwenija_v_izvewenii.setPrimaryKey(naruwenija_v_izvewenii_id);

		return naruwenija_v_izvewenii;
	}

	/**
	 * Removes the naruwenija_v_izvewenii with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param naruwenija_v_izvewenii_id the primary key of the naruwenija_v_izvewenii
	 * @return the naruwenija_v_izvewenii that was removed
	 * @throws NoSuchnaruwenija_v_izveweniiException if a naruwenija_v_izvewenii with the primary key could not be found
	 */
	@Override
	public naruwenija_v_izvewenii remove(long naruwenija_v_izvewenii_id)
		throws NoSuchnaruwenija_v_izveweniiException {
		return remove((Serializable)naruwenija_v_izvewenii_id);
	}

	/**
	 * Removes the naruwenija_v_izvewenii with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the naruwenija_v_izvewenii
	 * @return the naruwenija_v_izvewenii that was removed
	 * @throws NoSuchnaruwenija_v_izveweniiException if a naruwenija_v_izvewenii with the primary key could not be found
	 */
	@Override
	public naruwenija_v_izvewenii remove(Serializable primaryKey)
		throws NoSuchnaruwenija_v_izveweniiException {
		Session session = null;

		try {
			session = openSession();

			naruwenija_v_izvewenii naruwenija_v_izvewenii = (naruwenija_v_izvewenii)session.get(naruwenija_v_izveweniiImpl.class,
					primaryKey);

			if (naruwenija_v_izvewenii == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchnaruwenija_v_izveweniiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(naruwenija_v_izvewenii);
		}
		catch (NoSuchnaruwenija_v_izveweniiException nsee) {
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
	protected naruwenija_v_izvewenii removeImpl(
		naruwenija_v_izvewenii naruwenija_v_izvewenii) {
		naruwenija_v_izvewenii = toUnwrappedModel(naruwenija_v_izvewenii);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(naruwenija_v_izvewenii)) {
				naruwenija_v_izvewenii = (naruwenija_v_izvewenii)session.get(naruwenija_v_izveweniiImpl.class,
						naruwenija_v_izvewenii.getPrimaryKeyObj());
			}

			if (naruwenija_v_izvewenii != null) {
				session.delete(naruwenija_v_izvewenii);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (naruwenija_v_izvewenii != null) {
			clearCache(naruwenija_v_izvewenii);
		}

		return naruwenija_v_izvewenii;
	}

	@Override
	public naruwenija_v_izvewenii updateImpl(
		naruwenija_v_izvewenii naruwenija_v_izvewenii) {
		naruwenija_v_izvewenii = toUnwrappedModel(naruwenija_v_izvewenii);

		boolean isNew = naruwenija_v_izvewenii.isNew();

		Session session = null;

		try {
			session = openSession();

			if (naruwenija_v_izvewenii.isNew()) {
				session.save(naruwenija_v_izvewenii);

				naruwenija_v_izvewenii.setNew(false);
			}
			else {
				naruwenija_v_izvewenii = (naruwenija_v_izvewenii)session.merge(naruwenija_v_izvewenii);
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

		entityCache.putResult(naruwenija_v_izveweniiModelImpl.ENTITY_CACHE_ENABLED,
			naruwenija_v_izveweniiImpl.class,
			naruwenija_v_izvewenii.getPrimaryKey(), naruwenija_v_izvewenii,
			false);

		naruwenija_v_izvewenii.resetOriginalValues();

		return naruwenija_v_izvewenii;
	}

	protected naruwenija_v_izvewenii toUnwrappedModel(
		naruwenija_v_izvewenii naruwenija_v_izvewenii) {
		if (naruwenija_v_izvewenii instanceof naruwenija_v_izveweniiImpl) {
			return naruwenija_v_izvewenii;
		}

		naruwenija_v_izveweniiImpl naruwenija_v_izveweniiImpl = new naruwenija_v_izveweniiImpl();

		naruwenija_v_izveweniiImpl.setNew(naruwenija_v_izvewenii.isNew());
		naruwenija_v_izveweniiImpl.setPrimaryKey(naruwenija_v_izvewenii.getPrimaryKey());

		naruwenija_v_izveweniiImpl.setData_sozdanija(naruwenija_v_izvewenii.getData_sozdanija());
		naruwenija_v_izveweniiImpl.setIzvewenie_id(naruwenija_v_izvewenii.getIzvewenie_id());
		naruwenija_v_izveweniiImpl.setNaruwenie(naruwenija_v_izvewenii.getNaruwenie());
		naruwenija_v_izveweniiImpl.setNaruwenija_v_izvewenii_id(naruwenija_v_izvewenii.getNaruwenija_v_izvewenii_id());
		naruwenija_v_izveweniiImpl.setNomer_razdela(naruwenija_v_izvewenii.getNomer_razdela());
		naruwenija_v_izveweniiImpl.setSozdal(naruwenija_v_izvewenii.getSozdal());

		return naruwenija_v_izveweniiImpl;
	}

	/**
	 * Returns the naruwenija_v_izvewenii with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the naruwenija_v_izvewenii
	 * @return the naruwenija_v_izvewenii
	 * @throws NoSuchnaruwenija_v_izveweniiException if a naruwenija_v_izvewenii with the primary key could not be found
	 */
	@Override
	public naruwenija_v_izvewenii findByPrimaryKey(Serializable primaryKey)
		throws NoSuchnaruwenija_v_izveweniiException {
		naruwenija_v_izvewenii naruwenija_v_izvewenii = fetchByPrimaryKey(primaryKey);

		if (naruwenija_v_izvewenii == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchnaruwenija_v_izveweniiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return naruwenija_v_izvewenii;
	}

	/**
	 * Returns the naruwenija_v_izvewenii with the primary key or throws a {@link NoSuchnaruwenija_v_izveweniiException} if it could not be found.
	 *
	 * @param naruwenija_v_izvewenii_id the primary key of the naruwenija_v_izvewenii
	 * @return the naruwenija_v_izvewenii
	 * @throws NoSuchnaruwenija_v_izveweniiException if a naruwenija_v_izvewenii with the primary key could not be found
	 */
	@Override
	public naruwenija_v_izvewenii findByPrimaryKey(
		long naruwenija_v_izvewenii_id)
		throws NoSuchnaruwenija_v_izveweniiException {
		return findByPrimaryKey((Serializable)naruwenija_v_izvewenii_id);
	}

	/**
	 * Returns the naruwenija_v_izvewenii with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the naruwenija_v_izvewenii
	 * @return the naruwenija_v_izvewenii, or <code>null</code> if a naruwenija_v_izvewenii with the primary key could not be found
	 */
	@Override
	public naruwenija_v_izvewenii fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(naruwenija_v_izveweniiModelImpl.ENTITY_CACHE_ENABLED,
				naruwenija_v_izveweniiImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		naruwenija_v_izvewenii naruwenija_v_izvewenii = (naruwenija_v_izvewenii)serializable;

		if (naruwenija_v_izvewenii == null) {
			Session session = null;

			try {
				session = openSession();

				naruwenija_v_izvewenii = (naruwenija_v_izvewenii)session.get(naruwenija_v_izveweniiImpl.class,
						primaryKey);

				if (naruwenija_v_izvewenii != null) {
					cacheResult(naruwenija_v_izvewenii);
				}
				else {
					entityCache.putResult(naruwenija_v_izveweniiModelImpl.ENTITY_CACHE_ENABLED,
						naruwenija_v_izveweniiImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(naruwenija_v_izveweniiModelImpl.ENTITY_CACHE_ENABLED,
					naruwenija_v_izveweniiImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return naruwenija_v_izvewenii;
	}

	/**
	 * Returns the naruwenija_v_izvewenii with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param naruwenija_v_izvewenii_id the primary key of the naruwenija_v_izvewenii
	 * @return the naruwenija_v_izvewenii, or <code>null</code> if a naruwenija_v_izvewenii with the primary key could not be found
	 */
	@Override
	public naruwenija_v_izvewenii fetchByPrimaryKey(
		long naruwenija_v_izvewenii_id) {
		return fetchByPrimaryKey((Serializable)naruwenija_v_izvewenii_id);
	}

	@Override
	public Map<Serializable, naruwenija_v_izvewenii> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, naruwenija_v_izvewenii> map = new HashMap<Serializable, naruwenija_v_izvewenii>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			naruwenija_v_izvewenii naruwenija_v_izvewenii = fetchByPrimaryKey(primaryKey);

			if (naruwenija_v_izvewenii != null) {
				map.put(primaryKey, naruwenija_v_izvewenii);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(naruwenija_v_izveweniiModelImpl.ENTITY_CACHE_ENABLED,
					naruwenija_v_izveweniiImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (naruwenija_v_izvewenii)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_NARUWENIJA_V_IZVEWENII_WHERE_PKS_IN);

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

			for (naruwenija_v_izvewenii naruwenija_v_izvewenii : (List<naruwenija_v_izvewenii>)q.list()) {
				map.put(naruwenija_v_izvewenii.getPrimaryKeyObj(),
					naruwenija_v_izvewenii);

				cacheResult(naruwenija_v_izvewenii);

				uncachedPrimaryKeys.remove(naruwenija_v_izvewenii.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(naruwenija_v_izveweniiModelImpl.ENTITY_CACHE_ENABLED,
					naruwenija_v_izveweniiImpl.class, primaryKey, nullModel);
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
	 * Returns all the naruwenija_v_izveweniis.
	 *
	 * @return the naruwenija_v_izveweniis
	 */
	@Override
	public List<naruwenija_v_izvewenii> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the naruwenija_v_izveweniis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link naruwenija_v_izveweniiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of naruwenija_v_izveweniis
	 * @param end the upper bound of the range of naruwenija_v_izveweniis (not inclusive)
	 * @return the range of naruwenija_v_izveweniis
	 */
	@Override
	public List<naruwenija_v_izvewenii> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the naruwenija_v_izveweniis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link naruwenija_v_izveweniiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of naruwenija_v_izveweniis
	 * @param end the upper bound of the range of naruwenija_v_izveweniis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of naruwenija_v_izveweniis
	 */
	@Override
	public List<naruwenija_v_izvewenii> findAll(int start, int end,
		OrderByComparator<naruwenija_v_izvewenii> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the naruwenija_v_izveweniis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link naruwenija_v_izveweniiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of naruwenija_v_izveweniis
	 * @param end the upper bound of the range of naruwenija_v_izveweniis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of naruwenija_v_izveweniis
	 */
	@Override
	public List<naruwenija_v_izvewenii> findAll(int start, int end,
		OrderByComparator<naruwenija_v_izvewenii> orderByComparator,
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

		List<naruwenija_v_izvewenii> list = null;

		if (retrieveFromCache) {
			list = (List<naruwenija_v_izvewenii>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_NARUWENIJA_V_IZVEWENII);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_NARUWENIJA_V_IZVEWENII;

				if (pagination) {
					sql = sql.concat(naruwenija_v_izveweniiModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<naruwenija_v_izvewenii>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<naruwenija_v_izvewenii>)QueryUtil.list(q,
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
	 * Removes all the naruwenija_v_izveweniis from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (naruwenija_v_izvewenii naruwenija_v_izvewenii : findAll()) {
			remove(naruwenija_v_izvewenii);
		}
	}

	/**
	 * Returns the number of naruwenija_v_izveweniis.
	 *
	 * @return the number of naruwenija_v_izveweniis
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_NARUWENIJA_V_IZVEWENII);

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
		return naruwenija_v_izveweniiModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the naruwenija_v_izvewenii persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(naruwenija_v_izveweniiImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_NARUWENIJA_V_IZVEWENII = "SELECT naruwenija_v_izvewenii FROM naruwenija_v_izvewenii naruwenija_v_izvewenii";
	private static final String _SQL_SELECT_NARUWENIJA_V_IZVEWENII_WHERE_PKS_IN = "SELECT naruwenija_v_izvewenii FROM naruwenija_v_izvewenii naruwenija_v_izvewenii WHERE naruwenija_v_izvewenii_id IN (";
	private static final String _SQL_COUNT_NARUWENIJA_V_IZVEWENII = "SELECT COUNT(naruwenija_v_izvewenii) FROM naruwenija_v_izvewenii naruwenija_v_izvewenii";
	private static final String _ORDER_BY_ENTITY_ALIAS = "naruwenija_v_izvewenii.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No naruwenija_v_izvewenii exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(naruwenija_v_izveweniiPersistenceImpl.class);
}
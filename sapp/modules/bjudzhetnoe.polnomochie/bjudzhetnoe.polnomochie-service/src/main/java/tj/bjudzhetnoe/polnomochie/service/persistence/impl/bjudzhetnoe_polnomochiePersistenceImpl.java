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

package tj.bjudzhetnoe.polnomochie.service.persistence.impl;

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

import tj.bjudzhetnoe.polnomochie.exception.NoSuchbjudzhetnoe_polnomochieException;
import tj.bjudzhetnoe.polnomochie.model.bjudzhetnoe_polnomochie;
import tj.bjudzhetnoe.polnomochie.model.impl.bjudzhetnoe_polnomochieImpl;
import tj.bjudzhetnoe.polnomochie.model.impl.bjudzhetnoe_polnomochieModelImpl;
import tj.bjudzhetnoe.polnomochie.service.persistence.bjudzhetnoe_polnomochiePersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the bjudzhetnoe_polnomochie service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see bjudzhetnoe_polnomochiePersistence
 * @see tj.bjudzhetnoe.polnomochie.service.persistence.bjudzhetnoe_polnomochieUtil
 * @generated
 */
@ProviderType
public class bjudzhetnoe_polnomochiePersistenceImpl extends BasePersistenceImpl<bjudzhetnoe_polnomochie>
	implements bjudzhetnoe_polnomochiePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link bjudzhetnoe_polnomochieUtil} to access the bjudzhetnoe_polnomochie persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = bjudzhetnoe_polnomochieImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(bjudzhetnoe_polnomochieModelImpl.ENTITY_CACHE_ENABLED,
			bjudzhetnoe_polnomochieModelImpl.FINDER_CACHE_ENABLED,
			bjudzhetnoe_polnomochieImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(bjudzhetnoe_polnomochieModelImpl.ENTITY_CACHE_ENABLED,
			bjudzhetnoe_polnomochieModelImpl.FINDER_CACHE_ENABLED,
			bjudzhetnoe_polnomochieImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(bjudzhetnoe_polnomochieModelImpl.ENTITY_CACHE_ENABLED,
			bjudzhetnoe_polnomochieModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public bjudzhetnoe_polnomochiePersistenceImpl() {
		setModelClass(bjudzhetnoe_polnomochie.class);
	}

	/**
	 * Caches the bjudzhetnoe_polnomochie in the entity cache if it is enabled.
	 *
	 * @param bjudzhetnoe_polnomochie the bjudzhetnoe_polnomochie
	 */
	@Override
	public void cacheResult(bjudzhetnoe_polnomochie bjudzhetnoe_polnomochie) {
		entityCache.putResult(bjudzhetnoe_polnomochieModelImpl.ENTITY_CACHE_ENABLED,
			bjudzhetnoe_polnomochieImpl.class,
			bjudzhetnoe_polnomochie.getPrimaryKey(), bjudzhetnoe_polnomochie);

		bjudzhetnoe_polnomochie.resetOriginalValues();
	}

	/**
	 * Caches the bjudzhetnoe_polnomochies in the entity cache if it is enabled.
	 *
	 * @param bjudzhetnoe_polnomochies the bjudzhetnoe_polnomochies
	 */
	@Override
	public void cacheResult(
		List<bjudzhetnoe_polnomochie> bjudzhetnoe_polnomochies) {
		for (bjudzhetnoe_polnomochie bjudzhetnoe_polnomochie : bjudzhetnoe_polnomochies) {
			if (entityCache.getResult(
						bjudzhetnoe_polnomochieModelImpl.ENTITY_CACHE_ENABLED,
						bjudzhetnoe_polnomochieImpl.class,
						bjudzhetnoe_polnomochie.getPrimaryKey()) == null) {
				cacheResult(bjudzhetnoe_polnomochie);
			}
			else {
				bjudzhetnoe_polnomochie.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all bjudzhetnoe_polnomochies.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(bjudzhetnoe_polnomochieImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the bjudzhetnoe_polnomochie.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(bjudzhetnoe_polnomochie bjudzhetnoe_polnomochie) {
		entityCache.removeResult(bjudzhetnoe_polnomochieModelImpl.ENTITY_CACHE_ENABLED,
			bjudzhetnoe_polnomochieImpl.class,
			bjudzhetnoe_polnomochie.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<bjudzhetnoe_polnomochie> bjudzhetnoe_polnomochies) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (bjudzhetnoe_polnomochie bjudzhetnoe_polnomochie : bjudzhetnoe_polnomochies) {
			entityCache.removeResult(bjudzhetnoe_polnomochieModelImpl.ENTITY_CACHE_ENABLED,
				bjudzhetnoe_polnomochieImpl.class,
				bjudzhetnoe_polnomochie.getPrimaryKey());
		}
	}

	/**
	 * Creates a new bjudzhetnoe_polnomochie with the primary key. Does not add the bjudzhetnoe_polnomochie to the database.
	 *
	 * @param bjudzhetnoe_polnomochie_id the primary key for the new bjudzhetnoe_polnomochie
	 * @return the new bjudzhetnoe_polnomochie
	 */
	@Override
	public bjudzhetnoe_polnomochie create(long bjudzhetnoe_polnomochie_id) {
		bjudzhetnoe_polnomochie bjudzhetnoe_polnomochie = new bjudzhetnoe_polnomochieImpl();

		bjudzhetnoe_polnomochie.setNew(true);
		bjudzhetnoe_polnomochie.setPrimaryKey(bjudzhetnoe_polnomochie_id);

		return bjudzhetnoe_polnomochie;
	}

	/**
	 * Removes the bjudzhetnoe_polnomochie with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param bjudzhetnoe_polnomochie_id the primary key of the bjudzhetnoe_polnomochie
	 * @return the bjudzhetnoe_polnomochie that was removed
	 * @throws NoSuchbjudzhetnoe_polnomochieException if a bjudzhetnoe_polnomochie with the primary key could not be found
	 */
	@Override
	public bjudzhetnoe_polnomochie remove(long bjudzhetnoe_polnomochie_id)
		throws NoSuchbjudzhetnoe_polnomochieException {
		return remove((Serializable)bjudzhetnoe_polnomochie_id);
	}

	/**
	 * Removes the bjudzhetnoe_polnomochie with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the bjudzhetnoe_polnomochie
	 * @return the bjudzhetnoe_polnomochie that was removed
	 * @throws NoSuchbjudzhetnoe_polnomochieException if a bjudzhetnoe_polnomochie with the primary key could not be found
	 */
	@Override
	public bjudzhetnoe_polnomochie remove(Serializable primaryKey)
		throws NoSuchbjudzhetnoe_polnomochieException {
		Session session = null;

		try {
			session = openSession();

			bjudzhetnoe_polnomochie bjudzhetnoe_polnomochie = (bjudzhetnoe_polnomochie)session.get(bjudzhetnoe_polnomochieImpl.class,
					primaryKey);

			if (bjudzhetnoe_polnomochie == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchbjudzhetnoe_polnomochieException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(bjudzhetnoe_polnomochie);
		}
		catch (NoSuchbjudzhetnoe_polnomochieException nsee) {
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
	protected bjudzhetnoe_polnomochie removeImpl(
		bjudzhetnoe_polnomochie bjudzhetnoe_polnomochie) {
		bjudzhetnoe_polnomochie = toUnwrappedModel(bjudzhetnoe_polnomochie);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(bjudzhetnoe_polnomochie)) {
				bjudzhetnoe_polnomochie = (bjudzhetnoe_polnomochie)session.get(bjudzhetnoe_polnomochieImpl.class,
						bjudzhetnoe_polnomochie.getPrimaryKeyObj());
			}

			if (bjudzhetnoe_polnomochie != null) {
				session.delete(bjudzhetnoe_polnomochie);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (bjudzhetnoe_polnomochie != null) {
			clearCache(bjudzhetnoe_polnomochie);
		}

		return bjudzhetnoe_polnomochie;
	}

	@Override
	public bjudzhetnoe_polnomochie updateImpl(
		bjudzhetnoe_polnomochie bjudzhetnoe_polnomochie) {
		bjudzhetnoe_polnomochie = toUnwrappedModel(bjudzhetnoe_polnomochie);

		boolean isNew = bjudzhetnoe_polnomochie.isNew();

		Session session = null;

		try {
			session = openSession();

			if (bjudzhetnoe_polnomochie.isNew()) {
				session.save(bjudzhetnoe_polnomochie);

				bjudzhetnoe_polnomochie.setNew(false);
			}
			else {
				bjudzhetnoe_polnomochie = (bjudzhetnoe_polnomochie)session.merge(bjudzhetnoe_polnomochie);
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

		entityCache.putResult(bjudzhetnoe_polnomochieModelImpl.ENTITY_CACHE_ENABLED,
			bjudzhetnoe_polnomochieImpl.class,
			bjudzhetnoe_polnomochie.getPrimaryKey(), bjudzhetnoe_polnomochie,
			false);

		bjudzhetnoe_polnomochie.resetOriginalValues();

		return bjudzhetnoe_polnomochie;
	}

	protected bjudzhetnoe_polnomochie toUnwrappedModel(
		bjudzhetnoe_polnomochie bjudzhetnoe_polnomochie) {
		if (bjudzhetnoe_polnomochie instanceof bjudzhetnoe_polnomochieImpl) {
			return bjudzhetnoe_polnomochie;
		}

		bjudzhetnoe_polnomochieImpl bjudzhetnoe_polnomochieImpl = new bjudzhetnoe_polnomochieImpl();

		bjudzhetnoe_polnomochieImpl.setNew(bjudzhetnoe_polnomochie.isNew());
		bjudzhetnoe_polnomochieImpl.setPrimaryKey(bjudzhetnoe_polnomochie.getPrimaryKey());

		bjudzhetnoe_polnomochieImpl.setBjudzhetnoe_polnomochie_id(bjudzhetnoe_polnomochie.getBjudzhetnoe_polnomochie_id());
		bjudzhetnoe_polnomochieImpl.setNaimenovanie(bjudzhetnoe_polnomochie.getNaimenovanie());

		return bjudzhetnoe_polnomochieImpl;
	}

	/**
	 * Returns the bjudzhetnoe_polnomochie with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the bjudzhetnoe_polnomochie
	 * @return the bjudzhetnoe_polnomochie
	 * @throws NoSuchbjudzhetnoe_polnomochieException if a bjudzhetnoe_polnomochie with the primary key could not be found
	 */
	@Override
	public bjudzhetnoe_polnomochie findByPrimaryKey(Serializable primaryKey)
		throws NoSuchbjudzhetnoe_polnomochieException {
		bjudzhetnoe_polnomochie bjudzhetnoe_polnomochie = fetchByPrimaryKey(primaryKey);

		if (bjudzhetnoe_polnomochie == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchbjudzhetnoe_polnomochieException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return bjudzhetnoe_polnomochie;
	}

	/**
	 * Returns the bjudzhetnoe_polnomochie with the primary key or throws a {@link NoSuchbjudzhetnoe_polnomochieException} if it could not be found.
	 *
	 * @param bjudzhetnoe_polnomochie_id the primary key of the bjudzhetnoe_polnomochie
	 * @return the bjudzhetnoe_polnomochie
	 * @throws NoSuchbjudzhetnoe_polnomochieException if a bjudzhetnoe_polnomochie with the primary key could not be found
	 */
	@Override
	public bjudzhetnoe_polnomochie findByPrimaryKey(
		long bjudzhetnoe_polnomochie_id)
		throws NoSuchbjudzhetnoe_polnomochieException {
		return findByPrimaryKey((Serializable)bjudzhetnoe_polnomochie_id);
	}

	/**
	 * Returns the bjudzhetnoe_polnomochie with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the bjudzhetnoe_polnomochie
	 * @return the bjudzhetnoe_polnomochie, or <code>null</code> if a bjudzhetnoe_polnomochie with the primary key could not be found
	 */
	@Override
	public bjudzhetnoe_polnomochie fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(bjudzhetnoe_polnomochieModelImpl.ENTITY_CACHE_ENABLED,
				bjudzhetnoe_polnomochieImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		bjudzhetnoe_polnomochie bjudzhetnoe_polnomochie = (bjudzhetnoe_polnomochie)serializable;

		if (bjudzhetnoe_polnomochie == null) {
			Session session = null;

			try {
				session = openSession();

				bjudzhetnoe_polnomochie = (bjudzhetnoe_polnomochie)session.get(bjudzhetnoe_polnomochieImpl.class,
						primaryKey);

				if (bjudzhetnoe_polnomochie != null) {
					cacheResult(bjudzhetnoe_polnomochie);
				}
				else {
					entityCache.putResult(bjudzhetnoe_polnomochieModelImpl.ENTITY_CACHE_ENABLED,
						bjudzhetnoe_polnomochieImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(bjudzhetnoe_polnomochieModelImpl.ENTITY_CACHE_ENABLED,
					bjudzhetnoe_polnomochieImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return bjudzhetnoe_polnomochie;
	}

	/**
	 * Returns the bjudzhetnoe_polnomochie with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param bjudzhetnoe_polnomochie_id the primary key of the bjudzhetnoe_polnomochie
	 * @return the bjudzhetnoe_polnomochie, or <code>null</code> if a bjudzhetnoe_polnomochie with the primary key could not be found
	 */
	@Override
	public bjudzhetnoe_polnomochie fetchByPrimaryKey(
		long bjudzhetnoe_polnomochie_id) {
		return fetchByPrimaryKey((Serializable)bjudzhetnoe_polnomochie_id);
	}

	@Override
	public Map<Serializable, bjudzhetnoe_polnomochie> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, bjudzhetnoe_polnomochie> map = new HashMap<Serializable, bjudzhetnoe_polnomochie>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			bjudzhetnoe_polnomochie bjudzhetnoe_polnomochie = fetchByPrimaryKey(primaryKey);

			if (bjudzhetnoe_polnomochie != null) {
				map.put(primaryKey, bjudzhetnoe_polnomochie);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(bjudzhetnoe_polnomochieModelImpl.ENTITY_CACHE_ENABLED,
					bjudzhetnoe_polnomochieImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (bjudzhetnoe_polnomochie)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_BJUDZHETNOE_POLNOMOCHIE_WHERE_PKS_IN);

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

			for (bjudzhetnoe_polnomochie bjudzhetnoe_polnomochie : (List<bjudzhetnoe_polnomochie>)q.list()) {
				map.put(bjudzhetnoe_polnomochie.getPrimaryKeyObj(),
					bjudzhetnoe_polnomochie);

				cacheResult(bjudzhetnoe_polnomochie);

				uncachedPrimaryKeys.remove(bjudzhetnoe_polnomochie.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(bjudzhetnoe_polnomochieModelImpl.ENTITY_CACHE_ENABLED,
					bjudzhetnoe_polnomochieImpl.class, primaryKey, nullModel);
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
	 * Returns all the bjudzhetnoe_polnomochies.
	 *
	 * @return the bjudzhetnoe_polnomochies
	 */
	@Override
	public List<bjudzhetnoe_polnomochie> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the bjudzhetnoe_polnomochies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bjudzhetnoe_polnomochieModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of bjudzhetnoe_polnomochies
	 * @param end the upper bound of the range of bjudzhetnoe_polnomochies (not inclusive)
	 * @return the range of bjudzhetnoe_polnomochies
	 */
	@Override
	public List<bjudzhetnoe_polnomochie> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the bjudzhetnoe_polnomochies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bjudzhetnoe_polnomochieModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of bjudzhetnoe_polnomochies
	 * @param end the upper bound of the range of bjudzhetnoe_polnomochies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of bjudzhetnoe_polnomochies
	 */
	@Override
	public List<bjudzhetnoe_polnomochie> findAll(int start, int end,
		OrderByComparator<bjudzhetnoe_polnomochie> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the bjudzhetnoe_polnomochies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bjudzhetnoe_polnomochieModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of bjudzhetnoe_polnomochies
	 * @param end the upper bound of the range of bjudzhetnoe_polnomochies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of bjudzhetnoe_polnomochies
	 */
	@Override
	public List<bjudzhetnoe_polnomochie> findAll(int start, int end,
		OrderByComparator<bjudzhetnoe_polnomochie> orderByComparator,
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

		List<bjudzhetnoe_polnomochie> list = null;

		if (retrieveFromCache) {
			list = (List<bjudzhetnoe_polnomochie>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_BJUDZHETNOE_POLNOMOCHIE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_BJUDZHETNOE_POLNOMOCHIE;

				if (pagination) {
					sql = sql.concat(bjudzhetnoe_polnomochieModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<bjudzhetnoe_polnomochie>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<bjudzhetnoe_polnomochie>)QueryUtil.list(q,
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
	 * Removes all the bjudzhetnoe_polnomochies from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (bjudzhetnoe_polnomochie bjudzhetnoe_polnomochie : findAll()) {
			remove(bjudzhetnoe_polnomochie);
		}
	}

	/**
	 * Returns the number of bjudzhetnoe_polnomochies.
	 *
	 * @return the number of bjudzhetnoe_polnomochies
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_BJUDZHETNOE_POLNOMOCHIE);

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
		return bjudzhetnoe_polnomochieModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the bjudzhetnoe_polnomochie persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(bjudzhetnoe_polnomochieImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_BJUDZHETNOE_POLNOMOCHIE = "SELECT bjudzhetnoe_polnomochie FROM bjudzhetnoe_polnomochie bjudzhetnoe_polnomochie";
	private static final String _SQL_SELECT_BJUDZHETNOE_POLNOMOCHIE_WHERE_PKS_IN =
		"SELECT bjudzhetnoe_polnomochie FROM bjudzhetnoe_polnomochie bjudzhetnoe_polnomochie WHERE bjudzhetnoe_polnomochie_id IN (";
	private static final String _SQL_COUNT_BJUDZHETNOE_POLNOMOCHIE = "SELECT COUNT(bjudzhetnoe_polnomochie) FROM bjudzhetnoe_polnomochie bjudzhetnoe_polnomochie";
	private static final String _ORDER_BY_ENTITY_ALIAS = "bjudzhetnoe_polnomochie.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No bjudzhetnoe_polnomochie exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(bjudzhetnoe_polnomochiePersistenceImpl.class);
}
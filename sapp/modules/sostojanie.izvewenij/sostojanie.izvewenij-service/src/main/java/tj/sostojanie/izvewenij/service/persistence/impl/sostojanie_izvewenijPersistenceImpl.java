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

package tj.sostojanie.izvewenij.service.persistence.impl;

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

import tj.sostojanie.izvewenij.exception.NoSuchsostojanie_izvewenijException;
import tj.sostojanie.izvewenij.model.impl.sostojanie_izvewenijImpl;
import tj.sostojanie.izvewenij.model.impl.sostojanie_izvewenijModelImpl;
import tj.sostojanie.izvewenij.model.sostojanie_izvewenij;
import tj.sostojanie.izvewenij.service.persistence.sostojanie_izvewenijPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the sostojanie_izvewenij service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see sostojanie_izvewenijPersistence
 * @see tj.sostojanie.izvewenij.service.persistence.sostojanie_izvewenijUtil
 * @generated
 */
@ProviderType
public class sostojanie_izvewenijPersistenceImpl extends BasePersistenceImpl<sostojanie_izvewenij>
	implements sostojanie_izvewenijPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link sostojanie_izvewenijUtil} to access the sostojanie_izvewenij persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = sostojanie_izvewenijImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(sostojanie_izvewenijModelImpl.ENTITY_CACHE_ENABLED,
			sostojanie_izvewenijModelImpl.FINDER_CACHE_ENABLED,
			sostojanie_izvewenijImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(sostojanie_izvewenijModelImpl.ENTITY_CACHE_ENABLED,
			sostojanie_izvewenijModelImpl.FINDER_CACHE_ENABLED,
			sostojanie_izvewenijImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(sostojanie_izvewenijModelImpl.ENTITY_CACHE_ENABLED,
			sostojanie_izvewenijModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public sostojanie_izvewenijPersistenceImpl() {
		setModelClass(sostojanie_izvewenij.class);
	}

	/**
	 * Caches the sostojanie_izvewenij in the entity cache if it is enabled.
	 *
	 * @param sostojanie_izvewenij the sostojanie_izvewenij
	 */
	@Override
	public void cacheResult(sostojanie_izvewenij sostojanie_izvewenij) {
		entityCache.putResult(sostojanie_izvewenijModelImpl.ENTITY_CACHE_ENABLED,
			sostojanie_izvewenijImpl.class,
			sostojanie_izvewenij.getPrimaryKey(), sostojanie_izvewenij);

		sostojanie_izvewenij.resetOriginalValues();
	}

	/**
	 * Caches the sostojanie_izvewenijs in the entity cache if it is enabled.
	 *
	 * @param sostojanie_izvewenijs the sostojanie_izvewenijs
	 */
	@Override
	public void cacheResult(List<sostojanie_izvewenij> sostojanie_izvewenijs) {
		for (sostojanie_izvewenij sostojanie_izvewenij : sostojanie_izvewenijs) {
			if (entityCache.getResult(
						sostojanie_izvewenijModelImpl.ENTITY_CACHE_ENABLED,
						sostojanie_izvewenijImpl.class,
						sostojanie_izvewenij.getPrimaryKey()) == null) {
				cacheResult(sostojanie_izvewenij);
			}
			else {
				sostojanie_izvewenij.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all sostojanie_izvewenijs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(sostojanie_izvewenijImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the sostojanie_izvewenij.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(sostojanie_izvewenij sostojanie_izvewenij) {
		entityCache.removeResult(sostojanie_izvewenijModelImpl.ENTITY_CACHE_ENABLED,
			sostojanie_izvewenijImpl.class, sostojanie_izvewenij.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<sostojanie_izvewenij> sostojanie_izvewenijs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (sostojanie_izvewenij sostojanie_izvewenij : sostojanie_izvewenijs) {
			entityCache.removeResult(sostojanie_izvewenijModelImpl.ENTITY_CACHE_ENABLED,
				sostojanie_izvewenijImpl.class,
				sostojanie_izvewenij.getPrimaryKey());
		}
	}

	/**
	 * Creates a new sostojanie_izvewenij with the primary key. Does not add the sostojanie_izvewenij to the database.
	 *
	 * @param sostojanie_izvewenij_id the primary key for the new sostojanie_izvewenij
	 * @return the new sostojanie_izvewenij
	 */
	@Override
	public sostojanie_izvewenij create(long sostojanie_izvewenij_id) {
		sostojanie_izvewenij sostojanie_izvewenij = new sostojanie_izvewenijImpl();

		sostojanie_izvewenij.setNew(true);
		sostojanie_izvewenij.setPrimaryKey(sostojanie_izvewenij_id);

		return sostojanie_izvewenij;
	}

	/**
	 * Removes the sostojanie_izvewenij with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sostojanie_izvewenij_id the primary key of the sostojanie_izvewenij
	 * @return the sostojanie_izvewenij that was removed
	 * @throws NoSuchsostojanie_izvewenijException if a sostojanie_izvewenij with the primary key could not be found
	 */
	@Override
	public sostojanie_izvewenij remove(long sostojanie_izvewenij_id)
		throws NoSuchsostojanie_izvewenijException {
		return remove((Serializable)sostojanie_izvewenij_id);
	}

	/**
	 * Removes the sostojanie_izvewenij with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sostojanie_izvewenij
	 * @return the sostojanie_izvewenij that was removed
	 * @throws NoSuchsostojanie_izvewenijException if a sostojanie_izvewenij with the primary key could not be found
	 */
	@Override
	public sostojanie_izvewenij remove(Serializable primaryKey)
		throws NoSuchsostojanie_izvewenijException {
		Session session = null;

		try {
			session = openSession();

			sostojanie_izvewenij sostojanie_izvewenij = (sostojanie_izvewenij)session.get(sostojanie_izvewenijImpl.class,
					primaryKey);

			if (sostojanie_izvewenij == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchsostojanie_izvewenijException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(sostojanie_izvewenij);
		}
		catch (NoSuchsostojanie_izvewenijException nsee) {
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
	protected sostojanie_izvewenij removeImpl(
		sostojanie_izvewenij sostojanie_izvewenij) {
		sostojanie_izvewenij = toUnwrappedModel(sostojanie_izvewenij);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sostojanie_izvewenij)) {
				sostojanie_izvewenij = (sostojanie_izvewenij)session.get(sostojanie_izvewenijImpl.class,
						sostojanie_izvewenij.getPrimaryKeyObj());
			}

			if (sostojanie_izvewenij != null) {
				session.delete(sostojanie_izvewenij);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (sostojanie_izvewenij != null) {
			clearCache(sostojanie_izvewenij);
		}

		return sostojanie_izvewenij;
	}

	@Override
	public sostojanie_izvewenij updateImpl(
		sostojanie_izvewenij sostojanie_izvewenij) {
		sostojanie_izvewenij = toUnwrappedModel(sostojanie_izvewenij);

		boolean isNew = sostojanie_izvewenij.isNew();

		Session session = null;

		try {
			session = openSession();

			if (sostojanie_izvewenij.isNew()) {
				session.save(sostojanie_izvewenij);

				sostojanie_izvewenij.setNew(false);
			}
			else {
				sostojanie_izvewenij = (sostojanie_izvewenij)session.merge(sostojanie_izvewenij);
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

		entityCache.putResult(sostojanie_izvewenijModelImpl.ENTITY_CACHE_ENABLED,
			sostojanie_izvewenijImpl.class,
			sostojanie_izvewenij.getPrimaryKey(), sostojanie_izvewenij, false);

		sostojanie_izvewenij.resetOriginalValues();

		return sostojanie_izvewenij;
	}

	protected sostojanie_izvewenij toUnwrappedModel(
		sostojanie_izvewenij sostojanie_izvewenij) {
		if (sostojanie_izvewenij instanceof sostojanie_izvewenijImpl) {
			return sostojanie_izvewenij;
		}

		sostojanie_izvewenijImpl sostojanie_izvewenijImpl = new sostojanie_izvewenijImpl();

		sostojanie_izvewenijImpl.setNew(sostojanie_izvewenij.isNew());
		sostojanie_izvewenijImpl.setPrimaryKey(sostojanie_izvewenij.getPrimaryKey());

		sostojanie_izvewenijImpl.setSostojanie(sostojanie_izvewenij.getSostojanie());
		sostojanie_izvewenijImpl.setSostojanie_izvewenij_id(sostojanie_izvewenij.getSostojanie_izvewenij_id());

		return sostojanie_izvewenijImpl;
	}

	/**
	 * Returns the sostojanie_izvewenij with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the sostojanie_izvewenij
	 * @return the sostojanie_izvewenij
	 * @throws NoSuchsostojanie_izvewenijException if a sostojanie_izvewenij with the primary key could not be found
	 */
	@Override
	public sostojanie_izvewenij findByPrimaryKey(Serializable primaryKey)
		throws NoSuchsostojanie_izvewenijException {
		sostojanie_izvewenij sostojanie_izvewenij = fetchByPrimaryKey(primaryKey);

		if (sostojanie_izvewenij == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchsostojanie_izvewenijException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return sostojanie_izvewenij;
	}

	/**
	 * Returns the sostojanie_izvewenij with the primary key or throws a {@link NoSuchsostojanie_izvewenijException} if it could not be found.
	 *
	 * @param sostojanie_izvewenij_id the primary key of the sostojanie_izvewenij
	 * @return the sostojanie_izvewenij
	 * @throws NoSuchsostojanie_izvewenijException if a sostojanie_izvewenij with the primary key could not be found
	 */
	@Override
	public sostojanie_izvewenij findByPrimaryKey(long sostojanie_izvewenij_id)
		throws NoSuchsostojanie_izvewenijException {
		return findByPrimaryKey((Serializable)sostojanie_izvewenij_id);
	}

	/**
	 * Returns the sostojanie_izvewenij with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sostojanie_izvewenij
	 * @return the sostojanie_izvewenij, or <code>null</code> if a sostojanie_izvewenij with the primary key could not be found
	 */
	@Override
	public sostojanie_izvewenij fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(sostojanie_izvewenijModelImpl.ENTITY_CACHE_ENABLED,
				sostojanie_izvewenijImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		sostojanie_izvewenij sostojanie_izvewenij = (sostojanie_izvewenij)serializable;

		if (sostojanie_izvewenij == null) {
			Session session = null;

			try {
				session = openSession();

				sostojanie_izvewenij = (sostojanie_izvewenij)session.get(sostojanie_izvewenijImpl.class,
						primaryKey);

				if (sostojanie_izvewenij != null) {
					cacheResult(sostojanie_izvewenij);
				}
				else {
					entityCache.putResult(sostojanie_izvewenijModelImpl.ENTITY_CACHE_ENABLED,
						sostojanie_izvewenijImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(sostojanie_izvewenijModelImpl.ENTITY_CACHE_ENABLED,
					sostojanie_izvewenijImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return sostojanie_izvewenij;
	}

	/**
	 * Returns the sostojanie_izvewenij with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sostojanie_izvewenij_id the primary key of the sostojanie_izvewenij
	 * @return the sostojanie_izvewenij, or <code>null</code> if a sostojanie_izvewenij with the primary key could not be found
	 */
	@Override
	public sostojanie_izvewenij fetchByPrimaryKey(long sostojanie_izvewenij_id) {
		return fetchByPrimaryKey((Serializable)sostojanie_izvewenij_id);
	}

	@Override
	public Map<Serializable, sostojanie_izvewenij> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, sostojanie_izvewenij> map = new HashMap<Serializable, sostojanie_izvewenij>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			sostojanie_izvewenij sostojanie_izvewenij = fetchByPrimaryKey(primaryKey);

			if (sostojanie_izvewenij != null) {
				map.put(primaryKey, sostojanie_izvewenij);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(sostojanie_izvewenijModelImpl.ENTITY_CACHE_ENABLED,
					sostojanie_izvewenijImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (sostojanie_izvewenij)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_SOSTOJANIE_IZVEWENIJ_WHERE_PKS_IN);

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

			for (sostojanie_izvewenij sostojanie_izvewenij : (List<sostojanie_izvewenij>)q.list()) {
				map.put(sostojanie_izvewenij.getPrimaryKeyObj(),
					sostojanie_izvewenij);

				cacheResult(sostojanie_izvewenij);

				uncachedPrimaryKeys.remove(sostojanie_izvewenij.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(sostojanie_izvewenijModelImpl.ENTITY_CACHE_ENABLED,
					sostojanie_izvewenijImpl.class, primaryKey, nullModel);
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
	 * Returns all the sostojanie_izvewenijs.
	 *
	 * @return the sostojanie_izvewenijs
	 */
	@Override
	public List<sostojanie_izvewenij> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sostojanie_izvewenijs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link sostojanie_izvewenijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of sostojanie_izvewenijs
	 * @param end the upper bound of the range of sostojanie_izvewenijs (not inclusive)
	 * @return the range of sostojanie_izvewenijs
	 */
	@Override
	public List<sostojanie_izvewenij> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sostojanie_izvewenijs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link sostojanie_izvewenijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of sostojanie_izvewenijs
	 * @param end the upper bound of the range of sostojanie_izvewenijs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sostojanie_izvewenijs
	 */
	@Override
	public List<sostojanie_izvewenij> findAll(int start, int end,
		OrderByComparator<sostojanie_izvewenij> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sostojanie_izvewenijs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link sostojanie_izvewenijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of sostojanie_izvewenijs
	 * @param end the upper bound of the range of sostojanie_izvewenijs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of sostojanie_izvewenijs
	 */
	@Override
	public List<sostojanie_izvewenij> findAll(int start, int end,
		OrderByComparator<sostojanie_izvewenij> orderByComparator,
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

		List<sostojanie_izvewenij> list = null;

		if (retrieveFromCache) {
			list = (List<sostojanie_izvewenij>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_SOSTOJANIE_IZVEWENIJ);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SOSTOJANIE_IZVEWENIJ;

				if (pagination) {
					sql = sql.concat(sostojanie_izvewenijModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<sostojanie_izvewenij>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<sostojanie_izvewenij>)QueryUtil.list(q,
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
	 * Removes all the sostojanie_izvewenijs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (sostojanie_izvewenij sostojanie_izvewenij : findAll()) {
			remove(sostojanie_izvewenij);
		}
	}

	/**
	 * Returns the number of sostojanie_izvewenijs.
	 *
	 * @return the number of sostojanie_izvewenijs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SOSTOJANIE_IZVEWENIJ);

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
		return sostojanie_izvewenijModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sostojanie_izvewenij persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(sostojanie_izvewenijImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_SOSTOJANIE_IZVEWENIJ = "SELECT sostojanie_izvewenij FROM sostojanie_izvewenij sostojanie_izvewenij";
	private static final String _SQL_SELECT_SOSTOJANIE_IZVEWENIJ_WHERE_PKS_IN = "SELECT sostojanie_izvewenij FROM sostojanie_izvewenij sostojanie_izvewenij WHERE sostojanie_izvewenij_id IN (";
	private static final String _SQL_COUNT_SOSTOJANIE_IZVEWENIJ = "SELECT COUNT(sostojanie_izvewenij) FROM sostojanie_izvewenij sostojanie_izvewenij";
	private static final String _ORDER_BY_ENTITY_ALIAS = "sostojanie_izvewenij.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No sostojanie_izvewenij exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(sostojanie_izvewenijPersistenceImpl.class);
}
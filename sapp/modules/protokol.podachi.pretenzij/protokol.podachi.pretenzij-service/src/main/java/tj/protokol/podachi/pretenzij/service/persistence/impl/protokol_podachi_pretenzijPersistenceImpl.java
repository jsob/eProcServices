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

package tj.protokol.podachi.pretenzij.service.persistence.impl;

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

import tj.protokol.podachi.pretenzij.exception.NoSuchprotokol_podachi_pretenzijException;
import tj.protokol.podachi.pretenzij.model.impl.protokol_podachi_pretenzijImpl;
import tj.protokol.podachi.pretenzij.model.impl.protokol_podachi_pretenzijModelImpl;
import tj.protokol.podachi.pretenzij.model.protokol_podachi_pretenzij;
import tj.protokol.podachi.pretenzij.service.persistence.protokol_podachi_pretenzijPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the protokol_podachi_pretenzij service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see protokol_podachi_pretenzijPersistence
 * @see tj.protokol.podachi.pretenzij.service.persistence.protokol_podachi_pretenzijUtil
 * @generated
 */
@ProviderType
public class protokol_podachi_pretenzijPersistenceImpl
	extends BasePersistenceImpl<protokol_podachi_pretenzij>
	implements protokol_podachi_pretenzijPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link protokol_podachi_pretenzijUtil} to access the protokol_podachi_pretenzij persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = protokol_podachi_pretenzijImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(protokol_podachi_pretenzijModelImpl.ENTITY_CACHE_ENABLED,
			protokol_podachi_pretenzijModelImpl.FINDER_CACHE_ENABLED,
			protokol_podachi_pretenzijImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(protokol_podachi_pretenzijModelImpl.ENTITY_CACHE_ENABLED,
			protokol_podachi_pretenzijModelImpl.FINDER_CACHE_ENABLED,
			protokol_podachi_pretenzijImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(protokol_podachi_pretenzijModelImpl.ENTITY_CACHE_ENABLED,
			protokol_podachi_pretenzijModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	public protokol_podachi_pretenzijPersistenceImpl() {
		setModelClass(protokol_podachi_pretenzij.class);
	}

	/**
	 * Caches the protokol_podachi_pretenzij in the entity cache if it is enabled.
	 *
	 * @param protokol_podachi_pretenzij the protokol_podachi_pretenzij
	 */
	@Override
	public void cacheResult(
		protokol_podachi_pretenzij protokol_podachi_pretenzij) {
		entityCache.putResult(protokol_podachi_pretenzijModelImpl.ENTITY_CACHE_ENABLED,
			protokol_podachi_pretenzijImpl.class,
			protokol_podachi_pretenzij.getPrimaryKey(),
			protokol_podachi_pretenzij);

		protokol_podachi_pretenzij.resetOriginalValues();
	}

	/**
	 * Caches the protokol_podachi_pretenzijs in the entity cache if it is enabled.
	 *
	 * @param protokol_podachi_pretenzijs the protokol_podachi_pretenzijs
	 */
	@Override
	public void cacheResult(
		List<protokol_podachi_pretenzij> protokol_podachi_pretenzijs) {
		for (protokol_podachi_pretenzij protokol_podachi_pretenzij : protokol_podachi_pretenzijs) {
			if (entityCache.getResult(
						protokol_podachi_pretenzijModelImpl.ENTITY_CACHE_ENABLED,
						protokol_podachi_pretenzijImpl.class,
						protokol_podachi_pretenzij.getPrimaryKey()) == null) {
				cacheResult(protokol_podachi_pretenzij);
			}
			else {
				protokol_podachi_pretenzij.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all protokol_podachi_pretenzijs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(protokol_podachi_pretenzijImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the protokol_podachi_pretenzij.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		protokol_podachi_pretenzij protokol_podachi_pretenzij) {
		entityCache.removeResult(protokol_podachi_pretenzijModelImpl.ENTITY_CACHE_ENABLED,
			protokol_podachi_pretenzijImpl.class,
			protokol_podachi_pretenzij.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<protokol_podachi_pretenzij> protokol_podachi_pretenzijs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (protokol_podachi_pretenzij protokol_podachi_pretenzij : protokol_podachi_pretenzijs) {
			entityCache.removeResult(protokol_podachi_pretenzijModelImpl.ENTITY_CACHE_ENABLED,
				protokol_podachi_pretenzijImpl.class,
				protokol_podachi_pretenzij.getPrimaryKey());
		}
	}

	/**
	 * Creates a new protokol_podachi_pretenzij with the primary key. Does not add the protokol_podachi_pretenzij to the database.
	 *
	 * @param protokol_podachi_pretenzij_id the primary key for the new protokol_podachi_pretenzij
	 * @return the new protokol_podachi_pretenzij
	 */
	@Override
	public protokol_podachi_pretenzij create(long protokol_podachi_pretenzij_id) {
		protokol_podachi_pretenzij protokol_podachi_pretenzij = new protokol_podachi_pretenzijImpl();

		protokol_podachi_pretenzij.setNew(true);
		protokol_podachi_pretenzij.setPrimaryKey(protokol_podachi_pretenzij_id);

		return protokol_podachi_pretenzij;
	}

	/**
	 * Removes the protokol_podachi_pretenzij with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param protokol_podachi_pretenzij_id the primary key of the protokol_podachi_pretenzij
	 * @return the protokol_podachi_pretenzij that was removed
	 * @throws NoSuchprotokol_podachi_pretenzijException if a protokol_podachi_pretenzij with the primary key could not be found
	 */
	@Override
	public protokol_podachi_pretenzij remove(long protokol_podachi_pretenzij_id)
		throws NoSuchprotokol_podachi_pretenzijException {
		return remove((Serializable)protokol_podachi_pretenzij_id);
	}

	/**
	 * Removes the protokol_podachi_pretenzij with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the protokol_podachi_pretenzij
	 * @return the protokol_podachi_pretenzij that was removed
	 * @throws NoSuchprotokol_podachi_pretenzijException if a protokol_podachi_pretenzij with the primary key could not be found
	 */
	@Override
	public protokol_podachi_pretenzij remove(Serializable primaryKey)
		throws NoSuchprotokol_podachi_pretenzijException {
		Session session = null;

		try {
			session = openSession();

			protokol_podachi_pretenzij protokol_podachi_pretenzij = (protokol_podachi_pretenzij)session.get(protokol_podachi_pretenzijImpl.class,
					primaryKey);

			if (protokol_podachi_pretenzij == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchprotokol_podachi_pretenzijException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(protokol_podachi_pretenzij);
		}
		catch (NoSuchprotokol_podachi_pretenzijException nsee) {
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
	protected protokol_podachi_pretenzij removeImpl(
		protokol_podachi_pretenzij protokol_podachi_pretenzij) {
		protokol_podachi_pretenzij = toUnwrappedModel(protokol_podachi_pretenzij);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(protokol_podachi_pretenzij)) {
				protokol_podachi_pretenzij = (protokol_podachi_pretenzij)session.get(protokol_podachi_pretenzijImpl.class,
						protokol_podachi_pretenzij.getPrimaryKeyObj());
			}

			if (protokol_podachi_pretenzij != null) {
				session.delete(protokol_podachi_pretenzij);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (protokol_podachi_pretenzij != null) {
			clearCache(protokol_podachi_pretenzij);
		}

		return protokol_podachi_pretenzij;
	}

	@Override
	public protokol_podachi_pretenzij updateImpl(
		protokol_podachi_pretenzij protokol_podachi_pretenzij) {
		protokol_podachi_pretenzij = toUnwrappedModel(protokol_podachi_pretenzij);

		boolean isNew = protokol_podachi_pretenzij.isNew();

		Session session = null;

		try {
			session = openSession();

			if (protokol_podachi_pretenzij.isNew()) {
				session.save(protokol_podachi_pretenzij);

				protokol_podachi_pretenzij.setNew(false);
			}
			else {
				protokol_podachi_pretenzij = (protokol_podachi_pretenzij)session.merge(protokol_podachi_pretenzij);
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

		entityCache.putResult(protokol_podachi_pretenzijModelImpl.ENTITY_CACHE_ENABLED,
			protokol_podachi_pretenzijImpl.class,
			protokol_podachi_pretenzij.getPrimaryKey(),
			protokol_podachi_pretenzij, false);

		protokol_podachi_pretenzij.resetOriginalValues();

		return protokol_podachi_pretenzij;
	}

	protected protokol_podachi_pretenzij toUnwrappedModel(
		protokol_podachi_pretenzij protokol_podachi_pretenzij) {
		if (protokol_podachi_pretenzij instanceof protokol_podachi_pretenzijImpl) {
			return protokol_podachi_pretenzij;
		}

		protokol_podachi_pretenzijImpl protokol_podachi_pretenzijImpl = new protokol_podachi_pretenzijImpl();

		protokol_podachi_pretenzijImpl.setNew(protokol_podachi_pretenzij.isNew());
		protokol_podachi_pretenzijImpl.setPrimaryKey(protokol_podachi_pretenzij.getPrimaryKey());

		protokol_podachi_pretenzijImpl.setData_generacii(protokol_podachi_pretenzij.getData_generacii());
		protokol_podachi_pretenzijImpl.setIzvewenie_id(protokol_podachi_pretenzij.getIzvewenie_id());
		protokol_podachi_pretenzijImpl.setProtokol_podachi_pretenzij_id(protokol_podachi_pretenzij.getProtokol_podachi_pretenzij_id());
		protokol_podachi_pretenzijImpl.setSgeneriroval(protokol_podachi_pretenzij.getSgeneriroval());

		return protokol_podachi_pretenzijImpl;
	}

	/**
	 * Returns the protokol_podachi_pretenzij with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the protokol_podachi_pretenzij
	 * @return the protokol_podachi_pretenzij
	 * @throws NoSuchprotokol_podachi_pretenzijException if a protokol_podachi_pretenzij with the primary key could not be found
	 */
	@Override
	public protokol_podachi_pretenzij findByPrimaryKey(Serializable primaryKey)
		throws NoSuchprotokol_podachi_pretenzijException {
		protokol_podachi_pretenzij protokol_podachi_pretenzij = fetchByPrimaryKey(primaryKey);

		if (protokol_podachi_pretenzij == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchprotokol_podachi_pretenzijException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return protokol_podachi_pretenzij;
	}

	/**
	 * Returns the protokol_podachi_pretenzij with the primary key or throws a {@link NoSuchprotokol_podachi_pretenzijException} if it could not be found.
	 *
	 * @param protokol_podachi_pretenzij_id the primary key of the protokol_podachi_pretenzij
	 * @return the protokol_podachi_pretenzij
	 * @throws NoSuchprotokol_podachi_pretenzijException if a protokol_podachi_pretenzij with the primary key could not be found
	 */
	@Override
	public protokol_podachi_pretenzij findByPrimaryKey(
		long protokol_podachi_pretenzij_id)
		throws NoSuchprotokol_podachi_pretenzijException {
		return findByPrimaryKey((Serializable)protokol_podachi_pretenzij_id);
	}

	/**
	 * Returns the protokol_podachi_pretenzij with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the protokol_podachi_pretenzij
	 * @return the protokol_podachi_pretenzij, or <code>null</code> if a protokol_podachi_pretenzij with the primary key could not be found
	 */
	@Override
	public protokol_podachi_pretenzij fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(protokol_podachi_pretenzijModelImpl.ENTITY_CACHE_ENABLED,
				protokol_podachi_pretenzijImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		protokol_podachi_pretenzij protokol_podachi_pretenzij = (protokol_podachi_pretenzij)serializable;

		if (protokol_podachi_pretenzij == null) {
			Session session = null;

			try {
				session = openSession();

				protokol_podachi_pretenzij = (protokol_podachi_pretenzij)session.get(protokol_podachi_pretenzijImpl.class,
						primaryKey);

				if (protokol_podachi_pretenzij != null) {
					cacheResult(protokol_podachi_pretenzij);
				}
				else {
					entityCache.putResult(protokol_podachi_pretenzijModelImpl.ENTITY_CACHE_ENABLED,
						protokol_podachi_pretenzijImpl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(protokol_podachi_pretenzijModelImpl.ENTITY_CACHE_ENABLED,
					protokol_podachi_pretenzijImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return protokol_podachi_pretenzij;
	}

	/**
	 * Returns the protokol_podachi_pretenzij with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param protokol_podachi_pretenzij_id the primary key of the protokol_podachi_pretenzij
	 * @return the protokol_podachi_pretenzij, or <code>null</code> if a protokol_podachi_pretenzij with the primary key could not be found
	 */
	@Override
	public protokol_podachi_pretenzij fetchByPrimaryKey(
		long protokol_podachi_pretenzij_id) {
		return fetchByPrimaryKey((Serializable)protokol_podachi_pretenzij_id);
	}

	@Override
	public Map<Serializable, protokol_podachi_pretenzij> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, protokol_podachi_pretenzij> map = new HashMap<Serializable, protokol_podachi_pretenzij>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			protokol_podachi_pretenzij protokol_podachi_pretenzij = fetchByPrimaryKey(primaryKey);

			if (protokol_podachi_pretenzij != null) {
				map.put(primaryKey, protokol_podachi_pretenzij);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(protokol_podachi_pretenzijModelImpl.ENTITY_CACHE_ENABLED,
					protokol_podachi_pretenzijImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (protokol_podachi_pretenzij)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_PROTOKOL_PODACHI_PRETENZIJ_WHERE_PKS_IN);

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

			for (protokol_podachi_pretenzij protokol_podachi_pretenzij : (List<protokol_podachi_pretenzij>)q.list()) {
				map.put(protokol_podachi_pretenzij.getPrimaryKeyObj(),
					protokol_podachi_pretenzij);

				cacheResult(protokol_podachi_pretenzij);

				uncachedPrimaryKeys.remove(protokol_podachi_pretenzij.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(protokol_podachi_pretenzijModelImpl.ENTITY_CACHE_ENABLED,
					protokol_podachi_pretenzijImpl.class, primaryKey, nullModel);
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
	 * Returns all the protokol_podachi_pretenzijs.
	 *
	 * @return the protokol_podachi_pretenzijs
	 */
	@Override
	public List<protokol_podachi_pretenzij> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the protokol_podachi_pretenzijs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link protokol_podachi_pretenzijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of protokol_podachi_pretenzijs
	 * @param end the upper bound of the range of protokol_podachi_pretenzijs (not inclusive)
	 * @return the range of protokol_podachi_pretenzijs
	 */
	@Override
	public List<protokol_podachi_pretenzij> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the protokol_podachi_pretenzijs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link protokol_podachi_pretenzijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of protokol_podachi_pretenzijs
	 * @param end the upper bound of the range of protokol_podachi_pretenzijs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of protokol_podachi_pretenzijs
	 */
	@Override
	public List<protokol_podachi_pretenzij> findAll(int start, int end,
		OrderByComparator<protokol_podachi_pretenzij> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the protokol_podachi_pretenzijs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link protokol_podachi_pretenzijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of protokol_podachi_pretenzijs
	 * @param end the upper bound of the range of protokol_podachi_pretenzijs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of protokol_podachi_pretenzijs
	 */
	@Override
	public List<protokol_podachi_pretenzij> findAll(int start, int end,
		OrderByComparator<protokol_podachi_pretenzij> orderByComparator,
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

		List<protokol_podachi_pretenzij> list = null;

		if (retrieveFromCache) {
			list = (List<protokol_podachi_pretenzij>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_PROTOKOL_PODACHI_PRETENZIJ);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PROTOKOL_PODACHI_PRETENZIJ;

				if (pagination) {
					sql = sql.concat(protokol_podachi_pretenzijModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<protokol_podachi_pretenzij>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<protokol_podachi_pretenzij>)QueryUtil.list(q,
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
	 * Removes all the protokol_podachi_pretenzijs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (protokol_podachi_pretenzij protokol_podachi_pretenzij : findAll()) {
			remove(protokol_podachi_pretenzij);
		}
	}

	/**
	 * Returns the number of protokol_podachi_pretenzijs.
	 *
	 * @return the number of protokol_podachi_pretenzijs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_PROTOKOL_PODACHI_PRETENZIJ);

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
		return protokol_podachi_pretenzijModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the protokol_podachi_pretenzij persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(protokol_podachi_pretenzijImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_PROTOKOL_PODACHI_PRETENZIJ = "SELECT protokol_podachi_pretenzij FROM protokol_podachi_pretenzij protokol_podachi_pretenzij";
	private static final String _SQL_SELECT_PROTOKOL_PODACHI_PRETENZIJ_WHERE_PKS_IN =
		"SELECT protokol_podachi_pretenzij FROM protokol_podachi_pretenzij protokol_podachi_pretenzij WHERE protokol_podachi_pretenzij_id IN (";
	private static final String _SQL_COUNT_PROTOKOL_PODACHI_PRETENZIJ = "SELECT COUNT(protokol_podachi_pretenzij) FROM protokol_podachi_pretenzij protokol_podachi_pretenzij";
	private static final String _ORDER_BY_ENTITY_ALIAS = "protokol_podachi_pretenzij.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No protokol_podachi_pretenzij exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(protokol_podachi_pretenzijPersistenceImpl.class);
}
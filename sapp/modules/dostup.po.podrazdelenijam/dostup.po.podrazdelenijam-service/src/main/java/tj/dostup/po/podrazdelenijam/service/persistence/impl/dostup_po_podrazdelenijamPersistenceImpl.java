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

package tj.dostup.po.podrazdelenijam.service.persistence.impl;

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

import tj.dostup.po.podrazdelenijam.exception.NoSuchdostup_po_podrazdelenijamException;
import tj.dostup.po.podrazdelenijam.model.dostup_po_podrazdelenijam;
import tj.dostup.po.podrazdelenijam.model.impl.dostup_po_podrazdelenijamImpl;
import tj.dostup.po.podrazdelenijam.model.impl.dostup_po_podrazdelenijamModelImpl;
import tj.dostup.po.podrazdelenijam.service.persistence.dostup_po_podrazdelenijamPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the dostup_po_podrazdelenijam service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see dostup_po_podrazdelenijamPersistence
 * @see tj.dostup.po.podrazdelenijam.service.persistence.dostup_po_podrazdelenijamUtil
 * @generated
 */
@ProviderType
public class dostup_po_podrazdelenijamPersistenceImpl
	extends BasePersistenceImpl<dostup_po_podrazdelenijam>
	implements dostup_po_podrazdelenijamPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link dostup_po_podrazdelenijamUtil} to access the dostup_po_podrazdelenijam persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = dostup_po_podrazdelenijamImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(dostup_po_podrazdelenijamModelImpl.ENTITY_CACHE_ENABLED,
			dostup_po_podrazdelenijamModelImpl.FINDER_CACHE_ENABLED,
			dostup_po_podrazdelenijamImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(dostup_po_podrazdelenijamModelImpl.ENTITY_CACHE_ENABLED,
			dostup_po_podrazdelenijamModelImpl.FINDER_CACHE_ENABLED,
			dostup_po_podrazdelenijamImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(dostup_po_podrazdelenijamModelImpl.ENTITY_CACHE_ENABLED,
			dostup_po_podrazdelenijamModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	public dostup_po_podrazdelenijamPersistenceImpl() {
		setModelClass(dostup_po_podrazdelenijam.class);
	}

	/**
	 * Caches the dostup_po_podrazdelenijam in the entity cache if it is enabled.
	 *
	 * @param dostup_po_podrazdelenijam the dostup_po_podrazdelenijam
	 */
	@Override
	public void cacheResult(dostup_po_podrazdelenijam dostup_po_podrazdelenijam) {
		entityCache.putResult(dostup_po_podrazdelenijamModelImpl.ENTITY_CACHE_ENABLED,
			dostup_po_podrazdelenijamImpl.class,
			dostup_po_podrazdelenijam.getPrimaryKey(), dostup_po_podrazdelenijam);

		dostup_po_podrazdelenijam.resetOriginalValues();
	}

	/**
	 * Caches the dostup_po_podrazdelenijams in the entity cache if it is enabled.
	 *
	 * @param dostup_po_podrazdelenijams the dostup_po_podrazdelenijams
	 */
	@Override
	public void cacheResult(
		List<dostup_po_podrazdelenijam> dostup_po_podrazdelenijams) {
		for (dostup_po_podrazdelenijam dostup_po_podrazdelenijam : dostup_po_podrazdelenijams) {
			if (entityCache.getResult(
						dostup_po_podrazdelenijamModelImpl.ENTITY_CACHE_ENABLED,
						dostup_po_podrazdelenijamImpl.class,
						dostup_po_podrazdelenijam.getPrimaryKey()) == null) {
				cacheResult(dostup_po_podrazdelenijam);
			}
			else {
				dostup_po_podrazdelenijam.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dostup_po_podrazdelenijams.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(dostup_po_podrazdelenijamImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dostup_po_podrazdelenijam.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(dostup_po_podrazdelenijam dostup_po_podrazdelenijam) {
		entityCache.removeResult(dostup_po_podrazdelenijamModelImpl.ENTITY_CACHE_ENABLED,
			dostup_po_podrazdelenijamImpl.class,
			dostup_po_podrazdelenijam.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<dostup_po_podrazdelenijam> dostup_po_podrazdelenijams) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (dostup_po_podrazdelenijam dostup_po_podrazdelenijam : dostup_po_podrazdelenijams) {
			entityCache.removeResult(dostup_po_podrazdelenijamModelImpl.ENTITY_CACHE_ENABLED,
				dostup_po_podrazdelenijamImpl.class,
				dostup_po_podrazdelenijam.getPrimaryKey());
		}
	}

	/**
	 * Creates a new dostup_po_podrazdelenijam with the primary key. Does not add the dostup_po_podrazdelenijam to the database.
	 *
	 * @param dostup_po_podrazdelenijam_id the primary key for the new dostup_po_podrazdelenijam
	 * @return the new dostup_po_podrazdelenijam
	 */
	@Override
	public dostup_po_podrazdelenijam create(long dostup_po_podrazdelenijam_id) {
		dostup_po_podrazdelenijam dostup_po_podrazdelenijam = new dostup_po_podrazdelenijamImpl();

		dostup_po_podrazdelenijam.setNew(true);
		dostup_po_podrazdelenijam.setPrimaryKey(dostup_po_podrazdelenijam_id);

		return dostup_po_podrazdelenijam;
	}

	/**
	 * Removes the dostup_po_podrazdelenijam with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dostup_po_podrazdelenijam_id the primary key of the dostup_po_podrazdelenijam
	 * @return the dostup_po_podrazdelenijam that was removed
	 * @throws NoSuchdostup_po_podrazdelenijamException if a dostup_po_podrazdelenijam with the primary key could not be found
	 */
	@Override
	public dostup_po_podrazdelenijam remove(long dostup_po_podrazdelenijam_id)
		throws NoSuchdostup_po_podrazdelenijamException {
		return remove((Serializable)dostup_po_podrazdelenijam_id);
	}

	/**
	 * Removes the dostup_po_podrazdelenijam with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dostup_po_podrazdelenijam
	 * @return the dostup_po_podrazdelenijam that was removed
	 * @throws NoSuchdostup_po_podrazdelenijamException if a dostup_po_podrazdelenijam with the primary key could not be found
	 */
	@Override
	public dostup_po_podrazdelenijam remove(Serializable primaryKey)
		throws NoSuchdostup_po_podrazdelenijamException {
		Session session = null;

		try {
			session = openSession();

			dostup_po_podrazdelenijam dostup_po_podrazdelenijam = (dostup_po_podrazdelenijam)session.get(dostup_po_podrazdelenijamImpl.class,
					primaryKey);

			if (dostup_po_podrazdelenijam == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchdostup_po_podrazdelenijamException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dostup_po_podrazdelenijam);
		}
		catch (NoSuchdostup_po_podrazdelenijamException nsee) {
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
	protected dostup_po_podrazdelenijam removeImpl(
		dostup_po_podrazdelenijam dostup_po_podrazdelenijam) {
		dostup_po_podrazdelenijam = toUnwrappedModel(dostup_po_podrazdelenijam);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dostup_po_podrazdelenijam)) {
				dostup_po_podrazdelenijam = (dostup_po_podrazdelenijam)session.get(dostup_po_podrazdelenijamImpl.class,
						dostup_po_podrazdelenijam.getPrimaryKeyObj());
			}

			if (dostup_po_podrazdelenijam != null) {
				session.delete(dostup_po_podrazdelenijam);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dostup_po_podrazdelenijam != null) {
			clearCache(dostup_po_podrazdelenijam);
		}

		return dostup_po_podrazdelenijam;
	}

	@Override
	public dostup_po_podrazdelenijam updateImpl(
		dostup_po_podrazdelenijam dostup_po_podrazdelenijam) {
		dostup_po_podrazdelenijam = toUnwrappedModel(dostup_po_podrazdelenijam);

		boolean isNew = dostup_po_podrazdelenijam.isNew();

		Session session = null;

		try {
			session = openSession();

			if (dostup_po_podrazdelenijam.isNew()) {
				session.save(dostup_po_podrazdelenijam);

				dostup_po_podrazdelenijam.setNew(false);
			}
			else {
				dostup_po_podrazdelenijam = (dostup_po_podrazdelenijam)session.merge(dostup_po_podrazdelenijam);
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

		entityCache.putResult(dostup_po_podrazdelenijamModelImpl.ENTITY_CACHE_ENABLED,
			dostup_po_podrazdelenijamImpl.class,
			dostup_po_podrazdelenijam.getPrimaryKey(),
			dostup_po_podrazdelenijam, false);

		dostup_po_podrazdelenijam.resetOriginalValues();

		return dostup_po_podrazdelenijam;
	}

	protected dostup_po_podrazdelenijam toUnwrappedModel(
		dostup_po_podrazdelenijam dostup_po_podrazdelenijam) {
		if (dostup_po_podrazdelenijam instanceof dostup_po_podrazdelenijamImpl) {
			return dostup_po_podrazdelenijam;
		}

		dostup_po_podrazdelenijamImpl dostup_po_podrazdelenijamImpl = new dostup_po_podrazdelenijamImpl();

		dostup_po_podrazdelenijamImpl.setNew(dostup_po_podrazdelenijam.isNew());
		dostup_po_podrazdelenijamImpl.setPrimaryKey(dostup_po_podrazdelenijam.getPrimaryKey());

		dostup_po_podrazdelenijamImpl.setData_izmenenija(dostup_po_podrazdelenijam.getData_izmenenija());
		dostup_po_podrazdelenijamImpl.setData_sozdanija(dostup_po_podrazdelenijam.getData_sozdanija());
		dostup_po_podrazdelenijamImpl.setDostup_po_podrazdelenijam_id(dostup_po_podrazdelenijam.getDostup_po_podrazdelenijam_id());
		dostup_po_podrazdelenijamImpl.setIzmenil(dostup_po_podrazdelenijam.getIzmenil());
		dostup_po_podrazdelenijamImpl.setPodrazdelenija_id(dostup_po_podrazdelenijam.getPodrazdelenija_id());
		dostup_po_podrazdelenijamImpl.setPolzovateli_id(dostup_po_podrazdelenijam.getPolzovateli_id());
		dostup_po_podrazdelenijamImpl.setSozdal(dostup_po_podrazdelenijam.getSozdal());

		return dostup_po_podrazdelenijamImpl;
	}

	/**
	 * Returns the dostup_po_podrazdelenijam with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dostup_po_podrazdelenijam
	 * @return the dostup_po_podrazdelenijam
	 * @throws NoSuchdostup_po_podrazdelenijamException if a dostup_po_podrazdelenijam with the primary key could not be found
	 */
	@Override
	public dostup_po_podrazdelenijam findByPrimaryKey(Serializable primaryKey)
		throws NoSuchdostup_po_podrazdelenijamException {
		dostup_po_podrazdelenijam dostup_po_podrazdelenijam = fetchByPrimaryKey(primaryKey);

		if (dostup_po_podrazdelenijam == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchdostup_po_podrazdelenijamException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dostup_po_podrazdelenijam;
	}

	/**
	 * Returns the dostup_po_podrazdelenijam with the primary key or throws a {@link NoSuchdostup_po_podrazdelenijamException} if it could not be found.
	 *
	 * @param dostup_po_podrazdelenijam_id the primary key of the dostup_po_podrazdelenijam
	 * @return the dostup_po_podrazdelenijam
	 * @throws NoSuchdostup_po_podrazdelenijamException if a dostup_po_podrazdelenijam with the primary key could not be found
	 */
	@Override
	public dostup_po_podrazdelenijam findByPrimaryKey(
		long dostup_po_podrazdelenijam_id)
		throws NoSuchdostup_po_podrazdelenijamException {
		return findByPrimaryKey((Serializable)dostup_po_podrazdelenijam_id);
	}

	/**
	 * Returns the dostup_po_podrazdelenijam with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dostup_po_podrazdelenijam
	 * @return the dostup_po_podrazdelenijam, or <code>null</code> if a dostup_po_podrazdelenijam with the primary key could not be found
	 */
	@Override
	public dostup_po_podrazdelenijam fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(dostup_po_podrazdelenijamModelImpl.ENTITY_CACHE_ENABLED,
				dostup_po_podrazdelenijamImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		dostup_po_podrazdelenijam dostup_po_podrazdelenijam = (dostup_po_podrazdelenijam)serializable;

		if (dostup_po_podrazdelenijam == null) {
			Session session = null;

			try {
				session = openSession();

				dostup_po_podrazdelenijam = (dostup_po_podrazdelenijam)session.get(dostup_po_podrazdelenijamImpl.class,
						primaryKey);

				if (dostup_po_podrazdelenijam != null) {
					cacheResult(dostup_po_podrazdelenijam);
				}
				else {
					entityCache.putResult(dostup_po_podrazdelenijamModelImpl.ENTITY_CACHE_ENABLED,
						dostup_po_podrazdelenijamImpl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(dostup_po_podrazdelenijamModelImpl.ENTITY_CACHE_ENABLED,
					dostup_po_podrazdelenijamImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dostup_po_podrazdelenijam;
	}

	/**
	 * Returns the dostup_po_podrazdelenijam with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param dostup_po_podrazdelenijam_id the primary key of the dostup_po_podrazdelenijam
	 * @return the dostup_po_podrazdelenijam, or <code>null</code> if a dostup_po_podrazdelenijam with the primary key could not be found
	 */
	@Override
	public dostup_po_podrazdelenijam fetchByPrimaryKey(
		long dostup_po_podrazdelenijam_id) {
		return fetchByPrimaryKey((Serializable)dostup_po_podrazdelenijam_id);
	}

	@Override
	public Map<Serializable, dostup_po_podrazdelenijam> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, dostup_po_podrazdelenijam> map = new HashMap<Serializable, dostup_po_podrazdelenijam>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			dostup_po_podrazdelenijam dostup_po_podrazdelenijam = fetchByPrimaryKey(primaryKey);

			if (dostup_po_podrazdelenijam != null) {
				map.put(primaryKey, dostup_po_podrazdelenijam);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(dostup_po_podrazdelenijamModelImpl.ENTITY_CACHE_ENABLED,
					dostup_po_podrazdelenijamImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (dostup_po_podrazdelenijam)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_DOSTUP_PO_PODRAZDELENIJAM_WHERE_PKS_IN);

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

			for (dostup_po_podrazdelenijam dostup_po_podrazdelenijam : (List<dostup_po_podrazdelenijam>)q.list()) {
				map.put(dostup_po_podrazdelenijam.getPrimaryKeyObj(),
					dostup_po_podrazdelenijam);

				cacheResult(dostup_po_podrazdelenijam);

				uncachedPrimaryKeys.remove(dostup_po_podrazdelenijam.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(dostup_po_podrazdelenijamModelImpl.ENTITY_CACHE_ENABLED,
					dostup_po_podrazdelenijamImpl.class, primaryKey, nullModel);
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
	 * Returns all the dostup_po_podrazdelenijams.
	 *
	 * @return the dostup_po_podrazdelenijams
	 */
	@Override
	public List<dostup_po_podrazdelenijam> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dostup_po_podrazdelenijams.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link dostup_po_podrazdelenijamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dostup_po_podrazdelenijams
	 * @param end the upper bound of the range of dostup_po_podrazdelenijams (not inclusive)
	 * @return the range of dostup_po_podrazdelenijams
	 */
	@Override
	public List<dostup_po_podrazdelenijam> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dostup_po_podrazdelenijams.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link dostup_po_podrazdelenijamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dostup_po_podrazdelenijams
	 * @param end the upper bound of the range of dostup_po_podrazdelenijams (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dostup_po_podrazdelenijams
	 */
	@Override
	public List<dostup_po_podrazdelenijam> findAll(int start, int end,
		OrderByComparator<dostup_po_podrazdelenijam> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the dostup_po_podrazdelenijams.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link dostup_po_podrazdelenijamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dostup_po_podrazdelenijams
	 * @param end the upper bound of the range of dostup_po_podrazdelenijams (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of dostup_po_podrazdelenijams
	 */
	@Override
	public List<dostup_po_podrazdelenijam> findAll(int start, int end,
		OrderByComparator<dostup_po_podrazdelenijam> orderByComparator,
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

		List<dostup_po_podrazdelenijam> list = null;

		if (retrieveFromCache) {
			list = (List<dostup_po_podrazdelenijam>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_DOSTUP_PO_PODRAZDELENIJAM);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DOSTUP_PO_PODRAZDELENIJAM;

				if (pagination) {
					sql = sql.concat(dostup_po_podrazdelenijamModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<dostup_po_podrazdelenijam>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<dostup_po_podrazdelenijam>)QueryUtil.list(q,
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
	 * Removes all the dostup_po_podrazdelenijams from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (dostup_po_podrazdelenijam dostup_po_podrazdelenijam : findAll()) {
			remove(dostup_po_podrazdelenijam);
		}
	}

	/**
	 * Returns the number of dostup_po_podrazdelenijams.
	 *
	 * @return the number of dostup_po_podrazdelenijams
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DOSTUP_PO_PODRAZDELENIJAM);

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
		return dostup_po_podrazdelenijamModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the dostup_po_podrazdelenijam persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(dostup_po_podrazdelenijamImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_DOSTUP_PO_PODRAZDELENIJAM = "SELECT dostup_po_podrazdelenijam FROM dostup_po_podrazdelenijam dostup_po_podrazdelenijam";
	private static final String _SQL_SELECT_DOSTUP_PO_PODRAZDELENIJAM_WHERE_PKS_IN =
		"SELECT dostup_po_podrazdelenijam FROM dostup_po_podrazdelenijam dostup_po_podrazdelenijam WHERE dostup_po_podrazdelenijam_id IN (";
	private static final String _SQL_COUNT_DOSTUP_PO_PODRAZDELENIJAM = "SELECT COUNT(dostup_po_podrazdelenijam) FROM dostup_po_podrazdelenijam dostup_po_podrazdelenijam";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dostup_po_podrazdelenijam.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No dostup_po_podrazdelenijam exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(dostup_po_podrazdelenijamPersistenceImpl.class);
}
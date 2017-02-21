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

package tj.reestr.kontraktov.service.persistence.impl;

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

import tj.reestr.kontraktov.exception.NoSuchreestr_kontraktovException;
import tj.reestr.kontraktov.model.impl.reestr_kontraktovImpl;
import tj.reestr.kontraktov.model.impl.reestr_kontraktovModelImpl;
import tj.reestr.kontraktov.model.reestr_kontraktov;
import tj.reestr.kontraktov.service.persistence.reestr_kontraktovPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the reestr_kontraktov service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see reestr_kontraktovPersistence
 * @see tj.reestr.kontraktov.service.persistence.reestr_kontraktovUtil
 * @generated
 */
@ProviderType
public class reestr_kontraktovPersistenceImpl extends BasePersistenceImpl<reestr_kontraktov>
	implements reestr_kontraktovPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link reestr_kontraktovUtil} to access the reestr_kontraktov persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = reestr_kontraktovImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(reestr_kontraktovModelImpl.ENTITY_CACHE_ENABLED,
			reestr_kontraktovModelImpl.FINDER_CACHE_ENABLED,
			reestr_kontraktovImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(reestr_kontraktovModelImpl.ENTITY_CACHE_ENABLED,
			reestr_kontraktovModelImpl.FINDER_CACHE_ENABLED,
			reestr_kontraktovImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(reestr_kontraktovModelImpl.ENTITY_CACHE_ENABLED,
			reestr_kontraktovModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public reestr_kontraktovPersistenceImpl() {
		setModelClass(reestr_kontraktov.class);
	}

	/**
	 * Caches the reestr_kontraktov in the entity cache if it is enabled.
	 *
	 * @param reestr_kontraktov the reestr_kontraktov
	 */
	@Override
	public void cacheResult(reestr_kontraktov reestr_kontraktov) {
		entityCache.putResult(reestr_kontraktovModelImpl.ENTITY_CACHE_ENABLED,
			reestr_kontraktovImpl.class, reestr_kontraktov.getPrimaryKey(),
			reestr_kontraktov);

		reestr_kontraktov.resetOriginalValues();
	}

	/**
	 * Caches the reestr_kontraktovs in the entity cache if it is enabled.
	 *
	 * @param reestr_kontraktovs the reestr_kontraktovs
	 */
	@Override
	public void cacheResult(List<reestr_kontraktov> reestr_kontraktovs) {
		for (reestr_kontraktov reestr_kontraktov : reestr_kontraktovs) {
			if (entityCache.getResult(
						reestr_kontraktovModelImpl.ENTITY_CACHE_ENABLED,
						reestr_kontraktovImpl.class,
						reestr_kontraktov.getPrimaryKey()) == null) {
				cacheResult(reestr_kontraktov);
			}
			else {
				reestr_kontraktov.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all reestr_kontraktovs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(reestr_kontraktovImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the reestr_kontraktov.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(reestr_kontraktov reestr_kontraktov) {
		entityCache.removeResult(reestr_kontraktovModelImpl.ENTITY_CACHE_ENABLED,
			reestr_kontraktovImpl.class, reestr_kontraktov.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<reestr_kontraktov> reestr_kontraktovs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (reestr_kontraktov reestr_kontraktov : reestr_kontraktovs) {
			entityCache.removeResult(reestr_kontraktovModelImpl.ENTITY_CACHE_ENABLED,
				reestr_kontraktovImpl.class, reestr_kontraktov.getPrimaryKey());
		}
	}

	/**
	 * Creates a new reestr_kontraktov with the primary key. Does not add the reestr_kontraktov to the database.
	 *
	 * @param reestr_kontraktov_id the primary key for the new reestr_kontraktov
	 * @return the new reestr_kontraktov
	 */
	@Override
	public reestr_kontraktov create(String reestr_kontraktov_id) {
		reestr_kontraktov reestr_kontraktov = new reestr_kontraktovImpl();

		reestr_kontraktov.setNew(true);
		reestr_kontraktov.setPrimaryKey(reestr_kontraktov_id);

		return reestr_kontraktov;
	}

	/**
	 * Removes the reestr_kontraktov with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param reestr_kontraktov_id the primary key of the reestr_kontraktov
	 * @return the reestr_kontraktov that was removed
	 * @throws NoSuchreestr_kontraktovException if a reestr_kontraktov with the primary key could not be found
	 */
	@Override
	public reestr_kontraktov remove(String reestr_kontraktov_id)
		throws NoSuchreestr_kontraktovException {
		return remove((Serializable)reestr_kontraktov_id);
	}

	/**
	 * Removes the reestr_kontraktov with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the reestr_kontraktov
	 * @return the reestr_kontraktov that was removed
	 * @throws NoSuchreestr_kontraktovException if a reestr_kontraktov with the primary key could not be found
	 */
	@Override
	public reestr_kontraktov remove(Serializable primaryKey)
		throws NoSuchreestr_kontraktovException {
		Session session = null;

		try {
			session = openSession();

			reestr_kontraktov reestr_kontraktov = (reestr_kontraktov)session.get(reestr_kontraktovImpl.class,
					primaryKey);

			if (reestr_kontraktov == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchreestr_kontraktovException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(reestr_kontraktov);
		}
		catch (NoSuchreestr_kontraktovException nsee) {
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
	protected reestr_kontraktov removeImpl(reestr_kontraktov reestr_kontraktov) {
		reestr_kontraktov = toUnwrappedModel(reestr_kontraktov);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(reestr_kontraktov)) {
				reestr_kontraktov = (reestr_kontraktov)session.get(reestr_kontraktovImpl.class,
						reestr_kontraktov.getPrimaryKeyObj());
			}

			if (reestr_kontraktov != null) {
				session.delete(reestr_kontraktov);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (reestr_kontraktov != null) {
			clearCache(reestr_kontraktov);
		}

		return reestr_kontraktov;
	}

	@Override
	public reestr_kontraktov updateImpl(reestr_kontraktov reestr_kontraktov) {
		reestr_kontraktov = toUnwrappedModel(reestr_kontraktov);

		boolean isNew = reestr_kontraktov.isNew();

		Session session = null;

		try {
			session = openSession();

			if (reestr_kontraktov.isNew()) {
				session.save(reestr_kontraktov);

				reestr_kontraktov.setNew(false);
			}
			else {
				reestr_kontraktov = (reestr_kontraktov)session.merge(reestr_kontraktov);
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

		entityCache.putResult(reestr_kontraktovModelImpl.ENTITY_CACHE_ENABLED,
			reestr_kontraktovImpl.class, reestr_kontraktov.getPrimaryKey(),
			reestr_kontraktov, false);

		reestr_kontraktov.resetOriginalValues();

		return reestr_kontraktov;
	}

	protected reestr_kontraktov toUnwrappedModel(
		reestr_kontraktov reestr_kontraktov) {
		if (reestr_kontraktov instanceof reestr_kontraktovImpl) {
			return reestr_kontraktov;
		}

		reestr_kontraktovImpl reestr_kontraktovImpl = new reestr_kontraktovImpl();

		reestr_kontraktovImpl.setNew(reestr_kontraktov.isNew());
		reestr_kontraktovImpl.setPrimaryKey(reestr_kontraktov.getPrimaryKey());

		reestr_kontraktovImpl.setData_kontrakta(reestr_kontraktov.getData_kontrakta());
		reestr_kontraktovImpl.setData_sozdanija(reestr_kontraktov.getData_sozdanija());
		reestr_kontraktovImpl.setIzvewenie_id(reestr_kontraktov.getIzvewenie_id());
		reestr_kontraktovImpl.setLot_id(reestr_kontraktov.getLot_id());
		reestr_kontraktovImpl.setPostavwik_id(reestr_kontraktov.getPostavwik_id());
		reestr_kontraktovImpl.setReestr_kontraktov_id(reestr_kontraktov.getReestr_kontraktov_id());
		reestr_kontraktovImpl.setSozdal(reestr_kontraktov.getSozdal());

		return reestr_kontraktovImpl;
	}

	/**
	 * Returns the reestr_kontraktov with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the reestr_kontraktov
	 * @return the reestr_kontraktov
	 * @throws NoSuchreestr_kontraktovException if a reestr_kontraktov with the primary key could not be found
	 */
	@Override
	public reestr_kontraktov findByPrimaryKey(Serializable primaryKey)
		throws NoSuchreestr_kontraktovException {
		reestr_kontraktov reestr_kontraktov = fetchByPrimaryKey(primaryKey);

		if (reestr_kontraktov == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchreestr_kontraktovException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return reestr_kontraktov;
	}

	/**
	 * Returns the reestr_kontraktov with the primary key or throws a {@link NoSuchreestr_kontraktovException} if it could not be found.
	 *
	 * @param reestr_kontraktov_id the primary key of the reestr_kontraktov
	 * @return the reestr_kontraktov
	 * @throws NoSuchreestr_kontraktovException if a reestr_kontraktov with the primary key could not be found
	 */
	@Override
	public reestr_kontraktov findByPrimaryKey(String reestr_kontraktov_id)
		throws NoSuchreestr_kontraktovException {
		return findByPrimaryKey((Serializable)reestr_kontraktov_id);
	}

	/**
	 * Returns the reestr_kontraktov with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the reestr_kontraktov
	 * @return the reestr_kontraktov, or <code>null</code> if a reestr_kontraktov with the primary key could not be found
	 */
	@Override
	public reestr_kontraktov fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(reestr_kontraktovModelImpl.ENTITY_CACHE_ENABLED,
				reestr_kontraktovImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		reestr_kontraktov reestr_kontraktov = (reestr_kontraktov)serializable;

		if (reestr_kontraktov == null) {
			Session session = null;

			try {
				session = openSession();

				reestr_kontraktov = (reestr_kontraktov)session.get(reestr_kontraktovImpl.class,
						primaryKey);

				if (reestr_kontraktov != null) {
					cacheResult(reestr_kontraktov);
				}
				else {
					entityCache.putResult(reestr_kontraktovModelImpl.ENTITY_CACHE_ENABLED,
						reestr_kontraktovImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(reestr_kontraktovModelImpl.ENTITY_CACHE_ENABLED,
					reestr_kontraktovImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return reestr_kontraktov;
	}

	/**
	 * Returns the reestr_kontraktov with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param reestr_kontraktov_id the primary key of the reestr_kontraktov
	 * @return the reestr_kontraktov, or <code>null</code> if a reestr_kontraktov with the primary key could not be found
	 */
	@Override
	public reestr_kontraktov fetchByPrimaryKey(String reestr_kontraktov_id) {
		return fetchByPrimaryKey((Serializable)reestr_kontraktov_id);
	}

	@Override
	public Map<Serializable, reestr_kontraktov> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, reestr_kontraktov> map = new HashMap<Serializable, reestr_kontraktov>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			reestr_kontraktov reestr_kontraktov = fetchByPrimaryKey(primaryKey);

			if (reestr_kontraktov != null) {
				map.put(primaryKey, reestr_kontraktov);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(reestr_kontraktovModelImpl.ENTITY_CACHE_ENABLED,
					reestr_kontraktovImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (reestr_kontraktov)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 4) +
				1);

		query.append(_SQL_SELECT_REESTR_KONTRAKTOV_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append(StringPool.APOSTROPHE);
			query.append((String)primaryKey);
			query.append(StringPool.APOSTROPHE);

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (reestr_kontraktov reestr_kontraktov : (List<reestr_kontraktov>)q.list()) {
				map.put(reestr_kontraktov.getPrimaryKeyObj(), reestr_kontraktov);

				cacheResult(reestr_kontraktov);

				uncachedPrimaryKeys.remove(reestr_kontraktov.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(reestr_kontraktovModelImpl.ENTITY_CACHE_ENABLED,
					reestr_kontraktovImpl.class, primaryKey, nullModel);
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
	 * Returns all the reestr_kontraktovs.
	 *
	 * @return the reestr_kontraktovs
	 */
	@Override
	public List<reestr_kontraktov> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the reestr_kontraktovs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link reestr_kontraktovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of reestr_kontraktovs
	 * @param end the upper bound of the range of reestr_kontraktovs (not inclusive)
	 * @return the range of reestr_kontraktovs
	 */
	@Override
	public List<reestr_kontraktov> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the reestr_kontraktovs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link reestr_kontraktovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of reestr_kontraktovs
	 * @param end the upper bound of the range of reestr_kontraktovs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of reestr_kontraktovs
	 */
	@Override
	public List<reestr_kontraktov> findAll(int start, int end,
		OrderByComparator<reestr_kontraktov> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the reestr_kontraktovs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link reestr_kontraktovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of reestr_kontraktovs
	 * @param end the upper bound of the range of reestr_kontraktovs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of reestr_kontraktovs
	 */
	@Override
	public List<reestr_kontraktov> findAll(int start, int end,
		OrderByComparator<reestr_kontraktov> orderByComparator,
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

		List<reestr_kontraktov> list = null;

		if (retrieveFromCache) {
			list = (List<reestr_kontraktov>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_REESTR_KONTRAKTOV);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_REESTR_KONTRAKTOV;

				if (pagination) {
					sql = sql.concat(reestr_kontraktovModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<reestr_kontraktov>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<reestr_kontraktov>)QueryUtil.list(q,
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
	 * Removes all the reestr_kontraktovs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (reestr_kontraktov reestr_kontraktov : findAll()) {
			remove(reestr_kontraktov);
		}
	}

	/**
	 * Returns the number of reestr_kontraktovs.
	 *
	 * @return the number of reestr_kontraktovs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_REESTR_KONTRAKTOV);

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
		return reestr_kontraktovModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the reestr_kontraktov persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(reestr_kontraktovImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_REESTR_KONTRAKTOV = "SELECT reestr_kontraktov FROM reestr_kontraktov reestr_kontraktov";
	private static final String _SQL_SELECT_REESTR_KONTRAKTOV_WHERE_PKS_IN = "SELECT reestr_kontraktov FROM reestr_kontraktov reestr_kontraktov WHERE reestr_kontraktov_id IN (";
	private static final String _SQL_COUNT_REESTR_KONTRAKTOV = "SELECT COUNT(reestr_kontraktov) FROM reestr_kontraktov reestr_kontraktov";
	private static final String _ORDER_BY_ENTITY_ALIAS = "reestr_kontraktov.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No reestr_kontraktov exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(reestr_kontraktovPersistenceImpl.class);
}
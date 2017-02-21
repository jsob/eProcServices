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

package tj.protokol.vskrytija.service.persistence.impl;

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

import tj.protokol.vskrytija.exception.NoSuchprotokol_vskrytijaException;
import tj.protokol.vskrytija.model.impl.protokol_vskrytijaImpl;
import tj.protokol.vskrytija.model.impl.protokol_vskrytijaModelImpl;
import tj.protokol.vskrytija.model.protokol_vskrytija;
import tj.protokol.vskrytija.service.persistence.protokol_vskrytijaPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the protokol_vskrytija service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see protokol_vskrytijaPersistence
 * @see tj.protokol.vskrytija.service.persistence.protokol_vskrytijaUtil
 * @generated
 */
@ProviderType
public class protokol_vskrytijaPersistenceImpl extends BasePersistenceImpl<protokol_vskrytija>
	implements protokol_vskrytijaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link protokol_vskrytijaUtil} to access the protokol_vskrytija persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = protokol_vskrytijaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(protokol_vskrytijaModelImpl.ENTITY_CACHE_ENABLED,
			protokol_vskrytijaModelImpl.FINDER_CACHE_ENABLED,
			protokol_vskrytijaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(protokol_vskrytijaModelImpl.ENTITY_CACHE_ENABLED,
			protokol_vskrytijaModelImpl.FINDER_CACHE_ENABLED,
			protokol_vskrytijaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(protokol_vskrytijaModelImpl.ENTITY_CACHE_ENABLED,
			protokol_vskrytijaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public protokol_vskrytijaPersistenceImpl() {
		setModelClass(protokol_vskrytija.class);
	}

	/**
	 * Caches the protokol_vskrytija in the entity cache if it is enabled.
	 *
	 * @param protokol_vskrytija the protokol_vskrytija
	 */
	@Override
	public void cacheResult(protokol_vskrytija protokol_vskrytija) {
		entityCache.putResult(protokol_vskrytijaModelImpl.ENTITY_CACHE_ENABLED,
			protokol_vskrytijaImpl.class, protokol_vskrytija.getPrimaryKey(),
			protokol_vskrytija);

		protokol_vskrytija.resetOriginalValues();
	}

	/**
	 * Caches the protokol_vskrytijas in the entity cache if it is enabled.
	 *
	 * @param protokol_vskrytijas the protokol_vskrytijas
	 */
	@Override
	public void cacheResult(List<protokol_vskrytija> protokol_vskrytijas) {
		for (protokol_vskrytija protokol_vskrytija : protokol_vskrytijas) {
			if (entityCache.getResult(
						protokol_vskrytijaModelImpl.ENTITY_CACHE_ENABLED,
						protokol_vskrytijaImpl.class,
						protokol_vskrytija.getPrimaryKey()) == null) {
				cacheResult(protokol_vskrytija);
			}
			else {
				protokol_vskrytija.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all protokol_vskrytijas.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(protokol_vskrytijaImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the protokol_vskrytija.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(protokol_vskrytija protokol_vskrytija) {
		entityCache.removeResult(protokol_vskrytijaModelImpl.ENTITY_CACHE_ENABLED,
			protokol_vskrytijaImpl.class, protokol_vskrytija.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<protokol_vskrytija> protokol_vskrytijas) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (protokol_vskrytija protokol_vskrytija : protokol_vskrytijas) {
			entityCache.removeResult(protokol_vskrytijaModelImpl.ENTITY_CACHE_ENABLED,
				protokol_vskrytijaImpl.class, protokol_vskrytija.getPrimaryKey());
		}
	}

	/**
	 * Creates a new protokol_vskrytija with the primary key. Does not add the protokol_vskrytija to the database.
	 *
	 * @param protokol_vskrytija_id the primary key for the new protokol_vskrytija
	 * @return the new protokol_vskrytija
	 */
	@Override
	public protokol_vskrytija create(long protokol_vskrytija_id) {
		protokol_vskrytija protokol_vskrytija = new protokol_vskrytijaImpl();

		protokol_vskrytija.setNew(true);
		protokol_vskrytija.setPrimaryKey(protokol_vskrytija_id);

		return protokol_vskrytija;
	}

	/**
	 * Removes the protokol_vskrytija with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param protokol_vskrytija_id the primary key of the protokol_vskrytija
	 * @return the protokol_vskrytija that was removed
	 * @throws NoSuchprotokol_vskrytijaException if a protokol_vskrytija with the primary key could not be found
	 */
	@Override
	public protokol_vskrytija remove(long protokol_vskrytija_id)
		throws NoSuchprotokol_vskrytijaException {
		return remove((Serializable)protokol_vskrytija_id);
	}

	/**
	 * Removes the protokol_vskrytija with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the protokol_vskrytija
	 * @return the protokol_vskrytija that was removed
	 * @throws NoSuchprotokol_vskrytijaException if a protokol_vskrytija with the primary key could not be found
	 */
	@Override
	public protokol_vskrytija remove(Serializable primaryKey)
		throws NoSuchprotokol_vskrytijaException {
		Session session = null;

		try {
			session = openSession();

			protokol_vskrytija protokol_vskrytija = (protokol_vskrytija)session.get(protokol_vskrytijaImpl.class,
					primaryKey);

			if (protokol_vskrytija == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchprotokol_vskrytijaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(protokol_vskrytija);
		}
		catch (NoSuchprotokol_vskrytijaException nsee) {
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
	protected protokol_vskrytija removeImpl(
		protokol_vskrytija protokol_vskrytija) {
		protokol_vskrytija = toUnwrappedModel(protokol_vskrytija);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(protokol_vskrytija)) {
				protokol_vskrytija = (protokol_vskrytija)session.get(protokol_vskrytijaImpl.class,
						protokol_vskrytija.getPrimaryKeyObj());
			}

			if (protokol_vskrytija != null) {
				session.delete(protokol_vskrytija);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (protokol_vskrytija != null) {
			clearCache(protokol_vskrytija);
		}

		return protokol_vskrytija;
	}

	@Override
	public protokol_vskrytija updateImpl(protokol_vskrytija protokol_vskrytija) {
		protokol_vskrytija = toUnwrappedModel(protokol_vskrytija);

		boolean isNew = protokol_vskrytija.isNew();

		Session session = null;

		try {
			session = openSession();

			if (protokol_vskrytija.isNew()) {
				session.save(protokol_vskrytija);

				protokol_vskrytija.setNew(false);
			}
			else {
				protokol_vskrytija = (protokol_vskrytija)session.merge(protokol_vskrytija);
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

		entityCache.putResult(protokol_vskrytijaModelImpl.ENTITY_CACHE_ENABLED,
			protokol_vskrytijaImpl.class, protokol_vskrytija.getPrimaryKey(),
			protokol_vskrytija, false);

		protokol_vskrytija.resetOriginalValues();

		return protokol_vskrytija;
	}

	protected protokol_vskrytija toUnwrappedModel(
		protokol_vskrytija protokol_vskrytija) {
		if (protokol_vskrytija instanceof protokol_vskrytijaImpl) {
			return protokol_vskrytija;
		}

		protokol_vskrytijaImpl protokol_vskrytijaImpl = new protokol_vskrytijaImpl();

		protokol_vskrytijaImpl.setNew(protokol_vskrytija.isNew());
		protokol_vskrytijaImpl.setPrimaryKey(protokol_vskrytija.getPrimaryKey());

		protokol_vskrytijaImpl.setData_vskrytija(protokol_vskrytija.getData_vskrytija());
		protokol_vskrytijaImpl.setIzvewenie_id(protokol_vskrytija.getIzvewenie_id());
		protokol_vskrytijaImpl.setProtokol_vskrytija_id(protokol_vskrytija.getProtokol_vskrytija_id());

		return protokol_vskrytijaImpl;
	}

	/**
	 * Returns the protokol_vskrytija with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the protokol_vskrytija
	 * @return the protokol_vskrytija
	 * @throws NoSuchprotokol_vskrytijaException if a protokol_vskrytija with the primary key could not be found
	 */
	@Override
	public protokol_vskrytija findByPrimaryKey(Serializable primaryKey)
		throws NoSuchprotokol_vskrytijaException {
		protokol_vskrytija protokol_vskrytija = fetchByPrimaryKey(primaryKey);

		if (protokol_vskrytija == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchprotokol_vskrytijaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return protokol_vskrytija;
	}

	/**
	 * Returns the protokol_vskrytija with the primary key or throws a {@link NoSuchprotokol_vskrytijaException} if it could not be found.
	 *
	 * @param protokol_vskrytija_id the primary key of the protokol_vskrytija
	 * @return the protokol_vskrytija
	 * @throws NoSuchprotokol_vskrytijaException if a protokol_vskrytija with the primary key could not be found
	 */
	@Override
	public protokol_vskrytija findByPrimaryKey(long protokol_vskrytija_id)
		throws NoSuchprotokol_vskrytijaException {
		return findByPrimaryKey((Serializable)protokol_vskrytija_id);
	}

	/**
	 * Returns the protokol_vskrytija with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the protokol_vskrytija
	 * @return the protokol_vskrytija, or <code>null</code> if a protokol_vskrytija with the primary key could not be found
	 */
	@Override
	public protokol_vskrytija fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(protokol_vskrytijaModelImpl.ENTITY_CACHE_ENABLED,
				protokol_vskrytijaImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		protokol_vskrytija protokol_vskrytija = (protokol_vskrytija)serializable;

		if (protokol_vskrytija == null) {
			Session session = null;

			try {
				session = openSession();

				protokol_vskrytija = (protokol_vskrytija)session.get(protokol_vskrytijaImpl.class,
						primaryKey);

				if (protokol_vskrytija != null) {
					cacheResult(protokol_vskrytija);
				}
				else {
					entityCache.putResult(protokol_vskrytijaModelImpl.ENTITY_CACHE_ENABLED,
						protokol_vskrytijaImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(protokol_vskrytijaModelImpl.ENTITY_CACHE_ENABLED,
					protokol_vskrytijaImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return protokol_vskrytija;
	}

	/**
	 * Returns the protokol_vskrytija with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param protokol_vskrytija_id the primary key of the protokol_vskrytija
	 * @return the protokol_vskrytija, or <code>null</code> if a protokol_vskrytija with the primary key could not be found
	 */
	@Override
	public protokol_vskrytija fetchByPrimaryKey(long protokol_vskrytija_id) {
		return fetchByPrimaryKey((Serializable)protokol_vskrytija_id);
	}

	@Override
	public Map<Serializable, protokol_vskrytija> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, protokol_vskrytija> map = new HashMap<Serializable, protokol_vskrytija>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			protokol_vskrytija protokol_vskrytija = fetchByPrimaryKey(primaryKey);

			if (protokol_vskrytija != null) {
				map.put(primaryKey, protokol_vskrytija);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(protokol_vskrytijaModelImpl.ENTITY_CACHE_ENABLED,
					protokol_vskrytijaImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (protokol_vskrytija)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_PROTOKOL_VSKRYTIJA_WHERE_PKS_IN);

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

			for (protokol_vskrytija protokol_vskrytija : (List<protokol_vskrytija>)q.list()) {
				map.put(protokol_vskrytija.getPrimaryKeyObj(),
					protokol_vskrytija);

				cacheResult(protokol_vskrytija);

				uncachedPrimaryKeys.remove(protokol_vskrytija.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(protokol_vskrytijaModelImpl.ENTITY_CACHE_ENABLED,
					protokol_vskrytijaImpl.class, primaryKey, nullModel);
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
	 * Returns all the protokol_vskrytijas.
	 *
	 * @return the protokol_vskrytijas
	 */
	@Override
	public List<protokol_vskrytija> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the protokol_vskrytijas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link protokol_vskrytijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of protokol_vskrytijas
	 * @param end the upper bound of the range of protokol_vskrytijas (not inclusive)
	 * @return the range of protokol_vskrytijas
	 */
	@Override
	public List<protokol_vskrytija> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the protokol_vskrytijas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link protokol_vskrytijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of protokol_vskrytijas
	 * @param end the upper bound of the range of protokol_vskrytijas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of protokol_vskrytijas
	 */
	@Override
	public List<protokol_vskrytija> findAll(int start, int end,
		OrderByComparator<protokol_vskrytija> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the protokol_vskrytijas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link protokol_vskrytijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of protokol_vskrytijas
	 * @param end the upper bound of the range of protokol_vskrytijas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of protokol_vskrytijas
	 */
	@Override
	public List<protokol_vskrytija> findAll(int start, int end,
		OrderByComparator<protokol_vskrytija> orderByComparator,
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

		List<protokol_vskrytija> list = null;

		if (retrieveFromCache) {
			list = (List<protokol_vskrytija>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_PROTOKOL_VSKRYTIJA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PROTOKOL_VSKRYTIJA;

				if (pagination) {
					sql = sql.concat(protokol_vskrytijaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<protokol_vskrytija>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<protokol_vskrytija>)QueryUtil.list(q,
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
	 * Removes all the protokol_vskrytijas from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (protokol_vskrytija protokol_vskrytija : findAll()) {
			remove(protokol_vskrytija);
		}
	}

	/**
	 * Returns the number of protokol_vskrytijas.
	 *
	 * @return the number of protokol_vskrytijas
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_PROTOKOL_VSKRYTIJA);

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
		return protokol_vskrytijaModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the protokol_vskrytija persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(protokol_vskrytijaImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_PROTOKOL_VSKRYTIJA = "SELECT protokol_vskrytija FROM protokol_vskrytija protokol_vskrytija";
	private static final String _SQL_SELECT_PROTOKOL_VSKRYTIJA_WHERE_PKS_IN = "SELECT protokol_vskrytija FROM protokol_vskrytija protokol_vskrytija WHERE protokol_vskrytija_id IN (";
	private static final String _SQL_COUNT_PROTOKOL_VSKRYTIJA = "SELECT COUNT(protokol_vskrytija) FROM protokol_vskrytija protokol_vskrytija";
	private static final String _ORDER_BY_ENTITY_ALIAS = "protokol_vskrytija.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No protokol_vskrytija exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(protokol_vskrytijaPersistenceImpl.class);
}
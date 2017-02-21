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

package tj.spisok.tovarov.service.persistence.impl;

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

import tj.spisok.tovarov.exception.NoSuchspisok_tovarovException;
import tj.spisok.tovarov.model.impl.spisok_tovarovImpl;
import tj.spisok.tovarov.model.impl.spisok_tovarovModelImpl;
import tj.spisok.tovarov.model.spisok_tovarov;
import tj.spisok.tovarov.service.persistence.spisok_tovarovPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the spisok_tovarov service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see spisok_tovarovPersistence
 * @see tj.spisok.tovarov.service.persistence.spisok_tovarovUtil
 * @generated
 */
@ProviderType
public class spisok_tovarovPersistenceImpl extends BasePersistenceImpl<spisok_tovarov>
	implements spisok_tovarovPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link spisok_tovarovUtil} to access the spisok_tovarov persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = spisok_tovarovImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(spisok_tovarovModelImpl.ENTITY_CACHE_ENABLED,
			spisok_tovarovModelImpl.FINDER_CACHE_ENABLED,
			spisok_tovarovImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(spisok_tovarovModelImpl.ENTITY_CACHE_ENABLED,
			spisok_tovarovModelImpl.FINDER_CACHE_ENABLED,
			spisok_tovarovImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(spisok_tovarovModelImpl.ENTITY_CACHE_ENABLED,
			spisok_tovarovModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public spisok_tovarovPersistenceImpl() {
		setModelClass(spisok_tovarov.class);
	}

	/**
	 * Caches the spisok_tovarov in the entity cache if it is enabled.
	 *
	 * @param spisok_tovarov the spisok_tovarov
	 */
	@Override
	public void cacheResult(spisok_tovarov spisok_tovarov) {
		entityCache.putResult(spisok_tovarovModelImpl.ENTITY_CACHE_ENABLED,
			spisok_tovarovImpl.class, spisok_tovarov.getPrimaryKey(),
			spisok_tovarov);

		spisok_tovarov.resetOriginalValues();
	}

	/**
	 * Caches the spisok_tovarovs in the entity cache if it is enabled.
	 *
	 * @param spisok_tovarovs the spisok_tovarovs
	 */
	@Override
	public void cacheResult(List<spisok_tovarov> spisok_tovarovs) {
		for (spisok_tovarov spisok_tovarov : spisok_tovarovs) {
			if (entityCache.getResult(
						spisok_tovarovModelImpl.ENTITY_CACHE_ENABLED,
						spisok_tovarovImpl.class, spisok_tovarov.getPrimaryKey()) == null) {
				cacheResult(spisok_tovarov);
			}
			else {
				spisok_tovarov.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all spisok_tovarovs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(spisok_tovarovImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the spisok_tovarov.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(spisok_tovarov spisok_tovarov) {
		entityCache.removeResult(spisok_tovarovModelImpl.ENTITY_CACHE_ENABLED,
			spisok_tovarovImpl.class, spisok_tovarov.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<spisok_tovarov> spisok_tovarovs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (spisok_tovarov spisok_tovarov : spisok_tovarovs) {
			entityCache.removeResult(spisok_tovarovModelImpl.ENTITY_CACHE_ENABLED,
				spisok_tovarovImpl.class, spisok_tovarov.getPrimaryKey());
		}
	}

	/**
	 * Creates a new spisok_tovarov with the primary key. Does not add the spisok_tovarov to the database.
	 *
	 * @param spisok_tovarov_id the primary key for the new spisok_tovarov
	 * @return the new spisok_tovarov
	 */
	@Override
	public spisok_tovarov create(long spisok_tovarov_id) {
		spisok_tovarov spisok_tovarov = new spisok_tovarovImpl();

		spisok_tovarov.setNew(true);
		spisok_tovarov.setPrimaryKey(spisok_tovarov_id);

		return spisok_tovarov;
	}

	/**
	 * Removes the spisok_tovarov with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param spisok_tovarov_id the primary key of the spisok_tovarov
	 * @return the spisok_tovarov that was removed
	 * @throws NoSuchspisok_tovarovException if a spisok_tovarov with the primary key could not be found
	 */
	@Override
	public spisok_tovarov remove(long spisok_tovarov_id)
		throws NoSuchspisok_tovarovException {
		return remove((Serializable)spisok_tovarov_id);
	}

	/**
	 * Removes the spisok_tovarov with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the spisok_tovarov
	 * @return the spisok_tovarov that was removed
	 * @throws NoSuchspisok_tovarovException if a spisok_tovarov with the primary key could not be found
	 */
	@Override
	public spisok_tovarov remove(Serializable primaryKey)
		throws NoSuchspisok_tovarovException {
		Session session = null;

		try {
			session = openSession();

			spisok_tovarov spisok_tovarov = (spisok_tovarov)session.get(spisok_tovarovImpl.class,
					primaryKey);

			if (spisok_tovarov == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchspisok_tovarovException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(spisok_tovarov);
		}
		catch (NoSuchspisok_tovarovException nsee) {
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
	protected spisok_tovarov removeImpl(spisok_tovarov spisok_tovarov) {
		spisok_tovarov = toUnwrappedModel(spisok_tovarov);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(spisok_tovarov)) {
				spisok_tovarov = (spisok_tovarov)session.get(spisok_tovarovImpl.class,
						spisok_tovarov.getPrimaryKeyObj());
			}

			if (spisok_tovarov != null) {
				session.delete(spisok_tovarov);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (spisok_tovarov != null) {
			clearCache(spisok_tovarov);
		}

		return spisok_tovarov;
	}

	@Override
	public spisok_tovarov updateImpl(spisok_tovarov spisok_tovarov) {
		spisok_tovarov = toUnwrappedModel(spisok_tovarov);

		boolean isNew = spisok_tovarov.isNew();

		Session session = null;

		try {
			session = openSession();

			if (spisok_tovarov.isNew()) {
				session.save(spisok_tovarov);

				spisok_tovarov.setNew(false);
			}
			else {
				spisok_tovarov = (spisok_tovarov)session.merge(spisok_tovarov);
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

		entityCache.putResult(spisok_tovarovModelImpl.ENTITY_CACHE_ENABLED,
			spisok_tovarovImpl.class, spisok_tovarov.getPrimaryKey(),
			spisok_tovarov, false);

		spisok_tovarov.resetOriginalValues();

		return spisok_tovarov;
	}

	protected spisok_tovarov toUnwrappedModel(spisok_tovarov spisok_tovarov) {
		if (spisok_tovarov instanceof spisok_tovarovImpl) {
			return spisok_tovarov;
		}

		spisok_tovarovImpl spisok_tovarovImpl = new spisok_tovarovImpl();

		spisok_tovarovImpl.setNew(spisok_tovarov.isNew());
		spisok_tovarovImpl.setPrimaryKey(spisok_tovarov.getPrimaryKey());

		spisok_tovarovImpl.setData_izmenenija(spisok_tovarov.getData_izmenenija());
		spisok_tovarovImpl.setData_sozdanija(spisok_tovarov.getData_sozdanija());
		spisok_tovarovImpl.setEdinica_izmerenija_id(spisok_tovarov.getEdinica_izmerenija_id());
		spisok_tovarovImpl.setIzmenil(spisok_tovarov.getIzmenil());
		spisok_tovarovImpl.setIzvewenie_id(spisok_tovarov.getIzvewenie_id());
		spisok_tovarovImpl.setKlassifikacija_po_okdp(spisok_tovarov.getKlassifikacija_po_okdp());
		spisok_tovarovImpl.setKod_po_okdp(spisok_tovarov.getKod_po_okdp());
		spisok_tovarovImpl.setKod_po_spravochniku_naimenovanij(spisok_tovarov.getKod_po_spravochniku_naimenovanij());
		spisok_tovarovImpl.setKod_strany_proizvoditelja(spisok_tovarov.getKod_strany_proizvoditelja());
		spisok_tovarovImpl.setKolichestvo(spisok_tovarov.getKolichestvo());
		spisok_tovarovImpl.setLot_id(spisok_tovarov.getLot_id());
		spisok_tovarovImpl.setNaimenovanie_tovara(spisok_tovarov.getNaimenovanie_tovara());
		spisok_tovarovImpl.setOpisanie_tovara(spisok_tovarov.getOpisanie_tovara());
		spisok_tovarovImpl.setSozdal(spisok_tovarov.getSozdal());
		spisok_tovarovImpl.setSpisok_tovarov_id(spisok_tovarov.getSpisok_tovarov_id());

		return spisok_tovarovImpl;
	}

	/**
	 * Returns the spisok_tovarov with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the spisok_tovarov
	 * @return the spisok_tovarov
	 * @throws NoSuchspisok_tovarovException if a spisok_tovarov with the primary key could not be found
	 */
	@Override
	public spisok_tovarov findByPrimaryKey(Serializable primaryKey)
		throws NoSuchspisok_tovarovException {
		spisok_tovarov spisok_tovarov = fetchByPrimaryKey(primaryKey);

		if (spisok_tovarov == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchspisok_tovarovException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return spisok_tovarov;
	}

	/**
	 * Returns the spisok_tovarov with the primary key or throws a {@link NoSuchspisok_tovarovException} if it could not be found.
	 *
	 * @param spisok_tovarov_id the primary key of the spisok_tovarov
	 * @return the spisok_tovarov
	 * @throws NoSuchspisok_tovarovException if a spisok_tovarov with the primary key could not be found
	 */
	@Override
	public spisok_tovarov findByPrimaryKey(long spisok_tovarov_id)
		throws NoSuchspisok_tovarovException {
		return findByPrimaryKey((Serializable)spisok_tovarov_id);
	}

	/**
	 * Returns the spisok_tovarov with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the spisok_tovarov
	 * @return the spisok_tovarov, or <code>null</code> if a spisok_tovarov with the primary key could not be found
	 */
	@Override
	public spisok_tovarov fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(spisok_tovarovModelImpl.ENTITY_CACHE_ENABLED,
				spisok_tovarovImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		spisok_tovarov spisok_tovarov = (spisok_tovarov)serializable;

		if (spisok_tovarov == null) {
			Session session = null;

			try {
				session = openSession();

				spisok_tovarov = (spisok_tovarov)session.get(spisok_tovarovImpl.class,
						primaryKey);

				if (spisok_tovarov != null) {
					cacheResult(spisok_tovarov);
				}
				else {
					entityCache.putResult(spisok_tovarovModelImpl.ENTITY_CACHE_ENABLED,
						spisok_tovarovImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(spisok_tovarovModelImpl.ENTITY_CACHE_ENABLED,
					spisok_tovarovImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return spisok_tovarov;
	}

	/**
	 * Returns the spisok_tovarov with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param spisok_tovarov_id the primary key of the spisok_tovarov
	 * @return the spisok_tovarov, or <code>null</code> if a spisok_tovarov with the primary key could not be found
	 */
	@Override
	public spisok_tovarov fetchByPrimaryKey(long spisok_tovarov_id) {
		return fetchByPrimaryKey((Serializable)spisok_tovarov_id);
	}

	@Override
	public Map<Serializable, spisok_tovarov> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, spisok_tovarov> map = new HashMap<Serializable, spisok_tovarov>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			spisok_tovarov spisok_tovarov = fetchByPrimaryKey(primaryKey);

			if (spisok_tovarov != null) {
				map.put(primaryKey, spisok_tovarov);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(spisok_tovarovModelImpl.ENTITY_CACHE_ENABLED,
					spisok_tovarovImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (spisok_tovarov)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_SPISOK_TOVAROV_WHERE_PKS_IN);

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

			for (spisok_tovarov spisok_tovarov : (List<spisok_tovarov>)q.list()) {
				map.put(spisok_tovarov.getPrimaryKeyObj(), spisok_tovarov);

				cacheResult(spisok_tovarov);

				uncachedPrimaryKeys.remove(spisok_tovarov.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(spisok_tovarovModelImpl.ENTITY_CACHE_ENABLED,
					spisok_tovarovImpl.class, primaryKey, nullModel);
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
	 * Returns all the spisok_tovarovs.
	 *
	 * @return the spisok_tovarovs
	 */
	@Override
	public List<spisok_tovarov> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the spisok_tovarovs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link spisok_tovarovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of spisok_tovarovs
	 * @param end the upper bound of the range of spisok_tovarovs (not inclusive)
	 * @return the range of spisok_tovarovs
	 */
	@Override
	public List<spisok_tovarov> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the spisok_tovarovs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link spisok_tovarovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of spisok_tovarovs
	 * @param end the upper bound of the range of spisok_tovarovs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of spisok_tovarovs
	 */
	@Override
	public List<spisok_tovarov> findAll(int start, int end,
		OrderByComparator<spisok_tovarov> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the spisok_tovarovs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link spisok_tovarovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of spisok_tovarovs
	 * @param end the upper bound of the range of spisok_tovarovs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of spisok_tovarovs
	 */
	@Override
	public List<spisok_tovarov> findAll(int start, int end,
		OrderByComparator<spisok_tovarov> orderByComparator,
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

		List<spisok_tovarov> list = null;

		if (retrieveFromCache) {
			list = (List<spisok_tovarov>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_SPISOK_TOVAROV);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SPISOK_TOVAROV;

				if (pagination) {
					sql = sql.concat(spisok_tovarovModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<spisok_tovarov>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<spisok_tovarov>)QueryUtil.list(q,
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
	 * Removes all the spisok_tovarovs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (spisok_tovarov spisok_tovarov : findAll()) {
			remove(spisok_tovarov);
		}
	}

	/**
	 * Returns the number of spisok_tovarovs.
	 *
	 * @return the number of spisok_tovarovs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SPISOK_TOVAROV);

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
		return spisok_tovarovModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the spisok_tovarov persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(spisok_tovarovImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_SPISOK_TOVAROV = "SELECT spisok_tovarov FROM spisok_tovarov spisok_tovarov";
	private static final String _SQL_SELECT_SPISOK_TOVAROV_WHERE_PKS_IN = "SELECT spisok_tovarov FROM spisok_tovarov spisok_tovarov WHERE spisok_tovarov_id IN (";
	private static final String _SQL_COUNT_SPISOK_TOVAROV = "SELECT COUNT(spisok_tovarov) FROM spisok_tovarov spisok_tovarov";
	private static final String _ORDER_BY_ENTITY_ALIAS = "spisok_tovarov.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No spisok_tovarov exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(spisok_tovarovPersistenceImpl.class);
}
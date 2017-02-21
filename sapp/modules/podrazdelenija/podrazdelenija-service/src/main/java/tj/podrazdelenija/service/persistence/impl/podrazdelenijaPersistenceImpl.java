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

package tj.podrazdelenija.service.persistence.impl;

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

import tj.podrazdelenija.exception.NoSuchpodrazdelenijaException;

import tj.podrazdelenija.model.impl.podrazdelenijaImpl;
import tj.podrazdelenija.model.impl.podrazdelenijaModelImpl;
import tj.podrazdelenija.model.podrazdelenija;

import tj.podrazdelenija.service.persistence.podrazdelenijaPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the podrazdelenija service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see podrazdelenijaPersistence
 * @see tj.podrazdelenija.service.persistence.podrazdelenijaUtil
 * @generated
 */
@ProviderType
public class podrazdelenijaPersistenceImpl extends BasePersistenceImpl<podrazdelenija>
	implements podrazdelenijaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link podrazdelenijaUtil} to access the podrazdelenija persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = podrazdelenijaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(podrazdelenijaModelImpl.ENTITY_CACHE_ENABLED,
			podrazdelenijaModelImpl.FINDER_CACHE_ENABLED,
			podrazdelenijaImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(podrazdelenijaModelImpl.ENTITY_CACHE_ENABLED,
			podrazdelenijaModelImpl.FINDER_CACHE_ENABLED,
			podrazdelenijaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(podrazdelenijaModelImpl.ENTITY_CACHE_ENABLED,
			podrazdelenijaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public podrazdelenijaPersistenceImpl() {
		setModelClass(podrazdelenija.class);
	}

	/**
	 * Caches the podrazdelenija in the entity cache if it is enabled.
	 *
	 * @param podrazdelenija the podrazdelenija
	 */
	@Override
	public void cacheResult(podrazdelenija podrazdelenija) {
		entityCache.putResult(podrazdelenijaModelImpl.ENTITY_CACHE_ENABLED,
			podrazdelenijaImpl.class, podrazdelenija.getPrimaryKey(),
			podrazdelenija);

		podrazdelenija.resetOriginalValues();
	}

	/**
	 * Caches the podrazdelenijas in the entity cache if it is enabled.
	 *
	 * @param podrazdelenijas the podrazdelenijas
	 */
	@Override
	public void cacheResult(List<podrazdelenija> podrazdelenijas) {
		for (podrazdelenija podrazdelenija : podrazdelenijas) {
			if (entityCache.getResult(
						podrazdelenijaModelImpl.ENTITY_CACHE_ENABLED,
						podrazdelenijaImpl.class, podrazdelenija.getPrimaryKey()) == null) {
				cacheResult(podrazdelenija);
			}
			else {
				podrazdelenija.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all podrazdelenijas.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(podrazdelenijaImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the podrazdelenija.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(podrazdelenija podrazdelenija) {
		entityCache.removeResult(podrazdelenijaModelImpl.ENTITY_CACHE_ENABLED,
			podrazdelenijaImpl.class, podrazdelenija.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<podrazdelenija> podrazdelenijas) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (podrazdelenija podrazdelenija : podrazdelenijas) {
			entityCache.removeResult(podrazdelenijaModelImpl.ENTITY_CACHE_ENABLED,
				podrazdelenijaImpl.class, podrazdelenija.getPrimaryKey());
		}
	}

	/**
	 * Creates a new podrazdelenija with the primary key. Does not add the podrazdelenija to the database.
	 *
	 * @param podrazdelenija_id the primary key for the new podrazdelenija
	 * @return the new podrazdelenija
	 */
	@Override
	public podrazdelenija create(long podrazdelenija_id) {
		podrazdelenija podrazdelenija = new podrazdelenijaImpl();

		podrazdelenija.setNew(true);
		podrazdelenija.setPrimaryKey(podrazdelenija_id);

		return podrazdelenija;
	}

	/**
	 * Removes the podrazdelenija with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param podrazdelenija_id the primary key of the podrazdelenija
	 * @return the podrazdelenija that was removed
	 * @throws NoSuchpodrazdelenijaException if a podrazdelenija with the primary key could not be found
	 */
	@Override
	public podrazdelenija remove(long podrazdelenija_id)
		throws NoSuchpodrazdelenijaException {
		return remove((Serializable)podrazdelenija_id);
	}

	/**
	 * Removes the podrazdelenija with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the podrazdelenija
	 * @return the podrazdelenija that was removed
	 * @throws NoSuchpodrazdelenijaException if a podrazdelenija with the primary key could not be found
	 */
	@Override
	public podrazdelenija remove(Serializable primaryKey)
		throws NoSuchpodrazdelenijaException {
		Session session = null;

		try {
			session = openSession();

			podrazdelenija podrazdelenija = (podrazdelenija)session.get(podrazdelenijaImpl.class,
					primaryKey);

			if (podrazdelenija == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchpodrazdelenijaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(podrazdelenija);
		}
		catch (NoSuchpodrazdelenijaException nsee) {
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
	protected podrazdelenija removeImpl(podrazdelenija podrazdelenija) {
		podrazdelenija = toUnwrappedModel(podrazdelenija);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(podrazdelenija)) {
				podrazdelenija = (podrazdelenija)session.get(podrazdelenijaImpl.class,
						podrazdelenija.getPrimaryKeyObj());
			}

			if (podrazdelenija != null) {
				session.delete(podrazdelenija);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (podrazdelenija != null) {
			clearCache(podrazdelenija);
		}

		return podrazdelenija;
	}

	@Override
	public podrazdelenija updateImpl(podrazdelenija podrazdelenija) {
		podrazdelenija = toUnwrappedModel(podrazdelenija);

		boolean isNew = podrazdelenija.isNew();

		Session session = null;

		try {
			session = openSession();

			if (podrazdelenija.isNew()) {
				session.save(podrazdelenija);

				podrazdelenija.setNew(false);
			}
			else {
				podrazdelenija = (podrazdelenija)session.merge(podrazdelenija);
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

		entityCache.putResult(podrazdelenijaModelImpl.ENTITY_CACHE_ENABLED,
			podrazdelenijaImpl.class, podrazdelenija.getPrimaryKey(),
			podrazdelenija, false);

		podrazdelenija.resetOriginalValues();

		return podrazdelenija;
	}

	protected podrazdelenija toUnwrappedModel(podrazdelenija podrazdelenija) {
		if (podrazdelenija instanceof podrazdelenijaImpl) {
			return podrazdelenija;
		}

		podrazdelenijaImpl podrazdelenijaImpl = new podrazdelenijaImpl();

		podrazdelenijaImpl.setNew(podrazdelenija.isNew());
		podrazdelenijaImpl.setPrimaryKey(podrazdelenija.getPrimaryKey());

		podrazdelenijaImpl.setData_izmenenija(podrazdelenija.getData_izmenenija());
		podrazdelenijaImpl.setData_sozdanija(podrazdelenija.getData_sozdanija());
		podrazdelenijaImpl.setIzmenil(podrazdelenija.getIzmenil());
		podrazdelenijaImpl.setOrganizacija_id(podrazdelenija.getOrganizacija_id());
		podrazdelenijaImpl.setPodrazdelenie(podrazdelenija.getPodrazdelenie());
		podrazdelenijaImpl.setPodrazdelenija_id(podrazdelenija.getPodrazdelenija_id());
		podrazdelenijaImpl.setSozdal(podrazdelenija.getSozdal());

		return podrazdelenijaImpl;
	}

	/**
	 * Returns the podrazdelenija with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the podrazdelenija
	 * @return the podrazdelenija
	 * @throws NoSuchpodrazdelenijaException if a podrazdelenija with the primary key could not be found
	 */
	@Override
	public podrazdelenija findByPrimaryKey(Serializable primaryKey)
		throws NoSuchpodrazdelenijaException {
		podrazdelenija podrazdelenija = fetchByPrimaryKey(primaryKey);

		if (podrazdelenija == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchpodrazdelenijaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return podrazdelenija;
	}

	/**
	 * Returns the podrazdelenija with the primary key or throws a {@link NoSuchpodrazdelenijaException} if it could not be found.
	 *
	 * @param podrazdelenija_id the primary key of the podrazdelenija
	 * @return the podrazdelenija
	 * @throws NoSuchpodrazdelenijaException if a podrazdelenija with the primary key could not be found
	 */
	@Override
	public podrazdelenija findByPrimaryKey(long podrazdelenija_id)
		throws NoSuchpodrazdelenijaException {
		return findByPrimaryKey((Serializable)podrazdelenija_id);
	}

	/**
	 * Returns the podrazdelenija with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the podrazdelenija
	 * @return the podrazdelenija, or <code>null</code> if a podrazdelenija with the primary key could not be found
	 */
	@Override
	public podrazdelenija fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(podrazdelenijaModelImpl.ENTITY_CACHE_ENABLED,
				podrazdelenijaImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		podrazdelenija podrazdelenija = (podrazdelenija)serializable;

		if (podrazdelenija == null) {
			Session session = null;

			try {
				session = openSession();

				podrazdelenija = (podrazdelenija)session.get(podrazdelenijaImpl.class,
						primaryKey);

				if (podrazdelenija != null) {
					cacheResult(podrazdelenija);
				}
				else {
					entityCache.putResult(podrazdelenijaModelImpl.ENTITY_CACHE_ENABLED,
						podrazdelenijaImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(podrazdelenijaModelImpl.ENTITY_CACHE_ENABLED,
					podrazdelenijaImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return podrazdelenija;
	}

	/**
	 * Returns the podrazdelenija with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param podrazdelenija_id the primary key of the podrazdelenija
	 * @return the podrazdelenija, or <code>null</code> if a podrazdelenija with the primary key could not be found
	 */
	@Override
	public podrazdelenija fetchByPrimaryKey(long podrazdelenija_id) {
		return fetchByPrimaryKey((Serializable)podrazdelenija_id);
	}

	@Override
	public Map<Serializable, podrazdelenija> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, podrazdelenija> map = new HashMap<Serializable, podrazdelenija>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			podrazdelenija podrazdelenija = fetchByPrimaryKey(primaryKey);

			if (podrazdelenija != null) {
				map.put(primaryKey, podrazdelenija);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(podrazdelenijaModelImpl.ENTITY_CACHE_ENABLED,
					podrazdelenijaImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (podrazdelenija)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_PODRAZDELENIJA_WHERE_PKS_IN);

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

			for (podrazdelenija podrazdelenija : (List<podrazdelenija>)q.list()) {
				map.put(podrazdelenija.getPrimaryKeyObj(), podrazdelenija);

				cacheResult(podrazdelenija);

				uncachedPrimaryKeys.remove(podrazdelenija.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(podrazdelenijaModelImpl.ENTITY_CACHE_ENABLED,
					podrazdelenijaImpl.class, primaryKey, nullModel);
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
	 * Returns all the podrazdelenijas.
	 *
	 * @return the podrazdelenijas
	 */
	@Override
	public List<podrazdelenija> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the podrazdelenijas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link podrazdelenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of podrazdelenijas
	 * @param end the upper bound of the range of podrazdelenijas (not inclusive)
	 * @return the range of podrazdelenijas
	 */
	@Override
	public List<podrazdelenija> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the podrazdelenijas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link podrazdelenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of podrazdelenijas
	 * @param end the upper bound of the range of podrazdelenijas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of podrazdelenijas
	 */
	@Override
	public List<podrazdelenija> findAll(int start, int end,
		OrderByComparator<podrazdelenija> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the podrazdelenijas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link podrazdelenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of podrazdelenijas
	 * @param end the upper bound of the range of podrazdelenijas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of podrazdelenijas
	 */
	@Override
	public List<podrazdelenija> findAll(int start, int end,
		OrderByComparator<podrazdelenija> orderByComparator,
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

		List<podrazdelenija> list = null;

		if (retrieveFromCache) {
			list = (List<podrazdelenija>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_PODRAZDELENIJA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PODRAZDELENIJA;

				if (pagination) {
					sql = sql.concat(podrazdelenijaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<podrazdelenija>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<podrazdelenija>)QueryUtil.list(q,
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
	 * Removes all the podrazdelenijas from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (podrazdelenija podrazdelenija : findAll()) {
			remove(podrazdelenija);
		}
	}

	/**
	 * Returns the number of podrazdelenijas.
	 *
	 * @return the number of podrazdelenijas
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_PODRAZDELENIJA);

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
		return podrazdelenijaModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the podrazdelenija persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(podrazdelenijaImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_PODRAZDELENIJA = "SELECT podrazdelenija FROM podrazdelenija podrazdelenija";
	private static final String _SQL_SELECT_PODRAZDELENIJA_WHERE_PKS_IN = "SELECT podrazdelenija FROM podrazdelenija podrazdelenija WHERE podrazdelenija_id IN (";
	private static final String _SQL_COUNT_PODRAZDELENIJA = "SELECT COUNT(podrazdelenija) FROM podrazdelenija podrazdelenija";
	private static final String _ORDER_BY_ENTITY_ALIAS = "podrazdelenija.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No podrazdelenija exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(podrazdelenijaPersistenceImpl.class);
}
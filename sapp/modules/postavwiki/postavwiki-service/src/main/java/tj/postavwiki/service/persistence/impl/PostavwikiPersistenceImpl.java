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

package tj.postavwiki.service.persistence.impl;

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

import tj.postavwiki.exception.NoSuchpostavwikiException;

import tj.postavwiki.model.impl.postavwikiImpl;
import tj.postavwiki.model.impl.postavwikiModelImpl;
import tj.postavwiki.model.postavwiki;

import tj.postavwiki.service.persistence.postavwikiPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the postavwiki service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see postavwikiPersistence
 * @see tj.postavwiki.service.persistence.postavwikiUtil
 * @generated
 */
@ProviderType
public class postavwikiPersistenceImpl extends BasePersistenceImpl<postavwiki>
	implements postavwikiPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link postavwikiUtil} to access the postavwiki persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = postavwikiImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(postavwikiModelImpl.ENTITY_CACHE_ENABLED,
			postavwikiModelImpl.FINDER_CACHE_ENABLED, postavwikiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(postavwikiModelImpl.ENTITY_CACHE_ENABLED,
			postavwikiModelImpl.FINDER_CACHE_ENABLED, postavwikiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(postavwikiModelImpl.ENTITY_CACHE_ENABLED,
			postavwikiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public postavwikiPersistenceImpl() {
		setModelClass(postavwiki.class);
	}

	/**
	 * Caches the postavwiki in the entity cache if it is enabled.
	 *
	 * @param postavwiki the postavwiki
	 */
	@Override
	public void cacheResult(postavwiki postavwiki) {
		entityCache.putResult(postavwikiModelImpl.ENTITY_CACHE_ENABLED,
			postavwikiImpl.class, postavwiki.getPrimaryKey(), postavwiki);

		postavwiki.resetOriginalValues();
	}

	/**
	 * Caches the postavwikis in the entity cache if it is enabled.
	 *
	 * @param postavwikis the postavwikis
	 */
	@Override
	public void cacheResult(List<postavwiki> postavwikis) {
		for (postavwiki postavwiki : postavwikis) {
			if (entityCache.getResult(
						postavwikiModelImpl.ENTITY_CACHE_ENABLED,
						postavwikiImpl.class, postavwiki.getPrimaryKey()) == null) {
				cacheResult(postavwiki);
			}
			else {
				postavwiki.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all postavwikis.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(postavwikiImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the postavwiki.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(postavwiki postavwiki) {
		entityCache.removeResult(postavwikiModelImpl.ENTITY_CACHE_ENABLED,
			postavwikiImpl.class, postavwiki.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<postavwiki> postavwikis) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (postavwiki postavwiki : postavwikis) {
			entityCache.removeResult(postavwikiModelImpl.ENTITY_CACHE_ENABLED,
				postavwikiImpl.class, postavwiki.getPrimaryKey());
		}
	}

	/**
	 * Creates a new postavwiki with the primary key. Does not add the postavwiki to the database.
	 *
	 * @param postavwiki_id the primary key for the new postavwiki
	 * @return the new postavwiki
	 */
	@Override
	public postavwiki create(long postavwiki_id) {
		postavwiki postavwiki = new postavwikiImpl();

		postavwiki.setNew(true);
		postavwiki.setPrimaryKey(postavwiki_id);

		return postavwiki;
	}

	/**
	 * Removes the postavwiki with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param postavwiki_id the primary key of the postavwiki
	 * @return the postavwiki that was removed
	 * @throws NoSuchpostavwikiException if a postavwiki with the primary key could not be found
	 */
	@Override
	public postavwiki remove(long postavwiki_id)
		throws NoSuchpostavwikiException {
		return remove((Serializable)postavwiki_id);
	}

	/**
	 * Removes the postavwiki with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the postavwiki
	 * @return the postavwiki that was removed
	 * @throws NoSuchpostavwikiException if a postavwiki with the primary key could not be found
	 */
	@Override
	public postavwiki remove(Serializable primaryKey)
		throws NoSuchpostavwikiException {
		Session session = null;

		try {
			session = openSession();

			postavwiki postavwiki = (postavwiki)session.get(postavwikiImpl.class,
					primaryKey);

			if (postavwiki == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchpostavwikiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(postavwiki);
		}
		catch (NoSuchpostavwikiException nsee) {
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
	protected postavwiki removeImpl(postavwiki postavwiki) {
		postavwiki = toUnwrappedModel(postavwiki);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(postavwiki)) {
				postavwiki = (postavwiki)session.get(postavwikiImpl.class,
						postavwiki.getPrimaryKeyObj());
			}

			if (postavwiki != null) {
				session.delete(postavwiki);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (postavwiki != null) {
			clearCache(postavwiki);
		}

		return postavwiki;
	}

	@Override
	public postavwiki updateImpl(postavwiki postavwiki) {
		postavwiki = toUnwrappedModel(postavwiki);

		boolean isNew = postavwiki.isNew();

		Session session = null;

		try {
			session = openSession();

			if (postavwiki.isNew()) {
				session.save(postavwiki);

				postavwiki.setNew(false);
			}
			else {
				postavwiki = (postavwiki)session.merge(postavwiki);
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

		entityCache.putResult(postavwikiModelImpl.ENTITY_CACHE_ENABLED,
			postavwikiImpl.class, postavwiki.getPrimaryKey(), postavwiki, false);

		postavwiki.resetOriginalValues();

		return postavwiki;
	}

	protected postavwiki toUnwrappedModel(postavwiki postavwiki) {
		if (postavwiki instanceof postavwikiImpl) {
			return postavwiki;
		}

		postavwikiImpl postavwikiImpl = new postavwikiImpl();

		postavwikiImpl.setNew(postavwiki.isNew());
		postavwikiImpl.setPrimaryKey(postavwiki.getPrimaryKey());

		postavwikiImpl.setAdres(postavwiki.getAdres());
		postavwikiImpl.setData_gosudarstvennoj_registracii(postavwiki.getData_gosudarstvennoj_registracii());
		postavwikiImpl.setData_izmenenija(postavwiki.getData_izmenenija());
		postavwikiImpl.setData_sozdanija(postavwiki.getData_sozdanija());
		postavwikiImpl.setEin(postavwiki.getEin());
		postavwikiImpl.setGorod(postavwiki.getGorod());
		postavwikiImpl.setInn(postavwiki.getInn());
		postavwikiImpl.setIzmenil(postavwiki.getIzmenil());
		postavwikiImpl.setKratkoe_naimenovanie(postavwiki.getKratkoe_naimenovanie());
		postavwikiImpl.setMesto_registracii(postavwiki.getMesto_registracii());
		postavwikiImpl.setOblast_id(postavwiki.getOblast_id());
		postavwikiImpl.setPolnoe_naimenovanie(postavwiki.getPolnoe_naimenovanie());
		postavwikiImpl.setPostavwiki_id(postavwiki.getPostavwiki_id());
		postavwikiImpl.setRajon_id(postavwiki.getRajon_id());
		postavwikiImpl.setSin(postavwiki.getSin());
		postavwikiImpl.setSozdal(postavwiki.getSozdal());

		return postavwikiImpl;
	}

	/**
	 * Returns the postavwiki with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the postavwiki
	 * @return the postavwiki
	 * @throws NoSuchpostavwikiException if a postavwiki with the primary key could not be found
	 */
	@Override
	public postavwiki findByPrimaryKey(Serializable primaryKey)
		throws NoSuchpostavwikiException {
		postavwiki postavwiki = fetchByPrimaryKey(primaryKey);

		if (postavwiki == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchpostavwikiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return postavwiki;
	}

	/**
	 * Returns the postavwiki with the primary key or throws a {@link NoSuchpostavwikiException} if it could not be found.
	 *
	 * @param postavwiki_id the primary key of the postavwiki
	 * @return the postavwiki
	 * @throws NoSuchpostavwikiException if a postavwiki with the primary key could not be found
	 */
	@Override
	public postavwiki findByPrimaryKey(long postavwiki_id)
		throws NoSuchpostavwikiException {
		return findByPrimaryKey((Serializable)postavwiki_id);
	}

	/**
	 * Returns the postavwiki with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the postavwiki
	 * @return the postavwiki, or <code>null</code> if a postavwiki with the primary key could not be found
	 */
	@Override
	public postavwiki fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(postavwikiModelImpl.ENTITY_CACHE_ENABLED,
				postavwikiImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		postavwiki postavwiki = (postavwiki)serializable;

		if (postavwiki == null) {
			Session session = null;

			try {
				session = openSession();

				postavwiki = (postavwiki)session.get(postavwikiImpl.class,
						primaryKey);

				if (postavwiki != null) {
					cacheResult(postavwiki);
				}
				else {
					entityCache.putResult(postavwikiModelImpl.ENTITY_CACHE_ENABLED,
						postavwikiImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(postavwikiModelImpl.ENTITY_CACHE_ENABLED,
					postavwikiImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return postavwiki;
	}

	/**
	 * Returns the postavwiki with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param postavwiki_id the primary key of the postavwiki
	 * @return the postavwiki, or <code>null</code> if a postavwiki with the primary key could not be found
	 */
	@Override
	public postavwiki fetchByPrimaryKey(long postavwiki_id) {
		return fetchByPrimaryKey((Serializable)postavwiki_id);
	}

	@Override
	public Map<Serializable, postavwiki> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, postavwiki> map = new HashMap<Serializable, postavwiki>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			postavwiki postavwiki = fetchByPrimaryKey(primaryKey);

			if (postavwiki != null) {
				map.put(primaryKey, postavwiki);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(postavwikiModelImpl.ENTITY_CACHE_ENABLED,
					postavwikiImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (postavwiki)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_POSTAVWIKI_WHERE_PKS_IN);

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

			for (postavwiki postavwiki : (List<postavwiki>)q.list()) {
				map.put(postavwiki.getPrimaryKeyObj(), postavwiki);

				cacheResult(postavwiki);

				uncachedPrimaryKeys.remove(postavwiki.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(postavwikiModelImpl.ENTITY_CACHE_ENABLED,
					postavwikiImpl.class, primaryKey, nullModel);
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
	 * Returns all the postavwikis.
	 *
	 * @return the postavwikis
	 */
	@Override
	public List<postavwiki> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the postavwikis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link postavwikiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of postavwikis
	 * @param end the upper bound of the range of postavwikis (not inclusive)
	 * @return the range of postavwikis
	 */
	@Override
	public List<postavwiki> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the postavwikis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link postavwikiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of postavwikis
	 * @param end the upper bound of the range of postavwikis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of postavwikis
	 */
	@Override
	public List<postavwiki> findAll(int start, int end,
		OrderByComparator<postavwiki> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the postavwikis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link postavwikiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of postavwikis
	 * @param end the upper bound of the range of postavwikis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of postavwikis
	 */
	@Override
	public List<postavwiki> findAll(int start, int end,
		OrderByComparator<postavwiki> orderByComparator,
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

		List<postavwiki> list = null;

		if (retrieveFromCache) {
			list = (List<postavwiki>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_POSTAVWIKI);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_POSTAVWIKI;

				if (pagination) {
					sql = sql.concat(postavwikiModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<postavwiki>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<postavwiki>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Removes all the postavwikis from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (postavwiki postavwiki : findAll()) {
			remove(postavwiki);
		}
	}

	/**
	 * Returns the number of postavwikis.
	 *
	 * @return the number of postavwikis
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_POSTAVWIKI);

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
		return postavwikiModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the postavwiki persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(postavwikiImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_POSTAVWIKI = "SELECT postavwiki FROM postavwiki postavwiki";
	private static final String _SQL_SELECT_POSTAVWIKI_WHERE_PKS_IN = "SELECT postavwiki FROM postavwiki postavwiki WHERE postavwiki_id IN (";
	private static final String _SQL_COUNT_POSTAVWIKI = "SELECT COUNT(postavwiki) FROM postavwiki postavwiki";
	private static final String _ORDER_BY_ENTITY_ALIAS = "postavwiki.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No postavwiki exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(postavwikiPersistenceImpl.class);
}
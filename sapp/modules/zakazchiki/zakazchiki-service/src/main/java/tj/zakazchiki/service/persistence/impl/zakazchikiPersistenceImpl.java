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

package tj.zakazchiki.service.persistence.impl;

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

import tj.zakazchiki.exception.NoSuchzakazchikiException;

import tj.zakazchiki.model.impl.zakazchikiImpl;
import tj.zakazchiki.model.impl.zakazchikiModelImpl;
import tj.zakazchiki.model.zakazchiki;

import tj.zakazchiki.service.persistence.zakazchikiPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the zakazchiki service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see zakazchikiPersistence
 * @see tj.zakazchiki.service.persistence.zakazchikiUtil
 * @generated
 */
@ProviderType
public class zakazchikiPersistenceImpl extends BasePersistenceImpl<zakazchiki>
	implements zakazchikiPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link zakazchikiUtil} to access the zakazchiki persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = zakazchikiImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(zakazchikiModelImpl.ENTITY_CACHE_ENABLED,
			zakazchikiModelImpl.FINDER_CACHE_ENABLED, zakazchikiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(zakazchikiModelImpl.ENTITY_CACHE_ENABLED,
			zakazchikiModelImpl.FINDER_CACHE_ENABLED, zakazchikiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(zakazchikiModelImpl.ENTITY_CACHE_ENABLED,
			zakazchikiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public zakazchikiPersistenceImpl() {
		setModelClass(zakazchiki.class);
	}

	/**
	 * Caches the zakazchiki in the entity cache if it is enabled.
	 *
	 * @param zakazchiki the zakazchiki
	 */
	@Override
	public void cacheResult(zakazchiki zakazchiki) {
		entityCache.putResult(zakazchikiModelImpl.ENTITY_CACHE_ENABLED,
			zakazchikiImpl.class, zakazchiki.getPrimaryKey(), zakazchiki);

		zakazchiki.resetOriginalValues();
	}

	/**
	 * Caches the zakazchikis in the entity cache if it is enabled.
	 *
	 * @param zakazchikis the zakazchikis
	 */
	@Override
	public void cacheResult(List<zakazchiki> zakazchikis) {
		for (zakazchiki zakazchiki : zakazchikis) {
			if (entityCache.getResult(
						zakazchikiModelImpl.ENTITY_CACHE_ENABLED,
						zakazchikiImpl.class, zakazchiki.getPrimaryKey()) == null) {
				cacheResult(zakazchiki);
			}
			else {
				zakazchiki.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all zakazchikis.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(zakazchikiImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the zakazchiki.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(zakazchiki zakazchiki) {
		entityCache.removeResult(zakazchikiModelImpl.ENTITY_CACHE_ENABLED,
			zakazchikiImpl.class, zakazchiki.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<zakazchiki> zakazchikis) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (zakazchiki zakazchiki : zakazchikis) {
			entityCache.removeResult(zakazchikiModelImpl.ENTITY_CACHE_ENABLED,
				zakazchikiImpl.class, zakazchiki.getPrimaryKey());
		}
	}

	/**
	 * Creates a new zakazchiki with the primary key. Does not add the zakazchiki to the database.
	 *
	 * @param zakazchiki_id the primary key for the new zakazchiki
	 * @return the new zakazchiki
	 */
	@Override
	public zakazchiki create(long zakazchiki_id) {
		zakazchiki zakazchiki = new zakazchikiImpl();

		zakazchiki.setNew(true);
		zakazchiki.setPrimaryKey(zakazchiki_id);

		return zakazchiki;
	}

	/**
	 * Removes the zakazchiki with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param zakazchiki_id the primary key of the zakazchiki
	 * @return the zakazchiki that was removed
	 * @throws NoSuchzakazchikiException if a zakazchiki with the primary key could not be found
	 */
	@Override
	public zakazchiki remove(long zakazchiki_id)
		throws NoSuchzakazchikiException {
		return remove((Serializable)zakazchiki_id);
	}

	/**
	 * Removes the zakazchiki with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the zakazchiki
	 * @return the zakazchiki that was removed
	 * @throws NoSuchzakazchikiException if a zakazchiki with the primary key could not be found
	 */
	@Override
	public zakazchiki remove(Serializable primaryKey)
		throws NoSuchzakazchikiException {
		Session session = null;

		try {
			session = openSession();

			zakazchiki zakazchiki = (zakazchiki)session.get(zakazchikiImpl.class,
					primaryKey);

			if (zakazchiki == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchzakazchikiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(zakazchiki);
		}
		catch (NoSuchzakazchikiException nsee) {
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
	protected zakazchiki removeImpl(zakazchiki zakazchiki) {
		zakazchiki = toUnwrappedModel(zakazchiki);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(zakazchiki)) {
				zakazchiki = (zakazchiki)session.get(zakazchikiImpl.class,
						zakazchiki.getPrimaryKeyObj());
			}

			if (zakazchiki != null) {
				session.delete(zakazchiki);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (zakazchiki != null) {
			clearCache(zakazchiki);
		}

		return zakazchiki;
	}

	@Override
	public zakazchiki updateImpl(zakazchiki zakazchiki) {
		zakazchiki = toUnwrappedModel(zakazchiki);

		boolean isNew = zakazchiki.isNew();

		Session session = null;

		try {
			session = openSession();

			if (zakazchiki.isNew()) {
				session.save(zakazchiki);

				zakazchiki.setNew(false);
			}
			else {
				zakazchiki = (zakazchiki)session.merge(zakazchiki);
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

		entityCache.putResult(zakazchikiModelImpl.ENTITY_CACHE_ENABLED,
			zakazchikiImpl.class, zakazchiki.getPrimaryKey(), zakazchiki, false);

		zakazchiki.resetOriginalValues();

		return zakazchiki;
	}

	protected zakazchiki toUnwrappedModel(zakazchiki zakazchiki) {
		if (zakazchiki instanceof zakazchikiImpl) {
			return zakazchiki;
		}

		zakazchikiImpl zakazchikiImpl = new zakazchikiImpl();

		zakazchikiImpl.setNew(zakazchiki.isNew());
		zakazchikiImpl.setPrimaryKey(zakazchiki.getPrimaryKey());

		zakazchikiImpl.setAdres(zakazchiki.getAdres());
		zakazchikiImpl.setData_izmenenija(zakazchiki.getData_izmenenija());
		zakazchikiImpl.setData_sozdanija(zakazchiki.getData_sozdanija());
		zakazchikiImpl.setEin(zakazchiki.getEin());
		zakazchikiImpl.setFbk_id(zakazchiki.getFbk_id());
		zakazchikiImpl.setGorod(zakazchiki.getGorod());
		zakazchikiImpl.setInn(zakazchiki.getInn());
		zakazchikiImpl.setIstochnik_finansirovanija_id(zakazchiki.getIstochnik_finansirovanija_id());
		zakazchikiImpl.setIzmenil(zakazchiki.getIzmenil());
		zakazchikiImpl.setJe_pochta(zakazchiki.getJe_pochta());
		zakazchikiImpl.setKontaktnyj_telefon(zakazchiki.getKontaktnyj_telefon());
		zakazchikiImpl.setKvalificirovannaja_organizacija(zakazchiki.getKvalificirovannaja_organizacija());
		zakazchikiImpl.setNaimenovanie(zakazchiki.getNaimenovanie());
		zakazchikiImpl.setOblast_id(zakazchiki.getOblast_id());
		zakazchikiImpl.setOtvetstvennoe_lico(zakazchiki.getOtvetstvennoe_lico());
		zakazchikiImpl.setRajon_id(zakazchiki.getRajon_id());
		zakazchikiImpl.setRukovoditel(zakazchiki.getRukovoditel());
		zakazchikiImpl.setSozdal(zakazchiki.getSozdal());
		zakazchikiImpl.setVbk_id(zakazchiki.getVbk_id());
		zakazchikiImpl.setZakazchiki_id(zakazchiki.getZakazchiki_id());

		return zakazchikiImpl;
	}

	/**
	 * Returns the zakazchiki with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the zakazchiki
	 * @return the zakazchiki
	 * @throws NoSuchzakazchikiException if a zakazchiki with the primary key could not be found
	 */
	@Override
	public zakazchiki findByPrimaryKey(Serializable primaryKey)
		throws NoSuchzakazchikiException {
		zakazchiki zakazchiki = fetchByPrimaryKey(primaryKey);

		if (zakazchiki == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchzakazchikiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return zakazchiki;
	}

	/**
	 * Returns the zakazchiki with the primary key or throws a {@link NoSuchzakazchikiException} if it could not be found.
	 *
	 * @param zakazchiki_id the primary key of the zakazchiki
	 * @return the zakazchiki
	 * @throws NoSuchzakazchikiException if a zakazchiki with the primary key could not be found
	 */
	@Override
	public zakazchiki findByPrimaryKey(long zakazchiki_id)
		throws NoSuchzakazchikiException {
		return findByPrimaryKey((Serializable)zakazchiki_id);
	}

	/**
	 * Returns the zakazchiki with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the zakazchiki
	 * @return the zakazchiki, or <code>null</code> if a zakazchiki with the primary key could not be found
	 */
	@Override
	public zakazchiki fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(zakazchikiModelImpl.ENTITY_CACHE_ENABLED,
				zakazchikiImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		zakazchiki zakazchiki = (zakazchiki)serializable;

		if (zakazchiki == null) {
			Session session = null;

			try {
				session = openSession();

				zakazchiki = (zakazchiki)session.get(zakazchikiImpl.class,
						primaryKey);

				if (zakazchiki != null) {
					cacheResult(zakazchiki);
				}
				else {
					entityCache.putResult(zakazchikiModelImpl.ENTITY_CACHE_ENABLED,
						zakazchikiImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(zakazchikiModelImpl.ENTITY_CACHE_ENABLED,
					zakazchikiImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return zakazchiki;
	}

	/**
	 * Returns the zakazchiki with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param zakazchiki_id the primary key of the zakazchiki
	 * @return the zakazchiki, or <code>null</code> if a zakazchiki with the primary key could not be found
	 */
	@Override
	public zakazchiki fetchByPrimaryKey(long zakazchiki_id) {
		return fetchByPrimaryKey((Serializable)zakazchiki_id);
	}

	@Override
	public Map<Serializable, zakazchiki> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, zakazchiki> map = new HashMap<Serializable, zakazchiki>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			zakazchiki zakazchiki = fetchByPrimaryKey(primaryKey);

			if (zakazchiki != null) {
				map.put(primaryKey, zakazchiki);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(zakazchikiModelImpl.ENTITY_CACHE_ENABLED,
					zakazchikiImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (zakazchiki)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ZAKAZCHIKI_WHERE_PKS_IN);

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

			for (zakazchiki zakazchiki : (List<zakazchiki>)q.list()) {
				map.put(zakazchiki.getPrimaryKeyObj(), zakazchiki);

				cacheResult(zakazchiki);

				uncachedPrimaryKeys.remove(zakazchiki.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(zakazchikiModelImpl.ENTITY_CACHE_ENABLED,
					zakazchikiImpl.class, primaryKey, nullModel);
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
	 * Returns all the zakazchikis.
	 *
	 * @return the zakazchikis
	 */
	@Override
	public List<zakazchiki> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the zakazchikis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link zakazchikiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of zakazchikis
	 * @param end the upper bound of the range of zakazchikis (not inclusive)
	 * @return the range of zakazchikis
	 */
	@Override
	public List<zakazchiki> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the zakazchikis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link zakazchikiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of zakazchikis
	 * @param end the upper bound of the range of zakazchikis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of zakazchikis
	 */
	@Override
	public List<zakazchiki> findAll(int start, int end,
		OrderByComparator<zakazchiki> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the zakazchikis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link zakazchikiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of zakazchikis
	 * @param end the upper bound of the range of zakazchikis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of zakazchikis
	 */
	@Override
	public List<zakazchiki> findAll(int start, int end,
		OrderByComparator<zakazchiki> orderByComparator,
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

		List<zakazchiki> list = null;

		if (retrieveFromCache) {
			list = (List<zakazchiki>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ZAKAZCHIKI);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ZAKAZCHIKI;

				if (pagination) {
					sql = sql.concat(zakazchikiModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<zakazchiki>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<zakazchiki>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the zakazchikis from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (zakazchiki zakazchiki : findAll()) {
			remove(zakazchiki);
		}
	}

	/**
	 * Returns the number of zakazchikis.
	 *
	 * @return the number of zakazchikis
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ZAKAZCHIKI);

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
		return zakazchikiModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the zakazchiki persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(zakazchikiImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_ZAKAZCHIKI = "SELECT zakazchiki FROM zakazchiki zakazchiki";
	private static final String _SQL_SELECT_ZAKAZCHIKI_WHERE_PKS_IN = "SELECT zakazchiki FROM zakazchiki zakazchiki WHERE zakazchiki_id IN (";
	private static final String _SQL_COUNT_ZAKAZCHIKI = "SELECT COUNT(zakazchiki) FROM zakazchiki zakazchiki";
	private static final String _ORDER_BY_ENTITY_ALIAS = "zakazchiki.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No zakazchiki exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(zakazchikiPersistenceImpl.class);
}
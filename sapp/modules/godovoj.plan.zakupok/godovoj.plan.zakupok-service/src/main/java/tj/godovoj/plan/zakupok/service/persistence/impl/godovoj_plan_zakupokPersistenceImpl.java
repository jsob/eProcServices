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

package tj.godovoj.plan.zakupok.service.persistence.impl;

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

import tj.godovoj.plan.zakupok.exception.NoSuchgodovoj_plan_zakupokException;
import tj.godovoj.plan.zakupok.model.godovoj_plan_zakupok;
import tj.godovoj.plan.zakupok.model.impl.godovoj_plan_zakupokImpl;
import tj.godovoj.plan.zakupok.model.impl.godovoj_plan_zakupokModelImpl;
import tj.godovoj.plan.zakupok.service.persistence.godovoj_plan_zakupokPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the godovoj_plan_zakupok service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see godovoj_plan_zakupokPersistence
 * @see tj.godovoj.plan.zakupok.service.persistence.godovoj_plan_zakupokUtil
 * @generated
 */
@ProviderType
public class godovoj_plan_zakupokPersistenceImpl extends BasePersistenceImpl<godovoj_plan_zakupok>
	implements godovoj_plan_zakupokPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link godovoj_plan_zakupokUtil} to access the godovoj_plan_zakupok persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = godovoj_plan_zakupokImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(godovoj_plan_zakupokModelImpl.ENTITY_CACHE_ENABLED,
			godovoj_plan_zakupokModelImpl.FINDER_CACHE_ENABLED,
			godovoj_plan_zakupokImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(godovoj_plan_zakupokModelImpl.ENTITY_CACHE_ENABLED,
			godovoj_plan_zakupokModelImpl.FINDER_CACHE_ENABLED,
			godovoj_plan_zakupokImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(godovoj_plan_zakupokModelImpl.ENTITY_CACHE_ENABLED,
			godovoj_plan_zakupokModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public godovoj_plan_zakupokPersistenceImpl() {
		setModelClass(godovoj_plan_zakupok.class);
	}

	/**
	 * Caches the godovoj_plan_zakupok in the entity cache if it is enabled.
	 *
	 * @param godovoj_plan_zakupok the godovoj_plan_zakupok
	 */
	@Override
	public void cacheResult(godovoj_plan_zakupok godovoj_plan_zakupok) {
		entityCache.putResult(godovoj_plan_zakupokModelImpl.ENTITY_CACHE_ENABLED,
			godovoj_plan_zakupokImpl.class,
			godovoj_plan_zakupok.getPrimaryKey(), godovoj_plan_zakupok);

		godovoj_plan_zakupok.resetOriginalValues();
	}

	/**
	 * Caches the godovoj_plan_zakupoks in the entity cache if it is enabled.
	 *
	 * @param godovoj_plan_zakupoks the godovoj_plan_zakupoks
	 */
	@Override
	public void cacheResult(List<godovoj_plan_zakupok> godovoj_plan_zakupoks) {
		for (godovoj_plan_zakupok godovoj_plan_zakupok : godovoj_plan_zakupoks) {
			if (entityCache.getResult(
						godovoj_plan_zakupokModelImpl.ENTITY_CACHE_ENABLED,
						godovoj_plan_zakupokImpl.class,
						godovoj_plan_zakupok.getPrimaryKey()) == null) {
				cacheResult(godovoj_plan_zakupok);
			}
			else {
				godovoj_plan_zakupok.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all godovoj_plan_zakupoks.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(godovoj_plan_zakupokImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the godovoj_plan_zakupok.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(godovoj_plan_zakupok godovoj_plan_zakupok) {
		entityCache.removeResult(godovoj_plan_zakupokModelImpl.ENTITY_CACHE_ENABLED,
			godovoj_plan_zakupokImpl.class, godovoj_plan_zakupok.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<godovoj_plan_zakupok> godovoj_plan_zakupoks) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (godovoj_plan_zakupok godovoj_plan_zakupok : godovoj_plan_zakupoks) {
			entityCache.removeResult(godovoj_plan_zakupokModelImpl.ENTITY_CACHE_ENABLED,
				godovoj_plan_zakupokImpl.class,
				godovoj_plan_zakupok.getPrimaryKey());
		}
	}

	/**
	 * Creates a new godovoj_plan_zakupok with the primary key. Does not add the godovoj_plan_zakupok to the database.
	 *
	 * @param godovoj_plan_zakupok_id the primary key for the new godovoj_plan_zakupok
	 * @return the new godovoj_plan_zakupok
	 */
	@Override
	public godovoj_plan_zakupok create(long godovoj_plan_zakupok_id) {
		godovoj_plan_zakupok godovoj_plan_zakupok = new godovoj_plan_zakupokImpl();

		godovoj_plan_zakupok.setNew(true);
		godovoj_plan_zakupok.setPrimaryKey(godovoj_plan_zakupok_id);

		return godovoj_plan_zakupok;
	}

	/**
	 * Removes the godovoj_plan_zakupok with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param godovoj_plan_zakupok_id the primary key of the godovoj_plan_zakupok
	 * @return the godovoj_plan_zakupok that was removed
	 * @throws NoSuchgodovoj_plan_zakupokException if a godovoj_plan_zakupok with the primary key could not be found
	 */
	@Override
	public godovoj_plan_zakupok remove(long godovoj_plan_zakupok_id)
		throws NoSuchgodovoj_plan_zakupokException {
		return remove((Serializable)godovoj_plan_zakupok_id);
	}

	/**
	 * Removes the godovoj_plan_zakupok with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the godovoj_plan_zakupok
	 * @return the godovoj_plan_zakupok that was removed
	 * @throws NoSuchgodovoj_plan_zakupokException if a godovoj_plan_zakupok with the primary key could not be found
	 */
	@Override
	public godovoj_plan_zakupok remove(Serializable primaryKey)
		throws NoSuchgodovoj_plan_zakupokException {
		Session session = null;

		try {
			session = openSession();

			godovoj_plan_zakupok godovoj_plan_zakupok = (godovoj_plan_zakupok)session.get(godovoj_plan_zakupokImpl.class,
					primaryKey);

			if (godovoj_plan_zakupok == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchgodovoj_plan_zakupokException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(godovoj_plan_zakupok);
		}
		catch (NoSuchgodovoj_plan_zakupokException nsee) {
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
	protected godovoj_plan_zakupok removeImpl(
		godovoj_plan_zakupok godovoj_plan_zakupok) {
		godovoj_plan_zakupok = toUnwrappedModel(godovoj_plan_zakupok);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(godovoj_plan_zakupok)) {
				godovoj_plan_zakupok = (godovoj_plan_zakupok)session.get(godovoj_plan_zakupokImpl.class,
						godovoj_plan_zakupok.getPrimaryKeyObj());
			}

			if (godovoj_plan_zakupok != null) {
				session.delete(godovoj_plan_zakupok);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (godovoj_plan_zakupok != null) {
			clearCache(godovoj_plan_zakupok);
		}

		return godovoj_plan_zakupok;
	}

	@Override
	public godovoj_plan_zakupok updateImpl(
		godovoj_plan_zakupok godovoj_plan_zakupok) {
		godovoj_plan_zakupok = toUnwrappedModel(godovoj_plan_zakupok);

		boolean isNew = godovoj_plan_zakupok.isNew();

		Session session = null;

		try {
			session = openSession();

			if (godovoj_plan_zakupok.isNew()) {
				session.save(godovoj_plan_zakupok);

				godovoj_plan_zakupok.setNew(false);
			}
			else {
				godovoj_plan_zakupok = (godovoj_plan_zakupok)session.merge(godovoj_plan_zakupok);
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

		entityCache.putResult(godovoj_plan_zakupokModelImpl.ENTITY_CACHE_ENABLED,
			godovoj_plan_zakupokImpl.class,
			godovoj_plan_zakupok.getPrimaryKey(), godovoj_plan_zakupok, false);

		godovoj_plan_zakupok.resetOriginalValues();

		return godovoj_plan_zakupok;
	}

	protected godovoj_plan_zakupok toUnwrappedModel(
		godovoj_plan_zakupok godovoj_plan_zakupok) {
		if (godovoj_plan_zakupok instanceof godovoj_plan_zakupokImpl) {
			return godovoj_plan_zakupok;
		}

		godovoj_plan_zakupokImpl godovoj_plan_zakupokImpl = new godovoj_plan_zakupokImpl();

		godovoj_plan_zakupokImpl.setNew(godovoj_plan_zakupok.isNew());
		godovoj_plan_zakupokImpl.setPrimaryKey(godovoj_plan_zakupok.getPrimaryKey());

		godovoj_plan_zakupokImpl.setData_sozdanija(godovoj_plan_zakupok.getData_sozdanija());
		godovoj_plan_zakupokImpl.setGodovoj_plan_zakupok_id(godovoj_plan_zakupok.getGodovoj_plan_zakupok_id());
		godovoj_plan_zakupokImpl.setIstochnik_finansirovanija_id(godovoj_plan_zakupok.getIstochnik_finansirovanija_id());
		godovoj_plan_zakupokImpl.setNaimenovanie_predmeta_zakupki(godovoj_plan_zakupok.getNaimenovanie_predmeta_zakupki());
		godovoj_plan_zakupokImpl.setPlaniruemyj_metod_zakupki_id(godovoj_plan_zakupok.getPlaniruemyj_metod_zakupki_id());
		godovoj_plan_zakupokImpl.setPredpolagaemaja_summa(godovoj_plan_zakupok.getPredpolagaemaja_summa());
		godovoj_plan_zakupokImpl.setSozdal(godovoj_plan_zakupok.getSozdal());
		godovoj_plan_zakupokImpl.setSroki_provedenija_zakupki(godovoj_plan_zakupok.getSroki_provedenija_zakupki());
		godovoj_plan_zakupokImpl.setSumma_finansirovanija(godovoj_plan_zakupok.getSumma_finansirovanija());
		godovoj_plan_zakupokImpl.setVbk_id(godovoj_plan_zakupok.getVbk_id());

		return godovoj_plan_zakupokImpl;
	}

	/**
	 * Returns the godovoj_plan_zakupok with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the godovoj_plan_zakupok
	 * @return the godovoj_plan_zakupok
	 * @throws NoSuchgodovoj_plan_zakupokException if a godovoj_plan_zakupok with the primary key could not be found
	 */
	@Override
	public godovoj_plan_zakupok findByPrimaryKey(Serializable primaryKey)
		throws NoSuchgodovoj_plan_zakupokException {
		godovoj_plan_zakupok godovoj_plan_zakupok = fetchByPrimaryKey(primaryKey);

		if (godovoj_plan_zakupok == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchgodovoj_plan_zakupokException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return godovoj_plan_zakupok;
	}

	/**
	 * Returns the godovoj_plan_zakupok with the primary key or throws a {@link NoSuchgodovoj_plan_zakupokException} if it could not be found.
	 *
	 * @param godovoj_plan_zakupok_id the primary key of the godovoj_plan_zakupok
	 * @return the godovoj_plan_zakupok
	 * @throws NoSuchgodovoj_plan_zakupokException if a godovoj_plan_zakupok with the primary key could not be found
	 */
	@Override
	public godovoj_plan_zakupok findByPrimaryKey(long godovoj_plan_zakupok_id)
		throws NoSuchgodovoj_plan_zakupokException {
		return findByPrimaryKey((Serializable)godovoj_plan_zakupok_id);
	}

	/**
	 * Returns the godovoj_plan_zakupok with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the godovoj_plan_zakupok
	 * @return the godovoj_plan_zakupok, or <code>null</code> if a godovoj_plan_zakupok with the primary key could not be found
	 */
	@Override
	public godovoj_plan_zakupok fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(godovoj_plan_zakupokModelImpl.ENTITY_CACHE_ENABLED,
				godovoj_plan_zakupokImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		godovoj_plan_zakupok godovoj_plan_zakupok = (godovoj_plan_zakupok)serializable;

		if (godovoj_plan_zakupok == null) {
			Session session = null;

			try {
				session = openSession();

				godovoj_plan_zakupok = (godovoj_plan_zakupok)session.get(godovoj_plan_zakupokImpl.class,
						primaryKey);

				if (godovoj_plan_zakupok != null) {
					cacheResult(godovoj_plan_zakupok);
				}
				else {
					entityCache.putResult(godovoj_plan_zakupokModelImpl.ENTITY_CACHE_ENABLED,
						godovoj_plan_zakupokImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(godovoj_plan_zakupokModelImpl.ENTITY_CACHE_ENABLED,
					godovoj_plan_zakupokImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return godovoj_plan_zakupok;
	}

	/**
	 * Returns the godovoj_plan_zakupok with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param godovoj_plan_zakupok_id the primary key of the godovoj_plan_zakupok
	 * @return the godovoj_plan_zakupok, or <code>null</code> if a godovoj_plan_zakupok with the primary key could not be found
	 */
	@Override
	public godovoj_plan_zakupok fetchByPrimaryKey(long godovoj_plan_zakupok_id) {
		return fetchByPrimaryKey((Serializable)godovoj_plan_zakupok_id);
	}

	@Override
	public Map<Serializable, godovoj_plan_zakupok> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, godovoj_plan_zakupok> map = new HashMap<Serializable, godovoj_plan_zakupok>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			godovoj_plan_zakupok godovoj_plan_zakupok = fetchByPrimaryKey(primaryKey);

			if (godovoj_plan_zakupok != null) {
				map.put(primaryKey, godovoj_plan_zakupok);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(godovoj_plan_zakupokModelImpl.ENTITY_CACHE_ENABLED,
					godovoj_plan_zakupokImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (godovoj_plan_zakupok)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_GODOVOJ_PLAN_ZAKUPOK_WHERE_PKS_IN);

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

			for (godovoj_plan_zakupok godovoj_plan_zakupok : (List<godovoj_plan_zakupok>)q.list()) {
				map.put(godovoj_plan_zakupok.getPrimaryKeyObj(),
					godovoj_plan_zakupok);

				cacheResult(godovoj_plan_zakupok);

				uncachedPrimaryKeys.remove(godovoj_plan_zakupok.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(godovoj_plan_zakupokModelImpl.ENTITY_CACHE_ENABLED,
					godovoj_plan_zakupokImpl.class, primaryKey, nullModel);
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
	 * Returns all the godovoj_plan_zakupoks.
	 *
	 * @return the godovoj_plan_zakupoks
	 */
	@Override
	public List<godovoj_plan_zakupok> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the godovoj_plan_zakupoks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link godovoj_plan_zakupokModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of godovoj_plan_zakupoks
	 * @param end the upper bound of the range of godovoj_plan_zakupoks (not inclusive)
	 * @return the range of godovoj_plan_zakupoks
	 */
	@Override
	public List<godovoj_plan_zakupok> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the godovoj_plan_zakupoks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link godovoj_plan_zakupokModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of godovoj_plan_zakupoks
	 * @param end the upper bound of the range of godovoj_plan_zakupoks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of godovoj_plan_zakupoks
	 */
	@Override
	public List<godovoj_plan_zakupok> findAll(int start, int end,
		OrderByComparator<godovoj_plan_zakupok> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the godovoj_plan_zakupoks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link godovoj_plan_zakupokModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of godovoj_plan_zakupoks
	 * @param end the upper bound of the range of godovoj_plan_zakupoks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of godovoj_plan_zakupoks
	 */
	@Override
	public List<godovoj_plan_zakupok> findAll(int start, int end,
		OrderByComparator<godovoj_plan_zakupok> orderByComparator,
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

		List<godovoj_plan_zakupok> list = null;

		if (retrieveFromCache) {
			list = (List<godovoj_plan_zakupok>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_GODOVOJ_PLAN_ZAKUPOK);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_GODOVOJ_PLAN_ZAKUPOK;

				if (pagination) {
					sql = sql.concat(godovoj_plan_zakupokModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<godovoj_plan_zakupok>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<godovoj_plan_zakupok>)QueryUtil.list(q,
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
	 * Removes all the godovoj_plan_zakupoks from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (godovoj_plan_zakupok godovoj_plan_zakupok : findAll()) {
			remove(godovoj_plan_zakupok);
		}
	}

	/**
	 * Returns the number of godovoj_plan_zakupoks.
	 *
	 * @return the number of godovoj_plan_zakupoks
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_GODOVOJ_PLAN_ZAKUPOK);

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
		return godovoj_plan_zakupokModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the godovoj_plan_zakupok persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(godovoj_plan_zakupokImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_GODOVOJ_PLAN_ZAKUPOK = "SELECT godovoj_plan_zakupok FROM godovoj_plan_zakupok godovoj_plan_zakupok";
	private static final String _SQL_SELECT_GODOVOJ_PLAN_ZAKUPOK_WHERE_PKS_IN = "SELECT godovoj_plan_zakupok FROM godovoj_plan_zakupok godovoj_plan_zakupok WHERE godovoj_plan_zakupok_id IN (";
	private static final String _SQL_COUNT_GODOVOJ_PLAN_ZAKUPOK = "SELECT COUNT(godovoj_plan_zakupok) FROM godovoj_plan_zakupok godovoj_plan_zakupok";
	private static final String _ORDER_BY_ENTITY_ALIAS = "godovoj_plan_zakupok.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No godovoj_plan_zakupok exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(godovoj_plan_zakupokPersistenceImpl.class);
}
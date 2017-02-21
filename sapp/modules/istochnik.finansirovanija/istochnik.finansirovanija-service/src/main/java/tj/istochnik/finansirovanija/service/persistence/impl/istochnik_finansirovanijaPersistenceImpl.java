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

package tj.istochnik.finansirovanija.service.persistence.impl;

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

import tj.istochnik.finansirovanija.exception.NoSuchistochnik_finansirovanijaException;
import tj.istochnik.finansirovanija.model.impl.istochnik_finansirovanijaImpl;
import tj.istochnik.finansirovanija.model.impl.istochnik_finansirovanijaModelImpl;
import tj.istochnik.finansirovanija.model.istochnik_finansirovanija;
import tj.istochnik.finansirovanija.service.persistence.istochnik_finansirovanijaPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the istochnik_finansirovanija service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see istochnik_finansirovanijaPersistence
 * @see tj.istochnik.finansirovanija.service.persistence.istochnik_finansirovanijaUtil
 * @generated
 */
@ProviderType
public class istochnik_finansirovanijaPersistenceImpl
	extends BasePersistenceImpl<istochnik_finansirovanija>
	implements istochnik_finansirovanijaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link istochnik_finansirovanijaUtil} to access the istochnik_finansirovanija persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = istochnik_finansirovanijaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(istochnik_finansirovanijaModelImpl.ENTITY_CACHE_ENABLED,
			istochnik_finansirovanijaModelImpl.FINDER_CACHE_ENABLED,
			istochnik_finansirovanijaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(istochnik_finansirovanijaModelImpl.ENTITY_CACHE_ENABLED,
			istochnik_finansirovanijaModelImpl.FINDER_CACHE_ENABLED,
			istochnik_finansirovanijaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(istochnik_finansirovanijaModelImpl.ENTITY_CACHE_ENABLED,
			istochnik_finansirovanijaModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	public istochnik_finansirovanijaPersistenceImpl() {
		setModelClass(istochnik_finansirovanija.class);
	}

	/**
	 * Caches the istochnik_finansirovanija in the entity cache if it is enabled.
	 *
	 * @param istochnik_finansirovanija the istochnik_finansirovanija
	 */
	@Override
	public void cacheResult(istochnik_finansirovanija istochnik_finansirovanija) {
		entityCache.putResult(istochnik_finansirovanijaModelImpl.ENTITY_CACHE_ENABLED,
			istochnik_finansirovanijaImpl.class,
			istochnik_finansirovanija.getPrimaryKey(), istochnik_finansirovanija);

		istochnik_finansirovanija.resetOriginalValues();
	}

	/**
	 * Caches the istochnik_finansirovanijas in the entity cache if it is enabled.
	 *
	 * @param istochnik_finansirovanijas the istochnik_finansirovanijas
	 */
	@Override
	public void cacheResult(
		List<istochnik_finansirovanija> istochnik_finansirovanijas) {
		for (istochnik_finansirovanija istochnik_finansirovanija : istochnik_finansirovanijas) {
			if (entityCache.getResult(
						istochnik_finansirovanijaModelImpl.ENTITY_CACHE_ENABLED,
						istochnik_finansirovanijaImpl.class,
						istochnik_finansirovanija.getPrimaryKey()) == null) {
				cacheResult(istochnik_finansirovanija);
			}
			else {
				istochnik_finansirovanija.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all istochnik_finansirovanijas.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(istochnik_finansirovanijaImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the istochnik_finansirovanija.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(istochnik_finansirovanija istochnik_finansirovanija) {
		entityCache.removeResult(istochnik_finansirovanijaModelImpl.ENTITY_CACHE_ENABLED,
			istochnik_finansirovanijaImpl.class,
			istochnik_finansirovanija.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<istochnik_finansirovanija> istochnik_finansirovanijas) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (istochnik_finansirovanija istochnik_finansirovanija : istochnik_finansirovanijas) {
			entityCache.removeResult(istochnik_finansirovanijaModelImpl.ENTITY_CACHE_ENABLED,
				istochnik_finansirovanijaImpl.class,
				istochnik_finansirovanija.getPrimaryKey());
		}
	}

	/**
	 * Creates a new istochnik_finansirovanija with the primary key. Does not add the istochnik_finansirovanija to the database.
	 *
	 * @param istochnik_finansirovanija_id the primary key for the new istochnik_finansirovanija
	 * @return the new istochnik_finansirovanija
	 */
	@Override
	public istochnik_finansirovanija create(long istochnik_finansirovanija_id) {
		istochnik_finansirovanija istochnik_finansirovanija = new istochnik_finansirovanijaImpl();

		istochnik_finansirovanija.setNew(true);
		istochnik_finansirovanija.setPrimaryKey(istochnik_finansirovanija_id);

		return istochnik_finansirovanija;
	}

	/**
	 * Removes the istochnik_finansirovanija with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param istochnik_finansirovanija_id the primary key of the istochnik_finansirovanija
	 * @return the istochnik_finansirovanija that was removed
	 * @throws NoSuchistochnik_finansirovanijaException if a istochnik_finansirovanija with the primary key could not be found
	 */
	@Override
	public istochnik_finansirovanija remove(long istochnik_finansirovanija_id)
		throws NoSuchistochnik_finansirovanijaException {
		return remove((Serializable)istochnik_finansirovanija_id);
	}

	/**
	 * Removes the istochnik_finansirovanija with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the istochnik_finansirovanija
	 * @return the istochnik_finansirovanija that was removed
	 * @throws NoSuchistochnik_finansirovanijaException if a istochnik_finansirovanija with the primary key could not be found
	 */
	@Override
	public istochnik_finansirovanija remove(Serializable primaryKey)
		throws NoSuchistochnik_finansirovanijaException {
		Session session = null;

		try {
			session = openSession();

			istochnik_finansirovanija istochnik_finansirovanija = (istochnik_finansirovanija)session.get(istochnik_finansirovanijaImpl.class,
					primaryKey);

			if (istochnik_finansirovanija == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchistochnik_finansirovanijaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(istochnik_finansirovanija);
		}
		catch (NoSuchistochnik_finansirovanijaException nsee) {
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
	protected istochnik_finansirovanija removeImpl(
		istochnik_finansirovanija istochnik_finansirovanija) {
		istochnik_finansirovanija = toUnwrappedModel(istochnik_finansirovanija);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(istochnik_finansirovanija)) {
				istochnik_finansirovanija = (istochnik_finansirovanija)session.get(istochnik_finansirovanijaImpl.class,
						istochnik_finansirovanija.getPrimaryKeyObj());
			}

			if (istochnik_finansirovanija != null) {
				session.delete(istochnik_finansirovanija);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (istochnik_finansirovanija != null) {
			clearCache(istochnik_finansirovanija);
		}

		return istochnik_finansirovanija;
	}

	@Override
	public istochnik_finansirovanija updateImpl(
		istochnik_finansirovanija istochnik_finansirovanija) {
		istochnik_finansirovanija = toUnwrappedModel(istochnik_finansirovanija);

		boolean isNew = istochnik_finansirovanija.isNew();

		Session session = null;

		try {
			session = openSession();

			if (istochnik_finansirovanija.isNew()) {
				session.save(istochnik_finansirovanija);

				istochnik_finansirovanija.setNew(false);
			}
			else {
				istochnik_finansirovanija = (istochnik_finansirovanija)session.merge(istochnik_finansirovanija);
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

		entityCache.putResult(istochnik_finansirovanijaModelImpl.ENTITY_CACHE_ENABLED,
			istochnik_finansirovanijaImpl.class,
			istochnik_finansirovanija.getPrimaryKey(),
			istochnik_finansirovanija, false);

		istochnik_finansirovanija.resetOriginalValues();

		return istochnik_finansirovanija;
	}

	protected istochnik_finansirovanija toUnwrappedModel(
		istochnik_finansirovanija istochnik_finansirovanija) {
		if (istochnik_finansirovanija instanceof istochnik_finansirovanijaImpl) {
			return istochnik_finansirovanija;
		}

		istochnik_finansirovanijaImpl istochnik_finansirovanijaImpl = new istochnik_finansirovanijaImpl();

		istochnik_finansirovanijaImpl.setNew(istochnik_finansirovanija.isNew());
		istochnik_finansirovanijaImpl.setPrimaryKey(istochnik_finansirovanija.getPrimaryKey());

		istochnik_finansirovanijaImpl.setIstochnik_finansirovanija_id(istochnik_finansirovanija.getIstochnik_finansirovanija_id());
		istochnik_finansirovanijaImpl.setNaimenovanie(istochnik_finansirovanija.getNaimenovanie());

		return istochnik_finansirovanijaImpl;
	}

	/**
	 * Returns the istochnik_finansirovanija with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the istochnik_finansirovanija
	 * @return the istochnik_finansirovanija
	 * @throws NoSuchistochnik_finansirovanijaException if a istochnik_finansirovanija with the primary key could not be found
	 */
	@Override
	public istochnik_finansirovanija findByPrimaryKey(Serializable primaryKey)
		throws NoSuchistochnik_finansirovanijaException {
		istochnik_finansirovanija istochnik_finansirovanija = fetchByPrimaryKey(primaryKey);

		if (istochnik_finansirovanija == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchistochnik_finansirovanijaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return istochnik_finansirovanija;
	}

	/**
	 * Returns the istochnik_finansirovanija with the primary key or throws a {@link NoSuchistochnik_finansirovanijaException} if it could not be found.
	 *
	 * @param istochnik_finansirovanija_id the primary key of the istochnik_finansirovanija
	 * @return the istochnik_finansirovanija
	 * @throws NoSuchistochnik_finansirovanijaException if a istochnik_finansirovanija with the primary key could not be found
	 */
	@Override
	public istochnik_finansirovanija findByPrimaryKey(
		long istochnik_finansirovanija_id)
		throws NoSuchistochnik_finansirovanijaException {
		return findByPrimaryKey((Serializable)istochnik_finansirovanija_id);
	}

	/**
	 * Returns the istochnik_finansirovanija with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the istochnik_finansirovanija
	 * @return the istochnik_finansirovanija, or <code>null</code> if a istochnik_finansirovanija with the primary key could not be found
	 */
	@Override
	public istochnik_finansirovanija fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(istochnik_finansirovanijaModelImpl.ENTITY_CACHE_ENABLED,
				istochnik_finansirovanijaImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		istochnik_finansirovanija istochnik_finansirovanija = (istochnik_finansirovanija)serializable;

		if (istochnik_finansirovanija == null) {
			Session session = null;

			try {
				session = openSession();

				istochnik_finansirovanija = (istochnik_finansirovanija)session.get(istochnik_finansirovanijaImpl.class,
						primaryKey);

				if (istochnik_finansirovanija != null) {
					cacheResult(istochnik_finansirovanija);
				}
				else {
					entityCache.putResult(istochnik_finansirovanijaModelImpl.ENTITY_CACHE_ENABLED,
						istochnik_finansirovanijaImpl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(istochnik_finansirovanijaModelImpl.ENTITY_CACHE_ENABLED,
					istochnik_finansirovanijaImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return istochnik_finansirovanija;
	}

	/**
	 * Returns the istochnik_finansirovanija with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param istochnik_finansirovanija_id the primary key of the istochnik_finansirovanija
	 * @return the istochnik_finansirovanija, or <code>null</code> if a istochnik_finansirovanija with the primary key could not be found
	 */
	@Override
	public istochnik_finansirovanija fetchByPrimaryKey(
		long istochnik_finansirovanija_id) {
		return fetchByPrimaryKey((Serializable)istochnik_finansirovanija_id);
	}

	@Override
	public Map<Serializable, istochnik_finansirovanija> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, istochnik_finansirovanija> map = new HashMap<Serializable, istochnik_finansirovanija>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			istochnik_finansirovanija istochnik_finansirovanija = fetchByPrimaryKey(primaryKey);

			if (istochnik_finansirovanija != null) {
				map.put(primaryKey, istochnik_finansirovanija);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(istochnik_finansirovanijaModelImpl.ENTITY_CACHE_ENABLED,
					istochnik_finansirovanijaImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (istochnik_finansirovanija)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ISTOCHNIK_FINANSIROVANIJA_WHERE_PKS_IN);

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

			for (istochnik_finansirovanija istochnik_finansirovanija : (List<istochnik_finansirovanija>)q.list()) {
				map.put(istochnik_finansirovanija.getPrimaryKeyObj(),
					istochnik_finansirovanija);

				cacheResult(istochnik_finansirovanija);

				uncachedPrimaryKeys.remove(istochnik_finansirovanija.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(istochnik_finansirovanijaModelImpl.ENTITY_CACHE_ENABLED,
					istochnik_finansirovanijaImpl.class, primaryKey, nullModel);
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
	 * Returns all the istochnik_finansirovanijas.
	 *
	 * @return the istochnik_finansirovanijas
	 */
	@Override
	public List<istochnik_finansirovanija> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the istochnik_finansirovanijas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link istochnik_finansirovanijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of istochnik_finansirovanijas
	 * @param end the upper bound of the range of istochnik_finansirovanijas (not inclusive)
	 * @return the range of istochnik_finansirovanijas
	 */
	@Override
	public List<istochnik_finansirovanija> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the istochnik_finansirovanijas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link istochnik_finansirovanijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of istochnik_finansirovanijas
	 * @param end the upper bound of the range of istochnik_finansirovanijas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of istochnik_finansirovanijas
	 */
	@Override
	public List<istochnik_finansirovanija> findAll(int start, int end,
		OrderByComparator<istochnik_finansirovanija> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the istochnik_finansirovanijas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link istochnik_finansirovanijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of istochnik_finansirovanijas
	 * @param end the upper bound of the range of istochnik_finansirovanijas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of istochnik_finansirovanijas
	 */
	@Override
	public List<istochnik_finansirovanija> findAll(int start, int end,
		OrderByComparator<istochnik_finansirovanija> orderByComparator,
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

		List<istochnik_finansirovanija> list = null;

		if (retrieveFromCache) {
			list = (List<istochnik_finansirovanija>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ISTOCHNIK_FINANSIROVANIJA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ISTOCHNIK_FINANSIROVANIJA;

				if (pagination) {
					sql = sql.concat(istochnik_finansirovanijaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<istochnik_finansirovanija>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<istochnik_finansirovanija>)QueryUtil.list(q,
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
	 * Removes all the istochnik_finansirovanijas from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (istochnik_finansirovanija istochnik_finansirovanija : findAll()) {
			remove(istochnik_finansirovanija);
		}
	}

	/**
	 * Returns the number of istochnik_finansirovanijas.
	 *
	 * @return the number of istochnik_finansirovanijas
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ISTOCHNIK_FINANSIROVANIJA);

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
		return istochnik_finansirovanijaModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the istochnik_finansirovanija persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(istochnik_finansirovanijaImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_ISTOCHNIK_FINANSIROVANIJA = "SELECT istochnik_finansirovanija FROM istochnik_finansirovanija istochnik_finansirovanija";
	private static final String _SQL_SELECT_ISTOCHNIK_FINANSIROVANIJA_WHERE_PKS_IN =
		"SELECT istochnik_finansirovanija FROM istochnik_finansirovanija istochnik_finansirovanija WHERE istochnik_finansirovanija_id IN (";
	private static final String _SQL_COUNT_ISTOCHNIK_FINANSIROVANIJA = "SELECT COUNT(istochnik_finansirovanija) FROM istochnik_finansirovanija istochnik_finansirovanija";
	private static final String _ORDER_BY_ENTITY_ALIAS = "istochnik_finansirovanija.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No istochnik_finansirovanija exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(istochnik_finansirovanijaPersistenceImpl.class);
}
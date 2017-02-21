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

package tj.tipy.dokumentov.postavwika.service.persistence.impl;

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

import tj.tipy.dokumentov.postavwika.exception.NoSuchtipy_dokumentov_postavwikaException;
import tj.tipy.dokumentov.postavwika.model.impl.tipy_dokumentov_postavwikaImpl;
import tj.tipy.dokumentov.postavwika.model.impl.tipy_dokumentov_postavwikaModelImpl;
import tj.tipy.dokumentov.postavwika.model.tipy_dokumentov_postavwika;
import tj.tipy.dokumentov.postavwika.service.persistence.tipy_dokumentov_postavwikaPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the tipy_dokumentov_postavwika service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tipy_dokumentov_postavwikaPersistence
 * @see tj.tipy.dokumentov.postavwika.service.persistence.tipy_dokumentov_postavwikaUtil
 * @generated
 */
@ProviderType
public class tipy_dokumentov_postavwikaPersistenceImpl
	extends BasePersistenceImpl<tipy_dokumentov_postavwika>
	implements tipy_dokumentov_postavwikaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link tipy_dokumentov_postavwikaUtil} to access the tipy_dokumentov_postavwika persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = tipy_dokumentov_postavwikaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(tipy_dokumentov_postavwikaModelImpl.ENTITY_CACHE_ENABLED,
			tipy_dokumentov_postavwikaModelImpl.FINDER_CACHE_ENABLED,
			tipy_dokumentov_postavwikaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(tipy_dokumentov_postavwikaModelImpl.ENTITY_CACHE_ENABLED,
			tipy_dokumentov_postavwikaModelImpl.FINDER_CACHE_ENABLED,
			tipy_dokumentov_postavwikaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(tipy_dokumentov_postavwikaModelImpl.ENTITY_CACHE_ENABLED,
			tipy_dokumentov_postavwikaModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	public tipy_dokumentov_postavwikaPersistenceImpl() {
		setModelClass(tipy_dokumentov_postavwika.class);
	}

	/**
	 * Caches the tipy_dokumentov_postavwika in the entity cache if it is enabled.
	 *
	 * @param tipy_dokumentov_postavwika the tipy_dokumentov_postavwika
	 */
	@Override
	public void cacheResult(
		tipy_dokumentov_postavwika tipy_dokumentov_postavwika) {
		entityCache.putResult(tipy_dokumentov_postavwikaModelImpl.ENTITY_CACHE_ENABLED,
			tipy_dokumentov_postavwikaImpl.class,
			tipy_dokumentov_postavwika.getPrimaryKey(),
			tipy_dokumentov_postavwika);

		tipy_dokumentov_postavwika.resetOriginalValues();
	}

	/**
	 * Caches the tipy_dokumentov_postavwikas in the entity cache if it is enabled.
	 *
	 * @param tipy_dokumentov_postavwikas the tipy_dokumentov_postavwikas
	 */
	@Override
	public void cacheResult(
		List<tipy_dokumentov_postavwika> tipy_dokumentov_postavwikas) {
		for (tipy_dokumentov_postavwika tipy_dokumentov_postavwika : tipy_dokumentov_postavwikas) {
			if (entityCache.getResult(
						tipy_dokumentov_postavwikaModelImpl.ENTITY_CACHE_ENABLED,
						tipy_dokumentov_postavwikaImpl.class,
						tipy_dokumentov_postavwika.getPrimaryKey()) == null) {
				cacheResult(tipy_dokumentov_postavwika);
			}
			else {
				tipy_dokumentov_postavwika.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tipy_dokumentov_postavwikas.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(tipy_dokumentov_postavwikaImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tipy_dokumentov_postavwika.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		tipy_dokumentov_postavwika tipy_dokumentov_postavwika) {
		entityCache.removeResult(tipy_dokumentov_postavwikaModelImpl.ENTITY_CACHE_ENABLED,
			tipy_dokumentov_postavwikaImpl.class,
			tipy_dokumentov_postavwika.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<tipy_dokumentov_postavwika> tipy_dokumentov_postavwikas) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (tipy_dokumentov_postavwika tipy_dokumentov_postavwika : tipy_dokumentov_postavwikas) {
			entityCache.removeResult(tipy_dokumentov_postavwikaModelImpl.ENTITY_CACHE_ENABLED,
				tipy_dokumentov_postavwikaImpl.class,
				tipy_dokumentov_postavwika.getPrimaryKey());
		}
	}

	/**
	 * Creates a new tipy_dokumentov_postavwika with the primary key. Does not add the tipy_dokumentov_postavwika to the database.
	 *
	 * @param tipy_dokumentov_postavwika_id the primary key for the new tipy_dokumentov_postavwika
	 * @return the new tipy_dokumentov_postavwika
	 */
	@Override
	public tipy_dokumentov_postavwika create(long tipy_dokumentov_postavwika_id) {
		tipy_dokumentov_postavwika tipy_dokumentov_postavwika = new tipy_dokumentov_postavwikaImpl();

		tipy_dokumentov_postavwika.setNew(true);
		tipy_dokumentov_postavwika.setPrimaryKey(tipy_dokumentov_postavwika_id);

		return tipy_dokumentov_postavwika;
	}

	/**
	 * Removes the tipy_dokumentov_postavwika with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tipy_dokumentov_postavwika_id the primary key of the tipy_dokumentov_postavwika
	 * @return the tipy_dokumentov_postavwika that was removed
	 * @throws NoSuchtipy_dokumentov_postavwikaException if a tipy_dokumentov_postavwika with the primary key could not be found
	 */
	@Override
	public tipy_dokumentov_postavwika remove(long tipy_dokumentov_postavwika_id)
		throws NoSuchtipy_dokumentov_postavwikaException {
		return remove((Serializable)tipy_dokumentov_postavwika_id);
	}

	/**
	 * Removes the tipy_dokumentov_postavwika with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tipy_dokumentov_postavwika
	 * @return the tipy_dokumentov_postavwika that was removed
	 * @throws NoSuchtipy_dokumentov_postavwikaException if a tipy_dokumentov_postavwika with the primary key could not be found
	 */
	@Override
	public tipy_dokumentov_postavwika remove(Serializable primaryKey)
		throws NoSuchtipy_dokumentov_postavwikaException {
		Session session = null;

		try {
			session = openSession();

			tipy_dokumentov_postavwika tipy_dokumentov_postavwika = (tipy_dokumentov_postavwika)session.get(tipy_dokumentov_postavwikaImpl.class,
					primaryKey);

			if (tipy_dokumentov_postavwika == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchtipy_dokumentov_postavwikaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tipy_dokumentov_postavwika);
		}
		catch (NoSuchtipy_dokumentov_postavwikaException nsee) {
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
	protected tipy_dokumentov_postavwika removeImpl(
		tipy_dokumentov_postavwika tipy_dokumentov_postavwika) {
		tipy_dokumentov_postavwika = toUnwrappedModel(tipy_dokumentov_postavwika);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tipy_dokumentov_postavwika)) {
				tipy_dokumentov_postavwika = (tipy_dokumentov_postavwika)session.get(tipy_dokumentov_postavwikaImpl.class,
						tipy_dokumentov_postavwika.getPrimaryKeyObj());
			}

			if (tipy_dokumentov_postavwika != null) {
				session.delete(tipy_dokumentov_postavwika);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tipy_dokumentov_postavwika != null) {
			clearCache(tipy_dokumentov_postavwika);
		}

		return tipy_dokumentov_postavwika;
	}

	@Override
	public tipy_dokumentov_postavwika updateImpl(
		tipy_dokumentov_postavwika tipy_dokumentov_postavwika) {
		tipy_dokumentov_postavwika = toUnwrappedModel(tipy_dokumentov_postavwika);

		boolean isNew = tipy_dokumentov_postavwika.isNew();

		Session session = null;

		try {
			session = openSession();

			if (tipy_dokumentov_postavwika.isNew()) {
				session.save(tipy_dokumentov_postavwika);

				tipy_dokumentov_postavwika.setNew(false);
			}
			else {
				tipy_dokumentov_postavwika = (tipy_dokumentov_postavwika)session.merge(tipy_dokumentov_postavwika);
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

		entityCache.putResult(tipy_dokumentov_postavwikaModelImpl.ENTITY_CACHE_ENABLED,
			tipy_dokumentov_postavwikaImpl.class,
			tipy_dokumentov_postavwika.getPrimaryKey(),
			tipy_dokumentov_postavwika, false);

		tipy_dokumentov_postavwika.resetOriginalValues();

		return tipy_dokumentov_postavwika;
	}

	protected tipy_dokumentov_postavwika toUnwrappedModel(
		tipy_dokumentov_postavwika tipy_dokumentov_postavwika) {
		if (tipy_dokumentov_postavwika instanceof tipy_dokumentov_postavwikaImpl) {
			return tipy_dokumentov_postavwika;
		}

		tipy_dokumentov_postavwikaImpl tipy_dokumentov_postavwikaImpl = new tipy_dokumentov_postavwikaImpl();

		tipy_dokumentov_postavwikaImpl.setNew(tipy_dokumentov_postavwika.isNew());
		tipy_dokumentov_postavwikaImpl.setPrimaryKey(tipy_dokumentov_postavwika.getPrimaryKey());

		tipy_dokumentov_postavwikaImpl.setTip(tipy_dokumentov_postavwika.getTip());
		tipy_dokumentov_postavwikaImpl.setTipy_dokumentov_postavwika_id(tipy_dokumentov_postavwika.getTipy_dokumentov_postavwika_id());

		return tipy_dokumentov_postavwikaImpl;
	}

	/**
	 * Returns the tipy_dokumentov_postavwika with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tipy_dokumentov_postavwika
	 * @return the tipy_dokumentov_postavwika
	 * @throws NoSuchtipy_dokumentov_postavwikaException if a tipy_dokumentov_postavwika with the primary key could not be found
	 */
	@Override
	public tipy_dokumentov_postavwika findByPrimaryKey(Serializable primaryKey)
		throws NoSuchtipy_dokumentov_postavwikaException {
		tipy_dokumentov_postavwika tipy_dokumentov_postavwika = fetchByPrimaryKey(primaryKey);

		if (tipy_dokumentov_postavwika == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchtipy_dokumentov_postavwikaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tipy_dokumentov_postavwika;
	}

	/**
	 * Returns the tipy_dokumentov_postavwika with the primary key or throws a {@link NoSuchtipy_dokumentov_postavwikaException} if it could not be found.
	 *
	 * @param tipy_dokumentov_postavwika_id the primary key of the tipy_dokumentov_postavwika
	 * @return the tipy_dokumentov_postavwika
	 * @throws NoSuchtipy_dokumentov_postavwikaException if a tipy_dokumentov_postavwika with the primary key could not be found
	 */
	@Override
	public tipy_dokumentov_postavwika findByPrimaryKey(
		long tipy_dokumentov_postavwika_id)
		throws NoSuchtipy_dokumentov_postavwikaException {
		return findByPrimaryKey((Serializable)tipy_dokumentov_postavwika_id);
	}

	/**
	 * Returns the tipy_dokumentov_postavwika with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tipy_dokumentov_postavwika
	 * @return the tipy_dokumentov_postavwika, or <code>null</code> if a tipy_dokumentov_postavwika with the primary key could not be found
	 */
	@Override
	public tipy_dokumentov_postavwika fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(tipy_dokumentov_postavwikaModelImpl.ENTITY_CACHE_ENABLED,
				tipy_dokumentov_postavwikaImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		tipy_dokumentov_postavwika tipy_dokumentov_postavwika = (tipy_dokumentov_postavwika)serializable;

		if (tipy_dokumentov_postavwika == null) {
			Session session = null;

			try {
				session = openSession();

				tipy_dokumentov_postavwika = (tipy_dokumentov_postavwika)session.get(tipy_dokumentov_postavwikaImpl.class,
						primaryKey);

				if (tipy_dokumentov_postavwika != null) {
					cacheResult(tipy_dokumentov_postavwika);
				}
				else {
					entityCache.putResult(tipy_dokumentov_postavwikaModelImpl.ENTITY_CACHE_ENABLED,
						tipy_dokumentov_postavwikaImpl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(tipy_dokumentov_postavwikaModelImpl.ENTITY_CACHE_ENABLED,
					tipy_dokumentov_postavwikaImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tipy_dokumentov_postavwika;
	}

	/**
	 * Returns the tipy_dokumentov_postavwika with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tipy_dokumentov_postavwika_id the primary key of the tipy_dokumentov_postavwika
	 * @return the tipy_dokumentov_postavwika, or <code>null</code> if a tipy_dokumentov_postavwika with the primary key could not be found
	 */
	@Override
	public tipy_dokumentov_postavwika fetchByPrimaryKey(
		long tipy_dokumentov_postavwika_id) {
		return fetchByPrimaryKey((Serializable)tipy_dokumentov_postavwika_id);
	}

	@Override
	public Map<Serializable, tipy_dokumentov_postavwika> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, tipy_dokumentov_postavwika> map = new HashMap<Serializable, tipy_dokumentov_postavwika>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			tipy_dokumentov_postavwika tipy_dokumentov_postavwika = fetchByPrimaryKey(primaryKey);

			if (tipy_dokumentov_postavwika != null) {
				map.put(primaryKey, tipy_dokumentov_postavwika);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(tipy_dokumentov_postavwikaModelImpl.ENTITY_CACHE_ENABLED,
					tipy_dokumentov_postavwikaImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (tipy_dokumentov_postavwika)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_TIPY_DOKUMENTOV_POSTAVWIKA_WHERE_PKS_IN);

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

			for (tipy_dokumentov_postavwika tipy_dokumentov_postavwika : (List<tipy_dokumentov_postavwika>)q.list()) {
				map.put(tipy_dokumentov_postavwika.getPrimaryKeyObj(),
					tipy_dokumentov_postavwika);

				cacheResult(tipy_dokumentov_postavwika);

				uncachedPrimaryKeys.remove(tipy_dokumentov_postavwika.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(tipy_dokumentov_postavwikaModelImpl.ENTITY_CACHE_ENABLED,
					tipy_dokumentov_postavwikaImpl.class, primaryKey, nullModel);
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
	 * Returns all the tipy_dokumentov_postavwikas.
	 *
	 * @return the tipy_dokumentov_postavwikas
	 */
	@Override
	public List<tipy_dokumentov_postavwika> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tipy_dokumentov_postavwikas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tipy_dokumentov_postavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tipy_dokumentov_postavwikas
	 * @param end the upper bound of the range of tipy_dokumentov_postavwikas (not inclusive)
	 * @return the range of tipy_dokumentov_postavwikas
	 */
	@Override
	public List<tipy_dokumentov_postavwika> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tipy_dokumentov_postavwikas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tipy_dokumentov_postavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tipy_dokumentov_postavwikas
	 * @param end the upper bound of the range of tipy_dokumentov_postavwikas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tipy_dokumentov_postavwikas
	 */
	@Override
	public List<tipy_dokumentov_postavwika> findAll(int start, int end,
		OrderByComparator<tipy_dokumentov_postavwika> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tipy_dokumentov_postavwikas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tipy_dokumentov_postavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tipy_dokumentov_postavwikas
	 * @param end the upper bound of the range of tipy_dokumentov_postavwikas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of tipy_dokumentov_postavwikas
	 */
	@Override
	public List<tipy_dokumentov_postavwika> findAll(int start, int end,
		OrderByComparator<tipy_dokumentov_postavwika> orderByComparator,
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

		List<tipy_dokumentov_postavwika> list = null;

		if (retrieveFromCache) {
			list = (List<tipy_dokumentov_postavwika>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_TIPY_DOKUMENTOV_POSTAVWIKA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TIPY_DOKUMENTOV_POSTAVWIKA;

				if (pagination) {
					sql = sql.concat(tipy_dokumentov_postavwikaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<tipy_dokumentov_postavwika>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<tipy_dokumentov_postavwika>)QueryUtil.list(q,
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
	 * Removes all the tipy_dokumentov_postavwikas from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (tipy_dokumentov_postavwika tipy_dokumentov_postavwika : findAll()) {
			remove(tipy_dokumentov_postavwika);
		}
	}

	/**
	 * Returns the number of tipy_dokumentov_postavwikas.
	 *
	 * @return the number of tipy_dokumentov_postavwikas
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_TIPY_DOKUMENTOV_POSTAVWIKA);

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
		return tipy_dokumentov_postavwikaModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the tipy_dokumentov_postavwika persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(tipy_dokumentov_postavwikaImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_TIPY_DOKUMENTOV_POSTAVWIKA = "SELECT tipy_dokumentov_postavwika FROM tipy_dokumentov_postavwika tipy_dokumentov_postavwika";
	private static final String _SQL_SELECT_TIPY_DOKUMENTOV_POSTAVWIKA_WHERE_PKS_IN =
		"SELECT tipy_dokumentov_postavwika FROM tipy_dokumentov_postavwika tipy_dokumentov_postavwika WHERE tipy_dokumentov_postavwika_id IN (";
	private static final String _SQL_COUNT_TIPY_DOKUMENTOV_POSTAVWIKA = "SELECT COUNT(tipy_dokumentov_postavwika) FROM tipy_dokumentov_postavwika tipy_dokumentov_postavwika";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tipy_dokumentov_postavwika.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No tipy_dokumentov_postavwika exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(tipy_dokumentov_postavwikaPersistenceImpl.class);
}
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

package tj.dokumenty.postavwika.service.persistence.impl;

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

import tj.dokumenty.postavwika.exception.NoSuchdokumenty_postavwikaException;
import tj.dokumenty.postavwika.model.dokumenty_postavwika;
import tj.dokumenty.postavwika.model.impl.dokumenty_postavwikaImpl;
import tj.dokumenty.postavwika.model.impl.dokumenty_postavwikaModelImpl;
import tj.dokumenty.postavwika.service.persistence.dokumenty_postavwikaPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the dokumenty_postavwika service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see dokumenty_postavwikaPersistence
 * @see tj.dokumenty.postavwika.service.persistence.dokumenty_postavwikaUtil
 * @generated
 */
@ProviderType
public class dokumenty_postavwikaPersistenceImpl extends BasePersistenceImpl<dokumenty_postavwika>
	implements dokumenty_postavwikaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link dokumenty_postavwikaUtil} to access the dokumenty_postavwika persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = dokumenty_postavwikaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(dokumenty_postavwikaModelImpl.ENTITY_CACHE_ENABLED,
			dokumenty_postavwikaModelImpl.FINDER_CACHE_ENABLED,
			dokumenty_postavwikaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(dokumenty_postavwikaModelImpl.ENTITY_CACHE_ENABLED,
			dokumenty_postavwikaModelImpl.FINDER_CACHE_ENABLED,
			dokumenty_postavwikaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(dokumenty_postavwikaModelImpl.ENTITY_CACHE_ENABLED,
			dokumenty_postavwikaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public dokumenty_postavwikaPersistenceImpl() {
		setModelClass(dokumenty_postavwika.class);
	}

	/**
	 * Caches the dokumenty_postavwika in the entity cache if it is enabled.
	 *
	 * @param dokumenty_postavwika the dokumenty_postavwika
	 */
	@Override
	public void cacheResult(dokumenty_postavwika dokumenty_postavwika) {
		entityCache.putResult(dokumenty_postavwikaModelImpl.ENTITY_CACHE_ENABLED,
			dokumenty_postavwikaImpl.class,
			dokumenty_postavwika.getPrimaryKey(), dokumenty_postavwika);

		dokumenty_postavwika.resetOriginalValues();
	}

	/**
	 * Caches the dokumenty_postavwikas in the entity cache if it is enabled.
	 *
	 * @param dokumenty_postavwikas the dokumenty_postavwikas
	 */
	@Override
	public void cacheResult(List<dokumenty_postavwika> dokumenty_postavwikas) {
		for (dokumenty_postavwika dokumenty_postavwika : dokumenty_postavwikas) {
			if (entityCache.getResult(
						dokumenty_postavwikaModelImpl.ENTITY_CACHE_ENABLED,
						dokumenty_postavwikaImpl.class,
						dokumenty_postavwika.getPrimaryKey()) == null) {
				cacheResult(dokumenty_postavwika);
			}
			else {
				dokumenty_postavwika.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dokumenty_postavwikas.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(dokumenty_postavwikaImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dokumenty_postavwika.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(dokumenty_postavwika dokumenty_postavwika) {
		entityCache.removeResult(dokumenty_postavwikaModelImpl.ENTITY_CACHE_ENABLED,
			dokumenty_postavwikaImpl.class, dokumenty_postavwika.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<dokumenty_postavwika> dokumenty_postavwikas) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (dokumenty_postavwika dokumenty_postavwika : dokumenty_postavwikas) {
			entityCache.removeResult(dokumenty_postavwikaModelImpl.ENTITY_CACHE_ENABLED,
				dokumenty_postavwikaImpl.class,
				dokumenty_postavwika.getPrimaryKey());
		}
	}

	/**
	 * Creates a new dokumenty_postavwika with the primary key. Does not add the dokumenty_postavwika to the database.
	 *
	 * @param dokumenty_postavwika_id the primary key for the new dokumenty_postavwika
	 * @return the new dokumenty_postavwika
	 */
	@Override
	public dokumenty_postavwika create(long dokumenty_postavwika_id) {
		dokumenty_postavwika dokumenty_postavwika = new dokumenty_postavwikaImpl();

		dokumenty_postavwika.setNew(true);
		dokumenty_postavwika.setPrimaryKey(dokumenty_postavwika_id);

		return dokumenty_postavwika;
	}

	/**
	 * Removes the dokumenty_postavwika with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dokumenty_postavwika_id the primary key of the dokumenty_postavwika
	 * @return the dokumenty_postavwika that was removed
	 * @throws NoSuchdokumenty_postavwikaException if a dokumenty_postavwika with the primary key could not be found
	 */
	@Override
	public dokumenty_postavwika remove(long dokumenty_postavwika_id)
		throws NoSuchdokumenty_postavwikaException {
		return remove((Serializable)dokumenty_postavwika_id);
	}

	/**
	 * Removes the dokumenty_postavwika with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dokumenty_postavwika
	 * @return the dokumenty_postavwika that was removed
	 * @throws NoSuchdokumenty_postavwikaException if a dokumenty_postavwika with the primary key could not be found
	 */
	@Override
	public dokumenty_postavwika remove(Serializable primaryKey)
		throws NoSuchdokumenty_postavwikaException {
		Session session = null;

		try {
			session = openSession();

			dokumenty_postavwika dokumenty_postavwika = (dokumenty_postavwika)session.get(dokumenty_postavwikaImpl.class,
					primaryKey);

			if (dokumenty_postavwika == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchdokumenty_postavwikaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dokumenty_postavwika);
		}
		catch (NoSuchdokumenty_postavwikaException nsee) {
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
	protected dokumenty_postavwika removeImpl(
		dokumenty_postavwika dokumenty_postavwika) {
		dokumenty_postavwika = toUnwrappedModel(dokumenty_postavwika);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dokumenty_postavwika)) {
				dokumenty_postavwika = (dokumenty_postavwika)session.get(dokumenty_postavwikaImpl.class,
						dokumenty_postavwika.getPrimaryKeyObj());
			}

			if (dokumenty_postavwika != null) {
				session.delete(dokumenty_postavwika);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dokumenty_postavwika != null) {
			clearCache(dokumenty_postavwika);
		}

		return dokumenty_postavwika;
	}

	@Override
	public dokumenty_postavwika updateImpl(
		dokumenty_postavwika dokumenty_postavwika) {
		dokumenty_postavwika = toUnwrappedModel(dokumenty_postavwika);

		boolean isNew = dokumenty_postavwika.isNew();

		Session session = null;

		try {
			session = openSession();

			if (dokumenty_postavwika.isNew()) {
				session.save(dokumenty_postavwika);

				dokumenty_postavwika.setNew(false);
			}
			else {
				dokumenty_postavwika = (dokumenty_postavwika)session.merge(dokumenty_postavwika);
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

		entityCache.putResult(dokumenty_postavwikaModelImpl.ENTITY_CACHE_ENABLED,
			dokumenty_postavwikaImpl.class,
			dokumenty_postavwika.getPrimaryKey(), dokumenty_postavwika, false);

		dokumenty_postavwika.resetOriginalValues();

		return dokumenty_postavwika;
	}

	protected dokumenty_postavwika toUnwrappedModel(
		dokumenty_postavwika dokumenty_postavwika) {
		if (dokumenty_postavwika instanceof dokumenty_postavwikaImpl) {
			return dokumenty_postavwika;
		}

		dokumenty_postavwikaImpl dokumenty_postavwikaImpl = new dokumenty_postavwikaImpl();

		dokumenty_postavwikaImpl.setNew(dokumenty_postavwika.isNew());
		dokumenty_postavwikaImpl.setPrimaryKey(dokumenty_postavwika.getPrimaryKey());

		dokumenty_postavwikaImpl.setData_zagruzki(dokumenty_postavwika.getData_zagruzki());
		dokumenty_postavwikaImpl.setDokumenty_postavwika_id(dokumenty_postavwika.getDokumenty_postavwika_id());
		dokumenty_postavwikaImpl.setImja_fajla(dokumenty_postavwika.getImja_fajla());
		dokumenty_postavwikaImpl.setNazvanie_dokumenta(dokumenty_postavwika.getNazvanie_dokumenta());
		dokumenty_postavwikaImpl.setPostavwik_id(dokumenty_postavwika.getPostavwik_id());
		dokumenty_postavwikaImpl.setTip_dokumenta(dokumenty_postavwika.getTip_dokumenta());
		dokumenty_postavwikaImpl.setZagruzil(dokumenty_postavwika.getZagruzil());

		return dokumenty_postavwikaImpl;
	}

	/**
	 * Returns the dokumenty_postavwika with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dokumenty_postavwika
	 * @return the dokumenty_postavwika
	 * @throws NoSuchdokumenty_postavwikaException if a dokumenty_postavwika with the primary key could not be found
	 */
	@Override
	public dokumenty_postavwika findByPrimaryKey(Serializable primaryKey)
		throws NoSuchdokumenty_postavwikaException {
		dokumenty_postavwika dokumenty_postavwika = fetchByPrimaryKey(primaryKey);

		if (dokumenty_postavwika == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchdokumenty_postavwikaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dokumenty_postavwika;
	}

	/**
	 * Returns the dokumenty_postavwika with the primary key or throws a {@link NoSuchdokumenty_postavwikaException} if it could not be found.
	 *
	 * @param dokumenty_postavwika_id the primary key of the dokumenty_postavwika
	 * @return the dokumenty_postavwika
	 * @throws NoSuchdokumenty_postavwikaException if a dokumenty_postavwika with the primary key could not be found
	 */
	@Override
	public dokumenty_postavwika findByPrimaryKey(long dokumenty_postavwika_id)
		throws NoSuchdokumenty_postavwikaException {
		return findByPrimaryKey((Serializable)dokumenty_postavwika_id);
	}

	/**
	 * Returns the dokumenty_postavwika with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dokumenty_postavwika
	 * @return the dokumenty_postavwika, or <code>null</code> if a dokumenty_postavwika with the primary key could not be found
	 */
	@Override
	public dokumenty_postavwika fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(dokumenty_postavwikaModelImpl.ENTITY_CACHE_ENABLED,
				dokumenty_postavwikaImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		dokumenty_postavwika dokumenty_postavwika = (dokumenty_postavwika)serializable;

		if (dokumenty_postavwika == null) {
			Session session = null;

			try {
				session = openSession();

				dokumenty_postavwika = (dokumenty_postavwika)session.get(dokumenty_postavwikaImpl.class,
						primaryKey);

				if (dokumenty_postavwika != null) {
					cacheResult(dokumenty_postavwika);
				}
				else {
					entityCache.putResult(dokumenty_postavwikaModelImpl.ENTITY_CACHE_ENABLED,
						dokumenty_postavwikaImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(dokumenty_postavwikaModelImpl.ENTITY_CACHE_ENABLED,
					dokumenty_postavwikaImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dokumenty_postavwika;
	}

	/**
	 * Returns the dokumenty_postavwika with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param dokumenty_postavwika_id the primary key of the dokumenty_postavwika
	 * @return the dokumenty_postavwika, or <code>null</code> if a dokumenty_postavwika with the primary key could not be found
	 */
	@Override
	public dokumenty_postavwika fetchByPrimaryKey(long dokumenty_postavwika_id) {
		return fetchByPrimaryKey((Serializable)dokumenty_postavwika_id);
	}

	@Override
	public Map<Serializable, dokumenty_postavwika> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, dokumenty_postavwika> map = new HashMap<Serializable, dokumenty_postavwika>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			dokumenty_postavwika dokumenty_postavwika = fetchByPrimaryKey(primaryKey);

			if (dokumenty_postavwika != null) {
				map.put(primaryKey, dokumenty_postavwika);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(dokumenty_postavwikaModelImpl.ENTITY_CACHE_ENABLED,
					dokumenty_postavwikaImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (dokumenty_postavwika)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_DOKUMENTY_POSTAVWIKA_WHERE_PKS_IN);

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

			for (dokumenty_postavwika dokumenty_postavwika : (List<dokumenty_postavwika>)q.list()) {
				map.put(dokumenty_postavwika.getPrimaryKeyObj(),
					dokumenty_postavwika);

				cacheResult(dokumenty_postavwika);

				uncachedPrimaryKeys.remove(dokumenty_postavwika.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(dokumenty_postavwikaModelImpl.ENTITY_CACHE_ENABLED,
					dokumenty_postavwikaImpl.class, primaryKey, nullModel);
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
	 * Returns all the dokumenty_postavwikas.
	 *
	 * @return the dokumenty_postavwikas
	 */
	@Override
	public List<dokumenty_postavwika> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dokumenty_postavwikas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link dokumenty_postavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dokumenty_postavwikas
	 * @param end the upper bound of the range of dokumenty_postavwikas (not inclusive)
	 * @return the range of dokumenty_postavwikas
	 */
	@Override
	public List<dokumenty_postavwika> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dokumenty_postavwikas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link dokumenty_postavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dokumenty_postavwikas
	 * @param end the upper bound of the range of dokumenty_postavwikas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dokumenty_postavwikas
	 */
	@Override
	public List<dokumenty_postavwika> findAll(int start, int end,
		OrderByComparator<dokumenty_postavwika> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the dokumenty_postavwikas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link dokumenty_postavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dokumenty_postavwikas
	 * @param end the upper bound of the range of dokumenty_postavwikas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of dokumenty_postavwikas
	 */
	@Override
	public List<dokumenty_postavwika> findAll(int start, int end,
		OrderByComparator<dokumenty_postavwika> orderByComparator,
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

		List<dokumenty_postavwika> list = null;

		if (retrieveFromCache) {
			list = (List<dokumenty_postavwika>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_DOKUMENTY_POSTAVWIKA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DOKUMENTY_POSTAVWIKA;

				if (pagination) {
					sql = sql.concat(dokumenty_postavwikaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<dokumenty_postavwika>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<dokumenty_postavwika>)QueryUtil.list(q,
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
	 * Removes all the dokumenty_postavwikas from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (dokumenty_postavwika dokumenty_postavwika : findAll()) {
			remove(dokumenty_postavwika);
		}
	}

	/**
	 * Returns the number of dokumenty_postavwikas.
	 *
	 * @return the number of dokumenty_postavwikas
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DOKUMENTY_POSTAVWIKA);

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
		return dokumenty_postavwikaModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the dokumenty_postavwika persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(dokumenty_postavwikaImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_DOKUMENTY_POSTAVWIKA = "SELECT dokumenty_postavwika FROM dokumenty_postavwika dokumenty_postavwika";
	private static final String _SQL_SELECT_DOKUMENTY_POSTAVWIKA_WHERE_PKS_IN = "SELECT dokumenty_postavwika FROM dokumenty_postavwika dokumenty_postavwika WHERE dokumenty_postavwika_id IN (";
	private static final String _SQL_COUNT_DOKUMENTY_POSTAVWIKA = "SELECT COUNT(dokumenty_postavwika) FROM dokumenty_postavwika dokumenty_postavwika";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dokumenty_postavwika.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No dokumenty_postavwika exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(dokumenty_postavwikaPersistenceImpl.class);
}
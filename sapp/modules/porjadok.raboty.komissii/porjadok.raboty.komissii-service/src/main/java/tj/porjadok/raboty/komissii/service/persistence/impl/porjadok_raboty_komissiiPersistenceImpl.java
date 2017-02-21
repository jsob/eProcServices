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

package tj.porjadok.raboty.komissii.service.persistence.impl;

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

import tj.porjadok.raboty.komissii.exception.NoSuchporjadok_raboty_komissiiException;
import tj.porjadok.raboty.komissii.model.impl.porjadok_raboty_komissiiImpl;
import tj.porjadok.raboty.komissii.model.impl.porjadok_raboty_komissiiModelImpl;
import tj.porjadok.raboty.komissii.model.porjadok_raboty_komissii;
import tj.porjadok.raboty.komissii.service.persistence.porjadok_raboty_komissiiPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the porjadok_raboty_komissii service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see porjadok_raboty_komissiiPersistence
 * @see tj.porjadok.raboty.komissii.service.persistence.porjadok_raboty_komissiiUtil
 * @generated
 */
@ProviderType
public class porjadok_raboty_komissiiPersistenceImpl extends BasePersistenceImpl<porjadok_raboty_komissii>
	implements porjadok_raboty_komissiiPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link porjadok_raboty_komissiiUtil} to access the porjadok_raboty_komissii persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = porjadok_raboty_komissiiImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(porjadok_raboty_komissiiModelImpl.ENTITY_CACHE_ENABLED,
			porjadok_raboty_komissiiModelImpl.FINDER_CACHE_ENABLED,
			porjadok_raboty_komissiiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(porjadok_raboty_komissiiModelImpl.ENTITY_CACHE_ENABLED,
			porjadok_raboty_komissiiModelImpl.FINDER_CACHE_ENABLED,
			porjadok_raboty_komissiiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(porjadok_raboty_komissiiModelImpl.ENTITY_CACHE_ENABLED,
			porjadok_raboty_komissiiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public porjadok_raboty_komissiiPersistenceImpl() {
		setModelClass(porjadok_raboty_komissii.class);
	}

	/**
	 * Caches the porjadok_raboty_komissii in the entity cache if it is enabled.
	 *
	 * @param porjadok_raboty_komissii the porjadok_raboty_komissii
	 */
	@Override
	public void cacheResult(porjadok_raboty_komissii porjadok_raboty_komissii) {
		entityCache.putResult(porjadok_raboty_komissiiModelImpl.ENTITY_CACHE_ENABLED,
			porjadok_raboty_komissiiImpl.class,
			porjadok_raboty_komissii.getPrimaryKey(), porjadok_raboty_komissii);

		porjadok_raboty_komissii.resetOriginalValues();
	}

	/**
	 * Caches the porjadok_raboty_komissiis in the entity cache if it is enabled.
	 *
	 * @param porjadok_raboty_komissiis the porjadok_raboty_komissiis
	 */
	@Override
	public void cacheResult(
		List<porjadok_raboty_komissii> porjadok_raboty_komissiis) {
		for (porjadok_raboty_komissii porjadok_raboty_komissii : porjadok_raboty_komissiis) {
			if (entityCache.getResult(
						porjadok_raboty_komissiiModelImpl.ENTITY_CACHE_ENABLED,
						porjadok_raboty_komissiiImpl.class,
						porjadok_raboty_komissii.getPrimaryKey()) == null) {
				cacheResult(porjadok_raboty_komissii);
			}
			else {
				porjadok_raboty_komissii.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all porjadok_raboty_komissiis.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(porjadok_raboty_komissiiImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the porjadok_raboty_komissii.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(porjadok_raboty_komissii porjadok_raboty_komissii) {
		entityCache.removeResult(porjadok_raboty_komissiiModelImpl.ENTITY_CACHE_ENABLED,
			porjadok_raboty_komissiiImpl.class,
			porjadok_raboty_komissii.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<porjadok_raboty_komissii> porjadok_raboty_komissiis) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (porjadok_raboty_komissii porjadok_raboty_komissii : porjadok_raboty_komissiis) {
			entityCache.removeResult(porjadok_raboty_komissiiModelImpl.ENTITY_CACHE_ENABLED,
				porjadok_raboty_komissiiImpl.class,
				porjadok_raboty_komissii.getPrimaryKey());
		}
	}

	/**
	 * Creates a new porjadok_raboty_komissii with the primary key. Does not add the porjadok_raboty_komissii to the database.
	 *
	 * @param porjadok_raboty_komissii_id the primary key for the new porjadok_raboty_komissii
	 * @return the new porjadok_raboty_komissii
	 */
	@Override
	public porjadok_raboty_komissii create(long porjadok_raboty_komissii_id) {
		porjadok_raboty_komissii porjadok_raboty_komissii = new porjadok_raboty_komissiiImpl();

		porjadok_raboty_komissii.setNew(true);
		porjadok_raboty_komissii.setPrimaryKey(porjadok_raboty_komissii_id);

		return porjadok_raboty_komissii;
	}

	/**
	 * Removes the porjadok_raboty_komissii with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param porjadok_raboty_komissii_id the primary key of the porjadok_raboty_komissii
	 * @return the porjadok_raboty_komissii that was removed
	 * @throws NoSuchporjadok_raboty_komissiiException if a porjadok_raboty_komissii with the primary key could not be found
	 */
	@Override
	public porjadok_raboty_komissii remove(long porjadok_raboty_komissii_id)
		throws NoSuchporjadok_raboty_komissiiException {
		return remove((Serializable)porjadok_raboty_komissii_id);
	}

	/**
	 * Removes the porjadok_raboty_komissii with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the porjadok_raboty_komissii
	 * @return the porjadok_raboty_komissii that was removed
	 * @throws NoSuchporjadok_raboty_komissiiException if a porjadok_raboty_komissii with the primary key could not be found
	 */
	@Override
	public porjadok_raboty_komissii remove(Serializable primaryKey)
		throws NoSuchporjadok_raboty_komissiiException {
		Session session = null;

		try {
			session = openSession();

			porjadok_raboty_komissii porjadok_raboty_komissii = (porjadok_raboty_komissii)session.get(porjadok_raboty_komissiiImpl.class,
					primaryKey);

			if (porjadok_raboty_komissii == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchporjadok_raboty_komissiiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(porjadok_raboty_komissii);
		}
		catch (NoSuchporjadok_raboty_komissiiException nsee) {
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
	protected porjadok_raboty_komissii removeImpl(
		porjadok_raboty_komissii porjadok_raboty_komissii) {
		porjadok_raboty_komissii = toUnwrappedModel(porjadok_raboty_komissii);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(porjadok_raboty_komissii)) {
				porjadok_raboty_komissii = (porjadok_raboty_komissii)session.get(porjadok_raboty_komissiiImpl.class,
						porjadok_raboty_komissii.getPrimaryKeyObj());
			}

			if (porjadok_raboty_komissii != null) {
				session.delete(porjadok_raboty_komissii);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (porjadok_raboty_komissii != null) {
			clearCache(porjadok_raboty_komissii);
		}

		return porjadok_raboty_komissii;
	}

	@Override
	public porjadok_raboty_komissii updateImpl(
		porjadok_raboty_komissii porjadok_raboty_komissii) {
		porjadok_raboty_komissii = toUnwrappedModel(porjadok_raboty_komissii);

		boolean isNew = porjadok_raboty_komissii.isNew();

		Session session = null;

		try {
			session = openSession();

			if (porjadok_raboty_komissii.isNew()) {
				session.save(porjadok_raboty_komissii);

				porjadok_raboty_komissii.setNew(false);
			}
			else {
				porjadok_raboty_komissii = (porjadok_raboty_komissii)session.merge(porjadok_raboty_komissii);
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

		entityCache.putResult(porjadok_raboty_komissiiModelImpl.ENTITY_CACHE_ENABLED,
			porjadok_raboty_komissiiImpl.class,
			porjadok_raboty_komissii.getPrimaryKey(), porjadok_raboty_komissii,
			false);

		porjadok_raboty_komissii.resetOriginalValues();

		return porjadok_raboty_komissii;
	}

	protected porjadok_raboty_komissii toUnwrappedModel(
		porjadok_raboty_komissii porjadok_raboty_komissii) {
		if (porjadok_raboty_komissii instanceof porjadok_raboty_komissiiImpl) {
			return porjadok_raboty_komissii;
		}

		porjadok_raboty_komissiiImpl porjadok_raboty_komissiiImpl = new porjadok_raboty_komissiiImpl();

		porjadok_raboty_komissiiImpl.setNew(porjadok_raboty_komissii.isNew());
		porjadok_raboty_komissiiImpl.setPrimaryKey(porjadok_raboty_komissii.getPrimaryKey());

		porjadok_raboty_komissiiImpl.setData_izmenenija(porjadok_raboty_komissii.getData_izmenenija());
		porjadok_raboty_komissiiImpl.setData_podvedenija_itogov(porjadok_raboty_komissii.getData_podvedenija_itogov());
		porjadok_raboty_komissiiImpl.setData_publikacii(porjadok_raboty_komissii.getData_publikacii());
		porjadok_raboty_komissiiImpl.setData_sozdanija(porjadok_raboty_komissii.getData_sozdanija());
		porjadok_raboty_komissiiImpl.setIzmenil(porjadok_raboty_komissii.getIzmenil());
		porjadok_raboty_komissiiImpl.setIzvewenie_id(porjadok_raboty_komissii.getIzvewenie_id());
		porjadok_raboty_komissiiImpl.setPo_istecheniju_dnej(porjadok_raboty_komissii.getPo_istecheniju_dnej());
		porjadok_raboty_komissiiImpl.setPorjadok_raboty_komissii_id(porjadok_raboty_komissii.getPorjadok_raboty_komissii_id());
		porjadok_raboty_komissiiImpl.setSozdal(porjadok_raboty_komissii.getSozdal());

		return porjadok_raboty_komissiiImpl;
	}

	/**
	 * Returns the porjadok_raboty_komissii with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the porjadok_raboty_komissii
	 * @return the porjadok_raboty_komissii
	 * @throws NoSuchporjadok_raboty_komissiiException if a porjadok_raboty_komissii with the primary key could not be found
	 */
	@Override
	public porjadok_raboty_komissii findByPrimaryKey(Serializable primaryKey)
		throws NoSuchporjadok_raboty_komissiiException {
		porjadok_raboty_komissii porjadok_raboty_komissii = fetchByPrimaryKey(primaryKey);

		if (porjadok_raboty_komissii == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchporjadok_raboty_komissiiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return porjadok_raboty_komissii;
	}

	/**
	 * Returns the porjadok_raboty_komissii with the primary key or throws a {@link NoSuchporjadok_raboty_komissiiException} if it could not be found.
	 *
	 * @param porjadok_raboty_komissii_id the primary key of the porjadok_raboty_komissii
	 * @return the porjadok_raboty_komissii
	 * @throws NoSuchporjadok_raboty_komissiiException if a porjadok_raboty_komissii with the primary key could not be found
	 */
	@Override
	public porjadok_raboty_komissii findByPrimaryKey(
		long porjadok_raboty_komissii_id)
		throws NoSuchporjadok_raboty_komissiiException {
		return findByPrimaryKey((Serializable)porjadok_raboty_komissii_id);
	}

	/**
	 * Returns the porjadok_raboty_komissii with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the porjadok_raboty_komissii
	 * @return the porjadok_raboty_komissii, or <code>null</code> if a porjadok_raboty_komissii with the primary key could not be found
	 */
	@Override
	public porjadok_raboty_komissii fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(porjadok_raboty_komissiiModelImpl.ENTITY_CACHE_ENABLED,
				porjadok_raboty_komissiiImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		porjadok_raboty_komissii porjadok_raboty_komissii = (porjadok_raboty_komissii)serializable;

		if (porjadok_raboty_komissii == null) {
			Session session = null;

			try {
				session = openSession();

				porjadok_raboty_komissii = (porjadok_raboty_komissii)session.get(porjadok_raboty_komissiiImpl.class,
						primaryKey);

				if (porjadok_raboty_komissii != null) {
					cacheResult(porjadok_raboty_komissii);
				}
				else {
					entityCache.putResult(porjadok_raboty_komissiiModelImpl.ENTITY_CACHE_ENABLED,
						porjadok_raboty_komissiiImpl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(porjadok_raboty_komissiiModelImpl.ENTITY_CACHE_ENABLED,
					porjadok_raboty_komissiiImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return porjadok_raboty_komissii;
	}

	/**
	 * Returns the porjadok_raboty_komissii with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param porjadok_raboty_komissii_id the primary key of the porjadok_raboty_komissii
	 * @return the porjadok_raboty_komissii, or <code>null</code> if a porjadok_raboty_komissii with the primary key could not be found
	 */
	@Override
	public porjadok_raboty_komissii fetchByPrimaryKey(
		long porjadok_raboty_komissii_id) {
		return fetchByPrimaryKey((Serializable)porjadok_raboty_komissii_id);
	}

	@Override
	public Map<Serializable, porjadok_raboty_komissii> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, porjadok_raboty_komissii> map = new HashMap<Serializable, porjadok_raboty_komissii>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			porjadok_raboty_komissii porjadok_raboty_komissii = fetchByPrimaryKey(primaryKey);

			if (porjadok_raboty_komissii != null) {
				map.put(primaryKey, porjadok_raboty_komissii);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(porjadok_raboty_komissiiModelImpl.ENTITY_CACHE_ENABLED,
					porjadok_raboty_komissiiImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (porjadok_raboty_komissii)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_PORJADOK_RABOTY_KOMISSII_WHERE_PKS_IN);

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

			for (porjadok_raboty_komissii porjadok_raboty_komissii : (List<porjadok_raboty_komissii>)q.list()) {
				map.put(porjadok_raboty_komissii.getPrimaryKeyObj(),
					porjadok_raboty_komissii);

				cacheResult(porjadok_raboty_komissii);

				uncachedPrimaryKeys.remove(porjadok_raboty_komissii.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(porjadok_raboty_komissiiModelImpl.ENTITY_CACHE_ENABLED,
					porjadok_raboty_komissiiImpl.class, primaryKey, nullModel);
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
	 * Returns all the porjadok_raboty_komissiis.
	 *
	 * @return the porjadok_raboty_komissiis
	 */
	@Override
	public List<porjadok_raboty_komissii> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the porjadok_raboty_komissiis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link porjadok_raboty_komissiiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of porjadok_raboty_komissiis
	 * @param end the upper bound of the range of porjadok_raboty_komissiis (not inclusive)
	 * @return the range of porjadok_raboty_komissiis
	 */
	@Override
	public List<porjadok_raboty_komissii> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the porjadok_raboty_komissiis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link porjadok_raboty_komissiiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of porjadok_raboty_komissiis
	 * @param end the upper bound of the range of porjadok_raboty_komissiis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of porjadok_raboty_komissiis
	 */
	@Override
	public List<porjadok_raboty_komissii> findAll(int start, int end,
		OrderByComparator<porjadok_raboty_komissii> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the porjadok_raboty_komissiis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link porjadok_raboty_komissiiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of porjadok_raboty_komissiis
	 * @param end the upper bound of the range of porjadok_raboty_komissiis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of porjadok_raboty_komissiis
	 */
	@Override
	public List<porjadok_raboty_komissii> findAll(int start, int end,
		OrderByComparator<porjadok_raboty_komissii> orderByComparator,
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

		List<porjadok_raboty_komissii> list = null;

		if (retrieveFromCache) {
			list = (List<porjadok_raboty_komissii>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_PORJADOK_RABOTY_KOMISSII);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PORJADOK_RABOTY_KOMISSII;

				if (pagination) {
					sql = sql.concat(porjadok_raboty_komissiiModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<porjadok_raboty_komissii>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<porjadok_raboty_komissii>)QueryUtil.list(q,
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
	 * Removes all the porjadok_raboty_komissiis from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (porjadok_raboty_komissii porjadok_raboty_komissii : findAll()) {
			remove(porjadok_raboty_komissii);
		}
	}

	/**
	 * Returns the number of porjadok_raboty_komissiis.
	 *
	 * @return the number of porjadok_raboty_komissiis
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_PORJADOK_RABOTY_KOMISSII);

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
		return porjadok_raboty_komissiiModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the porjadok_raboty_komissii persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(porjadok_raboty_komissiiImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_PORJADOK_RABOTY_KOMISSII = "SELECT porjadok_raboty_komissii FROM porjadok_raboty_komissii porjadok_raboty_komissii";
	private static final String _SQL_SELECT_PORJADOK_RABOTY_KOMISSII_WHERE_PKS_IN =
		"SELECT porjadok_raboty_komissii FROM porjadok_raboty_komissii porjadok_raboty_komissii WHERE porjadok_raboty_komissii_id IN (";
	private static final String _SQL_COUNT_PORJADOK_RABOTY_KOMISSII = "SELECT COUNT(porjadok_raboty_komissii) FROM porjadok_raboty_komissii porjadok_raboty_komissii";
	private static final String _ORDER_BY_ENTITY_ALIAS = "porjadok_raboty_komissii.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No porjadok_raboty_komissii exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(porjadok_raboty_komissiiPersistenceImpl.class);
}
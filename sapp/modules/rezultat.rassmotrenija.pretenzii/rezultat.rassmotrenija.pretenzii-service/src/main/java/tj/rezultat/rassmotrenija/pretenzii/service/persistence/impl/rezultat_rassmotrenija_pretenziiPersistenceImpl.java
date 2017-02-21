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

package tj.rezultat.rassmotrenija.pretenzii.service.persistence.impl;

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

import tj.rezultat.rassmotrenija.pretenzii.exception.NoSuchrezultat_rassmotrenija_pretenziiException;
import tj.rezultat.rassmotrenija.pretenzii.model.impl.rezultat_rassmotrenija_pretenziiImpl;
import tj.rezultat.rassmotrenija.pretenzii.model.impl.rezultat_rassmotrenija_pretenziiModelImpl;
import tj.rezultat.rassmotrenija.pretenzii.model.rezultat_rassmotrenija_pretenzii;
import tj.rezultat.rassmotrenija.pretenzii.service.persistence.rezultat_rassmotrenija_pretenziiPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the rezultat_rassmotrenija_pretenzii service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see rezultat_rassmotrenija_pretenziiPersistence
 * @see tj.rezultat.rassmotrenija.pretenzii.service.persistence.rezultat_rassmotrenija_pretenziiUtil
 * @generated
 */
@ProviderType
public class rezultat_rassmotrenija_pretenziiPersistenceImpl
	extends BasePersistenceImpl<rezultat_rassmotrenija_pretenzii>
	implements rezultat_rassmotrenija_pretenziiPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link rezultat_rassmotrenija_pretenziiUtil} to access the rezultat_rassmotrenija_pretenzii persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = rezultat_rassmotrenija_pretenziiImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(rezultat_rassmotrenija_pretenziiModelImpl.ENTITY_CACHE_ENABLED,
			rezultat_rassmotrenija_pretenziiModelImpl.FINDER_CACHE_ENABLED,
			rezultat_rassmotrenija_pretenziiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(rezultat_rassmotrenija_pretenziiModelImpl.ENTITY_CACHE_ENABLED,
			rezultat_rassmotrenija_pretenziiModelImpl.FINDER_CACHE_ENABLED,
			rezultat_rassmotrenija_pretenziiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(rezultat_rassmotrenija_pretenziiModelImpl.ENTITY_CACHE_ENABLED,
			rezultat_rassmotrenija_pretenziiModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	public rezultat_rassmotrenija_pretenziiPersistenceImpl() {
		setModelClass(rezultat_rassmotrenija_pretenzii.class);
	}

	/**
	 * Caches the rezultat_rassmotrenija_pretenzii in the entity cache if it is enabled.
	 *
	 * @param rezultat_rassmotrenija_pretenzii the rezultat_rassmotrenija_pretenzii
	 */
	@Override
	public void cacheResult(
		rezultat_rassmotrenija_pretenzii rezultat_rassmotrenija_pretenzii) {
		entityCache.putResult(rezultat_rassmotrenija_pretenziiModelImpl.ENTITY_CACHE_ENABLED,
			rezultat_rassmotrenija_pretenziiImpl.class,
			rezultat_rassmotrenija_pretenzii.getPrimaryKey(),
			rezultat_rassmotrenija_pretenzii);

		rezultat_rassmotrenija_pretenzii.resetOriginalValues();
	}

	/**
	 * Caches the rezultat_rassmotrenija_pretenziis in the entity cache if it is enabled.
	 *
	 * @param rezultat_rassmotrenija_pretenziis the rezultat_rassmotrenija_pretenziis
	 */
	@Override
	public void cacheResult(
		List<rezultat_rassmotrenija_pretenzii> rezultat_rassmotrenija_pretenziis) {
		for (rezultat_rassmotrenija_pretenzii rezultat_rassmotrenija_pretenzii : rezultat_rassmotrenija_pretenziis) {
			if (entityCache.getResult(
						rezultat_rassmotrenija_pretenziiModelImpl.ENTITY_CACHE_ENABLED,
						rezultat_rassmotrenija_pretenziiImpl.class,
						rezultat_rassmotrenija_pretenzii.getPrimaryKey()) == null) {
				cacheResult(rezultat_rassmotrenija_pretenzii);
			}
			else {
				rezultat_rassmotrenija_pretenzii.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all rezultat_rassmotrenija_pretenziis.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(rezultat_rassmotrenija_pretenziiImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the rezultat_rassmotrenija_pretenzii.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		rezultat_rassmotrenija_pretenzii rezultat_rassmotrenija_pretenzii) {
		entityCache.removeResult(rezultat_rassmotrenija_pretenziiModelImpl.ENTITY_CACHE_ENABLED,
			rezultat_rassmotrenija_pretenziiImpl.class,
			rezultat_rassmotrenija_pretenzii.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<rezultat_rassmotrenija_pretenzii> rezultat_rassmotrenija_pretenziis) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (rezultat_rassmotrenija_pretenzii rezultat_rassmotrenija_pretenzii : rezultat_rassmotrenija_pretenziis) {
			entityCache.removeResult(rezultat_rassmotrenija_pretenziiModelImpl.ENTITY_CACHE_ENABLED,
				rezultat_rassmotrenija_pretenziiImpl.class,
				rezultat_rassmotrenija_pretenzii.getPrimaryKey());
		}
	}

	/**
	 * Creates a new rezultat_rassmotrenija_pretenzii with the primary key. Does not add the rezultat_rassmotrenija_pretenzii to the database.
	 *
	 * @param rezultat_rassmotrenija_pretenzii_id the primary key for the new rezultat_rassmotrenija_pretenzii
	 * @return the new rezultat_rassmotrenija_pretenzii
	 */
	@Override
	public rezultat_rassmotrenija_pretenzii create(
		long rezultat_rassmotrenija_pretenzii_id) {
		rezultat_rassmotrenija_pretenzii rezultat_rassmotrenija_pretenzii = new rezultat_rassmotrenija_pretenziiImpl();

		rezultat_rassmotrenija_pretenzii.setNew(true);
		rezultat_rassmotrenija_pretenzii.setPrimaryKey(rezultat_rassmotrenija_pretenzii_id);

		return rezultat_rassmotrenija_pretenzii;
	}

	/**
	 * Removes the rezultat_rassmotrenija_pretenzii with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param rezultat_rassmotrenija_pretenzii_id the primary key of the rezultat_rassmotrenija_pretenzii
	 * @return the rezultat_rassmotrenija_pretenzii that was removed
	 * @throws NoSuchrezultat_rassmotrenija_pretenziiException if a rezultat_rassmotrenija_pretenzii with the primary key could not be found
	 */
	@Override
	public rezultat_rassmotrenija_pretenzii remove(
		long rezultat_rassmotrenija_pretenzii_id)
		throws NoSuchrezultat_rassmotrenija_pretenziiException {
		return remove((Serializable)rezultat_rassmotrenija_pretenzii_id);
	}

	/**
	 * Removes the rezultat_rassmotrenija_pretenzii with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the rezultat_rassmotrenija_pretenzii
	 * @return the rezultat_rassmotrenija_pretenzii that was removed
	 * @throws NoSuchrezultat_rassmotrenija_pretenziiException if a rezultat_rassmotrenija_pretenzii with the primary key could not be found
	 */
	@Override
	public rezultat_rassmotrenija_pretenzii remove(Serializable primaryKey)
		throws NoSuchrezultat_rassmotrenija_pretenziiException {
		Session session = null;

		try {
			session = openSession();

			rezultat_rassmotrenija_pretenzii rezultat_rassmotrenija_pretenzii = (rezultat_rassmotrenija_pretenzii)session.get(rezultat_rassmotrenija_pretenziiImpl.class,
					primaryKey);

			if (rezultat_rassmotrenija_pretenzii == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchrezultat_rassmotrenija_pretenziiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(rezultat_rassmotrenija_pretenzii);
		}
		catch (NoSuchrezultat_rassmotrenija_pretenziiException nsee) {
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
	protected rezultat_rassmotrenija_pretenzii removeImpl(
		rezultat_rassmotrenija_pretenzii rezultat_rassmotrenija_pretenzii) {
		rezultat_rassmotrenija_pretenzii = toUnwrappedModel(rezultat_rassmotrenija_pretenzii);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(rezultat_rassmotrenija_pretenzii)) {
				rezultat_rassmotrenija_pretenzii = (rezultat_rassmotrenija_pretenzii)session.get(rezultat_rassmotrenija_pretenziiImpl.class,
						rezultat_rassmotrenija_pretenzii.getPrimaryKeyObj());
			}

			if (rezultat_rassmotrenija_pretenzii != null) {
				session.delete(rezultat_rassmotrenija_pretenzii);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (rezultat_rassmotrenija_pretenzii != null) {
			clearCache(rezultat_rassmotrenija_pretenzii);
		}

		return rezultat_rassmotrenija_pretenzii;
	}

	@Override
	public rezultat_rassmotrenija_pretenzii updateImpl(
		rezultat_rassmotrenija_pretenzii rezultat_rassmotrenija_pretenzii) {
		rezultat_rassmotrenija_pretenzii = toUnwrappedModel(rezultat_rassmotrenija_pretenzii);

		boolean isNew = rezultat_rassmotrenija_pretenzii.isNew();

		Session session = null;

		try {
			session = openSession();

			if (rezultat_rassmotrenija_pretenzii.isNew()) {
				session.save(rezultat_rassmotrenija_pretenzii);

				rezultat_rassmotrenija_pretenzii.setNew(false);
			}
			else {
				rezultat_rassmotrenija_pretenzii = (rezultat_rassmotrenija_pretenzii)session.merge(rezultat_rassmotrenija_pretenzii);
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

		entityCache.putResult(rezultat_rassmotrenija_pretenziiModelImpl.ENTITY_CACHE_ENABLED,
			rezultat_rassmotrenija_pretenziiImpl.class,
			rezultat_rassmotrenija_pretenzii.getPrimaryKey(),
			rezultat_rassmotrenija_pretenzii, false);

		rezultat_rassmotrenija_pretenzii.resetOriginalValues();

		return rezultat_rassmotrenija_pretenzii;
	}

	protected rezultat_rassmotrenija_pretenzii toUnwrappedModel(
		rezultat_rassmotrenija_pretenzii rezultat_rassmotrenija_pretenzii) {
		if (rezultat_rassmotrenija_pretenzii instanceof rezultat_rassmotrenija_pretenziiImpl) {
			return rezultat_rassmotrenija_pretenzii;
		}

		rezultat_rassmotrenija_pretenziiImpl rezultat_rassmotrenija_pretenziiImpl =
			new rezultat_rassmotrenija_pretenziiImpl();

		rezultat_rassmotrenija_pretenziiImpl.setNew(rezultat_rassmotrenija_pretenzii.isNew());
		rezultat_rassmotrenija_pretenziiImpl.setPrimaryKey(rezultat_rassmotrenija_pretenzii.getPrimaryKey());

		rezultat_rassmotrenija_pretenziiImpl.setData_zagruzki(rezultat_rassmotrenija_pretenzii.getData_zagruzki());
		rezultat_rassmotrenija_pretenziiImpl.setImja_fajla(rezultat_rassmotrenija_pretenzii.getImja_fajla());
		rezultat_rassmotrenija_pretenziiImpl.setIzvewenie_id(rezultat_rassmotrenija_pretenzii.getIzvewenie_id());
		rezultat_rassmotrenija_pretenziiImpl.setLot_id(rezultat_rassmotrenija_pretenzii.getLot_id());
		rezultat_rassmotrenija_pretenziiImpl.setNazvanie_dokumenta(rezultat_rassmotrenija_pretenzii.getNazvanie_dokumenta());
		rezultat_rassmotrenija_pretenziiImpl.setPostavwik_id(rezultat_rassmotrenija_pretenzii.getPostavwik_id());
		rezultat_rassmotrenija_pretenziiImpl.setRezultat_rassmotrenija_pretenzii_id(rezultat_rassmotrenija_pretenzii.getRezultat_rassmotrenija_pretenzii_id());
		rezultat_rassmotrenija_pretenziiImpl.setZagruzil(rezultat_rassmotrenija_pretenzii.getZagruzil());

		return rezultat_rassmotrenija_pretenziiImpl;
	}

	/**
	 * Returns the rezultat_rassmotrenija_pretenzii with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the rezultat_rassmotrenija_pretenzii
	 * @return the rezultat_rassmotrenija_pretenzii
	 * @throws NoSuchrezultat_rassmotrenija_pretenziiException if a rezultat_rassmotrenija_pretenzii with the primary key could not be found
	 */
	@Override
	public rezultat_rassmotrenija_pretenzii findByPrimaryKey(
		Serializable primaryKey)
		throws NoSuchrezultat_rassmotrenija_pretenziiException {
		rezultat_rassmotrenija_pretenzii rezultat_rassmotrenija_pretenzii = fetchByPrimaryKey(primaryKey);

		if (rezultat_rassmotrenija_pretenzii == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchrezultat_rassmotrenija_pretenziiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return rezultat_rassmotrenija_pretenzii;
	}

	/**
	 * Returns the rezultat_rassmotrenija_pretenzii with the primary key or throws a {@link NoSuchrezultat_rassmotrenija_pretenziiException} if it could not be found.
	 *
	 * @param rezultat_rassmotrenija_pretenzii_id the primary key of the rezultat_rassmotrenija_pretenzii
	 * @return the rezultat_rassmotrenija_pretenzii
	 * @throws NoSuchrezultat_rassmotrenija_pretenziiException if a rezultat_rassmotrenija_pretenzii with the primary key could not be found
	 */
	@Override
	public rezultat_rassmotrenija_pretenzii findByPrimaryKey(
		long rezultat_rassmotrenija_pretenzii_id)
		throws NoSuchrezultat_rassmotrenija_pretenziiException {
		return findByPrimaryKey((Serializable)rezultat_rassmotrenija_pretenzii_id);
	}

	/**
	 * Returns the rezultat_rassmotrenija_pretenzii with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the rezultat_rassmotrenija_pretenzii
	 * @return the rezultat_rassmotrenija_pretenzii, or <code>null</code> if a rezultat_rassmotrenija_pretenzii with the primary key could not be found
	 */
	@Override
	public rezultat_rassmotrenija_pretenzii fetchByPrimaryKey(
		Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(rezultat_rassmotrenija_pretenziiModelImpl.ENTITY_CACHE_ENABLED,
				rezultat_rassmotrenija_pretenziiImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		rezultat_rassmotrenija_pretenzii rezultat_rassmotrenija_pretenzii = (rezultat_rassmotrenija_pretenzii)serializable;

		if (rezultat_rassmotrenija_pretenzii == null) {
			Session session = null;

			try {
				session = openSession();

				rezultat_rassmotrenija_pretenzii = (rezultat_rassmotrenija_pretenzii)session.get(rezultat_rassmotrenija_pretenziiImpl.class,
						primaryKey);

				if (rezultat_rassmotrenija_pretenzii != null) {
					cacheResult(rezultat_rassmotrenija_pretenzii);
				}
				else {
					entityCache.putResult(rezultat_rassmotrenija_pretenziiModelImpl.ENTITY_CACHE_ENABLED,
						rezultat_rassmotrenija_pretenziiImpl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(rezultat_rassmotrenija_pretenziiModelImpl.ENTITY_CACHE_ENABLED,
					rezultat_rassmotrenija_pretenziiImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return rezultat_rassmotrenija_pretenzii;
	}

	/**
	 * Returns the rezultat_rassmotrenija_pretenzii with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param rezultat_rassmotrenija_pretenzii_id the primary key of the rezultat_rassmotrenija_pretenzii
	 * @return the rezultat_rassmotrenija_pretenzii, or <code>null</code> if a rezultat_rassmotrenija_pretenzii with the primary key could not be found
	 */
	@Override
	public rezultat_rassmotrenija_pretenzii fetchByPrimaryKey(
		long rezultat_rassmotrenija_pretenzii_id) {
		return fetchByPrimaryKey((Serializable)rezultat_rassmotrenija_pretenzii_id);
	}

	@Override
	public Map<Serializable, rezultat_rassmotrenija_pretenzii> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, rezultat_rassmotrenija_pretenzii> map = new HashMap<Serializable, rezultat_rassmotrenija_pretenzii>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			rezultat_rassmotrenija_pretenzii rezultat_rassmotrenija_pretenzii = fetchByPrimaryKey(primaryKey);

			if (rezultat_rassmotrenija_pretenzii != null) {
				map.put(primaryKey, rezultat_rassmotrenija_pretenzii);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(rezultat_rassmotrenija_pretenziiModelImpl.ENTITY_CACHE_ENABLED,
					rezultat_rassmotrenija_pretenziiImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey,
						(rezultat_rassmotrenija_pretenzii)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_REZULTAT_RASSMOTRENIJA_PRETENZII_WHERE_PKS_IN);

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

			for (rezultat_rassmotrenija_pretenzii rezultat_rassmotrenija_pretenzii : (List<rezultat_rassmotrenija_pretenzii>)q.list()) {
				map.put(rezultat_rassmotrenija_pretenzii.getPrimaryKeyObj(),
					rezultat_rassmotrenija_pretenzii);

				cacheResult(rezultat_rassmotrenija_pretenzii);

				uncachedPrimaryKeys.remove(rezultat_rassmotrenija_pretenzii.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(rezultat_rassmotrenija_pretenziiModelImpl.ENTITY_CACHE_ENABLED,
					rezultat_rassmotrenija_pretenziiImpl.class, primaryKey,
					nullModel);
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
	 * Returns all the rezultat_rassmotrenija_pretenziis.
	 *
	 * @return the rezultat_rassmotrenija_pretenziis
	 */
	@Override
	public List<rezultat_rassmotrenija_pretenzii> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the rezultat_rassmotrenija_pretenziis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link rezultat_rassmotrenija_pretenziiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of rezultat_rassmotrenija_pretenziis
	 * @param end the upper bound of the range of rezultat_rassmotrenija_pretenziis (not inclusive)
	 * @return the range of rezultat_rassmotrenija_pretenziis
	 */
	@Override
	public List<rezultat_rassmotrenija_pretenzii> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the rezultat_rassmotrenija_pretenziis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link rezultat_rassmotrenija_pretenziiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of rezultat_rassmotrenija_pretenziis
	 * @param end the upper bound of the range of rezultat_rassmotrenija_pretenziis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of rezultat_rassmotrenija_pretenziis
	 */
	@Override
	public List<rezultat_rassmotrenija_pretenzii> findAll(int start, int end,
		OrderByComparator<rezultat_rassmotrenija_pretenzii> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the rezultat_rassmotrenija_pretenziis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link rezultat_rassmotrenija_pretenziiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of rezultat_rassmotrenija_pretenziis
	 * @param end the upper bound of the range of rezultat_rassmotrenija_pretenziis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of rezultat_rassmotrenija_pretenziis
	 */
	@Override
	public List<rezultat_rassmotrenija_pretenzii> findAll(int start, int end,
		OrderByComparator<rezultat_rassmotrenija_pretenzii> orderByComparator,
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

		List<rezultat_rassmotrenija_pretenzii> list = null;

		if (retrieveFromCache) {
			list = (List<rezultat_rassmotrenija_pretenzii>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_REZULTAT_RASSMOTRENIJA_PRETENZII);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_REZULTAT_RASSMOTRENIJA_PRETENZII;

				if (pagination) {
					sql = sql.concat(rezultat_rassmotrenija_pretenziiModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<rezultat_rassmotrenija_pretenzii>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<rezultat_rassmotrenija_pretenzii>)QueryUtil.list(q,
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
	 * Removes all the rezultat_rassmotrenija_pretenziis from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (rezultat_rassmotrenija_pretenzii rezultat_rassmotrenija_pretenzii : findAll()) {
			remove(rezultat_rassmotrenija_pretenzii);
		}
	}

	/**
	 * Returns the number of rezultat_rassmotrenija_pretenziis.
	 *
	 * @return the number of rezultat_rassmotrenija_pretenziis
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_REZULTAT_RASSMOTRENIJA_PRETENZII);

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
		return rezultat_rassmotrenija_pretenziiModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the rezultat_rassmotrenija_pretenzii persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(rezultat_rassmotrenija_pretenziiImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_REZULTAT_RASSMOTRENIJA_PRETENZII = "SELECT rezultat_rassmotrenija_pretenzii FROM rezultat_rassmotrenija_pretenzii rezultat_rassmotrenija_pretenzii";
	private static final String _SQL_SELECT_REZULTAT_RASSMOTRENIJA_PRETENZII_WHERE_PKS_IN =
		"SELECT rezultat_rassmotrenija_pretenzii FROM rezultat_rassmotrenija_pretenzii rezultat_rassmotrenija_pretenzii WHERE rezultat_rassmotrenija_pretenzii_id IN (";
	private static final String _SQL_COUNT_REZULTAT_RASSMOTRENIJA_PRETENZII = "SELECT COUNT(rezultat_rassmotrenija_pretenzii) FROM rezultat_rassmotrenija_pretenzii rezultat_rassmotrenija_pretenzii";
	private static final String _ORDER_BY_ENTITY_ALIAS = "rezultat_rassmotrenija_pretenzii.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No rezultat_rassmotrenija_pretenzii exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(rezultat_rassmotrenija_pretenziiPersistenceImpl.class);
}
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

package tj.zajavki.ot.postavwikov.service.persistence.impl;

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

import tj.zajavki.ot.postavwikov.exception.NoSuchzajavki_ot_postavwikovException;
import tj.zajavki.ot.postavwikov.model.impl.zajavki_ot_postavwikovImpl;
import tj.zajavki.ot.postavwikov.model.impl.zajavki_ot_postavwikovModelImpl;
import tj.zajavki.ot.postavwikov.model.zajavki_ot_postavwikov;
import tj.zajavki.ot.postavwikov.service.persistence.zajavki_ot_postavwikovPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the zajavki_ot_postavwikov service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see zajavki_ot_postavwikovPersistence
 * @see tj.zajavki.ot.postavwikov.service.persistence.zajavki_ot_postavwikovUtil
 * @generated
 */
@ProviderType
public class zajavki_ot_postavwikovPersistenceImpl extends BasePersistenceImpl<zajavki_ot_postavwikov>
	implements zajavki_ot_postavwikovPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link zajavki_ot_postavwikovUtil} to access the zajavki_ot_postavwikov persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = zajavki_ot_postavwikovImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(zajavki_ot_postavwikovModelImpl.ENTITY_CACHE_ENABLED,
			zajavki_ot_postavwikovModelImpl.FINDER_CACHE_ENABLED,
			zajavki_ot_postavwikovImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(zajavki_ot_postavwikovModelImpl.ENTITY_CACHE_ENABLED,
			zajavki_ot_postavwikovModelImpl.FINDER_CACHE_ENABLED,
			zajavki_ot_postavwikovImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(zajavki_ot_postavwikovModelImpl.ENTITY_CACHE_ENABLED,
			zajavki_ot_postavwikovModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public zajavki_ot_postavwikovPersistenceImpl() {
		setModelClass(zajavki_ot_postavwikov.class);
	}

	/**
	 * Caches the zajavki_ot_postavwikov in the entity cache if it is enabled.
	 *
	 * @param zajavki_ot_postavwikov the zajavki_ot_postavwikov
	 */
	@Override
	public void cacheResult(zajavki_ot_postavwikov zajavki_ot_postavwikov) {
		entityCache.putResult(zajavki_ot_postavwikovModelImpl.ENTITY_CACHE_ENABLED,
			zajavki_ot_postavwikovImpl.class,
			zajavki_ot_postavwikov.getPrimaryKey(), zajavki_ot_postavwikov);

		zajavki_ot_postavwikov.resetOriginalValues();
	}

	/**
	 * Caches the zajavki_ot_postavwikovs in the entity cache if it is enabled.
	 *
	 * @param zajavki_ot_postavwikovs the zajavki_ot_postavwikovs
	 */
	@Override
	public void cacheResult(
		List<zajavki_ot_postavwikov> zajavki_ot_postavwikovs) {
		for (zajavki_ot_postavwikov zajavki_ot_postavwikov : zajavki_ot_postavwikovs) {
			if (entityCache.getResult(
						zajavki_ot_postavwikovModelImpl.ENTITY_CACHE_ENABLED,
						zajavki_ot_postavwikovImpl.class,
						zajavki_ot_postavwikov.getPrimaryKey()) == null) {
				cacheResult(zajavki_ot_postavwikov);
			}
			else {
				zajavki_ot_postavwikov.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all zajavki_ot_postavwikovs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(zajavki_ot_postavwikovImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the zajavki_ot_postavwikov.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(zajavki_ot_postavwikov zajavki_ot_postavwikov) {
		entityCache.removeResult(zajavki_ot_postavwikovModelImpl.ENTITY_CACHE_ENABLED,
			zajavki_ot_postavwikovImpl.class,
			zajavki_ot_postavwikov.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<zajavki_ot_postavwikov> zajavki_ot_postavwikovs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (zajavki_ot_postavwikov zajavki_ot_postavwikov : zajavki_ot_postavwikovs) {
			entityCache.removeResult(zajavki_ot_postavwikovModelImpl.ENTITY_CACHE_ENABLED,
				zajavki_ot_postavwikovImpl.class,
				zajavki_ot_postavwikov.getPrimaryKey());
		}
	}

	/**
	 * Creates a new zajavki_ot_postavwikov with the primary key. Does not add the zajavki_ot_postavwikov to the database.
	 *
	 * @param zajavki_ot_postavwikov_id the primary key for the new zajavki_ot_postavwikov
	 * @return the new zajavki_ot_postavwikov
	 */
	@Override
	public zajavki_ot_postavwikov create(long zajavki_ot_postavwikov_id) {
		zajavki_ot_postavwikov zajavki_ot_postavwikov = new zajavki_ot_postavwikovImpl();

		zajavki_ot_postavwikov.setNew(true);
		zajavki_ot_postavwikov.setPrimaryKey(zajavki_ot_postavwikov_id);

		return zajavki_ot_postavwikov;
	}

	/**
	 * Removes the zajavki_ot_postavwikov with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param zajavki_ot_postavwikov_id the primary key of the zajavki_ot_postavwikov
	 * @return the zajavki_ot_postavwikov that was removed
	 * @throws NoSuchzajavki_ot_postavwikovException if a zajavki_ot_postavwikov with the primary key could not be found
	 */
	@Override
	public zajavki_ot_postavwikov remove(long zajavki_ot_postavwikov_id)
		throws NoSuchzajavki_ot_postavwikovException {
		return remove((Serializable)zajavki_ot_postavwikov_id);
	}

	/**
	 * Removes the zajavki_ot_postavwikov with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the zajavki_ot_postavwikov
	 * @return the zajavki_ot_postavwikov that was removed
	 * @throws NoSuchzajavki_ot_postavwikovException if a zajavki_ot_postavwikov with the primary key could not be found
	 */
	@Override
	public zajavki_ot_postavwikov remove(Serializable primaryKey)
		throws NoSuchzajavki_ot_postavwikovException {
		Session session = null;

		try {
			session = openSession();

			zajavki_ot_postavwikov zajavki_ot_postavwikov = (zajavki_ot_postavwikov)session.get(zajavki_ot_postavwikovImpl.class,
					primaryKey);

			if (zajavki_ot_postavwikov == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchzajavki_ot_postavwikovException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(zajavki_ot_postavwikov);
		}
		catch (NoSuchzajavki_ot_postavwikovException nsee) {
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
	protected zajavki_ot_postavwikov removeImpl(
		zajavki_ot_postavwikov zajavki_ot_postavwikov) {
		zajavki_ot_postavwikov = toUnwrappedModel(zajavki_ot_postavwikov);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(zajavki_ot_postavwikov)) {
				zajavki_ot_postavwikov = (zajavki_ot_postavwikov)session.get(zajavki_ot_postavwikovImpl.class,
						zajavki_ot_postavwikov.getPrimaryKeyObj());
			}

			if (zajavki_ot_postavwikov != null) {
				session.delete(zajavki_ot_postavwikov);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (zajavki_ot_postavwikov != null) {
			clearCache(zajavki_ot_postavwikov);
		}

		return zajavki_ot_postavwikov;
	}

	@Override
	public zajavki_ot_postavwikov updateImpl(
		zajavki_ot_postavwikov zajavki_ot_postavwikov) {
		zajavki_ot_postavwikov = toUnwrappedModel(zajavki_ot_postavwikov);

		boolean isNew = zajavki_ot_postavwikov.isNew();

		Session session = null;

		try {
			session = openSession();

			if (zajavki_ot_postavwikov.isNew()) {
				session.save(zajavki_ot_postavwikov);

				zajavki_ot_postavwikov.setNew(false);
			}
			else {
				zajavki_ot_postavwikov = (zajavki_ot_postavwikov)session.merge(zajavki_ot_postavwikov);
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

		entityCache.putResult(zajavki_ot_postavwikovModelImpl.ENTITY_CACHE_ENABLED,
			zajavki_ot_postavwikovImpl.class,
			zajavki_ot_postavwikov.getPrimaryKey(), zajavki_ot_postavwikov,
			false);

		zajavki_ot_postavwikov.resetOriginalValues();

		return zajavki_ot_postavwikov;
	}

	protected zajavki_ot_postavwikov toUnwrappedModel(
		zajavki_ot_postavwikov zajavki_ot_postavwikov) {
		if (zajavki_ot_postavwikov instanceof zajavki_ot_postavwikovImpl) {
			return zajavki_ot_postavwikov;
		}

		zajavki_ot_postavwikovImpl zajavki_ot_postavwikovImpl = new zajavki_ot_postavwikovImpl();

		zajavki_ot_postavwikovImpl.setNew(zajavki_ot_postavwikov.isNew());
		zajavki_ot_postavwikovImpl.setPrimaryKey(zajavki_ot_postavwikov.getPrimaryKey());

		zajavki_ot_postavwikovImpl.setData_izmenenija(zajavki_ot_postavwikov.getData_izmenenija());
		zajavki_ot_postavwikovImpl.setData_sozdanija(zajavki_ot_postavwikov.getData_sozdanija());
		zajavki_ot_postavwikovImpl.setItogo_za_tovar(zajavki_ot_postavwikov.getItogo_za_tovar());
		zajavki_ot_postavwikovImpl.setIzmenil(zajavki_ot_postavwikov.getIzmenil());
		zajavki_ot_postavwikovImpl.setIzvewenie_id(zajavki_ot_postavwikov.getIzvewenie_id());
		zajavki_ot_postavwikovImpl.setKod_po_obshhemu_klassifikatoru(zajavki_ot_postavwikov.getKod_po_obshhemu_klassifikatoru());
		zajavki_ot_postavwikovImpl.setKod_strany_proizvoditelja(zajavki_ot_postavwikov.getKod_strany_proizvoditelja());
		zajavki_ot_postavwikovImpl.setKolichestvo(zajavki_ot_postavwikov.getKolichestvo());
		zajavki_ot_postavwikovImpl.setLot_id(zajavki_ot_postavwikov.getLot_id());
		zajavki_ot_postavwikovImpl.setOpisanie_tovara(zajavki_ot_postavwikov.getOpisanie_tovara());
		zajavki_ot_postavwikovImpl.setPostavwik_id(zajavki_ot_postavwikov.getPostavwik_id());
		zajavki_ot_postavwikovImpl.setPredlozhenie_postavwika(zajavki_ot_postavwikov.getPredlozhenie_postavwika());
		zajavki_ot_postavwikovImpl.setSozdal(zajavki_ot_postavwikov.getSozdal());
		zajavki_ot_postavwikovImpl.setSumma_za_edinicu_tovara(zajavki_ot_postavwikov.getSumma_za_edinicu_tovara());
		zajavki_ot_postavwikovImpl.setTovar_id(zajavki_ot_postavwikov.getTovar_id());
		zajavki_ot_postavwikovImpl.setZajavki_ot_postavwikov_id(zajavki_ot_postavwikov.getZajavki_ot_postavwikov_id());

		return zajavki_ot_postavwikovImpl;
	}

	/**
	 * Returns the zajavki_ot_postavwikov with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the zajavki_ot_postavwikov
	 * @return the zajavki_ot_postavwikov
	 * @throws NoSuchzajavki_ot_postavwikovException if a zajavki_ot_postavwikov with the primary key could not be found
	 */
	@Override
	public zajavki_ot_postavwikov findByPrimaryKey(Serializable primaryKey)
		throws NoSuchzajavki_ot_postavwikovException {
		zajavki_ot_postavwikov zajavki_ot_postavwikov = fetchByPrimaryKey(primaryKey);

		if (zajavki_ot_postavwikov == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchzajavki_ot_postavwikovException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return zajavki_ot_postavwikov;
	}

	/**
	 * Returns the zajavki_ot_postavwikov with the primary key or throws a {@link NoSuchzajavki_ot_postavwikovException} if it could not be found.
	 *
	 * @param zajavki_ot_postavwikov_id the primary key of the zajavki_ot_postavwikov
	 * @return the zajavki_ot_postavwikov
	 * @throws NoSuchzajavki_ot_postavwikovException if a zajavki_ot_postavwikov with the primary key could not be found
	 */
	@Override
	public zajavki_ot_postavwikov findByPrimaryKey(
		long zajavki_ot_postavwikov_id)
		throws NoSuchzajavki_ot_postavwikovException {
		return findByPrimaryKey((Serializable)zajavki_ot_postavwikov_id);
	}

	/**
	 * Returns the zajavki_ot_postavwikov with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the zajavki_ot_postavwikov
	 * @return the zajavki_ot_postavwikov, or <code>null</code> if a zajavki_ot_postavwikov with the primary key could not be found
	 */
	@Override
	public zajavki_ot_postavwikov fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(zajavki_ot_postavwikovModelImpl.ENTITY_CACHE_ENABLED,
				zajavki_ot_postavwikovImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		zajavki_ot_postavwikov zajavki_ot_postavwikov = (zajavki_ot_postavwikov)serializable;

		if (zajavki_ot_postavwikov == null) {
			Session session = null;

			try {
				session = openSession();

				zajavki_ot_postavwikov = (zajavki_ot_postavwikov)session.get(zajavki_ot_postavwikovImpl.class,
						primaryKey);

				if (zajavki_ot_postavwikov != null) {
					cacheResult(zajavki_ot_postavwikov);
				}
				else {
					entityCache.putResult(zajavki_ot_postavwikovModelImpl.ENTITY_CACHE_ENABLED,
						zajavki_ot_postavwikovImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(zajavki_ot_postavwikovModelImpl.ENTITY_CACHE_ENABLED,
					zajavki_ot_postavwikovImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return zajavki_ot_postavwikov;
	}

	/**
	 * Returns the zajavki_ot_postavwikov with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param zajavki_ot_postavwikov_id the primary key of the zajavki_ot_postavwikov
	 * @return the zajavki_ot_postavwikov, or <code>null</code> if a zajavki_ot_postavwikov with the primary key could not be found
	 */
	@Override
	public zajavki_ot_postavwikov fetchByPrimaryKey(
		long zajavki_ot_postavwikov_id) {
		return fetchByPrimaryKey((Serializable)zajavki_ot_postavwikov_id);
	}

	@Override
	public Map<Serializable, zajavki_ot_postavwikov> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, zajavki_ot_postavwikov> map = new HashMap<Serializable, zajavki_ot_postavwikov>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			zajavki_ot_postavwikov zajavki_ot_postavwikov = fetchByPrimaryKey(primaryKey);

			if (zajavki_ot_postavwikov != null) {
				map.put(primaryKey, zajavki_ot_postavwikov);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(zajavki_ot_postavwikovModelImpl.ENTITY_CACHE_ENABLED,
					zajavki_ot_postavwikovImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (zajavki_ot_postavwikov)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ZAJAVKI_OT_POSTAVWIKOV_WHERE_PKS_IN);

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

			for (zajavki_ot_postavwikov zajavki_ot_postavwikov : (List<zajavki_ot_postavwikov>)q.list()) {
				map.put(zajavki_ot_postavwikov.getPrimaryKeyObj(),
					zajavki_ot_postavwikov);

				cacheResult(zajavki_ot_postavwikov);

				uncachedPrimaryKeys.remove(zajavki_ot_postavwikov.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(zajavki_ot_postavwikovModelImpl.ENTITY_CACHE_ENABLED,
					zajavki_ot_postavwikovImpl.class, primaryKey, nullModel);
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
	 * Returns all the zajavki_ot_postavwikovs.
	 *
	 * @return the zajavki_ot_postavwikovs
	 */
	@Override
	public List<zajavki_ot_postavwikov> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the zajavki_ot_postavwikovs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link zajavki_ot_postavwikovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of zajavki_ot_postavwikovs
	 * @param end the upper bound of the range of zajavki_ot_postavwikovs (not inclusive)
	 * @return the range of zajavki_ot_postavwikovs
	 */
	@Override
	public List<zajavki_ot_postavwikov> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the zajavki_ot_postavwikovs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link zajavki_ot_postavwikovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of zajavki_ot_postavwikovs
	 * @param end the upper bound of the range of zajavki_ot_postavwikovs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of zajavki_ot_postavwikovs
	 */
	@Override
	public List<zajavki_ot_postavwikov> findAll(int start, int end,
		OrderByComparator<zajavki_ot_postavwikov> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the zajavki_ot_postavwikovs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link zajavki_ot_postavwikovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of zajavki_ot_postavwikovs
	 * @param end the upper bound of the range of zajavki_ot_postavwikovs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of zajavki_ot_postavwikovs
	 */
	@Override
	public List<zajavki_ot_postavwikov> findAll(int start, int end,
		OrderByComparator<zajavki_ot_postavwikov> orderByComparator,
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

		List<zajavki_ot_postavwikov> list = null;

		if (retrieveFromCache) {
			list = (List<zajavki_ot_postavwikov>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ZAJAVKI_OT_POSTAVWIKOV);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ZAJAVKI_OT_POSTAVWIKOV;

				if (pagination) {
					sql = sql.concat(zajavki_ot_postavwikovModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<zajavki_ot_postavwikov>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<zajavki_ot_postavwikov>)QueryUtil.list(q,
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
	 * Removes all the zajavki_ot_postavwikovs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (zajavki_ot_postavwikov zajavki_ot_postavwikov : findAll()) {
			remove(zajavki_ot_postavwikov);
		}
	}

	/**
	 * Returns the number of zajavki_ot_postavwikovs.
	 *
	 * @return the number of zajavki_ot_postavwikovs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ZAJAVKI_OT_POSTAVWIKOV);

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
		return zajavki_ot_postavwikovModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the zajavki_ot_postavwikov persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(zajavki_ot_postavwikovImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_ZAJAVKI_OT_POSTAVWIKOV = "SELECT zajavki_ot_postavwikov FROM zajavki_ot_postavwikov zajavki_ot_postavwikov";
	private static final String _SQL_SELECT_ZAJAVKI_OT_POSTAVWIKOV_WHERE_PKS_IN = "SELECT zajavki_ot_postavwikov FROM zajavki_ot_postavwikov zajavki_ot_postavwikov WHERE zajavki_ot_postavwikov_id IN (";
	private static final String _SQL_COUNT_ZAJAVKI_OT_POSTAVWIKOV = "SELECT COUNT(zajavki_ot_postavwikov) FROM zajavki_ot_postavwikov zajavki_ot_postavwikov";
	private static final String _ORDER_BY_ENTITY_ALIAS = "zajavki_ot_postavwikov.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No zajavki_ot_postavwikov exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(zajavki_ot_postavwikovPersistenceImpl.class);
}
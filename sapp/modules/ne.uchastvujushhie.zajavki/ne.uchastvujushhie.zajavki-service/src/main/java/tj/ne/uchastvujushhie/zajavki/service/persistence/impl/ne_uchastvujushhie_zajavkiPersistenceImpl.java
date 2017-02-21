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

package tj.ne.uchastvujushhie.zajavki.service.persistence.impl;

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

import tj.ne.uchastvujushhie.zajavki.exception.NoSuchne_uchastvujushhie_zajavkiException;
import tj.ne.uchastvujushhie.zajavki.model.impl.ne_uchastvujushhie_zajavkiImpl;
import tj.ne.uchastvujushhie.zajavki.model.impl.ne_uchastvujushhie_zajavkiModelImpl;
import tj.ne.uchastvujushhie.zajavki.model.ne_uchastvujushhie_zajavki;
import tj.ne.uchastvujushhie.zajavki.service.persistence.ne_uchastvujushhie_zajavkiPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the ne_uchastvujushhie_zajavki service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ne_uchastvujushhie_zajavkiPersistence
 * @see tj.ne.uchastvujushhie.zajavki.service.persistence.ne_uchastvujushhie_zajavkiUtil
 * @generated
 */
@ProviderType
public class ne_uchastvujushhie_zajavkiPersistenceImpl
	extends BasePersistenceImpl<ne_uchastvujushhie_zajavki>
	implements ne_uchastvujushhie_zajavkiPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ne_uchastvujushhie_zajavkiUtil} to access the ne_uchastvujushhie_zajavki persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ne_uchastvujushhie_zajavkiImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ne_uchastvujushhie_zajavkiModelImpl.ENTITY_CACHE_ENABLED,
			ne_uchastvujushhie_zajavkiModelImpl.FINDER_CACHE_ENABLED,
			ne_uchastvujushhie_zajavkiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ne_uchastvujushhie_zajavkiModelImpl.ENTITY_CACHE_ENABLED,
			ne_uchastvujushhie_zajavkiModelImpl.FINDER_CACHE_ENABLED,
			ne_uchastvujushhie_zajavkiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ne_uchastvujushhie_zajavkiModelImpl.ENTITY_CACHE_ENABLED,
			ne_uchastvujushhie_zajavkiModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	public ne_uchastvujushhie_zajavkiPersistenceImpl() {
		setModelClass(ne_uchastvujushhie_zajavki.class);
	}

	/**
	 * Caches the ne_uchastvujushhie_zajavki in the entity cache if it is enabled.
	 *
	 * @param ne_uchastvujushhie_zajavki the ne_uchastvujushhie_zajavki
	 */
	@Override
	public void cacheResult(
		ne_uchastvujushhie_zajavki ne_uchastvujushhie_zajavki) {
		entityCache.putResult(ne_uchastvujushhie_zajavkiModelImpl.ENTITY_CACHE_ENABLED,
			ne_uchastvujushhie_zajavkiImpl.class,
			ne_uchastvujushhie_zajavki.getPrimaryKey(),
			ne_uchastvujushhie_zajavki);

		ne_uchastvujushhie_zajavki.resetOriginalValues();
	}

	/**
	 * Caches the ne_uchastvujushhie_zajavkis in the entity cache if it is enabled.
	 *
	 * @param ne_uchastvujushhie_zajavkis the ne_uchastvujushhie_zajavkis
	 */
	@Override
	public void cacheResult(
		List<ne_uchastvujushhie_zajavki> ne_uchastvujushhie_zajavkis) {
		for (ne_uchastvujushhie_zajavki ne_uchastvujushhie_zajavki : ne_uchastvujushhie_zajavkis) {
			if (entityCache.getResult(
						ne_uchastvujushhie_zajavkiModelImpl.ENTITY_CACHE_ENABLED,
						ne_uchastvujushhie_zajavkiImpl.class,
						ne_uchastvujushhie_zajavki.getPrimaryKey()) == null) {
				cacheResult(ne_uchastvujushhie_zajavki);
			}
			else {
				ne_uchastvujushhie_zajavki.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all ne_uchastvujushhie_zajavkis.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ne_uchastvujushhie_zajavkiImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the ne_uchastvujushhie_zajavki.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		ne_uchastvujushhie_zajavki ne_uchastvujushhie_zajavki) {
		entityCache.removeResult(ne_uchastvujushhie_zajavkiModelImpl.ENTITY_CACHE_ENABLED,
			ne_uchastvujushhie_zajavkiImpl.class,
			ne_uchastvujushhie_zajavki.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<ne_uchastvujushhie_zajavki> ne_uchastvujushhie_zajavkis) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ne_uchastvujushhie_zajavki ne_uchastvujushhie_zajavki : ne_uchastvujushhie_zajavkis) {
			entityCache.removeResult(ne_uchastvujushhie_zajavkiModelImpl.ENTITY_CACHE_ENABLED,
				ne_uchastvujushhie_zajavkiImpl.class,
				ne_uchastvujushhie_zajavki.getPrimaryKey());
		}
	}

	/**
	 * Creates a new ne_uchastvujushhie_zajavki with the primary key. Does not add the ne_uchastvujushhie_zajavki to the database.
	 *
	 * @param ne_uchastvujushhie_zajavki_id the primary key for the new ne_uchastvujushhie_zajavki
	 * @return the new ne_uchastvujushhie_zajavki
	 */
	@Override
	public ne_uchastvujushhie_zajavki create(long ne_uchastvujushhie_zajavki_id) {
		ne_uchastvujushhie_zajavki ne_uchastvujushhie_zajavki = new ne_uchastvujushhie_zajavkiImpl();

		ne_uchastvujushhie_zajavki.setNew(true);
		ne_uchastvujushhie_zajavki.setPrimaryKey(ne_uchastvujushhie_zajavki_id);

		return ne_uchastvujushhie_zajavki;
	}

	/**
	 * Removes the ne_uchastvujushhie_zajavki with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ne_uchastvujushhie_zajavki_id the primary key of the ne_uchastvujushhie_zajavki
	 * @return the ne_uchastvujushhie_zajavki that was removed
	 * @throws NoSuchne_uchastvujushhie_zajavkiException if a ne_uchastvujushhie_zajavki with the primary key could not be found
	 */
	@Override
	public ne_uchastvujushhie_zajavki remove(long ne_uchastvujushhie_zajavki_id)
		throws NoSuchne_uchastvujushhie_zajavkiException {
		return remove((Serializable)ne_uchastvujushhie_zajavki_id);
	}

	/**
	 * Removes the ne_uchastvujushhie_zajavki with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ne_uchastvujushhie_zajavki
	 * @return the ne_uchastvujushhie_zajavki that was removed
	 * @throws NoSuchne_uchastvujushhie_zajavkiException if a ne_uchastvujushhie_zajavki with the primary key could not be found
	 */
	@Override
	public ne_uchastvujushhie_zajavki remove(Serializable primaryKey)
		throws NoSuchne_uchastvujushhie_zajavkiException {
		Session session = null;

		try {
			session = openSession();

			ne_uchastvujushhie_zajavki ne_uchastvujushhie_zajavki = (ne_uchastvujushhie_zajavki)session.get(ne_uchastvujushhie_zajavkiImpl.class,
					primaryKey);

			if (ne_uchastvujushhie_zajavki == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchne_uchastvujushhie_zajavkiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(ne_uchastvujushhie_zajavki);
		}
		catch (NoSuchne_uchastvujushhie_zajavkiException nsee) {
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
	protected ne_uchastvujushhie_zajavki removeImpl(
		ne_uchastvujushhie_zajavki ne_uchastvujushhie_zajavki) {
		ne_uchastvujushhie_zajavki = toUnwrappedModel(ne_uchastvujushhie_zajavki);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ne_uchastvujushhie_zajavki)) {
				ne_uchastvujushhie_zajavki = (ne_uchastvujushhie_zajavki)session.get(ne_uchastvujushhie_zajavkiImpl.class,
						ne_uchastvujushhie_zajavki.getPrimaryKeyObj());
			}

			if (ne_uchastvujushhie_zajavki != null) {
				session.delete(ne_uchastvujushhie_zajavki);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (ne_uchastvujushhie_zajavki != null) {
			clearCache(ne_uchastvujushhie_zajavki);
		}

		return ne_uchastvujushhie_zajavki;
	}

	@Override
	public ne_uchastvujushhie_zajavki updateImpl(
		ne_uchastvujushhie_zajavki ne_uchastvujushhie_zajavki) {
		ne_uchastvujushhie_zajavki = toUnwrappedModel(ne_uchastvujushhie_zajavki);

		boolean isNew = ne_uchastvujushhie_zajavki.isNew();

		Session session = null;

		try {
			session = openSession();

			if (ne_uchastvujushhie_zajavki.isNew()) {
				session.save(ne_uchastvujushhie_zajavki);

				ne_uchastvujushhie_zajavki.setNew(false);
			}
			else {
				ne_uchastvujushhie_zajavki = (ne_uchastvujushhie_zajavki)session.merge(ne_uchastvujushhie_zajavki);
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

		entityCache.putResult(ne_uchastvujushhie_zajavkiModelImpl.ENTITY_CACHE_ENABLED,
			ne_uchastvujushhie_zajavkiImpl.class,
			ne_uchastvujushhie_zajavki.getPrimaryKey(),
			ne_uchastvujushhie_zajavki, false);

		ne_uchastvujushhie_zajavki.resetOriginalValues();

		return ne_uchastvujushhie_zajavki;
	}

	protected ne_uchastvujushhie_zajavki toUnwrappedModel(
		ne_uchastvujushhie_zajavki ne_uchastvujushhie_zajavki) {
		if (ne_uchastvujushhie_zajavki instanceof ne_uchastvujushhie_zajavkiImpl) {
			return ne_uchastvujushhie_zajavki;
		}

		ne_uchastvujushhie_zajavkiImpl ne_uchastvujushhie_zajavkiImpl = new ne_uchastvujushhie_zajavkiImpl();

		ne_uchastvujushhie_zajavkiImpl.setNew(ne_uchastvujushhie_zajavki.isNew());
		ne_uchastvujushhie_zajavkiImpl.setPrimaryKey(ne_uchastvujushhie_zajavki.getPrimaryKey());

		ne_uchastvujushhie_zajavkiImpl.setData_sozdanija(ne_uchastvujushhie_zajavki.getData_sozdanija());
		ne_uchastvujushhie_zajavkiImpl.setItogo_za_tovar(ne_uchastvujushhie_zajavki.getItogo_za_tovar());
		ne_uchastvujushhie_zajavkiImpl.setIzvewenie_id(ne_uchastvujushhie_zajavki.getIzvewenie_id());
		ne_uchastvujushhie_zajavkiImpl.setKolichestvo(ne_uchastvujushhie_zajavki.getKolichestvo());
		ne_uchastvujushhie_zajavkiImpl.setLot_id(ne_uchastvujushhie_zajavki.getLot_id());
		ne_uchastvujushhie_zajavkiImpl.setNe_uchastvujushhie_zajavki_id(ne_uchastvujushhie_zajavki.getNe_uchastvujushhie_zajavki_id());
		ne_uchastvujushhie_zajavkiImpl.setPostavwik_id(ne_uchastvujushhie_zajavki.getPostavwik_id());
		ne_uchastvujushhie_zajavkiImpl.setSozdal(ne_uchastvujushhie_zajavki.getSozdal());
		ne_uchastvujushhie_zajavkiImpl.setSumma_za_edinicu_tovara(ne_uchastvujushhie_zajavki.getSumma_za_edinicu_tovara());
		ne_uchastvujushhie_zajavkiImpl.setTovar_id(ne_uchastvujushhie_zajavki.getTovar_id());

		return ne_uchastvujushhie_zajavkiImpl;
	}

	/**
	 * Returns the ne_uchastvujushhie_zajavki with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the ne_uchastvujushhie_zajavki
	 * @return the ne_uchastvujushhie_zajavki
	 * @throws NoSuchne_uchastvujushhie_zajavkiException if a ne_uchastvujushhie_zajavki with the primary key could not be found
	 */
	@Override
	public ne_uchastvujushhie_zajavki findByPrimaryKey(Serializable primaryKey)
		throws NoSuchne_uchastvujushhie_zajavkiException {
		ne_uchastvujushhie_zajavki ne_uchastvujushhie_zajavki = fetchByPrimaryKey(primaryKey);

		if (ne_uchastvujushhie_zajavki == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchne_uchastvujushhie_zajavkiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return ne_uchastvujushhie_zajavki;
	}

	/**
	 * Returns the ne_uchastvujushhie_zajavki with the primary key or throws a {@link NoSuchne_uchastvujushhie_zajavkiException} if it could not be found.
	 *
	 * @param ne_uchastvujushhie_zajavki_id the primary key of the ne_uchastvujushhie_zajavki
	 * @return the ne_uchastvujushhie_zajavki
	 * @throws NoSuchne_uchastvujushhie_zajavkiException if a ne_uchastvujushhie_zajavki with the primary key could not be found
	 */
	@Override
	public ne_uchastvujushhie_zajavki findByPrimaryKey(
		long ne_uchastvujushhie_zajavki_id)
		throws NoSuchne_uchastvujushhie_zajavkiException {
		return findByPrimaryKey((Serializable)ne_uchastvujushhie_zajavki_id);
	}

	/**
	 * Returns the ne_uchastvujushhie_zajavki with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ne_uchastvujushhie_zajavki
	 * @return the ne_uchastvujushhie_zajavki, or <code>null</code> if a ne_uchastvujushhie_zajavki with the primary key could not be found
	 */
	@Override
	public ne_uchastvujushhie_zajavki fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(ne_uchastvujushhie_zajavkiModelImpl.ENTITY_CACHE_ENABLED,
				ne_uchastvujushhie_zajavkiImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		ne_uchastvujushhie_zajavki ne_uchastvujushhie_zajavki = (ne_uchastvujushhie_zajavki)serializable;

		if (ne_uchastvujushhie_zajavki == null) {
			Session session = null;

			try {
				session = openSession();

				ne_uchastvujushhie_zajavki = (ne_uchastvujushhie_zajavki)session.get(ne_uchastvujushhie_zajavkiImpl.class,
						primaryKey);

				if (ne_uchastvujushhie_zajavki != null) {
					cacheResult(ne_uchastvujushhie_zajavki);
				}
				else {
					entityCache.putResult(ne_uchastvujushhie_zajavkiModelImpl.ENTITY_CACHE_ENABLED,
						ne_uchastvujushhie_zajavkiImpl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ne_uchastvujushhie_zajavkiModelImpl.ENTITY_CACHE_ENABLED,
					ne_uchastvujushhie_zajavkiImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return ne_uchastvujushhie_zajavki;
	}

	/**
	 * Returns the ne_uchastvujushhie_zajavki with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ne_uchastvujushhie_zajavki_id the primary key of the ne_uchastvujushhie_zajavki
	 * @return the ne_uchastvujushhie_zajavki, or <code>null</code> if a ne_uchastvujushhie_zajavki with the primary key could not be found
	 */
	@Override
	public ne_uchastvujushhie_zajavki fetchByPrimaryKey(
		long ne_uchastvujushhie_zajavki_id) {
		return fetchByPrimaryKey((Serializable)ne_uchastvujushhie_zajavki_id);
	}

	@Override
	public Map<Serializable, ne_uchastvujushhie_zajavki> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, ne_uchastvujushhie_zajavki> map = new HashMap<Serializable, ne_uchastvujushhie_zajavki>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			ne_uchastvujushhie_zajavki ne_uchastvujushhie_zajavki = fetchByPrimaryKey(primaryKey);

			if (ne_uchastvujushhie_zajavki != null) {
				map.put(primaryKey, ne_uchastvujushhie_zajavki);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(ne_uchastvujushhie_zajavkiModelImpl.ENTITY_CACHE_ENABLED,
					ne_uchastvujushhie_zajavkiImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (ne_uchastvujushhie_zajavki)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_NE_UCHASTVUJUSHHIE_ZAJAVKI_WHERE_PKS_IN);

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

			for (ne_uchastvujushhie_zajavki ne_uchastvujushhie_zajavki : (List<ne_uchastvujushhie_zajavki>)q.list()) {
				map.put(ne_uchastvujushhie_zajavki.getPrimaryKeyObj(),
					ne_uchastvujushhie_zajavki);

				cacheResult(ne_uchastvujushhie_zajavki);

				uncachedPrimaryKeys.remove(ne_uchastvujushhie_zajavki.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ne_uchastvujushhie_zajavkiModelImpl.ENTITY_CACHE_ENABLED,
					ne_uchastvujushhie_zajavkiImpl.class, primaryKey, nullModel);
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
	 * Returns all the ne_uchastvujushhie_zajavkis.
	 *
	 * @return the ne_uchastvujushhie_zajavkis
	 */
	@Override
	public List<ne_uchastvujushhie_zajavki> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ne_uchastvujushhie_zajavkis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ne_uchastvujushhie_zajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ne_uchastvujushhie_zajavkis
	 * @param end the upper bound of the range of ne_uchastvujushhie_zajavkis (not inclusive)
	 * @return the range of ne_uchastvujushhie_zajavkis
	 */
	@Override
	public List<ne_uchastvujushhie_zajavki> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ne_uchastvujushhie_zajavkis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ne_uchastvujushhie_zajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ne_uchastvujushhie_zajavkis
	 * @param end the upper bound of the range of ne_uchastvujushhie_zajavkis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ne_uchastvujushhie_zajavkis
	 */
	@Override
	public List<ne_uchastvujushhie_zajavki> findAll(int start, int end,
		OrderByComparator<ne_uchastvujushhie_zajavki> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ne_uchastvujushhie_zajavkis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ne_uchastvujushhie_zajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ne_uchastvujushhie_zajavkis
	 * @param end the upper bound of the range of ne_uchastvujushhie_zajavkis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of ne_uchastvujushhie_zajavkis
	 */
	@Override
	public List<ne_uchastvujushhie_zajavki> findAll(int start, int end,
		OrderByComparator<ne_uchastvujushhie_zajavki> orderByComparator,
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

		List<ne_uchastvujushhie_zajavki> list = null;

		if (retrieveFromCache) {
			list = (List<ne_uchastvujushhie_zajavki>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_NE_UCHASTVUJUSHHIE_ZAJAVKI);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_NE_UCHASTVUJUSHHIE_ZAJAVKI;

				if (pagination) {
					sql = sql.concat(ne_uchastvujushhie_zajavkiModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ne_uchastvujushhie_zajavki>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ne_uchastvujushhie_zajavki>)QueryUtil.list(q,
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
	 * Removes all the ne_uchastvujushhie_zajavkis from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ne_uchastvujushhie_zajavki ne_uchastvujushhie_zajavki : findAll()) {
			remove(ne_uchastvujushhie_zajavki);
		}
	}

	/**
	 * Returns the number of ne_uchastvujushhie_zajavkis.
	 *
	 * @return the number of ne_uchastvujushhie_zajavkis
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_NE_UCHASTVUJUSHHIE_ZAJAVKI);

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
		return ne_uchastvujushhie_zajavkiModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ne_uchastvujushhie_zajavki persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ne_uchastvujushhie_zajavkiImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_NE_UCHASTVUJUSHHIE_ZAJAVKI = "SELECT ne_uchastvujushhie_zajavki FROM ne_uchastvujushhie_zajavki ne_uchastvujushhie_zajavki";
	private static final String _SQL_SELECT_NE_UCHASTVUJUSHHIE_ZAJAVKI_WHERE_PKS_IN =
		"SELECT ne_uchastvujushhie_zajavki FROM ne_uchastvujushhie_zajavki ne_uchastvujushhie_zajavki WHERE ne_uchastvujushhie_zajavki_id IN (";
	private static final String _SQL_COUNT_NE_UCHASTVUJUSHHIE_ZAJAVKI = "SELECT COUNT(ne_uchastvujushhie_zajavki) FROM ne_uchastvujushhie_zajavki ne_uchastvujushhie_zajavki";
	private static final String _ORDER_BY_ENTITY_ALIAS = "ne_uchastvujushhie_zajavki.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ne_uchastvujushhie_zajavki exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(ne_uchastvujushhie_zajavkiPersistenceImpl.class);
}
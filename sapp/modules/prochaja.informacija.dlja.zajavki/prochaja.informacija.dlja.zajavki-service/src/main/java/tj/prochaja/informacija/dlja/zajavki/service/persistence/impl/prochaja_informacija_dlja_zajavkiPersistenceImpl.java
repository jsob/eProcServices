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

package tj.prochaja.informacija.dlja.zajavki.service.persistence.impl;

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

import tj.prochaja.informacija.dlja.zajavki.exception.NoSuchprochaja_informacija_dlja_zajavkiException;
import tj.prochaja.informacija.dlja.zajavki.model.impl.prochaja_informacija_dlja_zajavkiImpl;
import tj.prochaja.informacija.dlja.zajavki.model.impl.prochaja_informacija_dlja_zajavkiModelImpl;
import tj.prochaja.informacija.dlja.zajavki.model.prochaja_informacija_dlja_zajavki;
import tj.prochaja.informacija.dlja.zajavki.service.persistence.prochaja_informacija_dlja_zajavkiPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the prochaja_informacija_dlja_zajavki service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see prochaja_informacija_dlja_zajavkiPersistence
 * @see tj.prochaja.informacija.dlja.zajavki.service.persistence.prochaja_informacija_dlja_zajavkiUtil
 * @generated
 */
@ProviderType
public class prochaja_informacija_dlja_zajavkiPersistenceImpl
	extends BasePersistenceImpl<prochaja_informacija_dlja_zajavki>
	implements prochaja_informacija_dlja_zajavkiPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link prochaja_informacija_dlja_zajavkiUtil} to access the prochaja_informacija_dlja_zajavki persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = prochaja_informacija_dlja_zajavkiImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(prochaja_informacija_dlja_zajavkiModelImpl.ENTITY_CACHE_ENABLED,
			prochaja_informacija_dlja_zajavkiModelImpl.FINDER_CACHE_ENABLED,
			prochaja_informacija_dlja_zajavkiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(prochaja_informacija_dlja_zajavkiModelImpl.ENTITY_CACHE_ENABLED,
			prochaja_informacija_dlja_zajavkiModelImpl.FINDER_CACHE_ENABLED,
			prochaja_informacija_dlja_zajavkiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(prochaja_informacija_dlja_zajavkiModelImpl.ENTITY_CACHE_ENABLED,
			prochaja_informacija_dlja_zajavkiModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	public prochaja_informacija_dlja_zajavkiPersistenceImpl() {
		setModelClass(prochaja_informacija_dlja_zajavki.class);
	}

	/**
	 * Caches the prochaja_informacija_dlja_zajavki in the entity cache if it is enabled.
	 *
	 * @param prochaja_informacija_dlja_zajavki the prochaja_informacija_dlja_zajavki
	 */
	@Override
	public void cacheResult(
		prochaja_informacija_dlja_zajavki prochaja_informacija_dlja_zajavki) {
		entityCache.putResult(prochaja_informacija_dlja_zajavkiModelImpl.ENTITY_CACHE_ENABLED,
			prochaja_informacija_dlja_zajavkiImpl.class,
			prochaja_informacija_dlja_zajavki.getPrimaryKey(),
			prochaja_informacija_dlja_zajavki);

		prochaja_informacija_dlja_zajavki.resetOriginalValues();
	}

	/**
	 * Caches the prochaja_informacija_dlja_zajavkis in the entity cache if it is enabled.
	 *
	 * @param prochaja_informacija_dlja_zajavkis the prochaja_informacija_dlja_zajavkis
	 */
	@Override
	public void cacheResult(
		List<prochaja_informacija_dlja_zajavki> prochaja_informacija_dlja_zajavkis) {
		for (prochaja_informacija_dlja_zajavki prochaja_informacija_dlja_zajavki : prochaja_informacija_dlja_zajavkis) {
			if (entityCache.getResult(
						prochaja_informacija_dlja_zajavkiModelImpl.ENTITY_CACHE_ENABLED,
						prochaja_informacija_dlja_zajavkiImpl.class,
						prochaja_informacija_dlja_zajavki.getPrimaryKey()) == null) {
				cacheResult(prochaja_informacija_dlja_zajavki);
			}
			else {
				prochaja_informacija_dlja_zajavki.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all prochaja_informacija_dlja_zajavkis.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(prochaja_informacija_dlja_zajavkiImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the prochaja_informacija_dlja_zajavki.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		prochaja_informacija_dlja_zajavki prochaja_informacija_dlja_zajavki) {
		entityCache.removeResult(prochaja_informacija_dlja_zajavkiModelImpl.ENTITY_CACHE_ENABLED,
			prochaja_informacija_dlja_zajavkiImpl.class,
			prochaja_informacija_dlja_zajavki.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<prochaja_informacija_dlja_zajavki> prochaja_informacija_dlja_zajavkis) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (prochaja_informacija_dlja_zajavki prochaja_informacija_dlja_zajavki : prochaja_informacija_dlja_zajavkis) {
			entityCache.removeResult(prochaja_informacija_dlja_zajavkiModelImpl.ENTITY_CACHE_ENABLED,
				prochaja_informacija_dlja_zajavkiImpl.class,
				prochaja_informacija_dlja_zajavki.getPrimaryKey());
		}
	}

	/**
	 * Creates a new prochaja_informacija_dlja_zajavki with the primary key. Does not add the prochaja_informacija_dlja_zajavki to the database.
	 *
	 * @param prochaja_informacija_dlja_zajavki_id the primary key for the new prochaja_informacija_dlja_zajavki
	 * @return the new prochaja_informacija_dlja_zajavki
	 */
	@Override
	public prochaja_informacija_dlja_zajavki create(
		long prochaja_informacija_dlja_zajavki_id) {
		prochaja_informacija_dlja_zajavki prochaja_informacija_dlja_zajavki = new prochaja_informacija_dlja_zajavkiImpl();

		prochaja_informacija_dlja_zajavki.setNew(true);
		prochaja_informacija_dlja_zajavki.setPrimaryKey(prochaja_informacija_dlja_zajavki_id);

		return prochaja_informacija_dlja_zajavki;
	}

	/**
	 * Removes the prochaja_informacija_dlja_zajavki with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param prochaja_informacija_dlja_zajavki_id the primary key of the prochaja_informacija_dlja_zajavki
	 * @return the prochaja_informacija_dlja_zajavki that was removed
	 * @throws NoSuchprochaja_informacija_dlja_zajavkiException if a prochaja_informacija_dlja_zajavki with the primary key could not be found
	 */
	@Override
	public prochaja_informacija_dlja_zajavki remove(
		long prochaja_informacija_dlja_zajavki_id)
		throws NoSuchprochaja_informacija_dlja_zajavkiException {
		return remove((Serializable)prochaja_informacija_dlja_zajavki_id);
	}

	/**
	 * Removes the prochaja_informacija_dlja_zajavki with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the prochaja_informacija_dlja_zajavki
	 * @return the prochaja_informacija_dlja_zajavki that was removed
	 * @throws NoSuchprochaja_informacija_dlja_zajavkiException if a prochaja_informacija_dlja_zajavki with the primary key could not be found
	 */
	@Override
	public prochaja_informacija_dlja_zajavki remove(Serializable primaryKey)
		throws NoSuchprochaja_informacija_dlja_zajavkiException {
		Session session = null;

		try {
			session = openSession();

			prochaja_informacija_dlja_zajavki prochaja_informacija_dlja_zajavki = (prochaja_informacija_dlja_zajavki)session.get(prochaja_informacija_dlja_zajavkiImpl.class,
					primaryKey);

			if (prochaja_informacija_dlja_zajavki == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchprochaja_informacija_dlja_zajavkiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(prochaja_informacija_dlja_zajavki);
		}
		catch (NoSuchprochaja_informacija_dlja_zajavkiException nsee) {
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
	protected prochaja_informacija_dlja_zajavki removeImpl(
		prochaja_informacija_dlja_zajavki prochaja_informacija_dlja_zajavki) {
		prochaja_informacija_dlja_zajavki = toUnwrappedModel(prochaja_informacija_dlja_zajavki);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(prochaja_informacija_dlja_zajavki)) {
				prochaja_informacija_dlja_zajavki = (prochaja_informacija_dlja_zajavki)session.get(prochaja_informacija_dlja_zajavkiImpl.class,
						prochaja_informacija_dlja_zajavki.getPrimaryKeyObj());
			}

			if (prochaja_informacija_dlja_zajavki != null) {
				session.delete(prochaja_informacija_dlja_zajavki);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (prochaja_informacija_dlja_zajavki != null) {
			clearCache(prochaja_informacija_dlja_zajavki);
		}

		return prochaja_informacija_dlja_zajavki;
	}

	@Override
	public prochaja_informacija_dlja_zajavki updateImpl(
		prochaja_informacija_dlja_zajavki prochaja_informacija_dlja_zajavki) {
		prochaja_informacija_dlja_zajavki = toUnwrappedModel(prochaja_informacija_dlja_zajavki);

		boolean isNew = prochaja_informacija_dlja_zajavki.isNew();

		Session session = null;

		try {
			session = openSession();

			if (prochaja_informacija_dlja_zajavki.isNew()) {
				session.save(prochaja_informacija_dlja_zajavki);

				prochaja_informacija_dlja_zajavki.setNew(false);
			}
			else {
				prochaja_informacija_dlja_zajavki = (prochaja_informacija_dlja_zajavki)session.merge(prochaja_informacija_dlja_zajavki);
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

		entityCache.putResult(prochaja_informacija_dlja_zajavkiModelImpl.ENTITY_CACHE_ENABLED,
			prochaja_informacija_dlja_zajavkiImpl.class,
			prochaja_informacija_dlja_zajavki.getPrimaryKey(),
			prochaja_informacija_dlja_zajavki, false);

		prochaja_informacija_dlja_zajavki.resetOriginalValues();

		return prochaja_informacija_dlja_zajavki;
	}

	protected prochaja_informacija_dlja_zajavki toUnwrappedModel(
		prochaja_informacija_dlja_zajavki prochaja_informacija_dlja_zajavki) {
		if (prochaja_informacija_dlja_zajavki instanceof prochaja_informacija_dlja_zajavkiImpl) {
			return prochaja_informacija_dlja_zajavki;
		}

		prochaja_informacija_dlja_zajavkiImpl prochaja_informacija_dlja_zajavkiImpl =
			new prochaja_informacija_dlja_zajavkiImpl();

		prochaja_informacija_dlja_zajavkiImpl.setNew(prochaja_informacija_dlja_zajavki.isNew());
		prochaja_informacija_dlja_zajavkiImpl.setPrimaryKey(prochaja_informacija_dlja_zajavki.getPrimaryKey());

		prochaja_informacija_dlja_zajavkiImpl.setCena_postavki(prochaja_informacija_dlja_zajavki.getCena_postavki());
		prochaja_informacija_dlja_zajavkiImpl.setCena_postavki_soglasno_zakazchiku(prochaja_informacija_dlja_zajavki.getCena_postavki_soglasno_zakazchiku());
		prochaja_informacija_dlja_zajavkiImpl.setData_sozdanija(prochaja_informacija_dlja_zajavki.getData_sozdanija());
		prochaja_informacija_dlja_zajavkiImpl.setIzvewenie_id(prochaja_informacija_dlja_zajavki.getIzvewenie_id());
		prochaja_informacija_dlja_zajavkiImpl.setLot_id(prochaja_informacija_dlja_zajavki.getLot_id());
		prochaja_informacija_dlja_zajavkiImpl.setMesto_postavki(prochaja_informacija_dlja_zajavki.getMesto_postavki());
		prochaja_informacija_dlja_zajavkiImpl.setMesto_postavki_soglasno_zakazchiku(prochaja_informacija_dlja_zajavki.getMesto_postavki_soglasno_zakazchiku());
		prochaja_informacija_dlja_zajavkiImpl.setOplata(prochaja_informacija_dlja_zajavki.getOplata());
		prochaja_informacija_dlja_zajavkiImpl.setOplata_soglasno_zakazchiku(prochaja_informacija_dlja_zajavki.getOplata_soglasno_zakazchiku());
		prochaja_informacija_dlja_zajavkiImpl.setPostavwik_id(prochaja_informacija_dlja_zajavki.getPostavwik_id());
		prochaja_informacija_dlja_zajavkiImpl.setProchaja_informacija_dlja_zajavki_id(prochaja_informacija_dlja_zajavki.getProchaja_informacija_dlja_zajavki_id());
		prochaja_informacija_dlja_zajavkiImpl.setSoputstvujuwie_uslovija(prochaja_informacija_dlja_zajavki.getSoputstvujuwie_uslovija());
		prochaja_informacija_dlja_zajavkiImpl.setSoputstvujuwie_uslovija_soglasno_zakazchiku(prochaja_informacija_dlja_zajavki.getSoputstvujuwie_uslovija_soglasno_zakazchiku());
		prochaja_informacija_dlja_zajavkiImpl.setSozdal(prochaja_informacija_dlja_zajavki.getSozdal());
		prochaja_informacija_dlja_zajavkiImpl.setSrok_dejstvija(prochaja_informacija_dlja_zajavki.getSrok_dejstvija());
		prochaja_informacija_dlja_zajavkiImpl.setSrok_dejstvija_soglasno_zakazchiku(prochaja_informacija_dlja_zajavki.getSrok_dejstvija_soglasno_zakazchiku());
		prochaja_informacija_dlja_zajavkiImpl.setSrok_ispolnenija_zajavki(prochaja_informacija_dlja_zajavki.getSrok_ispolnenija_zajavki());
		prochaja_informacija_dlja_zajavkiImpl.setSrok_ispolnenija_zajavki_soglasno_zakazchiku(prochaja_informacija_dlja_zajavki.getSrok_ispolnenija_zajavki_soglasno_zakazchiku());
		prochaja_informacija_dlja_zajavkiImpl.setSrok_obespechenija_zajavki(prochaja_informacija_dlja_zajavki.getSrok_obespechenija_zajavki());
		prochaja_informacija_dlja_zajavkiImpl.setSrok_obespechenija_zajavki_soglasno_zakazchiku(prochaja_informacija_dlja_zajavki.getSrok_obespechenija_zajavki_soglasno_zakazchiku());
		prochaja_informacija_dlja_zajavkiImpl.setSrok_postavki(prochaja_informacija_dlja_zajavki.getSrok_postavki());
		prochaja_informacija_dlja_zajavkiImpl.setSrok_postavki_soglasno_zakazchiku(prochaja_informacija_dlja_zajavki.getSrok_postavki_soglasno_zakazchiku());

		return prochaja_informacija_dlja_zajavkiImpl;
	}

	/**
	 * Returns the prochaja_informacija_dlja_zajavki with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the prochaja_informacija_dlja_zajavki
	 * @return the prochaja_informacija_dlja_zajavki
	 * @throws NoSuchprochaja_informacija_dlja_zajavkiException if a prochaja_informacija_dlja_zajavki with the primary key could not be found
	 */
	@Override
	public prochaja_informacija_dlja_zajavki findByPrimaryKey(
		Serializable primaryKey)
		throws NoSuchprochaja_informacija_dlja_zajavkiException {
		prochaja_informacija_dlja_zajavki prochaja_informacija_dlja_zajavki = fetchByPrimaryKey(primaryKey);

		if (prochaja_informacija_dlja_zajavki == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchprochaja_informacija_dlja_zajavkiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return prochaja_informacija_dlja_zajavki;
	}

	/**
	 * Returns the prochaja_informacija_dlja_zajavki with the primary key or throws a {@link NoSuchprochaja_informacija_dlja_zajavkiException} if it could not be found.
	 *
	 * @param prochaja_informacija_dlja_zajavki_id the primary key of the prochaja_informacija_dlja_zajavki
	 * @return the prochaja_informacija_dlja_zajavki
	 * @throws NoSuchprochaja_informacija_dlja_zajavkiException if a prochaja_informacija_dlja_zajavki with the primary key could not be found
	 */
	@Override
	public prochaja_informacija_dlja_zajavki findByPrimaryKey(
		long prochaja_informacija_dlja_zajavki_id)
		throws NoSuchprochaja_informacija_dlja_zajavkiException {
		return findByPrimaryKey((Serializable)prochaja_informacija_dlja_zajavki_id);
	}

	/**
	 * Returns the prochaja_informacija_dlja_zajavki with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the prochaja_informacija_dlja_zajavki
	 * @return the prochaja_informacija_dlja_zajavki, or <code>null</code> if a prochaja_informacija_dlja_zajavki with the primary key could not be found
	 */
	@Override
	public prochaja_informacija_dlja_zajavki fetchByPrimaryKey(
		Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(prochaja_informacija_dlja_zajavkiModelImpl.ENTITY_CACHE_ENABLED,
				prochaja_informacija_dlja_zajavkiImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		prochaja_informacija_dlja_zajavki prochaja_informacija_dlja_zajavki = (prochaja_informacija_dlja_zajavki)serializable;

		if (prochaja_informacija_dlja_zajavki == null) {
			Session session = null;

			try {
				session = openSession();

				prochaja_informacija_dlja_zajavki = (prochaja_informacija_dlja_zajavki)session.get(prochaja_informacija_dlja_zajavkiImpl.class,
						primaryKey);

				if (prochaja_informacija_dlja_zajavki != null) {
					cacheResult(prochaja_informacija_dlja_zajavki);
				}
				else {
					entityCache.putResult(prochaja_informacija_dlja_zajavkiModelImpl.ENTITY_CACHE_ENABLED,
						prochaja_informacija_dlja_zajavkiImpl.class,
						primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(prochaja_informacija_dlja_zajavkiModelImpl.ENTITY_CACHE_ENABLED,
					prochaja_informacija_dlja_zajavkiImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return prochaja_informacija_dlja_zajavki;
	}

	/**
	 * Returns the prochaja_informacija_dlja_zajavki with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param prochaja_informacija_dlja_zajavki_id the primary key of the prochaja_informacija_dlja_zajavki
	 * @return the prochaja_informacija_dlja_zajavki, or <code>null</code> if a prochaja_informacija_dlja_zajavki with the primary key could not be found
	 */
	@Override
	public prochaja_informacija_dlja_zajavki fetchByPrimaryKey(
		long prochaja_informacija_dlja_zajavki_id) {
		return fetchByPrimaryKey((Serializable)prochaja_informacija_dlja_zajavki_id);
	}

	@Override
	public Map<Serializable, prochaja_informacija_dlja_zajavki> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, prochaja_informacija_dlja_zajavki> map = new HashMap<Serializable, prochaja_informacija_dlja_zajavki>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			prochaja_informacija_dlja_zajavki prochaja_informacija_dlja_zajavki = fetchByPrimaryKey(primaryKey);

			if (prochaja_informacija_dlja_zajavki != null) {
				map.put(primaryKey, prochaja_informacija_dlja_zajavki);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(prochaja_informacija_dlja_zajavkiModelImpl.ENTITY_CACHE_ENABLED,
					prochaja_informacija_dlja_zajavkiImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey,
						(prochaja_informacija_dlja_zajavki)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_PROCHAJA_INFORMACIJA_DLJA_ZAJAVKI_WHERE_PKS_IN);

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

			for (prochaja_informacija_dlja_zajavki prochaja_informacija_dlja_zajavki : (List<prochaja_informacija_dlja_zajavki>)q.list()) {
				map.put(prochaja_informacija_dlja_zajavki.getPrimaryKeyObj(),
					prochaja_informacija_dlja_zajavki);

				cacheResult(prochaja_informacija_dlja_zajavki);

				uncachedPrimaryKeys.remove(prochaja_informacija_dlja_zajavki.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(prochaja_informacija_dlja_zajavkiModelImpl.ENTITY_CACHE_ENABLED,
					prochaja_informacija_dlja_zajavkiImpl.class, primaryKey,
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
	 * Returns all the prochaja_informacija_dlja_zajavkis.
	 *
	 * @return the prochaja_informacija_dlja_zajavkis
	 */
	@Override
	public List<prochaja_informacija_dlja_zajavki> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the prochaja_informacija_dlja_zajavkis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link prochaja_informacija_dlja_zajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of prochaja_informacija_dlja_zajavkis
	 * @param end the upper bound of the range of prochaja_informacija_dlja_zajavkis (not inclusive)
	 * @return the range of prochaja_informacija_dlja_zajavkis
	 */
	@Override
	public List<prochaja_informacija_dlja_zajavki> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the prochaja_informacija_dlja_zajavkis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link prochaja_informacija_dlja_zajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of prochaja_informacija_dlja_zajavkis
	 * @param end the upper bound of the range of prochaja_informacija_dlja_zajavkis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of prochaja_informacija_dlja_zajavkis
	 */
	@Override
	public List<prochaja_informacija_dlja_zajavki> findAll(int start, int end,
		OrderByComparator<prochaja_informacija_dlja_zajavki> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the prochaja_informacija_dlja_zajavkis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link prochaja_informacija_dlja_zajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of prochaja_informacija_dlja_zajavkis
	 * @param end the upper bound of the range of prochaja_informacija_dlja_zajavkis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of prochaja_informacija_dlja_zajavkis
	 */
	@Override
	public List<prochaja_informacija_dlja_zajavki> findAll(int start, int end,
		OrderByComparator<prochaja_informacija_dlja_zajavki> orderByComparator,
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

		List<prochaja_informacija_dlja_zajavki> list = null;

		if (retrieveFromCache) {
			list = (List<prochaja_informacija_dlja_zajavki>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_PROCHAJA_INFORMACIJA_DLJA_ZAJAVKI);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PROCHAJA_INFORMACIJA_DLJA_ZAJAVKI;

				if (pagination) {
					sql = sql.concat(prochaja_informacija_dlja_zajavkiModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<prochaja_informacija_dlja_zajavki>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<prochaja_informacija_dlja_zajavki>)QueryUtil.list(q,
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
	 * Removes all the prochaja_informacija_dlja_zajavkis from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (prochaja_informacija_dlja_zajavki prochaja_informacija_dlja_zajavki : findAll()) {
			remove(prochaja_informacija_dlja_zajavki);
		}
	}

	/**
	 * Returns the number of prochaja_informacija_dlja_zajavkis.
	 *
	 * @return the number of prochaja_informacija_dlja_zajavkis
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_PROCHAJA_INFORMACIJA_DLJA_ZAJAVKI);

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
		return prochaja_informacija_dlja_zajavkiModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the prochaja_informacija_dlja_zajavki persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(prochaja_informacija_dlja_zajavkiImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_PROCHAJA_INFORMACIJA_DLJA_ZAJAVKI = "SELECT prochaja_informacija_dlja_zajavki FROM prochaja_informacija_dlja_zajavki prochaja_informacija_dlja_zajavki";
	private static final String _SQL_SELECT_PROCHAJA_INFORMACIJA_DLJA_ZAJAVKI_WHERE_PKS_IN =
		"SELECT prochaja_informacija_dlja_zajavki FROM prochaja_informacija_dlja_zajavki prochaja_informacija_dlja_zajavki WHERE prochaja_informacija_dlja_zajavki_id IN (";
	private static final String _SQL_COUNT_PROCHAJA_INFORMACIJA_DLJA_ZAJAVKI = "SELECT COUNT(prochaja_informacija_dlja_zajavki) FROM prochaja_informacija_dlja_zajavki prochaja_informacija_dlja_zajavki";
	private static final String _ORDER_BY_ENTITY_ALIAS = "prochaja_informacija_dlja_zajavki.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No prochaja_informacija_dlja_zajavki exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(prochaja_informacija_dlja_zajavkiPersistenceImpl.class);
}
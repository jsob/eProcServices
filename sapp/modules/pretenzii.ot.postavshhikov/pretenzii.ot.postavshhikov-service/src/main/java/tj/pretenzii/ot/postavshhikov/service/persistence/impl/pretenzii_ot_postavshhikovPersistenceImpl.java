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

package tj.pretenzii.ot.postavshhikov.service.persistence.impl;

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

import tj.pretenzii.ot.postavshhikov.exception.NoSuchpretenzii_ot_postavshhikovException;
import tj.pretenzii.ot.postavshhikov.model.impl.pretenzii_ot_postavshhikovImpl;
import tj.pretenzii.ot.postavshhikov.model.impl.pretenzii_ot_postavshhikovModelImpl;
import tj.pretenzii.ot.postavshhikov.model.pretenzii_ot_postavshhikov;
import tj.pretenzii.ot.postavshhikov.service.persistence.pretenzii_ot_postavshhikovPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the pretenzii_ot_postavshhikov service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see pretenzii_ot_postavshhikovPersistence
 * @see tj.pretenzii.ot.postavshhikov.service.persistence.pretenzii_ot_postavshhikovUtil
 * @generated
 */
@ProviderType
public class pretenzii_ot_postavshhikovPersistenceImpl
	extends BasePersistenceImpl<pretenzii_ot_postavshhikov>
	implements pretenzii_ot_postavshhikovPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link pretenzii_ot_postavshhikovUtil} to access the pretenzii_ot_postavshhikov persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = pretenzii_ot_postavshhikovImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(pretenzii_ot_postavshhikovModelImpl.ENTITY_CACHE_ENABLED,
			pretenzii_ot_postavshhikovModelImpl.FINDER_CACHE_ENABLED,
			pretenzii_ot_postavshhikovImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(pretenzii_ot_postavshhikovModelImpl.ENTITY_CACHE_ENABLED,
			pretenzii_ot_postavshhikovModelImpl.FINDER_CACHE_ENABLED,
			pretenzii_ot_postavshhikovImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(pretenzii_ot_postavshhikovModelImpl.ENTITY_CACHE_ENABLED,
			pretenzii_ot_postavshhikovModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	public pretenzii_ot_postavshhikovPersistenceImpl() {
		setModelClass(pretenzii_ot_postavshhikov.class);
	}

	/**
	 * Caches the pretenzii_ot_postavshhikov in the entity cache if it is enabled.
	 *
	 * @param pretenzii_ot_postavshhikov the pretenzii_ot_postavshhikov
	 */
	@Override
	public void cacheResult(
		pretenzii_ot_postavshhikov pretenzii_ot_postavshhikov) {
		entityCache.putResult(pretenzii_ot_postavshhikovModelImpl.ENTITY_CACHE_ENABLED,
			pretenzii_ot_postavshhikovImpl.class,
			pretenzii_ot_postavshhikov.getPrimaryKey(),
			pretenzii_ot_postavshhikov);

		pretenzii_ot_postavshhikov.resetOriginalValues();
	}

	/**
	 * Caches the pretenzii_ot_postavshhikovs in the entity cache if it is enabled.
	 *
	 * @param pretenzii_ot_postavshhikovs the pretenzii_ot_postavshhikovs
	 */
	@Override
	public void cacheResult(
		List<pretenzii_ot_postavshhikov> pretenzii_ot_postavshhikovs) {
		for (pretenzii_ot_postavshhikov pretenzii_ot_postavshhikov : pretenzii_ot_postavshhikovs) {
			if (entityCache.getResult(
						pretenzii_ot_postavshhikovModelImpl.ENTITY_CACHE_ENABLED,
						pretenzii_ot_postavshhikovImpl.class,
						pretenzii_ot_postavshhikov.getPrimaryKey()) == null) {
				cacheResult(pretenzii_ot_postavshhikov);
			}
			else {
				pretenzii_ot_postavshhikov.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all pretenzii_ot_postavshhikovs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(pretenzii_ot_postavshhikovImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the pretenzii_ot_postavshhikov.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		pretenzii_ot_postavshhikov pretenzii_ot_postavshhikov) {
		entityCache.removeResult(pretenzii_ot_postavshhikovModelImpl.ENTITY_CACHE_ENABLED,
			pretenzii_ot_postavshhikovImpl.class,
			pretenzii_ot_postavshhikov.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<pretenzii_ot_postavshhikov> pretenzii_ot_postavshhikovs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (pretenzii_ot_postavshhikov pretenzii_ot_postavshhikov : pretenzii_ot_postavshhikovs) {
			entityCache.removeResult(pretenzii_ot_postavshhikovModelImpl.ENTITY_CACHE_ENABLED,
				pretenzii_ot_postavshhikovImpl.class,
				pretenzii_ot_postavshhikov.getPrimaryKey());
		}
	}

	/**
	 * Creates a new pretenzii_ot_postavshhikov with the primary key. Does not add the pretenzii_ot_postavshhikov to the database.
	 *
	 * @param pretenzii_ot_postavshhikov_id the primary key for the new pretenzii_ot_postavshhikov
	 * @return the new pretenzii_ot_postavshhikov
	 */
	@Override
	public pretenzii_ot_postavshhikov create(long pretenzii_ot_postavshhikov_id) {
		pretenzii_ot_postavshhikov pretenzii_ot_postavshhikov = new pretenzii_ot_postavshhikovImpl();

		pretenzii_ot_postavshhikov.setNew(true);
		pretenzii_ot_postavshhikov.setPrimaryKey(pretenzii_ot_postavshhikov_id);

		return pretenzii_ot_postavshhikov;
	}

	/**
	 * Removes the pretenzii_ot_postavshhikov with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pretenzii_ot_postavshhikov_id the primary key of the pretenzii_ot_postavshhikov
	 * @return the pretenzii_ot_postavshhikov that was removed
	 * @throws NoSuchpretenzii_ot_postavshhikovException if a pretenzii_ot_postavshhikov with the primary key could not be found
	 */
	@Override
	public pretenzii_ot_postavshhikov remove(long pretenzii_ot_postavshhikov_id)
		throws NoSuchpretenzii_ot_postavshhikovException {
		return remove((Serializable)pretenzii_ot_postavshhikov_id);
	}

	/**
	 * Removes the pretenzii_ot_postavshhikov with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the pretenzii_ot_postavshhikov
	 * @return the pretenzii_ot_postavshhikov that was removed
	 * @throws NoSuchpretenzii_ot_postavshhikovException if a pretenzii_ot_postavshhikov with the primary key could not be found
	 */
	@Override
	public pretenzii_ot_postavshhikov remove(Serializable primaryKey)
		throws NoSuchpretenzii_ot_postavshhikovException {
		Session session = null;

		try {
			session = openSession();

			pretenzii_ot_postavshhikov pretenzii_ot_postavshhikov = (pretenzii_ot_postavshhikov)session.get(pretenzii_ot_postavshhikovImpl.class,
					primaryKey);

			if (pretenzii_ot_postavshhikov == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchpretenzii_ot_postavshhikovException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(pretenzii_ot_postavshhikov);
		}
		catch (NoSuchpretenzii_ot_postavshhikovException nsee) {
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
	protected pretenzii_ot_postavshhikov removeImpl(
		pretenzii_ot_postavshhikov pretenzii_ot_postavshhikov) {
		pretenzii_ot_postavshhikov = toUnwrappedModel(pretenzii_ot_postavshhikov);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(pretenzii_ot_postavshhikov)) {
				pretenzii_ot_postavshhikov = (pretenzii_ot_postavshhikov)session.get(pretenzii_ot_postavshhikovImpl.class,
						pretenzii_ot_postavshhikov.getPrimaryKeyObj());
			}

			if (pretenzii_ot_postavshhikov != null) {
				session.delete(pretenzii_ot_postavshhikov);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (pretenzii_ot_postavshhikov != null) {
			clearCache(pretenzii_ot_postavshhikov);
		}

		return pretenzii_ot_postavshhikov;
	}

	@Override
	public pretenzii_ot_postavshhikov updateImpl(
		pretenzii_ot_postavshhikov pretenzii_ot_postavshhikov) {
		pretenzii_ot_postavshhikov = toUnwrappedModel(pretenzii_ot_postavshhikov);

		boolean isNew = pretenzii_ot_postavshhikov.isNew();

		Session session = null;

		try {
			session = openSession();

			if (pretenzii_ot_postavshhikov.isNew()) {
				session.save(pretenzii_ot_postavshhikov);

				pretenzii_ot_postavshhikov.setNew(false);
			}
			else {
				pretenzii_ot_postavshhikov = (pretenzii_ot_postavshhikov)session.merge(pretenzii_ot_postavshhikov);
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

		entityCache.putResult(pretenzii_ot_postavshhikovModelImpl.ENTITY_CACHE_ENABLED,
			pretenzii_ot_postavshhikovImpl.class,
			pretenzii_ot_postavshhikov.getPrimaryKey(),
			pretenzii_ot_postavshhikov, false);

		pretenzii_ot_postavshhikov.resetOriginalValues();

		return pretenzii_ot_postavshhikov;
	}

	protected pretenzii_ot_postavshhikov toUnwrappedModel(
		pretenzii_ot_postavshhikov pretenzii_ot_postavshhikov) {
		if (pretenzii_ot_postavshhikov instanceof pretenzii_ot_postavshhikovImpl) {
			return pretenzii_ot_postavshhikov;
		}

		pretenzii_ot_postavshhikovImpl pretenzii_ot_postavshhikovImpl = new pretenzii_ot_postavshhikovImpl();

		pretenzii_ot_postavshhikovImpl.setNew(pretenzii_ot_postavshhikov.isNew());
		pretenzii_ot_postavshhikovImpl.setPrimaryKey(pretenzii_ot_postavshhikov.getPrimaryKey());

		pretenzii_ot_postavshhikovImpl.setData_zagruzki(pretenzii_ot_postavshhikov.getData_zagruzki());
		pretenzii_ot_postavshhikovImpl.setImja_fajla(pretenzii_ot_postavshhikov.getImja_fajla());
		pretenzii_ot_postavshhikovImpl.setIzvewenie_id(pretenzii_ot_postavshhikov.getIzvewenie_id());
		pretenzii_ot_postavshhikovImpl.setLot_id(pretenzii_ot_postavshhikov.getLot_id());
		pretenzii_ot_postavshhikovImpl.setNazvanie_dokumenta(pretenzii_ot_postavshhikov.getNazvanie_dokumenta());
		pretenzii_ot_postavshhikovImpl.setPostavshik_id(pretenzii_ot_postavshhikov.getPostavshik_id());
		pretenzii_ot_postavshhikovImpl.setPretenzii_ot_postavshhikov_id(pretenzii_ot_postavshhikov.getPretenzii_ot_postavshhikov_id());
		pretenzii_ot_postavshhikovImpl.setZagruzil(pretenzii_ot_postavshhikov.getZagruzil());

		return pretenzii_ot_postavshhikovImpl;
	}

	/**
	 * Returns the pretenzii_ot_postavshhikov with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the pretenzii_ot_postavshhikov
	 * @return the pretenzii_ot_postavshhikov
	 * @throws NoSuchpretenzii_ot_postavshhikovException if a pretenzii_ot_postavshhikov with the primary key could not be found
	 */
	@Override
	public pretenzii_ot_postavshhikov findByPrimaryKey(Serializable primaryKey)
		throws NoSuchpretenzii_ot_postavshhikovException {
		pretenzii_ot_postavshhikov pretenzii_ot_postavshhikov = fetchByPrimaryKey(primaryKey);

		if (pretenzii_ot_postavshhikov == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchpretenzii_ot_postavshhikovException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return pretenzii_ot_postavshhikov;
	}

	/**
	 * Returns the pretenzii_ot_postavshhikov with the primary key or throws a {@link NoSuchpretenzii_ot_postavshhikovException} if it could not be found.
	 *
	 * @param pretenzii_ot_postavshhikov_id the primary key of the pretenzii_ot_postavshhikov
	 * @return the pretenzii_ot_postavshhikov
	 * @throws NoSuchpretenzii_ot_postavshhikovException if a pretenzii_ot_postavshhikov with the primary key could not be found
	 */
	@Override
	public pretenzii_ot_postavshhikov findByPrimaryKey(
		long pretenzii_ot_postavshhikov_id)
		throws NoSuchpretenzii_ot_postavshhikovException {
		return findByPrimaryKey((Serializable)pretenzii_ot_postavshhikov_id);
	}

	/**
	 * Returns the pretenzii_ot_postavshhikov with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the pretenzii_ot_postavshhikov
	 * @return the pretenzii_ot_postavshhikov, or <code>null</code> if a pretenzii_ot_postavshhikov with the primary key could not be found
	 */
	@Override
	public pretenzii_ot_postavshhikov fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(pretenzii_ot_postavshhikovModelImpl.ENTITY_CACHE_ENABLED,
				pretenzii_ot_postavshhikovImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		pretenzii_ot_postavshhikov pretenzii_ot_postavshhikov = (pretenzii_ot_postavshhikov)serializable;

		if (pretenzii_ot_postavshhikov == null) {
			Session session = null;

			try {
				session = openSession();

				pretenzii_ot_postavshhikov = (pretenzii_ot_postavshhikov)session.get(pretenzii_ot_postavshhikovImpl.class,
						primaryKey);

				if (pretenzii_ot_postavshhikov != null) {
					cacheResult(pretenzii_ot_postavshhikov);
				}
				else {
					entityCache.putResult(pretenzii_ot_postavshhikovModelImpl.ENTITY_CACHE_ENABLED,
						pretenzii_ot_postavshhikovImpl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(pretenzii_ot_postavshhikovModelImpl.ENTITY_CACHE_ENABLED,
					pretenzii_ot_postavshhikovImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return pretenzii_ot_postavshhikov;
	}

	/**
	 * Returns the pretenzii_ot_postavshhikov with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pretenzii_ot_postavshhikov_id the primary key of the pretenzii_ot_postavshhikov
	 * @return the pretenzii_ot_postavshhikov, or <code>null</code> if a pretenzii_ot_postavshhikov with the primary key could not be found
	 */
	@Override
	public pretenzii_ot_postavshhikov fetchByPrimaryKey(
		long pretenzii_ot_postavshhikov_id) {
		return fetchByPrimaryKey((Serializable)pretenzii_ot_postavshhikov_id);
	}

	@Override
	public Map<Serializable, pretenzii_ot_postavshhikov> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, pretenzii_ot_postavshhikov> map = new HashMap<Serializable, pretenzii_ot_postavshhikov>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			pretenzii_ot_postavshhikov pretenzii_ot_postavshhikov = fetchByPrimaryKey(primaryKey);

			if (pretenzii_ot_postavshhikov != null) {
				map.put(primaryKey, pretenzii_ot_postavshhikov);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(pretenzii_ot_postavshhikovModelImpl.ENTITY_CACHE_ENABLED,
					pretenzii_ot_postavshhikovImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (pretenzii_ot_postavshhikov)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_PRETENZII_OT_POSTAVSHHIKOV_WHERE_PKS_IN);

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

			for (pretenzii_ot_postavshhikov pretenzii_ot_postavshhikov : (List<pretenzii_ot_postavshhikov>)q.list()) {
				map.put(pretenzii_ot_postavshhikov.getPrimaryKeyObj(),
					pretenzii_ot_postavshhikov);

				cacheResult(pretenzii_ot_postavshhikov);

				uncachedPrimaryKeys.remove(pretenzii_ot_postavshhikov.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(pretenzii_ot_postavshhikovModelImpl.ENTITY_CACHE_ENABLED,
					pretenzii_ot_postavshhikovImpl.class, primaryKey, nullModel);
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
	 * Returns all the pretenzii_ot_postavshhikovs.
	 *
	 * @return the pretenzii_ot_postavshhikovs
	 */
	@Override
	public List<pretenzii_ot_postavshhikov> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the pretenzii_ot_postavshhikovs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pretenzii_ot_postavshhikovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of pretenzii_ot_postavshhikovs
	 * @param end the upper bound of the range of pretenzii_ot_postavshhikovs (not inclusive)
	 * @return the range of pretenzii_ot_postavshhikovs
	 */
	@Override
	public List<pretenzii_ot_postavshhikov> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the pretenzii_ot_postavshhikovs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pretenzii_ot_postavshhikovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of pretenzii_ot_postavshhikovs
	 * @param end the upper bound of the range of pretenzii_ot_postavshhikovs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pretenzii_ot_postavshhikovs
	 */
	@Override
	public List<pretenzii_ot_postavshhikov> findAll(int start, int end,
		OrderByComparator<pretenzii_ot_postavshhikov> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the pretenzii_ot_postavshhikovs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pretenzii_ot_postavshhikovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of pretenzii_ot_postavshhikovs
	 * @param end the upper bound of the range of pretenzii_ot_postavshhikovs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of pretenzii_ot_postavshhikovs
	 */
	@Override
	public List<pretenzii_ot_postavshhikov> findAll(int start, int end,
		OrderByComparator<pretenzii_ot_postavshhikov> orderByComparator,
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

		List<pretenzii_ot_postavshhikov> list = null;

		if (retrieveFromCache) {
			list = (List<pretenzii_ot_postavshhikov>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_PRETENZII_OT_POSTAVSHHIKOV);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PRETENZII_OT_POSTAVSHHIKOV;

				if (pagination) {
					sql = sql.concat(pretenzii_ot_postavshhikovModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<pretenzii_ot_postavshhikov>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<pretenzii_ot_postavshhikov>)QueryUtil.list(q,
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
	 * Removes all the pretenzii_ot_postavshhikovs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (pretenzii_ot_postavshhikov pretenzii_ot_postavshhikov : findAll()) {
			remove(pretenzii_ot_postavshhikov);
		}
	}

	/**
	 * Returns the number of pretenzii_ot_postavshhikovs.
	 *
	 * @return the number of pretenzii_ot_postavshhikovs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_PRETENZII_OT_POSTAVSHHIKOV);

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
		return pretenzii_ot_postavshhikovModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the pretenzii_ot_postavshhikov persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(pretenzii_ot_postavshhikovImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_PRETENZII_OT_POSTAVSHHIKOV = "SELECT pretenzii_ot_postavshhikov FROM pretenzii_ot_postavshhikov pretenzii_ot_postavshhikov";
	private static final String _SQL_SELECT_PRETENZII_OT_POSTAVSHHIKOV_WHERE_PKS_IN =
		"SELECT pretenzii_ot_postavshhikov FROM pretenzii_ot_postavshhikov pretenzii_ot_postavshhikov WHERE pretenzii_ot_postavshhikov_id IN (";
	private static final String _SQL_COUNT_PRETENZII_OT_POSTAVSHHIKOV = "SELECT COUNT(pretenzii_ot_postavshhikov) FROM pretenzii_ot_postavshhikov pretenzii_ot_postavshhikov";
	private static final String _ORDER_BY_ENTITY_ALIAS = "pretenzii_ot_postavshhikov.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No pretenzii_ot_postavshhikov exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(pretenzii_ot_postavshhikovPersistenceImpl.class);
}
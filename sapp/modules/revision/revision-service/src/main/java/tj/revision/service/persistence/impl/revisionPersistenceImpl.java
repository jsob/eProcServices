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

package tj.revision.service.persistence.impl;

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
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import tj.revision.exception.NoSuchrevisionException;

import tj.revision.model.impl.revisionImpl;
import tj.revision.model.impl.revisionModelImpl;
import tj.revision.model.revision;

import tj.revision.service.persistence.revisionPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the revision service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see revisionPersistence
 * @see tj.revision.service.persistence.revisionUtil
 * @generated
 */
@ProviderType
public class revisionPersistenceImpl extends BasePersistenceImpl<revision>
	implements revisionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link revisionUtil} to access the revision persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = revisionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(revisionModelImpl.ENTITY_CACHE_ENABLED,
			revisionModelImpl.FINDER_CACHE_ENABLED, revisionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(revisionModelImpl.ENTITY_CACHE_ENABLED,
			revisionModelImpl.FINDER_CACHE_ENABLED, revisionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(revisionModelImpl.ENTITY_CACHE_ENABLED,
			revisionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public revisionPersistenceImpl() {
		setModelClass(revision.class);
	}

	/**
	 * Caches the revision in the entity cache if it is enabled.
	 *
	 * @param revision the revision
	 */
	@Override
	public void cacheResult(revision revision) {
		entityCache.putResult(revisionModelImpl.ENTITY_CACHE_ENABLED,
			revisionImpl.class, revision.getPrimaryKey(), revision);

		revision.resetOriginalValues();
	}

	/**
	 * Caches the revisions in the entity cache if it is enabled.
	 *
	 * @param revisions the revisions
	 */
	@Override
	public void cacheResult(List<revision> revisions) {
		for (revision revision : revisions) {
			if (entityCache.getResult(revisionModelImpl.ENTITY_CACHE_ENABLED,
						revisionImpl.class, revision.getPrimaryKey()) == null) {
				cacheResult(revision);
			}
			else {
				revision.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all revisions.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(revisionImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the revision.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(revision revision) {
		entityCache.removeResult(revisionModelImpl.ENTITY_CACHE_ENABLED,
			revisionImpl.class, revision.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<revision> revisions) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (revision revision : revisions) {
			entityCache.removeResult(revisionModelImpl.ENTITY_CACHE_ENABLED,
				revisionImpl.class, revision.getPrimaryKey());
		}
	}

	/**
	 * Creates a new revision with the primary key. Does not add the revision to the database.
	 *
	 * @param revision_id the primary key for the new revision
	 * @return the new revision
	 */
	@Override
	public revision create(long revision_id) {
		revision revision = new revisionImpl();

		revision.setNew(true);
		revision.setPrimaryKey(revision_id);

		return revision;
	}

	/**
	 * Removes the revision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param revision_id the primary key of the revision
	 * @return the revision that was removed
	 * @throws NoSuchrevisionException if a revision with the primary key could not be found
	 */
	@Override
	public revision remove(long revision_id) throws NoSuchrevisionException {
		return remove((Serializable)revision_id);
	}

	/**
	 * Removes the revision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the revision
	 * @return the revision that was removed
	 * @throws NoSuchrevisionException if a revision with the primary key could not be found
	 */
	@Override
	public revision remove(Serializable primaryKey)
		throws NoSuchrevisionException {
		Session session = null;

		try {
			session = openSession();

			revision revision = (revision)session.get(revisionImpl.class,
					primaryKey);

			if (revision == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchrevisionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(revision);
		}
		catch (NoSuchrevisionException nsee) {
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
	protected revision removeImpl(revision revision) {
		revision = toUnwrappedModel(revision);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(revision)) {
				revision = (revision)session.get(revisionImpl.class,
						revision.getPrimaryKeyObj());
			}

			if (revision != null) {
				session.delete(revision);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (revision != null) {
			clearCache(revision);
		}

		return revision;
	}

	@Override
	public revision updateImpl(revision revision) {
		revision = toUnwrappedModel(revision);

		boolean isNew = revision.isNew();

		Session session = null;

		try {
			session = openSession();

			if (revision.isNew()) {
				session.save(revision);

				revision.setNew(false);
			}
			else {
				revision = (revision)session.merge(revision);
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

		entityCache.putResult(revisionModelImpl.ENTITY_CACHE_ENABLED,
			revisionImpl.class, revision.getPrimaryKey(), revision, false);

		revision.resetOriginalValues();

		return revision;
	}

	protected revision toUnwrappedModel(revision revision) {
		if (revision instanceof revisionImpl) {
			return revision;
		}

		revisionImpl revisionImpl = new revisionImpl();

		revisionImpl.setNew(revision.isNew());
		revisionImpl.setPrimaryKey(revision.getPrimaryKey());

		revisionImpl.setDate(revision.getDate());
		revisionImpl.setRevision_id(revision.getRevision_id());

		return revisionImpl;
	}

	/**
	 * Returns the revision with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the revision
	 * @return the revision
	 * @throws NoSuchrevisionException if a revision with the primary key could not be found
	 */
	@Override
	public revision findByPrimaryKey(Serializable primaryKey)
		throws NoSuchrevisionException {
		revision revision = fetchByPrimaryKey(primaryKey);

		if (revision == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchrevisionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return revision;
	}

	/**
	 * Returns the revision with the primary key or throws a {@link NoSuchrevisionException} if it could not be found.
	 *
	 * @param revision_id the primary key of the revision
	 * @return the revision
	 * @throws NoSuchrevisionException if a revision with the primary key could not be found
	 */
	@Override
	public revision findByPrimaryKey(long revision_id)
		throws NoSuchrevisionException {
		return findByPrimaryKey((Serializable)revision_id);
	}

	/**
	 * Returns the revision with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the revision
	 * @return the revision, or <code>null</code> if a revision with the primary key could not be found
	 */
	@Override
	public revision fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(revisionModelImpl.ENTITY_CACHE_ENABLED,
				revisionImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		revision revision = (revision)serializable;

		if (revision == null) {
			Session session = null;

			try {
				session = openSession();

				revision = (revision)session.get(revisionImpl.class, primaryKey);

				if (revision != null) {
					cacheResult(revision);
				}
				else {
					entityCache.putResult(revisionModelImpl.ENTITY_CACHE_ENABLED,
						revisionImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(revisionModelImpl.ENTITY_CACHE_ENABLED,
					revisionImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return revision;
	}

	/**
	 * Returns the revision with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param revision_id the primary key of the revision
	 * @return the revision, or <code>null</code> if a revision with the primary key could not be found
	 */
	@Override
	public revision fetchByPrimaryKey(long revision_id) {
		return fetchByPrimaryKey((Serializable)revision_id);
	}

	@Override
	public Map<Serializable, revision> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, revision> map = new HashMap<Serializable, revision>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			revision revision = fetchByPrimaryKey(primaryKey);

			if (revision != null) {
				map.put(primaryKey, revision);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(revisionModelImpl.ENTITY_CACHE_ENABLED,
					revisionImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (revision)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_REVISION_WHERE_PKS_IN);

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

			for (revision revision : (List<revision>)q.list()) {
				map.put(revision.getPrimaryKeyObj(), revision);

				cacheResult(revision);

				uncachedPrimaryKeys.remove(revision.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(revisionModelImpl.ENTITY_CACHE_ENABLED,
					revisionImpl.class, primaryKey, nullModel);
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
	 * Returns all the revisions.
	 *
	 * @return the revisions
	 */
	@Override
	public List<revision> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the revisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link revisionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of revisions
	 * @param end the upper bound of the range of revisions (not inclusive)
	 * @return the range of revisions
	 */
	@Override
	public List<revision> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the revisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link revisionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of revisions
	 * @param end the upper bound of the range of revisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of revisions
	 */
	@Override
	public List<revision> findAll(int start, int end,
		OrderByComparator<revision> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the revisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link revisionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of revisions
	 * @param end the upper bound of the range of revisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of revisions
	 */
	@Override
	public List<revision> findAll(int start, int end,
		OrderByComparator<revision> orderByComparator, boolean retrieveFromCache) {
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

		List<revision> list = null;

		if (retrieveFromCache) {
			list = (List<revision>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_REVISION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_REVISION;

				if (pagination) {
					sql = sql.concat(revisionModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<revision>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<revision>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Removes all the revisions from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (revision revision : findAll()) {
			remove(revision);
		}
	}

	/**
	 * Returns the number of revisions.
	 *
	 * @return the number of revisions
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_REVISION);

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
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return revisionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the revision persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(revisionImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_REVISION = "SELECT revision FROM revision revision";
	private static final String _SQL_SELECT_REVISION_WHERE_PKS_IN = "SELECT revision FROM revision revision WHERE revision_id IN (";
	private static final String _SQL_COUNT_REVISION = "SELECT COUNT(revision) FROM revision revision";
	private static final String _ORDER_BY_ENTITY_ALIAS = "revision.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No revision exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(revisionPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"date"
			});
}
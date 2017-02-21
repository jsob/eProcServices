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

package tj.revision.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.revision.model.revision;

import java.util.List;

/**
 * The persistence utility for the revision service. This utility wraps {@link tj.revision.service.persistence.impl.revisionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see revisionPersistence
 * @see tj.revision.service.persistence.impl.revisionPersistenceImpl
 * @generated
 */
@ProviderType
public class revisionUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(revision revision) {
		getPersistence().clearCache(revision);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<revision> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<revision> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<revision> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<revision> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static revision update(revision revision) {
		return getPersistence().update(revision);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static revision update(revision revision,
		ServiceContext serviceContext) {
		return getPersistence().update(revision, serviceContext);
	}

	/**
	* Caches the revision in the entity cache if it is enabled.
	*
	* @param revision the revision
	*/
	public static void cacheResult(revision revision) {
		getPersistence().cacheResult(revision);
	}

	/**
	* Caches the revisions in the entity cache if it is enabled.
	*
	* @param revisions the revisions
	*/
	public static void cacheResult(List<revision> revisions) {
		getPersistence().cacheResult(revisions);
	}

	/**
	* Creates a new revision with the primary key. Does not add the revision to the database.
	*
	* @param revision_id the primary key for the new revision
	* @return the new revision
	*/
	public static revision create(long revision_id) {
		return getPersistence().create(revision_id);
	}

	/**
	* Removes the revision with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param revision_id the primary key of the revision
	* @return the revision that was removed
	* @throws NoSuchrevisionException if a revision with the primary key could not be found
	*/
	public static revision remove(long revision_id)
		throws tj.revision.exception.NoSuchrevisionException {
		return getPersistence().remove(revision_id);
	}

	public static revision updateImpl(revision revision) {
		return getPersistence().updateImpl(revision);
	}

	/**
	* Returns the revision with the primary key or throws a {@link NoSuchrevisionException} if it could not be found.
	*
	* @param revision_id the primary key of the revision
	* @return the revision
	* @throws NoSuchrevisionException if a revision with the primary key could not be found
	*/
	public static revision findByPrimaryKey(long revision_id)
		throws tj.revision.exception.NoSuchrevisionException {
		return getPersistence().findByPrimaryKey(revision_id);
	}

	/**
	* Returns the revision with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param revision_id the primary key of the revision
	* @return the revision, or <code>null</code> if a revision with the primary key could not be found
	*/
	public static revision fetchByPrimaryKey(long revision_id) {
		return getPersistence().fetchByPrimaryKey(revision_id);
	}

	public static java.util.Map<java.io.Serializable, revision> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the revisions.
	*
	* @return the revisions
	*/
	public static List<revision> findAll() {
		return getPersistence().findAll();
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
	public static List<revision> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
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
	public static List<revision> findAll(int start, int end,
		OrderByComparator<revision> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
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
	public static List<revision> findAll(int start, int end,
		OrderByComparator<revision> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the revisions from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of revisions.
	*
	* @return the number of revisions
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static revisionPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<revisionPersistence, revisionPersistence> _serviceTracker =
		ServiceTrackerFactory.open(revisionPersistence.class);
}
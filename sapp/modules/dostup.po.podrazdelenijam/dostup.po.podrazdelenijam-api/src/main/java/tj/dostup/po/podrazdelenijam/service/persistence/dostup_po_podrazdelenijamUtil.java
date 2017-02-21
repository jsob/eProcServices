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

package tj.dostup.po.podrazdelenijam.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.dostup.po.podrazdelenijam.model.dostup_po_podrazdelenijam;

import java.util.List;

/**
 * The persistence utility for the dostup_po_podrazdelenijam service. This utility wraps {@link tj.dostup.po.podrazdelenijam.service.persistence.impl.dostup_po_podrazdelenijamPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see dostup_po_podrazdelenijamPersistence
 * @see tj.dostup.po.podrazdelenijam.service.persistence.impl.dostup_po_podrazdelenijamPersistenceImpl
 * @generated
 */
@ProviderType
public class dostup_po_podrazdelenijamUtil {
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
	public static void clearCache(
		dostup_po_podrazdelenijam dostup_po_podrazdelenijam) {
		getPersistence().clearCache(dostup_po_podrazdelenijam);
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
	public static List<dostup_po_podrazdelenijam> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<dostup_po_podrazdelenijam> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<dostup_po_podrazdelenijam> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<dostup_po_podrazdelenijam> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static dostup_po_podrazdelenijam update(
		dostup_po_podrazdelenijam dostup_po_podrazdelenijam) {
		return getPersistence().update(dostup_po_podrazdelenijam);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static dostup_po_podrazdelenijam update(
		dostup_po_podrazdelenijam dostup_po_podrazdelenijam,
		ServiceContext serviceContext) {
		return getPersistence().update(dostup_po_podrazdelenijam, serviceContext);
	}

	/**
	* Caches the dostup_po_podrazdelenijam in the entity cache if it is enabled.
	*
	* @param dostup_po_podrazdelenijam the dostup_po_podrazdelenijam
	*/
	public static void cacheResult(
		dostup_po_podrazdelenijam dostup_po_podrazdelenijam) {
		getPersistence().cacheResult(dostup_po_podrazdelenijam);
	}

	/**
	* Caches the dostup_po_podrazdelenijams in the entity cache if it is enabled.
	*
	* @param dostup_po_podrazdelenijams the dostup_po_podrazdelenijams
	*/
	public static void cacheResult(
		List<dostup_po_podrazdelenijam> dostup_po_podrazdelenijams) {
		getPersistence().cacheResult(dostup_po_podrazdelenijams);
	}

	/**
	* Creates a new dostup_po_podrazdelenijam with the primary key. Does not add the dostup_po_podrazdelenijam to the database.
	*
	* @param dostup_po_podrazdelenijam_id the primary key for the new dostup_po_podrazdelenijam
	* @return the new dostup_po_podrazdelenijam
	*/
	public static dostup_po_podrazdelenijam create(
		long dostup_po_podrazdelenijam_id) {
		return getPersistence().create(dostup_po_podrazdelenijam_id);
	}

	/**
	* Removes the dostup_po_podrazdelenijam with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dostup_po_podrazdelenijam_id the primary key of the dostup_po_podrazdelenijam
	* @return the dostup_po_podrazdelenijam that was removed
	* @throws NoSuchdostup_po_podrazdelenijamException if a dostup_po_podrazdelenijam with the primary key could not be found
	*/
	public static dostup_po_podrazdelenijam remove(
		long dostup_po_podrazdelenijam_id)
		throws tj.dostup.po.podrazdelenijam.exception.NoSuchdostup_po_podrazdelenijamException {
		return getPersistence().remove(dostup_po_podrazdelenijam_id);
	}

	public static dostup_po_podrazdelenijam updateImpl(
		dostup_po_podrazdelenijam dostup_po_podrazdelenijam) {
		return getPersistence().updateImpl(dostup_po_podrazdelenijam);
	}

	/**
	* Returns the dostup_po_podrazdelenijam with the primary key or throws a {@link NoSuchdostup_po_podrazdelenijamException} if it could not be found.
	*
	* @param dostup_po_podrazdelenijam_id the primary key of the dostup_po_podrazdelenijam
	* @return the dostup_po_podrazdelenijam
	* @throws NoSuchdostup_po_podrazdelenijamException if a dostup_po_podrazdelenijam with the primary key could not be found
	*/
	public static dostup_po_podrazdelenijam findByPrimaryKey(
		long dostup_po_podrazdelenijam_id)
		throws tj.dostup.po.podrazdelenijam.exception.NoSuchdostup_po_podrazdelenijamException {
		return getPersistence().findByPrimaryKey(dostup_po_podrazdelenijam_id);
	}

	/**
	* Returns the dostup_po_podrazdelenijam with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param dostup_po_podrazdelenijam_id the primary key of the dostup_po_podrazdelenijam
	* @return the dostup_po_podrazdelenijam, or <code>null</code> if a dostup_po_podrazdelenijam with the primary key could not be found
	*/
	public static dostup_po_podrazdelenijam fetchByPrimaryKey(
		long dostup_po_podrazdelenijam_id) {
		return getPersistence().fetchByPrimaryKey(dostup_po_podrazdelenijam_id);
	}

	public static java.util.Map<java.io.Serializable, dostup_po_podrazdelenijam> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the dostup_po_podrazdelenijams.
	*
	* @return the dostup_po_podrazdelenijams
	*/
	public static List<dostup_po_podrazdelenijam> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dostup_po_podrazdelenijams.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link dostup_po_podrazdelenijamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dostup_po_podrazdelenijams
	* @param end the upper bound of the range of dostup_po_podrazdelenijams (not inclusive)
	* @return the range of dostup_po_podrazdelenijams
	*/
	public static List<dostup_po_podrazdelenijam> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dostup_po_podrazdelenijams.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link dostup_po_podrazdelenijamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dostup_po_podrazdelenijams
	* @param end the upper bound of the range of dostup_po_podrazdelenijams (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dostup_po_podrazdelenijams
	*/
	public static List<dostup_po_podrazdelenijam> findAll(int start, int end,
		OrderByComparator<dostup_po_podrazdelenijam> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the dostup_po_podrazdelenijams.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link dostup_po_podrazdelenijamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dostup_po_podrazdelenijams
	* @param end the upper bound of the range of dostup_po_podrazdelenijams (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of dostup_po_podrazdelenijams
	*/
	public static List<dostup_po_podrazdelenijam> findAll(int start, int end,
		OrderByComparator<dostup_po_podrazdelenijam> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the dostup_po_podrazdelenijams from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dostup_po_podrazdelenijams.
	*
	* @return the number of dostup_po_podrazdelenijams
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static dostup_po_podrazdelenijamPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<dostup_po_podrazdelenijamPersistence, dostup_po_podrazdelenijamPersistence> _serviceTracker =
		ServiceTrackerFactory.open(dostup_po_podrazdelenijamPersistence.class);
}
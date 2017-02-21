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

package tj.reestr.kontraktov.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.reestr.kontraktov.model.reestr_kontraktov;

import java.util.List;

/**
 * The persistence utility for the reestr_kontraktov service. This utility wraps {@link tj.reestr.kontraktov.service.persistence.impl.reestr_kontraktovPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see reestr_kontraktovPersistence
 * @see tj.reestr.kontraktov.service.persistence.impl.reestr_kontraktovPersistenceImpl
 * @generated
 */
@ProviderType
public class reestr_kontraktovUtil {
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
	public static void clearCache(reestr_kontraktov reestr_kontraktov) {
		getPersistence().clearCache(reestr_kontraktov);
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
	public static List<reestr_kontraktov> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<reestr_kontraktov> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<reestr_kontraktov> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<reestr_kontraktov> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static reestr_kontraktov update(reestr_kontraktov reestr_kontraktov) {
		return getPersistence().update(reestr_kontraktov);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static reestr_kontraktov update(
		reestr_kontraktov reestr_kontraktov, ServiceContext serviceContext) {
		return getPersistence().update(reestr_kontraktov, serviceContext);
	}

	/**
	* Caches the reestr_kontraktov in the entity cache if it is enabled.
	*
	* @param reestr_kontraktov the reestr_kontraktov
	*/
	public static void cacheResult(reestr_kontraktov reestr_kontraktov) {
		getPersistence().cacheResult(reestr_kontraktov);
	}

	/**
	* Caches the reestr_kontraktovs in the entity cache if it is enabled.
	*
	* @param reestr_kontraktovs the reestr_kontraktovs
	*/
	public static void cacheResult(List<reestr_kontraktov> reestr_kontraktovs) {
		getPersistence().cacheResult(reestr_kontraktovs);
	}

	/**
	* Creates a new reestr_kontraktov with the primary key. Does not add the reestr_kontraktov to the database.
	*
	* @param reestr_kontraktov_id the primary key for the new reestr_kontraktov
	* @return the new reestr_kontraktov
	*/
	public static reestr_kontraktov create(
		java.lang.String reestr_kontraktov_id) {
		return getPersistence().create(reestr_kontraktov_id);
	}

	/**
	* Removes the reestr_kontraktov with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param reestr_kontraktov_id the primary key of the reestr_kontraktov
	* @return the reestr_kontraktov that was removed
	* @throws NoSuchreestr_kontraktovException if a reestr_kontraktov with the primary key could not be found
	*/
	public static reestr_kontraktov remove(
		java.lang.String reestr_kontraktov_id)
		throws tj.reestr.kontraktov.exception.NoSuchreestr_kontraktovException {
		return getPersistence().remove(reestr_kontraktov_id);
	}

	public static reestr_kontraktov updateImpl(
		reestr_kontraktov reestr_kontraktov) {
		return getPersistence().updateImpl(reestr_kontraktov);
	}

	/**
	* Returns the reestr_kontraktov with the primary key or throws a {@link NoSuchreestr_kontraktovException} if it could not be found.
	*
	* @param reestr_kontraktov_id the primary key of the reestr_kontraktov
	* @return the reestr_kontraktov
	* @throws NoSuchreestr_kontraktovException if a reestr_kontraktov with the primary key could not be found
	*/
	public static reestr_kontraktov findByPrimaryKey(
		java.lang.String reestr_kontraktov_id)
		throws tj.reestr.kontraktov.exception.NoSuchreestr_kontraktovException {
		return getPersistence().findByPrimaryKey(reestr_kontraktov_id);
	}

	/**
	* Returns the reestr_kontraktov with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param reestr_kontraktov_id the primary key of the reestr_kontraktov
	* @return the reestr_kontraktov, or <code>null</code> if a reestr_kontraktov with the primary key could not be found
	*/
	public static reestr_kontraktov fetchByPrimaryKey(
		java.lang.String reestr_kontraktov_id) {
		return getPersistence().fetchByPrimaryKey(reestr_kontraktov_id);
	}

	public static java.util.Map<java.io.Serializable, reestr_kontraktov> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the reestr_kontraktovs.
	*
	* @return the reestr_kontraktovs
	*/
	public static List<reestr_kontraktov> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the reestr_kontraktovs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link reestr_kontraktovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of reestr_kontraktovs
	* @param end the upper bound of the range of reestr_kontraktovs (not inclusive)
	* @return the range of reestr_kontraktovs
	*/
	public static List<reestr_kontraktov> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the reestr_kontraktovs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link reestr_kontraktovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of reestr_kontraktovs
	* @param end the upper bound of the range of reestr_kontraktovs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of reestr_kontraktovs
	*/
	public static List<reestr_kontraktov> findAll(int start, int end,
		OrderByComparator<reestr_kontraktov> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the reestr_kontraktovs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link reestr_kontraktovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of reestr_kontraktovs
	* @param end the upper bound of the range of reestr_kontraktovs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of reestr_kontraktovs
	*/
	public static List<reestr_kontraktov> findAll(int start, int end,
		OrderByComparator<reestr_kontraktov> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the reestr_kontraktovs from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of reestr_kontraktovs.
	*
	* @return the number of reestr_kontraktovs
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static reestr_kontraktovPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<reestr_kontraktovPersistence, reestr_kontraktovPersistence> _serviceTracker =
		ServiceTrackerFactory.open(reestr_kontraktovPersistence.class);
}
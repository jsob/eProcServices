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

package tj.oblasti.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.oblasti.model.oblasti;

import java.util.List;

/**
 * The persistence utility for the oblasti service. This utility wraps {@link tj.oblasti.service.persistence.impl.oblastiPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see oblastiPersistence
 * @see tj.oblasti.service.persistence.impl.oblastiPersistenceImpl
 * @generated
 */
@ProviderType
public class oblastiUtil {
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
	public static void clearCache(oblasti oblasti) {
		getPersistence().clearCache(oblasti);
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
	public static List<oblasti> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<oblasti> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<oblasti> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<oblasti> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static oblasti update(oblasti oblasti) {
		return getPersistence().update(oblasti);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static oblasti update(oblasti oblasti, ServiceContext serviceContext) {
		return getPersistence().update(oblasti, serviceContext);
	}

	/**
	* Caches the oblasti in the entity cache if it is enabled.
	*
	* @param oblasti the oblasti
	*/
	public static void cacheResult(oblasti oblasti) {
		getPersistence().cacheResult(oblasti);
	}

	/**
	* Caches the oblastis in the entity cache if it is enabled.
	*
	* @param oblastis the oblastis
	*/
	public static void cacheResult(List<oblasti> oblastis) {
		getPersistence().cacheResult(oblastis);
	}

	/**
	* Creates a new oblasti with the primary key. Does not add the oblasti to the database.
	*
	* @param oblasti_id the primary key for the new oblasti
	* @return the new oblasti
	*/
	public static oblasti create(long oblasti_id) {
		return getPersistence().create(oblasti_id);
	}

	/**
	* Removes the oblasti with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param oblasti_id the primary key of the oblasti
	* @return the oblasti that was removed
	* @throws NoSuchoblastiException if a oblasti with the primary key could not be found
	*/
	public static oblasti remove(long oblasti_id)
		throws tj.oblasti.exception.NoSuchoblastiException {
		return getPersistence().remove(oblasti_id);
	}

	public static oblasti updateImpl(oblasti oblasti) {
		return getPersistence().updateImpl(oblasti);
	}

	/**
	* Returns the oblasti with the primary key or throws a {@link NoSuchoblastiException} if it could not be found.
	*
	* @param oblasti_id the primary key of the oblasti
	* @return the oblasti
	* @throws NoSuchoblastiException if a oblasti with the primary key could not be found
	*/
	public static oblasti findByPrimaryKey(long oblasti_id)
		throws tj.oblasti.exception.NoSuchoblastiException {
		return getPersistence().findByPrimaryKey(oblasti_id);
	}

	/**
	* Returns the oblasti with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param oblasti_id the primary key of the oblasti
	* @return the oblasti, or <code>null</code> if a oblasti with the primary key could not be found
	*/
	public static oblasti fetchByPrimaryKey(long oblasti_id) {
		return getPersistence().fetchByPrimaryKey(oblasti_id);
	}

	public static java.util.Map<java.io.Serializable, oblasti> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the oblastis.
	*
	* @return the oblastis
	*/
	public static List<oblasti> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the oblastis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link oblastiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of oblastis
	* @param end the upper bound of the range of oblastis (not inclusive)
	* @return the range of oblastis
	*/
	public static List<oblasti> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the oblastis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link oblastiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of oblastis
	* @param end the upper bound of the range of oblastis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of oblastis
	*/
	public static List<oblasti> findAll(int start, int end,
		OrderByComparator<oblasti> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the oblastis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link oblastiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of oblastis
	* @param end the upper bound of the range of oblastis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of oblastis
	*/
	public static List<oblasti> findAll(int start, int end,
		OrderByComparator<oblasti> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the oblastis from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of oblastis.
	*
	* @return the number of oblastis
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static oblastiPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<oblastiPersistence, oblastiPersistence> _serviceTracker =
		ServiceTrackerFactory.open(oblastiPersistence.class);
}
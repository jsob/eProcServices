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

package tj.dokumenty.na.zajavku.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.dokumenty.na.zajavku.model.dokumenty_na_zajavku;

import java.util.List;

/**
 * The persistence utility for the dokumenty_na_zajavku service. This utility wraps {@link tj.dokumenty.na.zajavku.service.persistence.impl.dokumenty_na_zajavkuPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see dokumenty_na_zajavkuPersistence
 * @see tj.dokumenty.na.zajavku.service.persistence.impl.dokumenty_na_zajavkuPersistenceImpl
 * @generated
 */
@ProviderType
public class dokumenty_na_zajavkuUtil {
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
	public static void clearCache(dokumenty_na_zajavku dokumenty_na_zajavku) {
		getPersistence().clearCache(dokumenty_na_zajavku);
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
	public static List<dokumenty_na_zajavku> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<dokumenty_na_zajavku> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<dokumenty_na_zajavku> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<dokumenty_na_zajavku> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static dokumenty_na_zajavku update(
		dokumenty_na_zajavku dokumenty_na_zajavku) {
		return getPersistence().update(dokumenty_na_zajavku);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static dokumenty_na_zajavku update(
		dokumenty_na_zajavku dokumenty_na_zajavku, ServiceContext serviceContext) {
		return getPersistence().update(dokumenty_na_zajavku, serviceContext);
	}

	/**
	* Caches the dokumenty_na_zajavku in the entity cache if it is enabled.
	*
	* @param dokumenty_na_zajavku the dokumenty_na_zajavku
	*/
	public static void cacheResult(dokumenty_na_zajavku dokumenty_na_zajavku) {
		getPersistence().cacheResult(dokumenty_na_zajavku);
	}

	/**
	* Caches the dokumenty_na_zajavkus in the entity cache if it is enabled.
	*
	* @param dokumenty_na_zajavkus the dokumenty_na_zajavkus
	*/
	public static void cacheResult(
		List<dokumenty_na_zajavku> dokumenty_na_zajavkus) {
		getPersistence().cacheResult(dokumenty_na_zajavkus);
	}

	/**
	* Creates a new dokumenty_na_zajavku with the primary key. Does not add the dokumenty_na_zajavku to the database.
	*
	* @param dokumenty_na_zajavku_id the primary key for the new dokumenty_na_zajavku
	* @return the new dokumenty_na_zajavku
	*/
	public static dokumenty_na_zajavku create(long dokumenty_na_zajavku_id) {
		return getPersistence().create(dokumenty_na_zajavku_id);
	}

	/**
	* Removes the dokumenty_na_zajavku with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dokumenty_na_zajavku_id the primary key of the dokumenty_na_zajavku
	* @return the dokumenty_na_zajavku that was removed
	* @throws NoSuchdokumenty_na_zajavkuException if a dokumenty_na_zajavku with the primary key could not be found
	*/
	public static dokumenty_na_zajavku remove(long dokumenty_na_zajavku_id)
		throws tj.dokumenty.na.zajavku.exception.NoSuchdokumenty_na_zajavkuException {
		return getPersistence().remove(dokumenty_na_zajavku_id);
	}

	public static dokumenty_na_zajavku updateImpl(
		dokumenty_na_zajavku dokumenty_na_zajavku) {
		return getPersistence().updateImpl(dokumenty_na_zajavku);
	}

	/**
	* Returns the dokumenty_na_zajavku with the primary key or throws a {@link NoSuchdokumenty_na_zajavkuException} if it could not be found.
	*
	* @param dokumenty_na_zajavku_id the primary key of the dokumenty_na_zajavku
	* @return the dokumenty_na_zajavku
	* @throws NoSuchdokumenty_na_zajavkuException if a dokumenty_na_zajavku with the primary key could not be found
	*/
	public static dokumenty_na_zajavku findByPrimaryKey(
		long dokumenty_na_zajavku_id)
		throws tj.dokumenty.na.zajavku.exception.NoSuchdokumenty_na_zajavkuException {
		return getPersistence().findByPrimaryKey(dokumenty_na_zajavku_id);
	}

	/**
	* Returns the dokumenty_na_zajavku with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param dokumenty_na_zajavku_id the primary key of the dokumenty_na_zajavku
	* @return the dokumenty_na_zajavku, or <code>null</code> if a dokumenty_na_zajavku with the primary key could not be found
	*/
	public static dokumenty_na_zajavku fetchByPrimaryKey(
		long dokumenty_na_zajavku_id) {
		return getPersistence().fetchByPrimaryKey(dokumenty_na_zajavku_id);
	}

	public static java.util.Map<java.io.Serializable, dokumenty_na_zajavku> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the dokumenty_na_zajavkus.
	*
	* @return the dokumenty_na_zajavkus
	*/
	public static List<dokumenty_na_zajavku> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dokumenty_na_zajavkus.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link dokumenty_na_zajavkuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dokumenty_na_zajavkus
	* @param end the upper bound of the range of dokumenty_na_zajavkus (not inclusive)
	* @return the range of dokumenty_na_zajavkus
	*/
	public static List<dokumenty_na_zajavku> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dokumenty_na_zajavkus.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link dokumenty_na_zajavkuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dokumenty_na_zajavkus
	* @param end the upper bound of the range of dokumenty_na_zajavkus (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dokumenty_na_zajavkus
	*/
	public static List<dokumenty_na_zajavku> findAll(int start, int end,
		OrderByComparator<dokumenty_na_zajavku> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the dokumenty_na_zajavkus.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link dokumenty_na_zajavkuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dokumenty_na_zajavkus
	* @param end the upper bound of the range of dokumenty_na_zajavkus (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of dokumenty_na_zajavkus
	*/
	public static List<dokumenty_na_zajavku> findAll(int start, int end,
		OrderByComparator<dokumenty_na_zajavku> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the dokumenty_na_zajavkus from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dokumenty_na_zajavkus.
	*
	* @return the number of dokumenty_na_zajavkus
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static dokumenty_na_zajavkuPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<dokumenty_na_zajavkuPersistence, dokumenty_na_zajavkuPersistence> _serviceTracker =
		ServiceTrackerFactory.open(dokumenty_na_zajavkuPersistence.class);
}
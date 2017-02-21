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

package tj.otpravlennye.zajavki.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.otpravlennye.zajavki.model.otpravlennye_zajavki;

import java.util.List;

/**
 * The persistence utility for the otpravlennye_zajavki service. This utility wraps {@link tj.otpravlennye.zajavki.service.persistence.impl.otpravlennye_zajavkiPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see otpravlennye_zajavkiPersistence
 * @see tj.otpravlennye.zajavki.service.persistence.impl.otpravlennye_zajavkiPersistenceImpl
 * @generated
 */
@ProviderType
public class otpravlennye_zajavkiUtil {
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
	public static void clearCache(otpravlennye_zajavki otpravlennye_zajavki) {
		getPersistence().clearCache(otpravlennye_zajavki);
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
	public static List<otpravlennye_zajavki> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<otpravlennye_zajavki> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<otpravlennye_zajavki> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<otpravlennye_zajavki> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static otpravlennye_zajavki update(
		otpravlennye_zajavki otpravlennye_zajavki) {
		return getPersistence().update(otpravlennye_zajavki);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static otpravlennye_zajavki update(
		otpravlennye_zajavki otpravlennye_zajavki, ServiceContext serviceContext) {
		return getPersistence().update(otpravlennye_zajavki, serviceContext);
	}

	/**
	* Caches the otpravlennye_zajavki in the entity cache if it is enabled.
	*
	* @param otpravlennye_zajavki the otpravlennye_zajavki
	*/
	public static void cacheResult(otpravlennye_zajavki otpravlennye_zajavki) {
		getPersistence().cacheResult(otpravlennye_zajavki);
	}

	/**
	* Caches the otpravlennye_zajavkis in the entity cache if it is enabled.
	*
	* @param otpravlennye_zajavkis the otpravlennye_zajavkis
	*/
	public static void cacheResult(
		List<otpravlennye_zajavki> otpravlennye_zajavkis) {
		getPersistence().cacheResult(otpravlennye_zajavkis);
	}

	/**
	* Creates a new otpravlennye_zajavki with the primary key. Does not add the otpravlennye_zajavki to the database.
	*
	* @param otpravlennye_zajavki_id the primary key for the new otpravlennye_zajavki
	* @return the new otpravlennye_zajavki
	*/
	public static otpravlennye_zajavki create(long otpravlennye_zajavki_id) {
		return getPersistence().create(otpravlennye_zajavki_id);
	}

	/**
	* Removes the otpravlennye_zajavki with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param otpravlennye_zajavki_id the primary key of the otpravlennye_zajavki
	* @return the otpravlennye_zajavki that was removed
	* @throws NoSuchotpravlennye_zajavkiException if a otpravlennye_zajavki with the primary key could not be found
	*/
	public static otpravlennye_zajavki remove(long otpravlennye_zajavki_id)
		throws tj.otpravlennye.zajavki.exception.NoSuchotpravlennye_zajavkiException {
		return getPersistence().remove(otpravlennye_zajavki_id);
	}

	public static otpravlennye_zajavki updateImpl(
		otpravlennye_zajavki otpravlennye_zajavki) {
		return getPersistence().updateImpl(otpravlennye_zajavki);
	}

	/**
	* Returns the otpravlennye_zajavki with the primary key or throws a {@link NoSuchotpravlennye_zajavkiException} if it could not be found.
	*
	* @param otpravlennye_zajavki_id the primary key of the otpravlennye_zajavki
	* @return the otpravlennye_zajavki
	* @throws NoSuchotpravlennye_zajavkiException if a otpravlennye_zajavki with the primary key could not be found
	*/
	public static otpravlennye_zajavki findByPrimaryKey(
		long otpravlennye_zajavki_id)
		throws tj.otpravlennye.zajavki.exception.NoSuchotpravlennye_zajavkiException {
		return getPersistence().findByPrimaryKey(otpravlennye_zajavki_id);
	}

	/**
	* Returns the otpravlennye_zajavki with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param otpravlennye_zajavki_id the primary key of the otpravlennye_zajavki
	* @return the otpravlennye_zajavki, or <code>null</code> if a otpravlennye_zajavki with the primary key could not be found
	*/
	public static otpravlennye_zajavki fetchByPrimaryKey(
		long otpravlennye_zajavki_id) {
		return getPersistence().fetchByPrimaryKey(otpravlennye_zajavki_id);
	}

	public static java.util.Map<java.io.Serializable, otpravlennye_zajavki> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the otpravlennye_zajavkis.
	*
	* @return the otpravlennye_zajavkis
	*/
	public static List<otpravlennye_zajavki> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the otpravlennye_zajavkis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link otpravlennye_zajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of otpravlennye_zajavkis
	* @param end the upper bound of the range of otpravlennye_zajavkis (not inclusive)
	* @return the range of otpravlennye_zajavkis
	*/
	public static List<otpravlennye_zajavki> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the otpravlennye_zajavkis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link otpravlennye_zajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of otpravlennye_zajavkis
	* @param end the upper bound of the range of otpravlennye_zajavkis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of otpravlennye_zajavkis
	*/
	public static List<otpravlennye_zajavki> findAll(int start, int end,
		OrderByComparator<otpravlennye_zajavki> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the otpravlennye_zajavkis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link otpravlennye_zajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of otpravlennye_zajavkis
	* @param end the upper bound of the range of otpravlennye_zajavkis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of otpravlennye_zajavkis
	*/
	public static List<otpravlennye_zajavki> findAll(int start, int end,
		OrderByComparator<otpravlennye_zajavki> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the otpravlennye_zajavkis from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of otpravlennye_zajavkis.
	*
	* @return the number of otpravlennye_zajavkis
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static otpravlennye_zajavkiPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<otpravlennye_zajavkiPersistence, otpravlennye_zajavkiPersistence> _serviceTracker =
		ServiceTrackerFactory.open(otpravlennye_zajavkiPersistence.class);
}
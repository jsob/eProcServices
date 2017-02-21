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

package tj.otozvannye.zajavki.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.otozvannye.zajavki.model.otozvannye_zajavki;

import java.util.List;

/**
 * The persistence utility for the otozvannye_zajavki service. This utility wraps {@link tj.otozvannye.zajavki.service.persistence.impl.otozvannye_zajavkiPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see otozvannye_zajavkiPersistence
 * @see tj.otozvannye.zajavki.service.persistence.impl.otozvannye_zajavkiPersistenceImpl
 * @generated
 */
@ProviderType
public class otozvannye_zajavkiUtil {
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
	public static void clearCache(otozvannye_zajavki otozvannye_zajavki) {
		getPersistence().clearCache(otozvannye_zajavki);
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
	public static List<otozvannye_zajavki> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<otozvannye_zajavki> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<otozvannye_zajavki> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<otozvannye_zajavki> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static otozvannye_zajavki update(
		otozvannye_zajavki otozvannye_zajavki) {
		return getPersistence().update(otozvannye_zajavki);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static otozvannye_zajavki update(
		otozvannye_zajavki otozvannye_zajavki, ServiceContext serviceContext) {
		return getPersistence().update(otozvannye_zajavki, serviceContext);
	}

	/**
	* Caches the otozvannye_zajavki in the entity cache if it is enabled.
	*
	* @param otozvannye_zajavki the otozvannye_zajavki
	*/
	public static void cacheResult(otozvannye_zajavki otozvannye_zajavki) {
		getPersistence().cacheResult(otozvannye_zajavki);
	}

	/**
	* Caches the otozvannye_zajavkis in the entity cache if it is enabled.
	*
	* @param otozvannye_zajavkis the otozvannye_zajavkis
	*/
	public static void cacheResult(List<otozvannye_zajavki> otozvannye_zajavkis) {
		getPersistence().cacheResult(otozvannye_zajavkis);
	}

	/**
	* Creates a new otozvannye_zajavki with the primary key. Does not add the otozvannye_zajavki to the database.
	*
	* @param otozvannye_zajavki_id the primary key for the new otozvannye_zajavki
	* @return the new otozvannye_zajavki
	*/
	public static otozvannye_zajavki create(long otozvannye_zajavki_id) {
		return getPersistence().create(otozvannye_zajavki_id);
	}

	/**
	* Removes the otozvannye_zajavki with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param otozvannye_zajavki_id the primary key of the otozvannye_zajavki
	* @return the otozvannye_zajavki that was removed
	* @throws NoSuchotozvannye_zajavkiException if a otozvannye_zajavki with the primary key could not be found
	*/
	public static otozvannye_zajavki remove(long otozvannye_zajavki_id)
		throws tj.otozvannye.zajavki.exception.NoSuchotozvannye_zajavkiException {
		return getPersistence().remove(otozvannye_zajavki_id);
	}

	public static otozvannye_zajavki updateImpl(
		otozvannye_zajavki otozvannye_zajavki) {
		return getPersistence().updateImpl(otozvannye_zajavki);
	}

	/**
	* Returns the otozvannye_zajavki with the primary key or throws a {@link NoSuchotozvannye_zajavkiException} if it could not be found.
	*
	* @param otozvannye_zajavki_id the primary key of the otozvannye_zajavki
	* @return the otozvannye_zajavki
	* @throws NoSuchotozvannye_zajavkiException if a otozvannye_zajavki with the primary key could not be found
	*/
	public static otozvannye_zajavki findByPrimaryKey(
		long otozvannye_zajavki_id)
		throws tj.otozvannye.zajavki.exception.NoSuchotozvannye_zajavkiException {
		return getPersistence().findByPrimaryKey(otozvannye_zajavki_id);
	}

	/**
	* Returns the otozvannye_zajavki with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param otozvannye_zajavki_id the primary key of the otozvannye_zajavki
	* @return the otozvannye_zajavki, or <code>null</code> if a otozvannye_zajavki with the primary key could not be found
	*/
	public static otozvannye_zajavki fetchByPrimaryKey(
		long otozvannye_zajavki_id) {
		return getPersistence().fetchByPrimaryKey(otozvannye_zajavki_id);
	}

	public static java.util.Map<java.io.Serializable, otozvannye_zajavki> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the otozvannye_zajavkis.
	*
	* @return the otozvannye_zajavkis
	*/
	public static List<otozvannye_zajavki> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the otozvannye_zajavkis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link otozvannye_zajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of otozvannye_zajavkis
	* @param end the upper bound of the range of otozvannye_zajavkis (not inclusive)
	* @return the range of otozvannye_zajavkis
	*/
	public static List<otozvannye_zajavki> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the otozvannye_zajavkis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link otozvannye_zajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of otozvannye_zajavkis
	* @param end the upper bound of the range of otozvannye_zajavkis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of otozvannye_zajavkis
	*/
	public static List<otozvannye_zajavki> findAll(int start, int end,
		OrderByComparator<otozvannye_zajavki> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the otozvannye_zajavkis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link otozvannye_zajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of otozvannye_zajavkis
	* @param end the upper bound of the range of otozvannye_zajavkis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of otozvannye_zajavkis
	*/
	public static List<otozvannye_zajavki> findAll(int start, int end,
		OrderByComparator<otozvannye_zajavki> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the otozvannye_zajavkis from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of otozvannye_zajavkis.
	*
	* @return the number of otozvannye_zajavkis
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static otozvannye_zajavkiPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<otozvannye_zajavkiPersistence, otozvannye_zajavkiPersistence> _serviceTracker =
		ServiceTrackerFactory.open(otozvannye_zajavkiPersistence.class);
}
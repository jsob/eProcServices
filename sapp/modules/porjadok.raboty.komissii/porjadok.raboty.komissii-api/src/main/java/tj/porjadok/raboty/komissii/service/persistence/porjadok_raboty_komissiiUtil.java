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

package tj.porjadok.raboty.komissii.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.porjadok.raboty.komissii.model.porjadok_raboty_komissii;

import java.util.List;

/**
 * The persistence utility for the porjadok_raboty_komissii service. This utility wraps {@link tj.porjadok.raboty.komissii.service.persistence.impl.porjadok_raboty_komissiiPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see porjadok_raboty_komissiiPersistence
 * @see tj.porjadok.raboty.komissii.service.persistence.impl.porjadok_raboty_komissiiPersistenceImpl
 * @generated
 */
@ProviderType
public class porjadok_raboty_komissiiUtil {
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
		porjadok_raboty_komissii porjadok_raboty_komissii) {
		getPersistence().clearCache(porjadok_raboty_komissii);
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
	public static List<porjadok_raboty_komissii> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<porjadok_raboty_komissii> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<porjadok_raboty_komissii> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<porjadok_raboty_komissii> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static porjadok_raboty_komissii update(
		porjadok_raboty_komissii porjadok_raboty_komissii) {
		return getPersistence().update(porjadok_raboty_komissii);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static porjadok_raboty_komissii update(
		porjadok_raboty_komissii porjadok_raboty_komissii,
		ServiceContext serviceContext) {
		return getPersistence().update(porjadok_raboty_komissii, serviceContext);
	}

	/**
	* Caches the porjadok_raboty_komissii in the entity cache if it is enabled.
	*
	* @param porjadok_raboty_komissii the porjadok_raboty_komissii
	*/
	public static void cacheResult(
		porjadok_raboty_komissii porjadok_raboty_komissii) {
		getPersistence().cacheResult(porjadok_raboty_komissii);
	}

	/**
	* Caches the porjadok_raboty_komissiis in the entity cache if it is enabled.
	*
	* @param porjadok_raboty_komissiis the porjadok_raboty_komissiis
	*/
	public static void cacheResult(
		List<porjadok_raboty_komissii> porjadok_raboty_komissiis) {
		getPersistence().cacheResult(porjadok_raboty_komissiis);
	}

	/**
	* Creates a new porjadok_raboty_komissii with the primary key. Does not add the porjadok_raboty_komissii to the database.
	*
	* @param porjadok_raboty_komissii_id the primary key for the new porjadok_raboty_komissii
	* @return the new porjadok_raboty_komissii
	*/
	public static porjadok_raboty_komissii create(
		long porjadok_raboty_komissii_id) {
		return getPersistence().create(porjadok_raboty_komissii_id);
	}

	/**
	* Removes the porjadok_raboty_komissii with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param porjadok_raboty_komissii_id the primary key of the porjadok_raboty_komissii
	* @return the porjadok_raboty_komissii that was removed
	* @throws NoSuchporjadok_raboty_komissiiException if a porjadok_raboty_komissii with the primary key could not be found
	*/
	public static porjadok_raboty_komissii remove(
		long porjadok_raboty_komissii_id)
		throws tj.porjadok.raboty.komissii.exception.NoSuchporjadok_raboty_komissiiException {
		return getPersistence().remove(porjadok_raboty_komissii_id);
	}

	public static porjadok_raboty_komissii updateImpl(
		porjadok_raboty_komissii porjadok_raboty_komissii) {
		return getPersistence().updateImpl(porjadok_raboty_komissii);
	}

	/**
	* Returns the porjadok_raboty_komissii with the primary key or throws a {@link NoSuchporjadok_raboty_komissiiException} if it could not be found.
	*
	* @param porjadok_raboty_komissii_id the primary key of the porjadok_raboty_komissii
	* @return the porjadok_raboty_komissii
	* @throws NoSuchporjadok_raboty_komissiiException if a porjadok_raboty_komissii with the primary key could not be found
	*/
	public static porjadok_raboty_komissii findByPrimaryKey(
		long porjadok_raboty_komissii_id)
		throws tj.porjadok.raboty.komissii.exception.NoSuchporjadok_raboty_komissiiException {
		return getPersistence().findByPrimaryKey(porjadok_raboty_komissii_id);
	}

	/**
	* Returns the porjadok_raboty_komissii with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param porjadok_raboty_komissii_id the primary key of the porjadok_raboty_komissii
	* @return the porjadok_raboty_komissii, or <code>null</code> if a porjadok_raboty_komissii with the primary key could not be found
	*/
	public static porjadok_raboty_komissii fetchByPrimaryKey(
		long porjadok_raboty_komissii_id) {
		return getPersistence().fetchByPrimaryKey(porjadok_raboty_komissii_id);
	}

	public static java.util.Map<java.io.Serializable, porjadok_raboty_komissii> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the porjadok_raboty_komissiis.
	*
	* @return the porjadok_raboty_komissiis
	*/
	public static List<porjadok_raboty_komissii> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the porjadok_raboty_komissiis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link porjadok_raboty_komissiiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of porjadok_raboty_komissiis
	* @param end the upper bound of the range of porjadok_raboty_komissiis (not inclusive)
	* @return the range of porjadok_raboty_komissiis
	*/
	public static List<porjadok_raboty_komissii> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the porjadok_raboty_komissiis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link porjadok_raboty_komissiiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of porjadok_raboty_komissiis
	* @param end the upper bound of the range of porjadok_raboty_komissiis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of porjadok_raboty_komissiis
	*/
	public static List<porjadok_raboty_komissii> findAll(int start, int end,
		OrderByComparator<porjadok_raboty_komissii> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the porjadok_raboty_komissiis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link porjadok_raboty_komissiiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of porjadok_raboty_komissiis
	* @param end the upper bound of the range of porjadok_raboty_komissiis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of porjadok_raboty_komissiis
	*/
	public static List<porjadok_raboty_komissii> findAll(int start, int end,
		OrderByComparator<porjadok_raboty_komissii> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the porjadok_raboty_komissiis from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of porjadok_raboty_komissiis.
	*
	* @return the number of porjadok_raboty_komissiis
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static porjadok_raboty_komissiiPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<porjadok_raboty_komissiiPersistence, porjadok_raboty_komissiiPersistence> _serviceTracker =
		ServiceTrackerFactory.open(porjadok_raboty_komissiiPersistence.class);
}
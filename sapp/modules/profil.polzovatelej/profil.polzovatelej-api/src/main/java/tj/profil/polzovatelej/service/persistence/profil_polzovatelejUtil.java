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

package tj.profil.polzovatelej.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.profil.polzovatelej.model.profil_polzovatelej;

import java.util.List;

/**
 * The persistence utility for the profil_polzovatelej service. This utility wraps {@link tj.profil.polzovatelej.service.persistence.impl.profil_polzovatelejPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see profil_polzovatelejPersistence
 * @see tj.profil.polzovatelej.service.persistence.impl.profil_polzovatelejPersistenceImpl
 * @generated
 */
@ProviderType
public class profil_polzovatelejUtil {
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
	public static void clearCache(profil_polzovatelej profil_polzovatelej) {
		getPersistence().clearCache(profil_polzovatelej);
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
	public static List<profil_polzovatelej> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<profil_polzovatelej> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<profil_polzovatelej> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<profil_polzovatelej> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static profil_polzovatelej update(
		profil_polzovatelej profil_polzovatelej) {
		return getPersistence().update(profil_polzovatelej);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static profil_polzovatelej update(
		profil_polzovatelej profil_polzovatelej, ServiceContext serviceContext) {
		return getPersistence().update(profil_polzovatelej, serviceContext);
	}

	/**
	* Caches the profil_polzovatelej in the entity cache if it is enabled.
	*
	* @param profil_polzovatelej the profil_polzovatelej
	*/
	public static void cacheResult(profil_polzovatelej profil_polzovatelej) {
		getPersistence().cacheResult(profil_polzovatelej);
	}

	/**
	* Caches the profil_polzovatelejs in the entity cache if it is enabled.
	*
	* @param profil_polzovatelejs the profil_polzovatelejs
	*/
	public static void cacheResult(
		List<profil_polzovatelej> profil_polzovatelejs) {
		getPersistence().cacheResult(profil_polzovatelejs);
	}

	/**
	* Creates a new profil_polzovatelej with the primary key. Does not add the profil_polzovatelej to the database.
	*
	* @param profil_polzovatelej_id the primary key for the new profil_polzovatelej
	* @return the new profil_polzovatelej
	*/
	public static profil_polzovatelej create(long profil_polzovatelej_id) {
		return getPersistence().create(profil_polzovatelej_id);
	}

	/**
	* Removes the profil_polzovatelej with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param profil_polzovatelej_id the primary key of the profil_polzovatelej
	* @return the profil_polzovatelej that was removed
	* @throws NoSuchprofil_polzovatelejException if a profil_polzovatelej with the primary key could not be found
	*/
	public static profil_polzovatelej remove(long profil_polzovatelej_id)
		throws tj.profil.polzovatelej.exception.NoSuchprofil_polzovatelejException {
		return getPersistence().remove(profil_polzovatelej_id);
	}

	public static profil_polzovatelej updateImpl(
		profil_polzovatelej profil_polzovatelej) {
		return getPersistence().updateImpl(profil_polzovatelej);
	}

	/**
	* Returns the profil_polzovatelej with the primary key or throws a {@link NoSuchprofil_polzovatelejException} if it could not be found.
	*
	* @param profil_polzovatelej_id the primary key of the profil_polzovatelej
	* @return the profil_polzovatelej
	* @throws NoSuchprofil_polzovatelejException if a profil_polzovatelej with the primary key could not be found
	*/
	public static profil_polzovatelej findByPrimaryKey(
		long profil_polzovatelej_id)
		throws tj.profil.polzovatelej.exception.NoSuchprofil_polzovatelejException {
		return getPersistence().findByPrimaryKey(profil_polzovatelej_id);
	}

	/**
	* Returns the profil_polzovatelej with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param profil_polzovatelej_id the primary key of the profil_polzovatelej
	* @return the profil_polzovatelej, or <code>null</code> if a profil_polzovatelej with the primary key could not be found
	*/
	public static profil_polzovatelej fetchByPrimaryKey(
		long profil_polzovatelej_id) {
		return getPersistence().fetchByPrimaryKey(profil_polzovatelej_id);
	}

	public static java.util.Map<java.io.Serializable, profil_polzovatelej> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the profil_polzovatelejs.
	*
	* @return the profil_polzovatelejs
	*/
	public static List<profil_polzovatelej> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the profil_polzovatelejs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link profil_polzovatelejModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of profil_polzovatelejs
	* @param end the upper bound of the range of profil_polzovatelejs (not inclusive)
	* @return the range of profil_polzovatelejs
	*/
	public static List<profil_polzovatelej> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the profil_polzovatelejs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link profil_polzovatelejModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of profil_polzovatelejs
	* @param end the upper bound of the range of profil_polzovatelejs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of profil_polzovatelejs
	*/
	public static List<profil_polzovatelej> findAll(int start, int end,
		OrderByComparator<profil_polzovatelej> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the profil_polzovatelejs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link profil_polzovatelejModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of profil_polzovatelejs
	* @param end the upper bound of the range of profil_polzovatelejs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of profil_polzovatelejs
	*/
	public static List<profil_polzovatelej> findAll(int start, int end,
		OrderByComparator<profil_polzovatelej> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the profil_polzovatelejs from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of profil_polzovatelejs.
	*
	* @return the number of profil_polzovatelejs
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static profil_polzovatelejPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<profil_polzovatelejPersistence, profil_polzovatelejPersistence> _serviceTracker =
		ServiceTrackerFactory.open(profil_polzovatelejPersistence.class);
}
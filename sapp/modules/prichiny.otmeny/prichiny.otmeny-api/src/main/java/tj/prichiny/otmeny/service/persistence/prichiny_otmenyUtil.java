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

package tj.prichiny.otmeny.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.prichiny.otmeny.model.prichiny_otmeny;

import java.util.List;

/**
 * The persistence utility for the prichiny_otmeny service. This utility wraps {@link tj.prichiny.otmeny.service.persistence.impl.prichiny_otmenyPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see prichiny_otmenyPersistence
 * @see tj.prichiny.otmeny.service.persistence.impl.prichiny_otmenyPersistenceImpl
 * @generated
 */
@ProviderType
public class prichiny_otmenyUtil {
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
	public static void clearCache(prichiny_otmeny prichiny_otmeny) {
		getPersistence().clearCache(prichiny_otmeny);
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
	public static List<prichiny_otmeny> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<prichiny_otmeny> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<prichiny_otmeny> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<prichiny_otmeny> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static prichiny_otmeny update(prichiny_otmeny prichiny_otmeny) {
		return getPersistence().update(prichiny_otmeny);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static prichiny_otmeny update(prichiny_otmeny prichiny_otmeny,
		ServiceContext serviceContext) {
		return getPersistence().update(prichiny_otmeny, serviceContext);
	}

	/**
	* Caches the prichiny_otmeny in the entity cache if it is enabled.
	*
	* @param prichiny_otmeny the prichiny_otmeny
	*/
	public static void cacheResult(prichiny_otmeny prichiny_otmeny) {
		getPersistence().cacheResult(prichiny_otmeny);
	}

	/**
	* Caches the prichiny_otmenies in the entity cache if it is enabled.
	*
	* @param prichiny_otmenies the prichiny_otmenies
	*/
	public static void cacheResult(List<prichiny_otmeny> prichiny_otmenies) {
		getPersistence().cacheResult(prichiny_otmenies);
	}

	/**
	* Creates a new prichiny_otmeny with the primary key. Does not add the prichiny_otmeny to the database.
	*
	* @param prichiny_otmeny_id the primary key for the new prichiny_otmeny
	* @return the new prichiny_otmeny
	*/
	public static prichiny_otmeny create(long prichiny_otmeny_id) {
		return getPersistence().create(prichiny_otmeny_id);
	}

	/**
	* Removes the prichiny_otmeny with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param prichiny_otmeny_id the primary key of the prichiny_otmeny
	* @return the prichiny_otmeny that was removed
	* @throws NoSuchprichiny_otmenyException if a prichiny_otmeny with the primary key could not be found
	*/
	public static prichiny_otmeny remove(long prichiny_otmeny_id)
		throws tj.prichiny.otmeny.exception.NoSuchprichiny_otmenyException {
		return getPersistence().remove(prichiny_otmeny_id);
	}

	public static prichiny_otmeny updateImpl(prichiny_otmeny prichiny_otmeny) {
		return getPersistence().updateImpl(prichiny_otmeny);
	}

	/**
	* Returns the prichiny_otmeny with the primary key or throws a {@link NoSuchprichiny_otmenyException} if it could not be found.
	*
	* @param prichiny_otmeny_id the primary key of the prichiny_otmeny
	* @return the prichiny_otmeny
	* @throws NoSuchprichiny_otmenyException if a prichiny_otmeny with the primary key could not be found
	*/
	public static prichiny_otmeny findByPrimaryKey(long prichiny_otmeny_id)
		throws tj.prichiny.otmeny.exception.NoSuchprichiny_otmenyException {
		return getPersistence().findByPrimaryKey(prichiny_otmeny_id);
	}

	/**
	* Returns the prichiny_otmeny with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param prichiny_otmeny_id the primary key of the prichiny_otmeny
	* @return the prichiny_otmeny, or <code>null</code> if a prichiny_otmeny with the primary key could not be found
	*/
	public static prichiny_otmeny fetchByPrimaryKey(long prichiny_otmeny_id) {
		return getPersistence().fetchByPrimaryKey(prichiny_otmeny_id);
	}

	public static java.util.Map<java.io.Serializable, prichiny_otmeny> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the prichiny_otmenies.
	*
	* @return the prichiny_otmenies
	*/
	public static List<prichiny_otmeny> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the prichiny_otmenies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link prichiny_otmenyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of prichiny_otmenies
	* @param end the upper bound of the range of prichiny_otmenies (not inclusive)
	* @return the range of prichiny_otmenies
	*/
	public static List<prichiny_otmeny> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the prichiny_otmenies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link prichiny_otmenyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of prichiny_otmenies
	* @param end the upper bound of the range of prichiny_otmenies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of prichiny_otmenies
	*/
	public static List<prichiny_otmeny> findAll(int start, int end,
		OrderByComparator<prichiny_otmeny> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the prichiny_otmenies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link prichiny_otmenyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of prichiny_otmenies
	* @param end the upper bound of the range of prichiny_otmenies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of prichiny_otmenies
	*/
	public static List<prichiny_otmeny> findAll(int start, int end,
		OrderByComparator<prichiny_otmeny> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the prichiny_otmenies from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of prichiny_otmenies.
	*
	* @return the number of prichiny_otmenies
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static prichiny_otmenyPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<prichiny_otmenyPersistence, prichiny_otmenyPersistence> _serviceTracker =
		ServiceTrackerFactory.open(prichiny_otmenyPersistence.class);
}
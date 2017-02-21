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

package tj.podrazdelenija.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.podrazdelenija.model.podrazdelenija;

import java.util.List;

/**
 * The persistence utility for the podrazdelenija service. This utility wraps {@link tj.podrazdelenija.service.persistence.impl.podrazdelenijaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see podrazdelenijaPersistence
 * @see tj.podrazdelenija.service.persistence.impl.podrazdelenijaPersistenceImpl
 * @generated
 */
@ProviderType
public class podrazdelenijaUtil {
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
	public static void clearCache(podrazdelenija podrazdelenija) {
		getPersistence().clearCache(podrazdelenija);
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
	public static List<podrazdelenija> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<podrazdelenija> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<podrazdelenija> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<podrazdelenija> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static podrazdelenija update(podrazdelenija podrazdelenija) {
		return getPersistence().update(podrazdelenija);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static podrazdelenija update(podrazdelenija podrazdelenija,
		ServiceContext serviceContext) {
		return getPersistence().update(podrazdelenija, serviceContext);
	}

	/**
	* Caches the podrazdelenija in the entity cache if it is enabled.
	*
	* @param podrazdelenija the podrazdelenija
	*/
	public static void cacheResult(podrazdelenija podrazdelenija) {
		getPersistence().cacheResult(podrazdelenija);
	}

	/**
	* Caches the podrazdelenijas in the entity cache if it is enabled.
	*
	* @param podrazdelenijas the podrazdelenijas
	*/
	public static void cacheResult(List<podrazdelenija> podrazdelenijas) {
		getPersistence().cacheResult(podrazdelenijas);
	}

	/**
	* Creates a new podrazdelenija with the primary key. Does not add the podrazdelenija to the database.
	*
	* @param podrazdelenija_id the primary key for the new podrazdelenija
	* @return the new podrazdelenija
	*/
	public static podrazdelenija create(long podrazdelenija_id) {
		return getPersistence().create(podrazdelenija_id);
	}

	/**
	* Removes the podrazdelenija with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param podrazdelenija_id the primary key of the podrazdelenija
	* @return the podrazdelenija that was removed
	* @throws NoSuchpodrazdelenijaException if a podrazdelenija with the primary key could not be found
	*/
	public static podrazdelenija remove(long podrazdelenija_id)
		throws tj.podrazdelenija.exception.NoSuchpodrazdelenijaException {
		return getPersistence().remove(podrazdelenija_id);
	}

	public static podrazdelenija updateImpl(podrazdelenija podrazdelenija) {
		return getPersistence().updateImpl(podrazdelenija);
	}

	/**
	* Returns the podrazdelenija with the primary key or throws a {@link NoSuchpodrazdelenijaException} if it could not be found.
	*
	* @param podrazdelenija_id the primary key of the podrazdelenija
	* @return the podrazdelenija
	* @throws NoSuchpodrazdelenijaException if a podrazdelenija with the primary key could not be found
	*/
	public static podrazdelenija findByPrimaryKey(long podrazdelenija_id)
		throws tj.podrazdelenija.exception.NoSuchpodrazdelenijaException {
		return getPersistence().findByPrimaryKey(podrazdelenija_id);
	}

	/**
	* Returns the podrazdelenija with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param podrazdelenija_id the primary key of the podrazdelenija
	* @return the podrazdelenija, or <code>null</code> if a podrazdelenija with the primary key could not be found
	*/
	public static podrazdelenija fetchByPrimaryKey(long podrazdelenija_id) {
		return getPersistence().fetchByPrimaryKey(podrazdelenija_id);
	}

	public static java.util.Map<java.io.Serializable, podrazdelenija> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the podrazdelenijas.
	*
	* @return the podrazdelenijas
	*/
	public static List<podrazdelenija> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the podrazdelenijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link podrazdelenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of podrazdelenijas
	* @param end the upper bound of the range of podrazdelenijas (not inclusive)
	* @return the range of podrazdelenijas
	*/
	public static List<podrazdelenija> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the podrazdelenijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link podrazdelenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of podrazdelenijas
	* @param end the upper bound of the range of podrazdelenijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of podrazdelenijas
	*/
	public static List<podrazdelenija> findAll(int start, int end,
		OrderByComparator<podrazdelenija> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the podrazdelenijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link podrazdelenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of podrazdelenijas
	* @param end the upper bound of the range of podrazdelenijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of podrazdelenijas
	*/
	public static List<podrazdelenija> findAll(int start, int end,
		OrderByComparator<podrazdelenija> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the podrazdelenijas from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of podrazdelenijas.
	*
	* @return the number of podrazdelenijas
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static podrazdelenijaPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<podrazdelenijaPersistence, podrazdelenijaPersistence> _serviceTracker =
		ServiceTrackerFactory.open(podrazdelenijaPersistence.class);
}
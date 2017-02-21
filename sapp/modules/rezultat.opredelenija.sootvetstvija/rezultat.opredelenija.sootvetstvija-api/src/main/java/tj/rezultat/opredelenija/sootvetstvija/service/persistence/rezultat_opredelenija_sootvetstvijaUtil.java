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

package tj.rezultat.opredelenija.sootvetstvija.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.rezultat.opredelenija.sootvetstvija.model.rezultat_opredelenija_sootvetstvija;

import java.util.List;

/**
 * The persistence utility for the rezultat_opredelenija_sootvetstvija service. This utility wraps {@link tj.rezultat.opredelenija.sootvetstvija.service.persistence.impl.rezultat_opredelenija_sootvetstvijaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see rezultat_opredelenija_sootvetstvijaPersistence
 * @see tj.rezultat.opredelenija.sootvetstvija.service.persistence.impl.rezultat_opredelenija_sootvetstvijaPersistenceImpl
 * @generated
 */
@ProviderType
public class rezultat_opredelenija_sootvetstvijaUtil {
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
		rezultat_opredelenija_sootvetstvija rezultat_opredelenija_sootvetstvija) {
		getPersistence().clearCache(rezultat_opredelenija_sootvetstvija);
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
	public static List<rezultat_opredelenija_sootvetstvija> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<rezultat_opredelenija_sootvetstvija> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<rezultat_opredelenija_sootvetstvija> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<rezultat_opredelenija_sootvetstvija> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static rezultat_opredelenija_sootvetstvija update(
		rezultat_opredelenija_sootvetstvija rezultat_opredelenija_sootvetstvija) {
		return getPersistence().update(rezultat_opredelenija_sootvetstvija);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static rezultat_opredelenija_sootvetstvija update(
		rezultat_opredelenija_sootvetstvija rezultat_opredelenija_sootvetstvija,
		ServiceContext serviceContext) {
		return getPersistence()
				   .update(rezultat_opredelenija_sootvetstvija, serviceContext);
	}

	/**
	* Caches the rezultat_opredelenija_sootvetstvija in the entity cache if it is enabled.
	*
	* @param rezultat_opredelenija_sootvetstvija the rezultat_opredelenija_sootvetstvija
	*/
	public static void cacheResult(
		rezultat_opredelenija_sootvetstvija rezultat_opredelenija_sootvetstvija) {
		getPersistence().cacheResult(rezultat_opredelenija_sootvetstvija);
	}

	/**
	* Caches the rezultat_opredelenija_sootvetstvijas in the entity cache if it is enabled.
	*
	* @param rezultat_opredelenija_sootvetstvijas the rezultat_opredelenija_sootvetstvijas
	*/
	public static void cacheResult(
		List<rezultat_opredelenija_sootvetstvija> rezultat_opredelenija_sootvetstvijas) {
		getPersistence().cacheResult(rezultat_opredelenija_sootvetstvijas);
	}

	/**
	* Creates a new rezultat_opredelenija_sootvetstvija with the primary key. Does not add the rezultat_opredelenija_sootvetstvija to the database.
	*
	* @param rezultat_opredelenija_sootvetstvija_id the primary key for the new rezultat_opredelenija_sootvetstvija
	* @return the new rezultat_opredelenija_sootvetstvija
	*/
	public static rezultat_opredelenija_sootvetstvija create(
		long rezultat_opredelenija_sootvetstvija_id) {
		return getPersistence().create(rezultat_opredelenija_sootvetstvija_id);
	}

	/**
	* Removes the rezultat_opredelenija_sootvetstvija with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param rezultat_opredelenija_sootvetstvija_id the primary key of the rezultat_opredelenija_sootvetstvija
	* @return the rezultat_opredelenija_sootvetstvija that was removed
	* @throws NoSuchrezultat_opredelenija_sootvetstvijaException if a rezultat_opredelenija_sootvetstvija with the primary key could not be found
	*/
	public static rezultat_opredelenija_sootvetstvija remove(
		long rezultat_opredelenija_sootvetstvija_id)
		throws tj.rezultat.opredelenija.sootvetstvija.exception.NoSuchrezultat_opredelenija_sootvetstvijaException {
		return getPersistence().remove(rezultat_opredelenija_sootvetstvija_id);
	}

	public static rezultat_opredelenija_sootvetstvija updateImpl(
		rezultat_opredelenija_sootvetstvija rezultat_opredelenija_sootvetstvija) {
		return getPersistence().updateImpl(rezultat_opredelenija_sootvetstvija);
	}

	/**
	* Returns the rezultat_opredelenija_sootvetstvija with the primary key or throws a {@link NoSuchrezultat_opredelenija_sootvetstvijaException} if it could not be found.
	*
	* @param rezultat_opredelenija_sootvetstvija_id the primary key of the rezultat_opredelenija_sootvetstvija
	* @return the rezultat_opredelenija_sootvetstvija
	* @throws NoSuchrezultat_opredelenija_sootvetstvijaException if a rezultat_opredelenija_sootvetstvija with the primary key could not be found
	*/
	public static rezultat_opredelenija_sootvetstvija findByPrimaryKey(
		long rezultat_opredelenija_sootvetstvija_id)
		throws tj.rezultat.opredelenija.sootvetstvija.exception.NoSuchrezultat_opredelenija_sootvetstvijaException {
		return getPersistence()
				   .findByPrimaryKey(rezultat_opredelenija_sootvetstvija_id);
	}

	/**
	* Returns the rezultat_opredelenija_sootvetstvija with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param rezultat_opredelenija_sootvetstvija_id the primary key of the rezultat_opredelenija_sootvetstvija
	* @return the rezultat_opredelenija_sootvetstvija, or <code>null</code> if a rezultat_opredelenija_sootvetstvija with the primary key could not be found
	*/
	public static rezultat_opredelenija_sootvetstvija fetchByPrimaryKey(
		long rezultat_opredelenija_sootvetstvija_id) {
		return getPersistence()
				   .fetchByPrimaryKey(rezultat_opredelenija_sootvetstvija_id);
	}

	public static java.util.Map<java.io.Serializable, rezultat_opredelenija_sootvetstvija> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the rezultat_opredelenija_sootvetstvijas.
	*
	* @return the rezultat_opredelenija_sootvetstvijas
	*/
	public static List<rezultat_opredelenija_sootvetstvija> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the rezultat_opredelenija_sootvetstvijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link rezultat_opredelenija_sootvetstvijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of rezultat_opredelenija_sootvetstvijas
	* @param end the upper bound of the range of rezultat_opredelenija_sootvetstvijas (not inclusive)
	* @return the range of rezultat_opredelenija_sootvetstvijas
	*/
	public static List<rezultat_opredelenija_sootvetstvija> findAll(int start,
		int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the rezultat_opredelenija_sootvetstvijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link rezultat_opredelenija_sootvetstvijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of rezultat_opredelenija_sootvetstvijas
	* @param end the upper bound of the range of rezultat_opredelenija_sootvetstvijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of rezultat_opredelenija_sootvetstvijas
	*/
	public static List<rezultat_opredelenija_sootvetstvija> findAll(int start,
		int end,
		OrderByComparator<rezultat_opredelenija_sootvetstvija> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the rezultat_opredelenija_sootvetstvijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link rezultat_opredelenija_sootvetstvijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of rezultat_opredelenija_sootvetstvijas
	* @param end the upper bound of the range of rezultat_opredelenija_sootvetstvijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of rezultat_opredelenija_sootvetstvijas
	*/
	public static List<rezultat_opredelenija_sootvetstvija> findAll(int start,
		int end,
		OrderByComparator<rezultat_opredelenija_sootvetstvija> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the rezultat_opredelenija_sootvetstvijas from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of rezultat_opredelenija_sootvetstvijas.
	*
	* @return the number of rezultat_opredelenija_sootvetstvijas
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static rezultat_opredelenija_sootvetstvijaPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<rezultat_opredelenija_sootvetstvijaPersistence, rezultat_opredelenija_sootvetstvijaPersistence> _serviceTracker =
		ServiceTrackerFactory.open(rezultat_opredelenija_sootvetstvijaPersistence.class);
}
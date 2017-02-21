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

package tj.ne.uchastvujushhie.zajavki.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.ne.uchastvujushhie.zajavki.model.ne_uchastvujushhie_zajavki;

import java.util.List;

/**
 * The persistence utility for the ne_uchastvujushhie_zajavki service. This utility wraps {@link tj.ne.uchastvujushhie.zajavki.service.persistence.impl.ne_uchastvujushhie_zajavkiPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ne_uchastvujushhie_zajavkiPersistence
 * @see tj.ne.uchastvujushhie.zajavki.service.persistence.impl.ne_uchastvujushhie_zajavkiPersistenceImpl
 * @generated
 */
@ProviderType
public class ne_uchastvujushhie_zajavkiUtil {
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
		ne_uchastvujushhie_zajavki ne_uchastvujushhie_zajavki) {
		getPersistence().clearCache(ne_uchastvujushhie_zajavki);
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
	public static List<ne_uchastvujushhie_zajavki> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ne_uchastvujushhie_zajavki> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ne_uchastvujushhie_zajavki> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ne_uchastvujushhie_zajavki> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ne_uchastvujushhie_zajavki update(
		ne_uchastvujushhie_zajavki ne_uchastvujushhie_zajavki) {
		return getPersistence().update(ne_uchastvujushhie_zajavki);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ne_uchastvujushhie_zajavki update(
		ne_uchastvujushhie_zajavki ne_uchastvujushhie_zajavki,
		ServiceContext serviceContext) {
		return getPersistence()
				   .update(ne_uchastvujushhie_zajavki, serviceContext);
	}

	/**
	* Caches the ne_uchastvujushhie_zajavki in the entity cache if it is enabled.
	*
	* @param ne_uchastvujushhie_zajavki the ne_uchastvujushhie_zajavki
	*/
	public static void cacheResult(
		ne_uchastvujushhie_zajavki ne_uchastvujushhie_zajavki) {
		getPersistence().cacheResult(ne_uchastvujushhie_zajavki);
	}

	/**
	* Caches the ne_uchastvujushhie_zajavkis in the entity cache if it is enabled.
	*
	* @param ne_uchastvujushhie_zajavkis the ne_uchastvujushhie_zajavkis
	*/
	public static void cacheResult(
		List<ne_uchastvujushhie_zajavki> ne_uchastvujushhie_zajavkis) {
		getPersistence().cacheResult(ne_uchastvujushhie_zajavkis);
	}

	/**
	* Creates a new ne_uchastvujushhie_zajavki with the primary key. Does not add the ne_uchastvujushhie_zajavki to the database.
	*
	* @param ne_uchastvujushhie_zajavki_id the primary key for the new ne_uchastvujushhie_zajavki
	* @return the new ne_uchastvujushhie_zajavki
	*/
	public static ne_uchastvujushhie_zajavki create(
		long ne_uchastvujushhie_zajavki_id) {
		return getPersistence().create(ne_uchastvujushhie_zajavki_id);
	}

	/**
	* Removes the ne_uchastvujushhie_zajavki with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ne_uchastvujushhie_zajavki_id the primary key of the ne_uchastvujushhie_zajavki
	* @return the ne_uchastvujushhie_zajavki that was removed
	* @throws NoSuchne_uchastvujushhie_zajavkiException if a ne_uchastvujushhie_zajavki with the primary key could not be found
	*/
	public static ne_uchastvujushhie_zajavki remove(
		long ne_uchastvujushhie_zajavki_id)
		throws tj.ne.uchastvujushhie.zajavki.exception.NoSuchne_uchastvujushhie_zajavkiException {
		return getPersistence().remove(ne_uchastvujushhie_zajavki_id);
	}

	public static ne_uchastvujushhie_zajavki updateImpl(
		ne_uchastvujushhie_zajavki ne_uchastvujushhie_zajavki) {
		return getPersistence().updateImpl(ne_uchastvujushhie_zajavki);
	}

	/**
	* Returns the ne_uchastvujushhie_zajavki with the primary key or throws a {@link NoSuchne_uchastvujushhie_zajavkiException} if it could not be found.
	*
	* @param ne_uchastvujushhie_zajavki_id the primary key of the ne_uchastvujushhie_zajavki
	* @return the ne_uchastvujushhie_zajavki
	* @throws NoSuchne_uchastvujushhie_zajavkiException if a ne_uchastvujushhie_zajavki with the primary key could not be found
	*/
	public static ne_uchastvujushhie_zajavki findByPrimaryKey(
		long ne_uchastvujushhie_zajavki_id)
		throws tj.ne.uchastvujushhie.zajavki.exception.NoSuchne_uchastvujushhie_zajavkiException {
		return getPersistence().findByPrimaryKey(ne_uchastvujushhie_zajavki_id);
	}

	/**
	* Returns the ne_uchastvujushhie_zajavki with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param ne_uchastvujushhie_zajavki_id the primary key of the ne_uchastvujushhie_zajavki
	* @return the ne_uchastvujushhie_zajavki, or <code>null</code> if a ne_uchastvujushhie_zajavki with the primary key could not be found
	*/
	public static ne_uchastvujushhie_zajavki fetchByPrimaryKey(
		long ne_uchastvujushhie_zajavki_id) {
		return getPersistence().fetchByPrimaryKey(ne_uchastvujushhie_zajavki_id);
	}

	public static java.util.Map<java.io.Serializable, ne_uchastvujushhie_zajavki> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the ne_uchastvujushhie_zajavkis.
	*
	* @return the ne_uchastvujushhie_zajavkis
	*/
	public static List<ne_uchastvujushhie_zajavki> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the ne_uchastvujushhie_zajavkis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ne_uchastvujushhie_zajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ne_uchastvujushhie_zajavkis
	* @param end the upper bound of the range of ne_uchastvujushhie_zajavkis (not inclusive)
	* @return the range of ne_uchastvujushhie_zajavkis
	*/
	public static List<ne_uchastvujushhie_zajavki> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the ne_uchastvujushhie_zajavkis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ne_uchastvujushhie_zajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ne_uchastvujushhie_zajavkis
	* @param end the upper bound of the range of ne_uchastvujushhie_zajavkis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ne_uchastvujushhie_zajavkis
	*/
	public static List<ne_uchastvujushhie_zajavki> findAll(int start, int end,
		OrderByComparator<ne_uchastvujushhie_zajavki> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the ne_uchastvujushhie_zajavkis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ne_uchastvujushhie_zajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ne_uchastvujushhie_zajavkis
	* @param end the upper bound of the range of ne_uchastvujushhie_zajavkis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of ne_uchastvujushhie_zajavkis
	*/
	public static List<ne_uchastvujushhie_zajavki> findAll(int start, int end,
		OrderByComparator<ne_uchastvujushhie_zajavki> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the ne_uchastvujushhie_zajavkis from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of ne_uchastvujushhie_zajavkis.
	*
	* @return the number of ne_uchastvujushhie_zajavkis
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ne_uchastvujushhie_zajavkiPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ne_uchastvujushhie_zajavkiPersistence, ne_uchastvujushhie_zajavkiPersistence> _serviceTracker =
		ServiceTrackerFactory.open(ne_uchastvujushhie_zajavkiPersistence.class);
}
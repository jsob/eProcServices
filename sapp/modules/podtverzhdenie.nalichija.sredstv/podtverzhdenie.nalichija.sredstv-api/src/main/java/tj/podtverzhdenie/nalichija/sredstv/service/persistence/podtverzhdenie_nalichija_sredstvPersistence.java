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

package tj.podtverzhdenie.nalichija.sredstv.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.podtverzhdenie.nalichija.sredstv.exception.NoSuchpodtverzhdenie_nalichija_sredstvException;
import tj.podtverzhdenie.nalichija.sredstv.model.podtverzhdenie_nalichija_sredstv;

/**
 * The persistence interface for the podtverzhdenie_nalichija_sredstv service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.podtverzhdenie.nalichija.sredstv.service.persistence.impl.podtverzhdenie_nalichija_sredstvPersistenceImpl
 * @see podtverzhdenie_nalichija_sredstvUtil
 * @generated
 */
@ProviderType
public interface podtverzhdenie_nalichija_sredstvPersistence
	extends BasePersistence<podtverzhdenie_nalichija_sredstv> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link podtverzhdenie_nalichija_sredstvUtil} to access the podtverzhdenie_nalichija_sredstv persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the podtverzhdenie_nalichija_sredstv in the entity cache if it is enabled.
	*
	* @param podtverzhdenie_nalichija_sredstv the podtverzhdenie_nalichija_sredstv
	*/
	public void cacheResult(
		podtverzhdenie_nalichija_sredstv podtverzhdenie_nalichija_sredstv);

	/**
	* Caches the podtverzhdenie_nalichija_sredstvs in the entity cache if it is enabled.
	*
	* @param podtverzhdenie_nalichija_sredstvs the podtverzhdenie_nalichija_sredstvs
	*/
	public void cacheResult(
		java.util.List<podtverzhdenie_nalichija_sredstv> podtverzhdenie_nalichija_sredstvs);

	/**
	* Creates a new podtverzhdenie_nalichija_sredstv with the primary key. Does not add the podtverzhdenie_nalichija_sredstv to the database.
	*
	* @param podtverzhdenie_nalichija_sredstv_id the primary key for the new podtverzhdenie_nalichija_sredstv
	* @return the new podtverzhdenie_nalichija_sredstv
	*/
	public podtverzhdenie_nalichija_sredstv create(
		long podtverzhdenie_nalichija_sredstv_id);

	/**
	* Removes the podtverzhdenie_nalichija_sredstv with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param podtverzhdenie_nalichija_sredstv_id the primary key of the podtverzhdenie_nalichija_sredstv
	* @return the podtverzhdenie_nalichija_sredstv that was removed
	* @throws NoSuchpodtverzhdenie_nalichija_sredstvException if a podtverzhdenie_nalichija_sredstv with the primary key could not be found
	*/
	public podtverzhdenie_nalichija_sredstv remove(
		long podtverzhdenie_nalichija_sredstv_id)
		throws NoSuchpodtverzhdenie_nalichija_sredstvException;

	public podtverzhdenie_nalichija_sredstv updateImpl(
		podtverzhdenie_nalichija_sredstv podtverzhdenie_nalichija_sredstv);

	/**
	* Returns the podtverzhdenie_nalichija_sredstv with the primary key or throws a {@link NoSuchpodtverzhdenie_nalichija_sredstvException} if it could not be found.
	*
	* @param podtverzhdenie_nalichija_sredstv_id the primary key of the podtverzhdenie_nalichija_sredstv
	* @return the podtverzhdenie_nalichija_sredstv
	* @throws NoSuchpodtverzhdenie_nalichija_sredstvException if a podtverzhdenie_nalichija_sredstv with the primary key could not be found
	*/
	public podtverzhdenie_nalichija_sredstv findByPrimaryKey(
		long podtverzhdenie_nalichija_sredstv_id)
		throws NoSuchpodtverzhdenie_nalichija_sredstvException;

	/**
	* Returns the podtverzhdenie_nalichija_sredstv with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param podtverzhdenie_nalichija_sredstv_id the primary key of the podtverzhdenie_nalichija_sredstv
	* @return the podtverzhdenie_nalichija_sredstv, or <code>null</code> if a podtverzhdenie_nalichija_sredstv with the primary key could not be found
	*/
	public podtverzhdenie_nalichija_sredstv fetchByPrimaryKey(
		long podtverzhdenie_nalichija_sredstv_id);

	@Override
	public java.util.Map<java.io.Serializable, podtverzhdenie_nalichija_sredstv> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the podtverzhdenie_nalichija_sredstvs.
	*
	* @return the podtverzhdenie_nalichija_sredstvs
	*/
	public java.util.List<podtverzhdenie_nalichija_sredstv> findAll();

	/**
	* Returns a range of all the podtverzhdenie_nalichija_sredstvs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link podtverzhdenie_nalichija_sredstvModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of podtverzhdenie_nalichija_sredstvs
	* @param end the upper bound of the range of podtverzhdenie_nalichija_sredstvs (not inclusive)
	* @return the range of podtverzhdenie_nalichija_sredstvs
	*/
	public java.util.List<podtverzhdenie_nalichija_sredstv> findAll(int start,
		int end);

	/**
	* Returns an ordered range of all the podtverzhdenie_nalichija_sredstvs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link podtverzhdenie_nalichija_sredstvModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of podtverzhdenie_nalichija_sredstvs
	* @param end the upper bound of the range of podtverzhdenie_nalichija_sredstvs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of podtverzhdenie_nalichija_sredstvs
	*/
	public java.util.List<podtverzhdenie_nalichija_sredstv> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<podtverzhdenie_nalichija_sredstv> orderByComparator);

	/**
	* Returns an ordered range of all the podtverzhdenie_nalichija_sredstvs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link podtverzhdenie_nalichija_sredstvModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of podtverzhdenie_nalichija_sredstvs
	* @param end the upper bound of the range of podtverzhdenie_nalichija_sredstvs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of podtverzhdenie_nalichija_sredstvs
	*/
	public java.util.List<podtverzhdenie_nalichija_sredstv> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<podtverzhdenie_nalichija_sredstv> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the podtverzhdenie_nalichija_sredstvs from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of podtverzhdenie_nalichija_sredstvs.
	*
	* @return the number of podtverzhdenie_nalichija_sredstvs
	*/
	public int countAll();
}
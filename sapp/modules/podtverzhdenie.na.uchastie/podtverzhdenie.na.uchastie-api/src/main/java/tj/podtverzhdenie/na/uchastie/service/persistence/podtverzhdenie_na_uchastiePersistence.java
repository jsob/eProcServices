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

package tj.podtverzhdenie.na.uchastie.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.podtverzhdenie.na.uchastie.exception.NoSuchpodtverzhdenie_na_uchastieException;
import tj.podtverzhdenie.na.uchastie.model.podtverzhdenie_na_uchastie;

/**
 * The persistence interface for the podtverzhdenie_na_uchastie service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.podtverzhdenie.na.uchastie.service.persistence.impl.podtverzhdenie_na_uchastiePersistenceImpl
 * @see podtverzhdenie_na_uchastieUtil
 * @generated
 */
@ProviderType
public interface podtverzhdenie_na_uchastiePersistence extends BasePersistence<podtverzhdenie_na_uchastie> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link podtverzhdenie_na_uchastieUtil} to access the podtverzhdenie_na_uchastie persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the podtverzhdenie_na_uchastie in the entity cache if it is enabled.
	*
	* @param podtverzhdenie_na_uchastie the podtverzhdenie_na_uchastie
	*/
	public void cacheResult(
		podtverzhdenie_na_uchastie podtverzhdenie_na_uchastie);

	/**
	* Caches the podtverzhdenie_na_uchasties in the entity cache if it is enabled.
	*
	* @param podtverzhdenie_na_uchasties the podtverzhdenie_na_uchasties
	*/
	public void cacheResult(
		java.util.List<podtverzhdenie_na_uchastie> podtverzhdenie_na_uchasties);

	/**
	* Creates a new podtverzhdenie_na_uchastie with the primary key. Does not add the podtverzhdenie_na_uchastie to the database.
	*
	* @param podtverzhdenie_na_uchastie_id the primary key for the new podtverzhdenie_na_uchastie
	* @return the new podtverzhdenie_na_uchastie
	*/
	public podtverzhdenie_na_uchastie create(long podtverzhdenie_na_uchastie_id);

	/**
	* Removes the podtverzhdenie_na_uchastie with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param podtverzhdenie_na_uchastie_id the primary key of the podtverzhdenie_na_uchastie
	* @return the podtverzhdenie_na_uchastie that was removed
	* @throws NoSuchpodtverzhdenie_na_uchastieException if a podtverzhdenie_na_uchastie with the primary key could not be found
	*/
	public podtverzhdenie_na_uchastie remove(long podtverzhdenie_na_uchastie_id)
		throws NoSuchpodtverzhdenie_na_uchastieException;

	public podtverzhdenie_na_uchastie updateImpl(
		podtverzhdenie_na_uchastie podtverzhdenie_na_uchastie);

	/**
	* Returns the podtverzhdenie_na_uchastie with the primary key or throws a {@link NoSuchpodtverzhdenie_na_uchastieException} if it could not be found.
	*
	* @param podtverzhdenie_na_uchastie_id the primary key of the podtverzhdenie_na_uchastie
	* @return the podtverzhdenie_na_uchastie
	* @throws NoSuchpodtverzhdenie_na_uchastieException if a podtverzhdenie_na_uchastie with the primary key could not be found
	*/
	public podtverzhdenie_na_uchastie findByPrimaryKey(
		long podtverzhdenie_na_uchastie_id)
		throws NoSuchpodtverzhdenie_na_uchastieException;

	/**
	* Returns the podtverzhdenie_na_uchastie with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param podtverzhdenie_na_uchastie_id the primary key of the podtverzhdenie_na_uchastie
	* @return the podtverzhdenie_na_uchastie, or <code>null</code> if a podtverzhdenie_na_uchastie with the primary key could not be found
	*/
	public podtverzhdenie_na_uchastie fetchByPrimaryKey(
		long podtverzhdenie_na_uchastie_id);

	@Override
	public java.util.Map<java.io.Serializable, podtverzhdenie_na_uchastie> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the podtverzhdenie_na_uchasties.
	*
	* @return the podtverzhdenie_na_uchasties
	*/
	public java.util.List<podtverzhdenie_na_uchastie> findAll();

	/**
	* Returns a range of all the podtverzhdenie_na_uchasties.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link podtverzhdenie_na_uchastieModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of podtverzhdenie_na_uchasties
	* @param end the upper bound of the range of podtverzhdenie_na_uchasties (not inclusive)
	* @return the range of podtverzhdenie_na_uchasties
	*/
	public java.util.List<podtverzhdenie_na_uchastie> findAll(int start, int end);

	/**
	* Returns an ordered range of all the podtverzhdenie_na_uchasties.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link podtverzhdenie_na_uchastieModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of podtverzhdenie_na_uchasties
	* @param end the upper bound of the range of podtverzhdenie_na_uchasties (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of podtverzhdenie_na_uchasties
	*/
	public java.util.List<podtverzhdenie_na_uchastie> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<podtverzhdenie_na_uchastie> orderByComparator);

	/**
	* Returns an ordered range of all the podtverzhdenie_na_uchasties.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link podtverzhdenie_na_uchastieModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of podtverzhdenie_na_uchasties
	* @param end the upper bound of the range of podtverzhdenie_na_uchasties (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of podtverzhdenie_na_uchasties
	*/
	public java.util.List<podtverzhdenie_na_uchastie> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<podtverzhdenie_na_uchastie> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the podtverzhdenie_na_uchasties from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of podtverzhdenie_na_uchasties.
	*
	* @return the number of podtverzhdenie_na_uchasties
	*/
	public int countAll();
}
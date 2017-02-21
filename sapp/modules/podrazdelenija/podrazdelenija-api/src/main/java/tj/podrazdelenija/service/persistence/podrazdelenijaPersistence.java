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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.podrazdelenija.exception.NoSuchpodrazdelenijaException;

import tj.podrazdelenija.model.podrazdelenija;

/**
 * The persistence interface for the podrazdelenija service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.podrazdelenija.service.persistence.impl.podrazdelenijaPersistenceImpl
 * @see podrazdelenijaUtil
 * @generated
 */
@ProviderType
public interface podrazdelenijaPersistence extends BasePersistence<podrazdelenija> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link podrazdelenijaUtil} to access the podrazdelenija persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the podrazdelenija in the entity cache if it is enabled.
	*
	* @param podrazdelenija the podrazdelenija
	*/
	public void cacheResult(podrazdelenija podrazdelenija);

	/**
	* Caches the podrazdelenijas in the entity cache if it is enabled.
	*
	* @param podrazdelenijas the podrazdelenijas
	*/
	public void cacheResult(java.util.List<podrazdelenija> podrazdelenijas);

	/**
	* Creates a new podrazdelenija with the primary key. Does not add the podrazdelenija to the database.
	*
	* @param podrazdelenija_id the primary key for the new podrazdelenija
	* @return the new podrazdelenija
	*/
	public podrazdelenija create(long podrazdelenija_id);

	/**
	* Removes the podrazdelenija with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param podrazdelenija_id the primary key of the podrazdelenija
	* @return the podrazdelenija that was removed
	* @throws NoSuchpodrazdelenijaException if a podrazdelenija with the primary key could not be found
	*/
	public podrazdelenija remove(long podrazdelenija_id)
		throws NoSuchpodrazdelenijaException;

	public podrazdelenija updateImpl(podrazdelenija podrazdelenija);

	/**
	* Returns the podrazdelenija with the primary key or throws a {@link NoSuchpodrazdelenijaException} if it could not be found.
	*
	* @param podrazdelenija_id the primary key of the podrazdelenija
	* @return the podrazdelenija
	* @throws NoSuchpodrazdelenijaException if a podrazdelenija with the primary key could not be found
	*/
	public podrazdelenija findByPrimaryKey(long podrazdelenija_id)
		throws NoSuchpodrazdelenijaException;

	/**
	* Returns the podrazdelenija with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param podrazdelenija_id the primary key of the podrazdelenija
	* @return the podrazdelenija, or <code>null</code> if a podrazdelenija with the primary key could not be found
	*/
	public podrazdelenija fetchByPrimaryKey(long podrazdelenija_id);

	@Override
	public java.util.Map<java.io.Serializable, podrazdelenija> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the podrazdelenijas.
	*
	* @return the podrazdelenijas
	*/
	public java.util.List<podrazdelenija> findAll();

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
	public java.util.List<podrazdelenija> findAll(int start, int end);

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
	public java.util.List<podrazdelenija> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<podrazdelenija> orderByComparator);

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
	public java.util.List<podrazdelenija> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<podrazdelenija> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the podrazdelenijas from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of podrazdelenijas.
	*
	* @return the number of podrazdelenijas
	*/
	public int countAll();
}